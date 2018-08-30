## rest-basics
Scaffold for starting a simple REST api project using Spring MVC. For practice by college students or trainees.

### Requires JDK 8 as minimum version and Maven 3.x.x for compile and build

### Clean the project using maven
``` shell
# in this case, the project root directory is "rest-basics"
cd $project_root_dir
mvn clean
```

### Build the project using maven
``` shell
# in this case, the project root directory is "rest-basics"
cd $project_root_dir
mvn package -DskipTests
```
Note: The build will be available in <project_root_dir>/target/rest-basics-x.y.z.jar. In this case, the project root directory is "rest-basics".

### Run the tests using maven
``` shell
# in this case, the project root directory is "rest-basics"
cd $project_root_dir
mvn test
```

### Execute the Jar and run the API
``` shell
# in this case, the project root directory is "rest-basics"
cd $project_root_dir
./mvnw spring-boot:run
```
     
#### OR

``` shell
# in this case, the project root directory is "rest-basics"
cd $project_root_dir
java -jar target/rest-basics-0.1.0.jar
```
     
NOTE: Java 8 is required as minimum JAVA/JRE version.

The API will be accessible at http://localhost:8080/samples. 

Download the postman collection json file at: https://pradyroy.in/rest-basics/REST-BASICS.postman_collection
