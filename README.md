  
  #  SPRING api MongoDB e MySQL

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://br.linkedin.com/in/luiza-andrade-ti/)  

[![git](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/luizaandradeti/) 


## Tech Stack 🔨
**Client:** Postman
**Backend softwares:** Java 17, IntelliJ


## Get Started 🚀 

### 1. Create Spring Project  ⚡️
- https://start.spring.io/ 
    - Spring Web 
    - Spring Boot DevTools Developer Tools

### 2. View 🌐

 **First endpoint, go to localhost:8080/home**

![App Screenshot](images/alter.png) 

![App Screenshot](images/navegador.png) 

![App Screenshot](images/postman.png)  

### 2. Actuator in the scene 🔬

 **Include the actuator dependency in pom.xml**

````
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
````
For more information, please visit the website below:
- https://mvnrepository.com/

- Now, go to localhost:8080/actuator**

![App Screenshot](images/actuator.png)
- Improve details:
![App Screenshot](images/details.png)

### Database setup

**add these libraries in pom.xml:**

````
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa -->
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-jpa</artifactId>
    <version>3.4.4</version>
</dependency>
````

