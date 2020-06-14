# spring-graphql-mysql-demo 
![Java CI with Gradle](https://github.com/suraj-subramanian/spring-graphql-mysql-demo/workflows/Java%20CI%20with%20Gradle/badge.svg)

GraphQL API demo for books with Spring Boot and MySQL backend.

![GraphQL](https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/GraphQL_Logo.svg/200px-GraphQL_Logo.svg.png)
![Spring](https://img.icons8.com/color/200/000000/spring-logo.png)
![MySQL](https://upload.wikimedia.org/wikipedia/en/thumb/6/62/MySQL.svg/320px-MySQL.svg.png)

### GraphQL schema
```
type Query {
    bookById(id: ID): Book
    authorById(id: ID): Author
    getBooks: [Book]
    getAuthors: [Author]
}

type Book {
    id: ID!
    name: String!
    pageCount: Int
    author: Author
}

type Author {
    id: ID!
    age: Int
    name: String!
}
```

### Example Query 
##### Input
```
{
  getBooks {
		name
    pageCount
  }
}
```
##### Output
```
{
  "data": {
    "getBooks": [
      {
        "name": "Programming is fun",
        "pageCount": 125
      },
      {
        "name": "Java Getting Started",
        "pageCount": 155
      },
      {
        "name": "Grooving with Groovy",
        "pageCount": 225
      },
      {
        "name": "Art of Programming",
        "pageCount": 300
      }
    ]
}
```
