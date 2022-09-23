# EnterpriseApp
Enterprise Application

## Links
- [Home / About](http://localhost:8080/home/about)
- [Swagger UI](http://localhost:8080/swagger-ui.html)
- [OpenAPI JSON](http://localhost:8080/v3/api-docs)
  
## References
- [Let’s Encrypt SSL Certificates for Dockerized Spring Boot in 2020](https://knasmueller.net/lets-encrypt-ssl-certificates-for-dockerized-spring-boot-in-2020)
- [Secure Spring boot with lets' encrypt](https://wstutorial.com/rest/spring-boot-with-lets-encrypt.html)
- [Nginx and Let’s Encrypt with Docker in Less Than 5 Minutes](https://pentacent.medium.com/nginx-and-lets-encrypt-with-docker-in-less-than-5-minutes-b4b8a60d3a71)
- [Deploy Web App with Docker, Nginx and SSL (HTTPS)](https://www.youtube.com/watch?v=zJPlyjfV4C0)

- [Spring Boot With an Apache Web Server Front End](https://careydevelopment.us/2017/06/19/run-spring-boot-apache-web-server-front-end/)
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