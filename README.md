# 🖥️ 식품 스마트팩토리 모니터링 및 원격 제어 시스템 프로젝트
스마트팩토리 시스템구축
        
---
## ✏️ 프로젝트 개요
본 프로젝트는 식품 공장의 모니터링 및 원격 제어 시스템을 개발하는 것을 목표로 합니다. 아두이노를 활용하여 센서 데이터를 수집하고, 웹 애플리케이션을 사용하여 실시간 모니터링 및 제어 기능을 구현합니다.

---
## 🕑 개발 기간
- 23.07.24 - 23.08.23

---
## 👥 멤버 구성       
 - 팀장  : 오현진 - 불량품 검출 AI(Colab), Flask, ESP32 CAM, Arduino ESP32(ET Board), 발표
 - 팀원1 : 김도환 - Spring Boot, DB, Arduino ESP32(ET Board)
 - 팀원2 : 이다빈 - React, PPT제작

---
## 💻 개발 환경

### 🌐 Front-End
- React 18.2.0
- HTML 5
- CSS 3
- MUI 5.14.3

### 🖥️ Back-End
- Java 17
- Spring Boot 3.1.2
- Python
- Flask

### 📦 Framework
- Node v14.21.3

### 🗃️ Database
- MySQL

### 🔌 Sensor
- Arduino ESP32 (ET Board)
- ESP32 Cam
- C++

---
## ⚙️ 기능 소개

- 센서 데이터 수집 및 저장
- 실시간 그래프를 통한 온도, 조도, 생산량 등의 시각화
- 웹 애플리케이션을 통한 공장 제어
 
  - ### 🔒 로그인 [로그인 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능-요약(로그인))
    - 서버와의 통신
    - 인증 상태 확인
    - 로그아웃 (사용자 정보 초기화)
    - 로그인 성공 시 인증 토큰 반환 (쿠키에 저장)
  - ### 🏠 홈 대시보드 [홈 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능-요약(홈-대시보드))
    - 사용자 정의 훅을 사용하여 데이터 가져옴
    - 생산관리, 온습도, 불량품 대시보드
  - ### 📈 생산 관리 페이지 [생산 관리 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능-요약(생산-관리))
    - 데이터 전송 및 알림
    - 타이머 및 카운터 기능
    - 알림 및 경고
    - 목표 생산량 입력 및 처리
  - ### 🌡️ 온습도 페이지 [온습도 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능(온습도))
    - 온도 적정 범위
    - 실시간 온습도 그래프
    - 실시간 최대 최소 평균값
  - ### ❌ 불량품 페이지 [불량품 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능(불량품-검출))
  - ### ⚠️ 에러 페이지 [에러 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능(Error))
    - 오류 메시지 표시
  - ### 🗃️ 생산 관리 DB [생산 DB 상세 wiki](https://github.com/KEB-SmartFactory-Project-Group3/SmartFactory-Project/wiki/기능(생산관리-DB))
    - 생산 관리 관련 데이터 베이스 저장
- 컴퓨터 비전과 인공지능을 활용한 식품 물체 인식

---
## 시스템 구성
### 아두이노 서버
- 센서 데이터 수집 및 아두이노 클라이언트의 HTTP 요청에 JSON 형식으로 응답
- 예시 데이터: {"timestamp":"2023-07-24 13:25:19","temperature":20,"brightness":2144,"count":0}
### 아두이노 클라이언트
- 아두이노에서 보낸 JSON 형식의 데이터를 DB에 저장 (Java)

---
## 주요 기능 소개
1. 시간대별 생산량: 시간과 카운트를 활용한 시간당 생산량 계산 및 모터 제어
2. 온도, 조도센서 데이터를 활용한 실시간 그래프
외부 온도, 습도 정보 표시 및 공장 제어
3. 버튼을 통한 웹에서 공장 제어 및 상태 확인
4. 컴퓨터 비전 및 인공지능을 활용한 물체 인식 (예시: 컵라면, 통조림)

---
## 코드 컨벤션
1) 변수선언
변수명은 낙타표기법을 사용합니다. $나 \는 사용하지 않으며 _도 사용을 자제하겠습니다. 
변수명은 소문자로 시작하며 새로운 단어의 첫 번째 문자는 대문자를 사용합니다. 
변수명의 첫 단어는 반드시 명사를 사용해주어 함수와 구분하기 쉽도록 합니다. 

