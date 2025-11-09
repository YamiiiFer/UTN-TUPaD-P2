# 🧾 Trabajo Práctico 6 – Colecciones y Sistema de Stock

**Materia:** Programación II  
**Carrera:** Tecnicatura Universitaria en Programación – UTN  
**Alumno/a:** Yamila Fernández  
**Año:** 2025  

---

## 🎯 Objetivo
Desarrollar un sistema de stock en Java aplicando Programación Orientada a Objetos y colecciones dinámicas (`ArrayList`), utilizando enumeraciones (`enum`) para representar categorías.

---

## 🏗️ Clases del Proyecto

### 🧩 Producto
- Atributos: `id`, `nombre`, `precio`, `cantidad`, `categoria`
- Métodos: `mostrarInfo()`, getters y setters.

### 🧩 CategoriaProducto (enum)
Enum con categorías predefinidas:
- `ALIMENTOS`, `ELECTRONICA`, `ROPA`, `HOGAR`  
Cada una tiene una descripción asociada mediante un atributo `descripcion`.

### 🧩 Inventario
Administra los productos mediante un `ArrayList<Producto>`.

**Métodos principales:**
- `agregarProducto(Producto p)`
- `listarProductos()`
- `buscarProductoPorId(String id)`
- `eliminarProducto(String id)`
- `actualizarStock(String id, int nuevaCantidad)`
- `filtrarPorCategoria(CategoriaProducto categoria)`
- `obtenerTotalStock()`
- `obtenerProductoConMayorStock()`
- `filtrarProductosPorPrecio(double min, double max)`
- `mostrarCategoriasDisponibles()`

### 🧩 Principal
Contiene el método `main` donde se:
1. Crea el inventario.  
2. Agregan 5 productos de distintas categorías.  
3. Se prueban todas las funcionalidades del sistema.

---

## 💻 Tecnologías
- Lenguaje: **Java**
- IDE: **NetBeans / IntelliJ IDEA / Eclipse**
- Paradigma: **Programación Orientada a Objetos**

---

## 📦 Resultado
El programa permite:
- Agregar, listar, buscar y eliminar productos.  
- Filtrar por categoría o rango de precios.  
- Calcular el total de stock.  
- Mostrar el producto con mayor stock.  
- Visualizar las categorías disponibles.

---

**✅ Trabajo completado con todos los requerimientos del TP6.**
