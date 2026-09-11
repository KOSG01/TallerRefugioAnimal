# 🏥 TallerRefugioAnimal - Sistema de Gestión de Refugio

Bienvenido al **Taller Educativo de Programación Orientada a Objetos**. Este proyecto 
es un sistema completo de gestión de un refugio de animales diseñado para enseñar 
conceptos fundamentales de Java.

---

## 🎯 ¿Qué es este Taller?

Un proyecto educativo integral que enseña:
- **Programación Orientada a Objetos**: Herencia, Polimorfismo, Interfaces
- **Estructuras de Datos**: Arrays, ArrayList
- **Algoritmos**: Búsqueda Lineal/Binaria, Ordenamiento
- **Manejo de Excepciones**: Validaciones y control de errores
- **Patrones de Diseño**: Separación de modelos y servicios

**Contexto:** Gestión de un refugio de animales que registra, busca, vacuna y 
procesa adopciones de mascotas.

---

## 📖 Documentación Disponible

### Para Estudiantes:

1. **[INDICE_DOCUMENTACION.md](INDICE_DOCUMENTACION.md)** ⭐ **COMIENZA AQUÍ**
   - Guía de navegación
   - Cómo usar la documentación
   - Qué leer según tu necesidad

2. **[DOCUMENTACION_PROYECTO.md](DOCUMENTACION_PROYECTO.md)**
   - Descripción completa del proyecto
   - Explicación de cada clase
   - Descripción de cada servicio
   - Tareas para implementar (ESTUDIANTE 01-15)

3. **[GUIA_CONCEPTOS.md](GUIA_CONCEPTOS.md)**
   - Teoría: Herencia, Polimorfismo, Interfaces
   - Explicación de Arrays
   - Manejo de Excepciones
   - Algoritmos de búsqueda y ordenamiento

4. **[TUTORIAL_PRACTICO.md](TUTORIAL_PRACTICO.md)**
   - Ejemplos paso a paso
   - Código ejecutable
   - Casos de uso prácticos
   - Flujo completo del sistema

5. **[REFERENCIA_RAPIDA.md](REFERENCIA_RAPIDA.md)**
   - Cheat sheet de código común
   - Resumen de servicios
   - Snippets útiles
   - Tabla de TODO

6. **[PREGUNTAS_FRECUENTES.md](PREGUNTAS_FRECUENTES.md)**
   - Preguntas comunes respondidas
   - Errores frecuentes y soluciones
   - Mejores prácticas
   - Debugging

### Para Profesores:

7. **[GUIA_PROFESORES.md](GUIA_PROFESORES.md)**
   - Plan de clase de 7 días
   - Estrategias de enseñanza
   - Rúbricas de evaluación
   - Tips y tricks

---

## 🚀 Comienza en 3 Pasos

### Paso 1: Lee el Índice (5 minutos)
```
Abre: INDICE_DOCUMENTACION.md
Lee: Sección "Empezando desde Cero"
```

### Paso 2: Entiende el Proyecto (30 minutos)
```
Abre: DOCUMENTACION_PROYECTO.md
Lee: Secciones 1-5 (Descripción, Objetivos, Arquitectura, Clases)
Entiende: ¿Qué hace cada clase? ¿Cómo se relacionan?
```

### Paso 3: Aprende Conceptos (45 minutos)
```
Abre: GUIA_CONCEPTOS.md
Lee: Herencia, Polimorfismo, Interfaces
Entiende: Por qué Perro extiende Mascota
         Por qué calcularCostoMensual es diferente en cada clase
```

### Paso 4: Practica (30 minutos)
```
Abre: TUTORIAL_PRACTICO.md
Sigue: Parte 1 (Crear mascotas)
Sigue: Parte 2 (Registrar mascotas)
Practica: En tu IDE con el código
```

---

## 📚 Estructura del Proyecto

```
TallerRefugioAnimal/
│
├─ 📄 Documentación (archivos .md)
│  ├─ README.md (este archivo)
│  ├─ INDICE_DOCUMENTACION.md (EMPIEZA AQUÍ)
│  ├─ DOCUMENTACION_PROYECTO.md (Descripción completa)
│  ├─ GUIA_CONCEPTOS.md (Teoría)
│  ├─ TUTORIAL_PRACTICO.md (Ejemplos)
│  ├─ REFERENCIA_RAPIDA.md (Cheat sheet)
│  ├─ PREGUNTAS_FRECUENTES.md (FAQ)
│  └─ GUIA_PROFESORES.md (Para profesores)
│
├─ 💻 Código Fuente
│  └─ src/
│     ├─ modelo/
│     │  ├─ Mascota.java (Clase base)
│     │  ├─ Perro.java (Hereda de Mascota)
│     │  ├─ Gato.java (Hereda de Mascota)
│     │  ├─ Conejo.java (Hereda de Mascota)
│     │  ├─ Cobrable.java (Interface)
│     │  ├─ RefugioModelo.java (Contenedor)
│     │  ├─ DatosIniciales.java (Datos pre-cargados)
│     │  └─ servicios/
│     │     ├─ RegistroMascotaServicio.java (ESTUDIANTE 01)
│     │     ├─ ActualizacionMascotaServicio.java (ESTUDIANTE 02)
│     │     ├─ EliminacionMascotaServicio.java (ESTUDIANTE 03)
│     │     ├─ BusquedaLinealServicio.java (ESTUDIANTE 04)
│     │     ├─ BusquedaBinariaServicio.java (ESTUDIANTE 05)
│     │     ├─ OrdenamientoBurbujaServicio.java (ESTUDIANTE 06)
│     │     ├─ OrdenamientoSeleccionServicio.java (ESTUDIANTE 07)
│     │     ├─ FiltroMascotaServicio.java (ESTUDIANTE 08)
│     │     ├─ EstadisticaMascotaServicio.java (ESTUDIANTE 09)
│     │     ├─ AdopcionServicio.java (ESTUDIANTE 10)
│     │     ├─ VacunacionServicio.java (ESTUDIANTE 11)
│     │     ├─ CalculoCostoServicio.java (ESTUDIANTE 12)
│     │     ├─ AsignacionJaulaServicio.java (ESTUDIANTE 13)
│     │     ├─ ProcesamientoTextoServicio.java (ESTUDIANTE 14)
│     │     └─ ReporteRefugioServicio.java (ESTUDIANTE 15)
│     ├─ excepcion/
│     │  ├─ DatoInvalidoException.java
│     │  ├─ MascotaNoEncontradaException.java
│     │  └─ MascotaYaAdoptadaException.java
│     └─ ...otros paquetes...
│
└─ 📋 Configuración
   ├─ build.xml
   ├─ nbproject/
   └─ manifest.mf
```

---

## 🎓 Conceptos Enseñados

### Nivel 1: Fundamentos (Clase 1-2)
- ✅ Herencia (extends)
- ✅ Polimorfismo (@Override)
- ✅ Interfaces (implements)
- ✅ Encapsulación (private, protected, public)

### Nivel 2: Operaciones (Clase 3-4)
- ✅ CRUD: Create, Read, Update, Delete
- ✅ Validación de datos
- ✅ Manejo de excepciones
- ✅ Búsqueda (lineal)

### Nivel 3: Algoritmos (Clase 5-6)
- ✅ Búsqueda binaria
- ✅ Ordenamiento (Bubble Sort, Selection Sort)
- ✅ Complejidad de algoritmos O(n), O(log n), O(n²)

### Nivel 4: Integración (Clase 7)
- ✅ Filtrado de datos
- ✅ Cálculo de estadísticas
- ✅ Aplicación completa funcionando

---

## 💼 Casos de Uso del Sistema

1. **Registrar mascota nueva**
   ```java
   Perro nuevo = new Perro(200, "Firulais", 3, 15, 120, false, false, "Criollo");
   registro.agregar(mascotas, nuevo);
   ```

2. **Buscar mascota**
   ```java
   Mascota encontrada = busqueda.buscarPorId(mascotas, 108);
   ```

3. **Actualizar información**
   ```java
   actualizacion.actualizarPeso(mascotas, 108, 20.0);
   ```

4. **Vacunar mascota**
   ```java
   vacunacion.vacunar(mascotas, 108);
   ```

5. **Procesar adopción**
   ```java
   adopcion.adoptar(mascotas, 108);
   ```

6. **Calcular costos**
   ```java
   double total = calculo.calcularCostoTotal(mascotas);
   ```

7. **Filtrar mascotas**
   ```java
   ArrayList<Mascota> perros = filtro.filtrarPorTipo(mascotas, "Perro");
   ```

8. **Eliminar mascota**
   ```java
   Mascota eliminada = eliminacion.eliminarPorId(mascotas, 108);
   ```

---

## 🔧 Configuración del Proyecto

### Requisitos:
- Java 8 o superior
- NetBeans o Eclipse
- Git (opcional)

### Compilación:
```bash
# Desde la línea de comandos
javac -d build/classes src/modelo/*.java
javac -d build/classes src/modelo/servicios/*.java
javac -d build/classes src/excepcion/*.java
```

### Ejecución:
```bash
java -cp build/classes modelo.DatosIniciales
```

### En NetBeans:
1. Abre el proyecto
2. Click derecho → Build
3. Click derecho → Run

---

## 📊 Estadísticas del Proyecto

| Métrica | Cantidad |
|---------|----------|
| Clases principales | 8 |
| Clases heredadas | 3 |
| Interfaces | 1 |
| Excepciones personalizadas | 3 |
| Servicios implementados | 15 |
| Métodos a implementar (estudiantes) | 15 |
| Líneas de documentación | 2000+ |
| Ejemplos de código | 50+ |

---

## 🎯 Objetivos de Aprendizaje

### Después de completar este taller, podrás:

✅ **Entender OOP**
- Crear clases que hereden de otras
- Implementar y usar interfaces
- Aplicar polimorfismo en tu código

✅ **Trabajar con Datos**
- Manejar arrays de objetos
- Usar ArrayList para colecciones dinámicas
- Validar e procesar datos

✅ **Implementar Algoritmos**
- Búsqueda lineal y binaria
- Ordenamiento (Bubble Sort, Selection Sort)
- Entender complejidad O(n), O(log n), O(n²)

✅ **Manejar Errores**
- Crear excepciones personalizadas
- Validar entrada
- Usar try-catch efectivamente

✅ **Escribir Código Profesional**
- Código limpio y legible
- Nombres descriptivos
- Documentación clara
- Testing básico

---

## 🆘 ¿Necesitas Ayuda?

### Si no entiendes un concepto:
1. Ve a: **GUIA_CONCEPTOS.md**
2. Busca la sección correspondiente
3. Lee ejemplos

### Si necesitas implementar un método:
1. Ve a: **DOCUMENTACION_PROYECTO.md**
2. Busca "ESTUDIANTE XX"
3. Lee la descripción
4. Ve a: **PREGUNTAS_FRECUENTES.md**
5. Busca P-número similar
6. Copia el código y adapta

### Si tienes un error:
1. Lee el mensaje de error
2. Ve a: **PREGUNTAS_FRECUENTES.md**
3. Busca sección "Errores Comunes"
4. Sigue la solución

### Si no sabes por dónde empezar:
1. Abre: **INDICE_DOCUMENTACION.md**
2. Lee: "Empezando desde Cero"
3. Sigue los pasos en orden

---

## 📈 Progresión Esperada

```
Semana 1
├─ Día 1: Herencia y Polimorfismo (ESTUDIANTE 01)
├─ Día 2: Interfaces y Excepciones
├─ Día 3: Búsqueda Lineal (ESTUDIANTE 04) y Registro
├─ Día 4: Actualización y Eliminación (ESTUDIANTE 02, 03)
├─ Día 5: Búsqueda Binaria (ESTUDIANTE 05)
├─ Día 6: Ordenamiento (ESTUDIANTE 06, 07)
└─ Día 7: Filtrado, Cálculos e Integración (ESTUDIANTE 08, 12)

Proyecto Final: Sistema completo funcionando
```

---

## 🏆 Validación de Éxito

Sabrás que completaste correctamente cuando:

✅ El código compila sin errores
✅ Todos los métodos ejecutan sin excepciones no manejadas
✅ Puedes crear, buscar, actualizar y eliminar mascotas
✅ Entiendes por qué cada clase hereda de Mascota
✅ Entiendes por qué los costos son diferentes por tipo
✅ Puedes explicar la diferencia entre búsqueda lineal y binaria
✅ Tu código sigue estándares de limpieza
✅ Todos los casos de prueba pasan

---

## 📞 Datos de Contacto / Soporte

Este es un proyecto educativo. Si encuentras errores o tienes sugerencias:

1. Consulta primero la documentación
2. Revisa PREGUNTAS_FRECUENTES.md
3. Contacta a tu profesor

---

## 📜 Licencia y Derechos

Este proyecto es de código abierto para propósitos educativos.
Siéntete libre de modificar, adaptar y mejorar.

**Créditos:** Profesor de Desarrollo de Software 2026

---

## 🎬 ¿Listo para Empezar?

```
1. Abre: INDICE_DOCUMENTACION.md
2. Lee: Sección "Empezando desde Cero"
3. Sigue: Los 4 pasos propuestos
4. Practica: Con el código
5. Implementa: Los métodos ESTUDIANTE
6. Celebra: ¡Lo lograste! 🎉
```

---

## 📚 Recursos Externos Recomendados

- Oracle Java Documentation: https://docs.oracle.com/javase/
- GeeksforGeeks - Java Tutorials
- TutorialsPoint - Java Programming
- YouTube - Programming with Java (canales educativos)

---

## 🌟 Características Especiales

✨ **Documentación Educativa Completa**
- 7 archivos markdown + 1 README
- 2000+ líneas de explicaciones
- 50+ ejemplos de código

✨ **Cobertura de Conceptos**
- Todos los conceptos clave de POO
- Algoritmos fundamentales
- Patrones de diseño básicos

✨ **Práctica Integrada**
- 15 tareas progresivas
- Casos de uso realistas
- Sistema completo al final

✨ **Materiales para Aprender**
- Tutorial paso a paso
- Guía de conceptos
- Preguntas frecuentes respondidas

---

**¡Bienvenido al Taller TallerRefugioAnimal! 🐾**

Esperamos que disfrutes aprendiendo programación a través de este proyecto educativo.

Que empiece la aventura. 🚀

---

**Versión:** 1.0  
**Nivel:** Principiante a Intermedio  
**Duración:** 1-2 semanas  
**Última actualización:** 2026  

**⭐ Comienza en INDICE_DOCUMENTACION.md ⭐**
