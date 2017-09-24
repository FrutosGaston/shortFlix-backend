##Running the backend (recommended)

The recommended way to launch the server is to use your favorite java IDE. The main method of the application is in the BootEmberApplication class.

##Running the frontend (recommended)

The problem when you launch your Spring boot server on the port 8080 and the dev server on the port 4200 is that you will get cross origin requests preventing the two servers from interacting

Proxy the request to localhost:8080 so we can access the front end application on localhost:4200 and not get cross-origin requests
```
ember server --proxy=http://localhost:8080
```

##Production

This command will generate an optimized bundle and include it in the jar.
```
/gradlew clean assemble
```
You can then launch it with:
```
java -jar build/libs/boot-ember-0.0.1-SNAPSHOT.jar
```