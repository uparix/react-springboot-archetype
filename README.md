# React SpringBoot Maven Archetype

This Maven Archtetype creates and builds a react project with a spring boot server backend only using maven build steps.

## Software Stack

- SpringBootFramework 2.1.1.RELEASE
- React 16.7.0
- JUnit5 

## Local Installation

```
  git clone https://github.com/uparix/react-springboot-archetype.git
  
  mvn clean install
```

### Prerequisites

You need Maven installed on your machine.

## Getting Started
```
mvn archetype:generate \
      -DarchetypeGroupId=com.uparix \
      -DarchetypeArtifactId=react-springboot-archetype \
      -DarchetypeVersion=1.0.0 \
      -DgroupId=com.example.acme \
      -DartifactId=myproject \
      -DinteractiveMode=false \
      -Dversion=0.0.1-SNAPSHOT
```

## Usage

```
  mvn clean package spring-boot:run
  
  http://localhost:8080
```

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.


## Authors

* **Andreas Neuenschwander** - *Initial work* - [Uparix](https://github.com/uparix)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
