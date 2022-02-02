# 10-BS4-1-Perfiles

Los ficheros se deberán llamar ‘spring-logging-NN.log', donde NN es el numero consecutivo. Hacer que genere un fichero de log nuevo cada vez que se 
inicie la aplicación y que como máximo haya 5 ficheros. 
Por ejemplo, el primer fichero será: spring-logging.log, el segundo spring-logging-01.log, etc. 
Cada vez que se genere uno nuevo, se renombrara spring-logging.log a spring-logging-01.log,  spring-logging-01.log a spring-logging-02.log y así sucesivamente. 
spring-logging-05.log, si existe será borrado y spring-logging-04.log será renombrado a spring-logging-05.log
Configurar el sistema de logs para que si un fichero excede los 5K de longitud también deberá rotar.
Aclaración importante:  Para hacer este ejercicio completamente habría que crear un fichero ‘logback-spring.xml” o “logback.xml”. 
Pero se podra realizar estableciendo propiedades en el fichero application.properties como “logging.file.name” o "logging.logback.rollingpolicy.max-file-size"   normalmente valdra para configurar nuestro sistema de log. (ver https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#application-properties.core.logging.file.name )
Sí se requiere utilizar los diferentes niveles de log (warning, info, etc)  y sacar los warning o inferiores por consola y los de error dejarlos en un fichero.
