# EnterpriseApp
Enterprise Application

[Spring Boot Token based Authentication with Spring Security & JWT](https://www.bezkoder.com/spring-boot-jwt-authentication/)

|Methods | Urls | Actions |
|--------|------|---------|
| POST | /api/auth/signup | signup new account |
| POST | /api/auth/signin | login an account |
| GET | /api/test/all | retrieve public content |
| GET | /api/test/user | access User’s content, for users has ROLE_USER or ROLE_MODERATOR or ROLE_ADMIN |
| GET | /api/test/mod | access Moderator’s content, for users has ROLE_MODERATOR |
| GET | /api/test/admin | access Admin’s content, for users has ROLE_ADMIN |



[Using JWT with Spring Security OAuth](https://www.baeldung.com/spring-security-oauth-jwt)