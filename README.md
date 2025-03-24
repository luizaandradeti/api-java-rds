
  <h2 align="center"> Spring API MongoDB e MySQL</h2> 
<center>

[![My Skills](https://skillicons.dev/icons?i=aws,java,mysql,postman,vscode,spring&perline=3)](https://skillicons.dev)


[![Generic badge](https://img.shields.io/badge/status-developing-yellow.svg)](/#/)


</center>

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://br.linkedin.com/in/luiza-andrade-ti/) [![git](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/luizaandradeti/)


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


![Brave](https://img.shields.io/badge/Brave-FB542B?style=for-the-badge&logo=Brave&logoColor=white)
![DuckDuckGo](https://img.shields.io/badge/duckduckgo-de5833?style=for-the-badge&logo=duckduckgo&logoColor=white)
![Edge](https://img.shields.io/badge/Edge-0078D7?style=for-the-badge&logo=Microsoft-edge&logoColor=white)
![Firefox](https://img.shields.io/badge/Firefox-FF7139?style=for-the-badge&logo=Firefox-Browser&logoColor=white)
![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white)
![App Screenshot](images/navegador.png) 

![App Screenshot](images/postman.png)  

### 3. Actuator in the scene 🔬

 *Include the actuator dependency in pom.xml*

[![dependency - JPA](https://img.shields.io/badge/Dependency-Actuator-turquoise )](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator/1.2.1.RELEASE)
````
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
````
For more information, please visit the Maven website:
	- https://mvnrepository.com/

- Now, go to localhost:8080/actuator

![App Screenshot](images/actuator.png)

![App Screenshot](images/details.png)

### 4. Connection with RDS Database 😄   

*Include the JPA and MySQL lib in the pom xml, to connect the api to the AWS database and perform queries and data persistence through ORM*

[![dependency - MySql](https://img.shields.io/badge/Dependency-MySQL-yellow)]([https://mvnrepository.com/search?q=MYSQL)

[![dependency - PersistenceJPA](https://img.shields.io/badge/Dependency-JPA-blue)](https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api/3.2.0)

[![dependency - JPA](https://img.shields.io/badge/Dependency-DataPersistence-red)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test/3.4.4)



````
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>8.0.33</version>
	</dependency>

	<dependency>
		<groupId>jakarta.persistence</groupId>
		<artifactId>jakarta.persistence-api</artifactId>
	</dependency>

	<dependency>
   		<groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

````

*Please first test the connection to the database in DBeaver, with the dev password provided to you by the cloud administrator*

![App Screenshot](images/connect-b.0249a5354c7767138c0efabeef2a2cec0104f084.png)<center><font size="1">https://aws.amazon.com/pt/getting-started/hands-on/create-mysql-db/</font></center>

![App Screenshot](images/conexao1.png)

*Now, Set AWS RDS credentials in the application.properties file, 

![App Screenshot](images/DATABASEAPPLICATION.png)

*create the table and jpa classes (product class and repository interface) and execute*

![App Screenshot](images/conexao2.png)


### 5.  Micrometer with AWS Cloud Watch -><img src="https://d2q66yyjeovezo.cloudfront.net/icon/8f57ebd825a828e205b2dde223ba17e4-6af63a22dc297f8041286760ee8cd2c9.svg" /></a></td>
	


[![Generic badge](https://img.shields.io/badge/status-TODO-yellow.svg)](/#/)
