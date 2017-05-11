# roamstory
Servlet &amp; jsp 

개발 목적
   1. Servlet/JSP로 블로그를 구현하면서 자바 웹 애플리케이션에서 알아야 할 HTTP,빌드도구, 
   logging 라이브러리, validation, 리팩토링 등을 파악하여 기본을 다지는 자세를 위해 개발한다.
   2. MVC 패턴과 의존성 주입 등을 이 개발소스로 진행하여 원초적인 개발 단계에서 좀 더 나아가는 방향성이 무엇인지 파악하는 것
   3. Step by Step

개발환경
- Tomcat 9.0
- JDK 1.8
- AWS(EC2) (우분투)
- git

Tool
 - eclipse
 - Xshell 5 
 - sourcetree
 - github
 - mysql workbench
 - notepad++
 
라이브러리
 - gson
 - junit (단위테스트)
 - hibernate- validator
 - beanutils (자바빈 규약에 따라 자바 객체에서 데이터 추출)
 - mysql-connector-java
 - logback-classic (디버깅)
 
라이브러리 의존성 관리
 - maven 프로젝트로 진행
 
AWS 환경 구축
- JDK 설치
- Mysql 설치
- Tomcat 설치
- Maven 설치
 
 
URL : http://ec2-52-78-18-177.ap-northeast-2.compute.amazonaws.com:8080/
 
진행상황
- servlet 구현
- 리팩토링 진행중
- contact 뷰단만 완성 

앞으로의 개발 진행
- 리팩토링 후 MVC패턴을 적용
- AJAX를 이용 한 질답게시판 구현
- MVC패턴을 적용 후 DI를 통한 개발 진행

진행 상황 중 이슈 사항은 github이슈 탭에 입력하여 진행일정을 등록 후 해당 이슈 사항 수정 및 구현 후 커밋 시 이슈사항에 반영.
