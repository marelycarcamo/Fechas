# Comparación de Fechas de Nacimiento
<p align="justify">Este repositorio contiene un programa en Java llamado Fechas. Este programa se utiliza para comparar las fechas de nacimiento de dos personas e identificar quién es mayor.</p>

## Descripción
El programa Fechas realiza las siguientes operaciones:

- #### Lectura de datos
  <p align="justify">Solicita al usuario que ingrese las fechas de nacimiento de dos personas. Las fechas deben ingresarse en el formato `‘dd/mm/yyyy’`.</p>

- #### Validación de fechas
  <p tab><p align="justify">Valida que las fechas ingresadas estén en el formato correcto. Si una fecha no está en el formato correcto, el programa muestra un mensaje de error y solicita al usuario que ingrese la fecha nuevamente.</p>

- #### Comparación de fechas
  <p align="justify">Descompone cada fecha en día, mes y año, y compara las fechas para determinar quién es mayor. Si las dos personas tienen la misma fecha de nacimiento, el programa indica que tienen la misma edad.</p>

- #### Despliegue del resultado
  <p align="justify">Muestra el resultado de la comparación, indicando quién es mayor o si ambas personas tienen la misma edad. El programa utiliza la clase Scanner de Java para leer la entrada del usuario y la clase SimpleDateFormat de Java para validar y formatear las fechas.</p>

## Cómo ejecutar el programa
<p align="justify">Para ejecutar el programa, necesitas tener instalado Java en tu máquina. Luego, puedes compilar y ejecutar el programa utilizando los siguientes comandos en la terminal:</p>

````
javac Fechas.java
java Fechas
