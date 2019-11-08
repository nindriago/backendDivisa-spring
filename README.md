# backendDivisa-spring
Project spring-boot with database H2, realizado con spring tool suite, se realiza creacion de tabla en archivo data.sql para poder manejar la interaccion de manera adecuada, se exponen 2 servicios `Divisa` y `Tasa` que son expuestos por link http://localhost:8080

Para poder realizar la ejecucion correcta del proyecto se debe descargar y realizar un `Maven update` para poder obtener todas las referencias necesarias, establecer un `Goals` de `Maven Build` para poder realizar las acciones mas rapidamente con la instruccion `clean install spring-boot:run`

Luego de ejecutado se podra desplegar y ser consultado desde el link por defecto de spring-boot.

si se desea otra forma de poder ejecutarlo seria por medio de `CMD` con la instruccion `java -jar nombreArtefacto.jar` el cual esta ubicado en la carpeta `divisa/target/divisa-0.0.1-SNAPSHOT.java`

Forma alternativa de poder detener ejecucion de proyecto usando `CMD` - `netstat -ano | find "8080"` y `Taskkill /F /IM XXXXX`
