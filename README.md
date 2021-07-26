# Casino API

Este programa ofrece es una API que representa un servicio de apuestas en ruletas, ofrece las siguientes funciones:

- **/createRoulette** : Permite la creación de nuevas ruletas, al usarlo devuelve el **id** de la nueva ruleta creada.
- **/openRoulette/{id}** : Permite la apertura de una ruleta.
- **/betNumber/{id}**  : Permite apostar en una ruleta a un número determinado en nombre de un usuario.
  - Se debe enviar **userId** como header, representa el id del usuario que realiza la apuesta.
  - El párametro **value** es el valor de la apuesta
  - El párametro **number** es el número al cual se le quiere apostar
- **/betColor/{id}** : Permite apostar en una ruleta a un color determinado en nombre de un usuario.
  - Se debe enviar **userId** como header, representa el id del usuario que realiza la apuesta.
  - El párametro **value** es el valor de la apuesta
  - El párametro **color** es el color al cual se le quiere apostar, debe ser "red" o "black"
- **/closeRoulette/{id}** : Permite cerrar una ruleta y cobrar todas sus apuestas, esto devolverá una lista con los resultados de las apuestas.
- **/getRoulettes** : Permite obtener todas las ruletas.


### Prerequisites

Para usar el proyecto se necesitan tener las siguientes versiones de java o superior:

```
java version "1.8"
javac version "1.8"
```

## Getting Started

Para hacer uso del proyecto podemos clonar el repositorio o descargarlo directamente, para ejectarlo lo hacemos por medio de la consola usando el siguiente comando, para compilar las clases con maven

```bash
mvn package
```
Luego ejecutamos el programa usando el siguiente codigo:

Linux o Mac
```linux
java $JAVA_OPTS -cp target/classes:target/dependency/* com.masiv.casinoapi.App
```
Windows
```windows
java -cp target/classes;target/dependency/* com.masiv.casinoapi.App
```
## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring-Boot](https://spring.io/projects/spring-boot) - Framework Web
* [Docker](https://www.docker.com/) - Deploy
* [Redis](https://redis.io/) - Persistence


## Versioning

El versionamiento se realizó a través de [github](https://github.com/anfegoca/casino-api)

## Authors

* **Andrés González** - [anfegoca](https://github.com/anfegoca)
