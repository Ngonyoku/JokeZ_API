# MyJokez API

This is a simple public REST API created using SpringBoot and Java to store Jokes. [Demo](https://myjokez.herokuapp.com/)

## DATABASE
- Heroku Postgres (PostgreSQL database)

## Languages
- Java 15 
- HTML 5

### GET ALL Jokes
GET https://myjokez.herokuapp.com/api/jokes/

### POST A JOKE
POST https://myjokez.herokuapp.com/api/jokes/

### UPDATE A JOKE
- To update, you will need to pass in the ID of an existing Joke in the database and the updated joke
PUT https://myjokez.herokuapp.com/api/jokes/{id}?joke={The Joke Update}

### DELETE A JOKE
- To delete a joke you will need to pass in the ID of the Joke
DELETE https://myjokez.herokuapp.com/api/jokes/{id}
