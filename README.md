# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.11.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.11.RELEASE/maven-plugin/reference/html/#build-image)
* [Hystrix [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#circuit-breaker-hystrix-clients)
* [Codecentric's Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-kafka)
* [Zuul [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#router-and-filter-zuul)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-redis)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Hystrix Dashboard [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#circuit-breaker-hystrix-dashboard)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)
* [Codecentric's Spring Boot Admin (Server)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Ribbon [Maintenance]](https://docs.spring.io/spring-cloud-netflix/docs/2.2.x/reference/html/#spring-cloud-ribbon)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.5.0/reference/htmlsingle/#production-ready)

### Guides

The following guides illustrate how to use some features concretely:

* [Circuit Breaker](https://spring.io/guides/gs/circuit-breaker/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Client-side load-balancing with Ribbon and Spring Cloud](https://spring.io/guides/gs/client-side-load-balancing/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links

These additional references should also help you:

* [Sample of circuit-breaker metrics with Spring Cloud and Hystrix Dashboard](https://github.com/spring-cloud-samples/hystrix-dashboard)
* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)

# Spring Cloud Netflix Maintenance Mode

The dependencies listed below are in maintenance mode. We do not recommend adding them to new projects:

* Ribbon
* Zuul
* Hystrix
* Hystrix Dashboard

The decision to move most of the Spring Cloud Netflix projects to maintenance mode was a response to Netflix not
continuing maintenance of many of the libraries that we provided support for.

Please
see [this blog entry](https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now#spring-cloud-netflix-projects-entering-maintenance-mode)
for more information on maintenance mode and a list of suggested replacements for those libraries.
