# Reto Tecnico Multiplica/Sura

> Reto técnico para Multiplica/Sura
> **Importante!** este proyecto requiere tener instalado **Java 8**  y **Maven 3**.

## Acerca de este Proyecto
Se ha creado un proyecto en Java - Spring , el cual expone 3 endpoints:
1. http://localhost:8080/color :
 - Se conecta a la BD RDS de mysql y trae todos los valores de la tabla color **Path: /color** **Metodo HTTP: GET** 
2. http://localhost:8080/color/{id} :
 - Se conecta a la BD RDS de mysql y trae un valor de la tabla color **Path: /color/{id}** **Metodo HTTP: GET** 
3. http://localhost:8080/color :
 - Recibe el payload Request se conecta a la BD RDS de mysql  y guarda los datos enviados  **Path: /color** **Metodo HTTP: POST**
 


## Instalación en Dev
**Nota:** El despliegue en local es posible gracias al tomcat embebido de springboot** 

```batch
# entrar con la terminal a la carpeta raiz del proyecto
$ cd {RUTA_PROYECTO}

# iniciamos el proyecto en local
$ mvn spring-boot:run

```
## El terminal te dará como resultado un mensaje como este
![alt text](https://gist.githubusercontent.com/renxbazan/6e73b076a41c257d8398816eea150d62/raw/26c23eecab23ae6cb2ddb9fcb851151ec99aa8b0/spring-terminal.png?raw=true)

## Ya puedes probar los endpoints
> **Importante!** Necesitas estar conectado a internet ya que se conecta a una base de datos de AWS 


## Endpoints que puedes probar: (Reemplazar {URL} por localhost:8080)
 1. {URL}/color                         (GET)
 2. {URL}/color/1                       (GET)
 3. {URL}/user                          (POST)
 
 Se ha implementado [Pageable](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Pageable.html) para hacer la paginación y el ordenamiento.
 
 ![alt text](https://gist.githubusercontent.com/renxbazan/6e73b076a41c257d8398816eea150d62/raw/26c23eecab23ae6cb2ddb9fcb851151ec99aa8b0/postman-get-pageable.png?raw=true)
 
 Para obtener el resultado como **XML** se debe agregar en el header el atributo *Accept=application/xml* como se ve en la imagen a continuacíon 
 
 ![alt text](https://gist.githubusercontent.com/renxbazan/6e73b076a41c257d8398816eea150d62/raw/26c23eecab23ae6cb2ddb9fcb851151ec99aa8b0/postman-get-pageable-xml.png?raw=true)
 
 Para el getone se debe probar de la siguiente manera:
 
  ![alt text](https://gist.githubusercontent.com/renxbazan/6e73b076a41c257d8398816eea150d62/raw/26c23eecab23ae6cb2ddb9fcb851151ec99aa8b0/postman-get-one.png?raw=true)
 

 **Nota** para usar el **POST** debes usar un payload con la siguiente estructura:
 ```javascript
 	{
    "name": "prueba",
    "year": 2005,
    "color": "#7788774",
    "pantoneValue": "14-2312"
  	}
```


 Al probar el POST tendrás un resultado similar al siguiente: 
![alt text](https://gist.githubusercontent.com/renxbazan/6e73b076a41c257d8398816eea150d62/raw/26c23eecab23ae6cb2ddb9fcb851151ec99aa8b0/postman-post.png?raw=true)




Cualquier duda o consulta, contactarme al email: **renxbazan@gmail.com**