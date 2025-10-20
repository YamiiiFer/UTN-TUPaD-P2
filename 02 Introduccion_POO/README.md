# 📘 Programación II – Trabajo Práctico 3  
**Introducción a la Programación Orientada a Objetos (POO)**  

---

## 🎯 Objetivo General
Comprender los fundamentos de la Programación Orientada a Objetos, incluyendo **clases, objetos, atributos y métodos**, para estructurar programas de manera modular y reutilizable en Java.

---

## 🧾 Marco Teórico
La Programación Orientada a Objetos (POO) se basa en representar elementos del mundo real mediante **clases** (plantillas) y **objetos** (instancias).  
Este TP aplica conceptos clave como:
- Definición de clases con atributos y métodos.
- Encapsulamiento (`private`, getters y setters).
- Creación y uso de objetos.
- Simulación de comportamientos mediante métodos.
- Control de estados y validaciones.

---

## 🛠️ Ejercicios Desarrollados

### 1️⃣ Registro de Estudiantes
- **Clase:** `Estudiante`
- **Atributos:** `nombre`, `apellido`, `curso`, `calificacion`  
- **Métodos:** `mostrarInfo()`, `subirCalificacion(puntos)`, `bajarCalificacion(puntos)`  
- **Tarea:** Instanciar un estudiante, mostrar su información, aumentar y disminuir calificaciones.  
- **Concepto aplicado:** Encapsulamiento y validación de atributos.

---

### 2️⃣ Registro de Mascotas
- **Clase:** `Mascota`
- **Atributos:** `nombre`, `especie`, `edad`  
- **Métodos:** `mostrarInfo()`, `cumplirAnios()`  
- **Tarea:** Crear una mascota, mostrar su información, simular el paso del tiempo y verificar cambios en la edad.  
- **Concepto aplicado:** Encapsulamiento y simulación del ciclo de vida.

---

### 3️⃣ Encapsulamiento con la Clase Libro
- **Clase:** `Libro`
- **Atributos privados:** `titulo`, `autor`, `anioPublicacion`  
- **Métodos:** Getters, setter validado para `anioPublicacion`, `mostrarInfo()`  
- **Tarea:** Crear un libro, intentar asignar un año inválido y luego uno válido, mostrando la información final.  
- **Concepto aplicado:** Validación de datos y uso de getters/setters.

---

### 4️⃣ Gestión de Gallinas en Granja Digital
- **Clase:** `Gallina`
- **Atributos:** `idGallina`, `edad`, `huevosPuestos`  
- **Métodos:** `ponerHuevo()`, `envejecer()`, `mostrarEstado()`  
- **Tarea:** Crear dos gallinas, simular acciones (envejecer y poner huevos) y mostrar su estado inicial y final.  
- **Concepto aplicado:** Simulación de objetos con cambios en atributos.

---

### 5️⃣ Simulación de Nave Espacial
- **Clase:** `NaveEspacial`
- **Atributos:** `nombre`, `combustible` (máx. 100)  
- **Métodos:** `despegar()`, `avanzar(distancia)`, `recargarCombustible(cantidad)`, `mostrarEstado()`  
- **Reglas:** Validar que haya suficiente combustible antes de avanzar y no superar el máximo al recargar.  
- **Tarea:** Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, recargar y avanzar correctamente. Mostrar el estado final.  
- **Concepto aplicado:** Manejo de estados y validaciones.

---

## ✅ Conclusiones
- Diferenciar entre **clases** (modelo) y **objetos** (instancias).  
- Aplicar **encapsulamiento** para proteger los datos internos.  
- Usar **getters y setters** para gestionar atributos privados.  
- Definir métodos que representen **comportamientos** de los objetos.  
- Controlar y actualizar el **estado** de los objetos durante la ejecución.  
- Aplicar buenas prácticas de **modularidad y reutilización** en Java.  

---

## 📂 Estructura del Proyecto
Unidad3/
└── IntroduccionPOO/
├── Ejercicio1/ # Registro de Estudiantes
├── Ejercicio2/ # Registro de Mascotas
├── Ejercicio3/ # Clase Libro
├── Ejercicio4/ # Gestión de Gallinas
├── Ejercicio5/ # Nave Espacial
└── README.md # Documentación general

---

✍️ **Autora:** Yamila Fernández  
📚 **Materia:** Programación II – Tecnicatura Universitaria en Programación
