# angularmongo-backend
Backend for an angular app with mongodb.

## docker-compose
* Sets up the mongodb instance on a docker container using ip 172.20.0.2.

* With docker and docker compose installed, run the command below on the app root directory.
```
docker-compose up
```

## Running the app
* Run main method on AngularmonApplication or LocalAngularmongoApplicatio class.

## Database
* Starting the app without setting the "data" profile will start the server with mongo in memory database. There is no additional configuration needed, as springboot will set everything up.
* Starting the app with the "data" profile requires an instance of mongodb running. The MongoConfig class tries to find the mongodb at host "172.20.0.2". Run the docker-compose command mentioned before to connect to the mongodb instance on the container.

## Security
* Profile "lsec": starts the app with security on, allowing all http method on all paths.
* Profile "msec": starts the app with security on, requiring authentication with user and password defined in MemoryWebSecurity class.
* Profile "dsec": starts the app with security on, requiring authentication with user and password registered on the mongo database, using the UserService class to find the user.

## Cors Configuration
* Allows requests from origin "http://localhost:4200"
