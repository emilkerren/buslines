# Spring/Java backend with Node/React frontend

This project uses the API described here https://www.trafiklab.se/api/sl-hallplatser-och-linjer-2.
to show a list of the buses with the most bus stops.

## Prerequisites
No need for maven since a wrapper is included
* Node.js 19.9.x
* Java 17


## Installing
To install the project, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory root and run mvn clean install to build the backend.
3. Navigate to the frontend directory in src/main/java/com/sbab/sl/buslines/app and run 'npm install' to install the frontend dependencies.

## Running
### Start backend by 
* running BuslinesApplication.java from IDE 
* standing on workspace root and running command './mvnw spring-boot:run' from linux or 'mvnw.cmd spring-boot:run' on windows
* navigate to /target folder and run 'java -jar buslines-0.0.1-SNAPSHOT.jar'

### Start frontend by
* open another terminal window and navigate to src/main/java/com/sbab/sl/buslines/app and run 'npm start'

### Usage
No input needed, the request should kick off and present the list of buses.