PROGRAMACIÓN II  

Trabajo Práctico 5: Relaciones UML 1 a 1 

Este repositorio contiene dos ejercicios prácticos en Java que ilustran diferentes tipos de relaciones entre clases: **asociación unidireccional** y **asociación bidireccional**.  
Los diagramas UML fueron diseñados previamente en **UMLetino** como parte del diseño orientado a objetos.

---

## 🧩 Ejercicio 1: Asociación Unidireccional

### 📘 Descripción
En este ejercicio se implementa una relación **unidireccional** entre las clases `Pasaporte` y `Foto`.  
Un pasaporte **posee una foto**, pero la foto **no conoce al pasaporte**.

### 💡 Clases principales
- **Foto**: representa una imagen asociada al pasaporte (nombre y formato).
- **Pasaporte**: contiene número, fecha de emisión y una foto.
- **Principal**: clase con el método `main` para probar el funcionamiento.

### 🧠 Conceptos aplicados
- Asociación unidireccional.
- Composición (la foto pertenece al pasaporte).
- Encapsulamiento y constructores.
- Método `mostrarInfo()` para mostrar los datos en consola.

### 📋 Ejemplo de salida
Pasaporte N° A1234567
Fecha de emisión: 2025-10-19
Foto: osito.jpg


---

## 🔁 Ejercicio 2: Asociación Bidireccional

### 📘 Descripción
En este segundo ejercicio se implementa una relación **bidireccional** entre `Pasaporte` y `Titular`.  
El pasaporte **conoce a su titular**, y el titular **también conoce a su pasaporte**.  
Además, se mantiene la asociación con la clase `Foto` como en el ejercicio anterior.

### 💡 Clases principales
- **Titular**: representa la persona que posee el pasaporte (nombre y DNI).
- **Pasaporte**: contiene número, fecha de emisión, una foto y una referencia al titular.
- **Foto**: se reutiliza del ejercicio anterior.
- **Principal**: instancia los objetos y asocia ambos extremos de la relación.

### 🔗 Diagrama UML (resumen)
Titular ↔ Pasaporte → Foto


### 🧠 Conceptos aplicados
- Asociación bidireccional (uso de referencias cruzadas).
- Encapsulamiento y métodos `setTitular()` y `setPasaporte()`.
- Constructores y método `mostrarInfo()` en cada clase.
- Relaciones 1..1 explícitas en el diseño UML.

### 📋 Ejemplo de salida
Pasaporte N° A1234567
Fecha de emisión: 2025-10-19
Foto: osito.jpg
Titular: Juan Pérez

Titular: Juan Pérez
DNI: 12345678
Pasaporte asociado: A1234567


---

## ⚙️ Requisitos
- Java 8 o superior.
- Editor o IDE (NetBeans, IntelliJ IDEA, Eclipse o VSCode).
- UMLetino (para abrir los diagramas UML del proyecto).

---

## 📂 Estructura del proyecto
Ejercicio1/
├── Foto.java
├── Pasaporte.java
├── Principal.java
Ejercicio2/
├── Foto.java
├── Titular.java
├── Pasaporte.java
├── Principal.java


---

## ✨ Autor
**Yamila Fernández**  
Tecnicatura Universitaria en Programación - UTN  
Trabajo Práctico 5: Relaciones UML 1 a 1
