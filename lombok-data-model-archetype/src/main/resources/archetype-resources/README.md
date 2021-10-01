
# Data Model
This project uses [Lombok](https://projectlombok.org/) to simplify your Pojo definitions.

To generate the plain Java classes annotated with Lombok run the following mvn goal:

```
mvn clean package lombok:delombok
```

The code will be generated into `target/generated-sources/delobok`