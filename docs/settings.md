# Mongoose

## Settings

### Requirements

- Java 8
- Postgresql


### Application start

```
java -jar mongoose.jar --spring.config.location=path_to_file/application.yml -Dspring.profiles.active=prod
```


### Structure Project

```
  benchmark
  docs
  src
  ├── main
    ├── java
      ├── packageName
        configuration 
        └── ...
        controller
        ├── TestController
        └── ...
        utils (helper classes)
        ├── fixture
        ├── test
        ├── SomeClass
        └── ...
    ├── resources
        ├── fixture
        ├── spring
            ├── context.xml
            └── ...
        ├── static
            ├── css
            ├── images
            ├── js
            └── ...
        ├── templates
  ├── test
      └── ...
  └── target
  .gitignore
  CHANGELOG.md
  Dockerfile
  Makefile
  README.md
  pom.xml
```
