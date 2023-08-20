# 📌 식품 스마트팩토리 모니터링 및 제어 시스템 프로젝트

------------------------------------
## ✏️ 프로젝트 개요
본 프로젝트는 식품 공장의 모니터링 및 제어 시스템을 개발하는 것을 목표로 합니다. 아두이노를 활용하여 센서 데이터를 수집하고, 웹 애플리케이션을 사용하여 실시간 모니터링 및 제어 기능을 구현합니다.

------------------------------------
## 🕑 기간

- 23.07.24 ~ 23.08.23

------------------------------------
## 💻 개발 환경
- Java 17
- JDK 17
- Framework : Spring-boot
- DB : MySQL
- Arduino

---
## 📎 기능 요약
1. 센서 데이터 수집 및 저장
2. 실시간 그래프를 통한 온도, 조도, 생산량 등의 시각화
3. 웹 애플리케이션을 통한 공장 제어
4. 컴퓨터 비전과 인공지능을 활용한 식품 물체 인식

## 시스템 구성
### 아두이노 서버
- 센서 데이터 수집 및 아두이노 클라이언트의 HTTP 요청에 JSON 형식으로 응답
- 예시 데이터: {"timestamp":"2023-07-24 13:25:19","temperature":20,"brightness":2144,"count":0}
### 아두이노 클라이언트
- 아두이노에서 보낸 JSON 형식의 데이터를 DB에 저장 (Java)
------------------------------------
## 주요 기능 소개
1. 시간대별 생산량: 시간과 카운트를 활용한 시간당 생산량 계산 및 모터 제어
2. 온도, 조도센서 데이터를 활용한 실시간 그래프
외부 온도, 습도 정보 표시 및 공장 제어
3. 버튼을 통한 웹에서 공장 제어 및 상태 확인
4. 컴퓨터 비전 및 인공지능을 활용한 물체 인식 (예시: 컵라면, 통조림)

------------------------------------
## 코드 컨벤션
1) 변수선언
변수명은 낙타표기법을 사용합니다. $나 \는 사용하지 않으며 _도 사용을 자제하겠습니다. 
변수명은 소문자로 시작하며 새로운 단어의 첫 번째 문자는 대문자를 사용합니다. 
변수명의 첫 단어는 반드시 명사를 사용해주어 함수와 구분하기 쉽도록 합니다. 

