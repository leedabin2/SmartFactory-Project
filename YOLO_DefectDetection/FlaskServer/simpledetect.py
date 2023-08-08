import cv2
import urllib.request
import numpy as np
import torch

# YOLOv5 모델 불러오기 (로컬에 저장된 best.pt 또는 last.pt 파일)
model = torch.hub.load('ultralytics/yolov5', 'custom', path='C:/YOLOv5_model/best.pt')
model.conf = 0.60  # 검출 임계값(Threshold) 설정

url = 'http://165.246.116.53/'
##'''cam.bmp / cam-lo.jpg /cam-hi.jpg / cam.mjpeg '''
cv2.namedWindow("live transmission", cv2.WINDOW_AUTOSIZE)

while True:
    img_resp = urllib.request.urlopen(url + 'cam-hi.jpg')
    imgnp = np.array(bytearray(img_resp.read()), dtype=np.uint8)
    img = cv2.imdecode(imgnp, -1)

    new_width = 614
    new_height = 614
    img = cv2.resize(img, (new_width, new_height), interpolation=cv2.INTER_LINEAR)

    blurred_image = cv2.GaussianBlur(img, (5, 5), 0)
    sharpened_image = cv2.addWeighted(img, 1.5, blurred_image, -0.5, 0)

    # 객체 검출 수행
    results = model(sharpened_image, size=614)

    # 객체 검출 결과를 영상에 표시
    detected_frame = results.render()
    print(f"Detected frame type: {type(detected_frame)}")  # 데이터 타입 확인

    if isinstance(detected_frame, list) and len(detected_frame) > 0:
        detected_frame = detected_frame[0]  # 올바른 이미지를 가져옵니다.

        if isinstance(detected_frame, torch.Tensor):
            detected_frame = detected_frame.numpy().transpose(1, 2, 0)  # PyTorch 텐서를 OpenCV 형식으로 변환

        cv2.imshow("live transmission", detected_frame)

    key = cv2.waitKey(5)

    if key == ord('q'):
        break

cv2.destroyAllWindows()
