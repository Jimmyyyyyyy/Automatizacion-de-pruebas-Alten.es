# Plan de pruebas - Alten

Repositorio de la prueba de Automatización de pruebas - Alten.es de Jaime Suárez González.

### Pre-requisitos

* Eclipse
* Java 
* Maven
* Junit
* Selenium 
* Google Chrome  
* Git

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

_Dí cómo será ese paso_

```
Da un ejemplo
```

_Y repite_

```
hasta finalizar
```

_Finaliza con un ejemplo de cómo obtener datos del sistema o como usarlos para una pequeña demo_

## Estructura del proyecto
 .
    ├── Drivers                                # Chrome driver
    ├── ScreenShot_Folder                      # Capturas de pantallas automáticas
    ├── src                     
    │   ├── main          
    │   └── test/java/pruebas                 # Clase principal que ejecuta la prueba
    ├── target                    
    ├── _PruebaTecnica_auto_Selenium.docx     # Respuesta preguntas teóricas
    ├── pom.xml                               # Archivo de configuración Modelo Base Page Object 
    └── README.md

#!/bin/bash

#File: tree-md

tree=$(tree -tf --noreport -I '*~' --charset ascii $1 |
       sed -e 's/| \+/  /g' -e 's/[|`]-\+/ */g' -e 's:\(* \)\(\(.*/\)\([^/]\+\)\):\1[\4](\2):g')

printf "# Project tree\n\n${tree}"

## Autor

Trabajo realizado por Jaime Suárez González.



