# Proyecto de Automatización con Java y Maven 02

Este proyecto es un framework de pruebas automatizadas desarrollado en **Java** utilizando **JUnit 5** como framework de pruebas y **Log4j** para el manejo de logs. Además, se integra con **Allure** para la generación de reportes.

## Estructura del Proyecto

- **`src/test/java/utilities`**: Contiene clases utilitarias como `BaseTest` y `Logs` para la configuración y manejo de logs.
- **`src/test/resources/allure.properties`**: Archivo de configuración para Allure.
- **`listeners`**: Contiene los listeners personalizados para la ejecución de pruebas.

## Características

- **Manejo de Logs**: Implementado con Log4j para diferentes niveles de logging (`info`, `debug`, `error`, etc.).
- **Configuración Base**: La clase `BaseTest` incluye métodos de configuración (`@BeforeEach`) y limpieza (`@AfterEach`) para las pruebas.
- **Integración con Allure**: Configuración para generar reportes detallados de las pruebas.
- **Listeners Personalizados**: Extensiones de JUnit para manejar eventos durante la ejecución de las pruebas.

## Requisitos Previos

- **Java 11 o superior**.
- **Maven 3.6 o superior**.
- Configuración de las variables de entorno para Java y Maven.

## Instalación

1. Clona este repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
