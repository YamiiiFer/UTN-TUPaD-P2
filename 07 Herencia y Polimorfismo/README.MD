# Trabajo Práctico 7: Herencia y Polimorfismo en Java

## Objetivo General

El objetivo de este trabajo práctico es comprender y aplicar los conceptos de **herencia** y **polimorfismo** en la Programación Orientada a Objetos, reconociendo su importancia para la reutilización de código, la creación de jerarquías y el diseño flexible de soluciones en Java.

---

## Marco Teórico

### Conceptos Aplicados

* **Herencia (`extends`)**: permite crear jerarquías entre clases basadas en el principio *is-a*.
* **Modificadores de acceso**: uso de `private`, `protected` y `public` para controlar la visibilidad de atributos y métodos.
* **Constructores y `super`**: inicialización de atributos llamando al constructor de la superclase.
* **Upcasting**: convertir un objeto de una clase específica al tipo de su superclase.
* **`instanceof`**: verificar el tipo real del objeto antes de realizar conversiones.
* **Downcasting**: conversión de un objeto general a uno más específico.
* **Clases abstractas (`abstract`)**: definen estructuras base que deben ser completadas por sus subclases.
* **Métodos abstractos**: métodos declarados sin implementación, obligatorios de sobrescribir.
* **Polimorfismo**: uso de sobrescritura de métodos (`@Override`) y vinculación dinámica.

---

## Katas del Trabajo Práctico

A continuación se desarrollan las diferentes katas propuestas para ejercitar los conceptos.

### 1. Vehículos y Herencia Básica

* Clase base: `Vehiculo` con atributos `marca`, `modelo` y método `mostrarInfo()`.
* Subclase: `Auto` con atributo adicional `cantidadPuertas`.
* La subclase sobrescribe `mostrarInfo()`.
* Tarea: Instanciar un `Auto` y mostrar toda su información.

### 2. Figuras Geométricas y Métodos Abstractos

* Clase abstracta: `Figura` con método abstracto `calcularArea()` y atributo `nombre`.
* Subclases: `Circulo` y `Rectangulo`, implementando el cálculo de área.
* Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.

### 3. Empleados y Polimorfismo

* Clase abstracta: `Empleado` con método abstracto `calcularSueldo()`.
* Subclases: `EmpleadoPlanta` y `EmpleadoTemporal`.
* Tarea: Crear una lista de empleados, invocar `calcularSueldo()` polimórficamente y clasificar los empleados con `instanceof`.

### 4. Animales y Comportamiento Sobrescrito

* Clase base: `Animal` con métodos `hacerSonido()` y `describirAnimal()`.
* Subclases: `Perro`, `Gato`, `Vaca`, cada una sobrescribiendo `hacerSonido()`.
* Tarea: Crear una lista de animales y mostrar sus sonidos mediante polimorfismo.

---

## Conclusiones Esperadas

Al finalizar el trabajo, el estudiante debe ser capaz de:

* Comprender cómo funciona la herencia y por qué favorece la reutilización de código.
* Aplicar polimorfismo para diseñar programas más flexibles y escalables.
* Utilizar `super` para inicializar correctamente objetos dentro de jerarquías.
* Elegir correctamente los modificadores de acceso según el diseño.
* Implementar upcasting, downcasting y `instanceof` de forma segura y fundamentada.
* Diseñar jerarquías usando clases y métodos abstractos cuando corresponda.
* Reconocer los beneficios de la orientación a objetos y aplicar estos principios en soluciones prácticas.

---

## Ejecución del Proyecto

1. Crear las clases correspondientes para cada kata.
2. Implementar los métodos indicados respetando los principios de herencia y polimorfismo.
3. Crear una clase `Main` para cada ejercicio y probar los comportamientos solicitados.
4. Comprobar el correcto funcionamiento del código mediante instancias reales y llamadas polimórficas.

---

## Recomendaciones

* Repetir cada kata cambiando valores, atributos y comportamientos para fortalecer el entendimiento.
* Identificar patrones comunes entre jerarquías y comprender por qué ciertas clases deben ser abstractas.
* Practicar especialmente el uso de polimorfismo y `instanceof`, ya que son muy frecuentes en exámenes y trabajos reales.

---

**Autor:** Yamila Fernández

**Materia:** Programación II – Tecnicatura Universitaria en Programación (UTN)
