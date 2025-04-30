# MavenTestNG01

## Descripción
Este proyecto es una aplicación de prueba desarrollada en **Java** utilizando **Maven** como herramienta de gestión de dependencias y **TestNG** como framework de pruebas. El objetivo principal es realizar pruebas relacionadas con la lectura y manipulación de datos de Excel, utilizando modelos y utilidades personalizadas.

## Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

- **`src/main/java`**: Código fuente principal (actualmente no utilizado en este proyecto).
- **`src/test/java`**: Contiene las clases de prueba y utilidades necesarias para ejecutar las pruebas.
  - **`principal`**: Clases principales de pruebas.
  - **`utilities`**: Clases de soporte como `BaseTest` y `Logs`.
  - **`reader`**: Clases para la lectura de datos desde Excel.
  - **`modelos`**: Clases que representan los modelos de datos (como `Monstruo`).

## Dependencias Principales
El proyecto utiliza las siguientes dependencias:

- **Log4j**: Para el manejo de logs.
- **Poiji**: Para la lectura de archivos Excel y su mapeo a objetos Java.
- **JavaFaker**: Para la generación de datos ficticios.
- **Jackson Databind**: Para la manipulación de datos JSON.
- **TestNG**: Framework de pruebas.
- **SLF4J**: API de logging.

## Requisitos Previos
- **Java 17** o superior.
- **Maven** instalado en el sistema.

## Instalación
1. Clona este repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
