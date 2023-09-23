# Spring Boot Kotlin sample project


You can launch the application with by running:

1. Run Postgres Container on your localhost:5432 with this command

```docker run --name postgres -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres postgres:alpine```

Once Docker is running run below Command inside the dierctory of the repo
```./gradlew bootRun```

Following API's will work


Get All Customer
```
curl --request GET \
  --url http://localhost:8080/customers
```

Save Customer Name and  Mobile
```
curl --request POST \
  --url http://localhost:8080/save/name/Mobasshir/mobile/1234356
```

Get Customer By Mobile
```
curl --request GET \
  --url http://localhost:8080/customers/find/mobile/91065566544
```

Get Customer By name
```
curl --request GET \
  --url http://localhost:8080/customers/find/name/Jack
```


To check it database, please log into database using terminal or use apps like TablePlus/DBeaver


