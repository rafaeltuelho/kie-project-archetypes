
# Data Model
This project uses [Lombok](https://projectlombok.org/) to simplify your Pojo definitions.

## generating plain pojo from Lombok annotated classes
You don't need to perform this manually but if you need to just do it.
To generate the plain Java classes annotated with Lombok run the following mvn goal:

```
mvn clean package lombok:delombok
```

The code will be generated into `target/generated-sources/delobok`