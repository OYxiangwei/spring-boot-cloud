# spring-boot-cloud
基于 Spring Boot、Spring Cloud、Spring Oauth2 和 Spring Cloud Netflix 等框架构建的微服务项目<br>
* register - 服务注册与发现<br>
* configs - 外部配置<br>
* monitors - 监控<br>
* zipkins - 分布式跟踪<br>
* gateway_about - 代理所有微服务的接口网关<br>
* auth_service - OAuth2 认证服务<br>
* serviceA - 业务服务A<br>
* serviceB - 业务服务B<br>
<br>
<br>
使用 Docker 快速启动<br>
 1. 配置 Docker 环境<br>
 2. `mvn clean package` 打包项目及 Docker 镜像<br>
 3. 在项目根目录下执行 `docker-compose up -d` 启动所有项目<br>
