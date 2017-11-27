“Write a REST service in Java which takes a language as input (i.e. rust, go, coffeescript) and provides a JSON output listing all the projects using that language in GitHub.  

The output must contain only project id, name, url and the owner login. 

 We expect working code to be provided with instructions on how to execute it. 
 
 You may use open source libraries where available, 
 
 the relevant GitHub API is : https://developer.github.com/v3/search/#search-repositories. ”

To run the code :

1) git clone https://github.com/mkris8/search-repository.git
2) mvn clean
3) mvn install
4) mvn spring-boot:run
5) Hit the service endpoint /projects by providing input param as below.
Examples :
http://localhost:8080/projects/java
http://localhost:8080/projects/rust
http://localhost:8080/projects/scala

