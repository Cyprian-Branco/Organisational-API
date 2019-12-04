[![CircleCI](https://circleci.com/gh/Cyprian-Branco/Organisational-API.svg?style=svg)](https://circleci.com/gh/Cyprian-Branco/Organisational-API)
# Organisational-API

## Author

* **Cyprian Bowen** 

## Getting Started

Clone this repository to your local machine to get Started

Github:[https://github.com/Cyprian-Branco/](https://github.com/Cyprian-Branco/)

### Prerequisites

You need the following installed on your machine
- java
- JDK - Java Development Kit
- Spark
- Gradle
- An IDE - Intellij
-postgresql



To confirm run the following command on linux
```
$ java --version       //java version
$ mvn --version        //maven version
$ gradle --version     //gradle version
```

## Installing

After cloning to your local machine navigate to the folder you cloned into and open it with intellij.
* Navigate into the ``` src/main/java/App.java ``` and click run in intellij.
* Go to your browser and type ``` localhost:4567 ```
In PSQL:
 *
## HTTP Methods

| Method | Path                  | Description               |
| ---    | ---                   | ---                       |
| `Get`  | /departments          | Fetches all departments   |
| `Get`  | /users                | Fetches all users         |
| `Get`  | /departmentsnews      | Fetches departments new   |
| `Get`  | /departments/:id/news | Fetches department news   |
| `Get`  | /generalnews          | Fetches department news   |
	
## Built With

* [Java](https://www.java.com/) - The language used
* [Intellij Idea](https://www.jetbrains.com/idea/) - Intergated development
* [Spark]() - Framework


## Contributing
If you want to put out a pull request you first have to send us the sample code that you want to add to our repository for cross-checking before we allow the pull.

## License

This project is licensed under the MIT License. 
