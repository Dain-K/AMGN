## 스프링 시큐리티 환경설정

### :one: MySQL 설정

아래의 코드는 mySQL workbench query 문으로 프로젝트를 시작하기 전에 실행한다.

- 기존 cos 유저 삭제

```sql
drop user cos;
```

- 유저이름@아이피주소 identified by 비번

```sql
create user 'cos'@'%' indentified by 'cos1234';
```

- ON DB이름.테이블명 (해당 유저에게 모든 권한을 준다)
- to 유저이름@아이피주소

```sql
create user 'cos'@'%' identified by 'cos1234';
```

- 데이터베이스 생성 (이름: amgnProject)

```sql
create database amgnProject;
use amgnProject;
```

- 결과

```sql
drop user cos;
create user 'cos'@'%' identified by 'cos1234';
grant all privileges on *.* to 'cos'@'%';
create database amgn;
use amgn;
```

### :two: Spring 프로젝트 생성
