# Spring Security 개념잡기.
- inflearn 에서 스프링부트 시큐리티 & jwt 강의를 보고 실습한 사항입니다.
- 강의 주소는 https://www.inflearn.com/course/스프링부트-시큐리티 를 참고하였습니다.

## OSI 7계
- 물데네트세프응
  - 물리계층
  - 데이터계층
  - 네트워크계층
  - 트랜스포트계층
  - 세션계층
  - 프리젠테이션계층
  - 응용계층

## CIA (Confidentiality, Intergraity, Availability)
- Confidentiality(기밀성) : 개인정보, 민감한 정보 등을 인가된 사용자에게만 허가
- Intergraity(무결성) : 내용의 변경이나, 훼손없이 정확하게 보존
- Availability(가용성) : 항상 정상적으로 신뢰성이 있는 서비스를 할 수 있는 상태

## RSA
- public Key : 공개키
- private key : 개인

## JWT
- https://jwt.io
- RFC 7519
  - Hypertext Transfer Protocol
  - RFC(Request for Comments) 문서는 비평을 기다리는 문서라는 의미로, 컴퓨터 네트워크 공학 등에서 인터넷 기술에 적용 가능한 새로운 연구, 혁신, 기법 등을 아우르는 메모를 나타냄.