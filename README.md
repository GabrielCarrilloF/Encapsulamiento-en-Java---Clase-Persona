# Encapsulamiento en Java - Clase Persona

Ejercicio básico en Java para practicar encapsulamiento. La clase `Persona` tiene atributos privados (`nombre`, `edad`, `dni`) y métodos `get` y `set` con validaciones. Incluye un método `mostrarInformacion()` para imprimir los datos. Ideal para principiantes en Java.

---

**Enunciado del ejercicio:**

**Objetivo:** Implementar una clase `Persona` que utilice el concepto de encapsulamiento para gestionar sus atributos.

**Descripción:**

1. Crea una clase llamada `Persona` que tenga los siguientes atributos privados:
   - `nombre` (tipo `String`)
   - `edad` (tipo `int`)
   - `dni` (tipo `String`)

2. Implementa los métodos `get` y `set` para cada uno de los atributos:
   - `getNombre()`
   - `setNombre(String nombre)`
   - `getEdad()`
   - `setEdad(int edad)`
   - `getDni()`
   - `setDni(String dni)`

3. En el método `setEdad(int edad)`, asegúrate de que la edad sea un valor positivo. Si se intenta establecer una edad negativa, el método debe ignorar la solicitud y no cambiar el valor de `edad`.

4. En el método `setDni(String dni)`, asegúrate de que el `dni` tenga una longitud de 9 caracteres. Si se intenta establecer un `dni` con una longitud diferente, el método debe ignorar la solicitud y no cambiar el valor de `dni`.

5. Implementa un método adicional llamado `mostrarInformacion()` que imprima en consola los datos de la persona en el siguiente formato:

   ```
   Nombre: [nombre]
   Edad: [edad]
   DNI: [dni]
   ```

**Ejemplo de uso:**

```java
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Juan Perez");
        persona.setEdad(30);
        persona.setDni("123456789");
        
        persona.mostrarInformacion();
        
        persona.setEdad(-5);  // Intentar establecer una edad negativa
        persona.setDni("12345");  // Intentar establecer un DNI con longitud incorrecta
        
        persona.mostrarInformacion();  // Verificar que los cambios no se aplicaron
    }
}
```

---

**Instrucciones adicionales:**

- Asegúrate de probar tu código para verificar que los métodos `set` están manejando correctamente las validaciones.
- Puedes agregar más validaciones o métodos si lo consideras necesario para practicar el concepto de encapsulamiento.

---

Este ejercicio te ayudará a comprender cómo proteger los datos internos de una clase mediante el uso de métodos `get` y `set`, y cómo implementar validaciones básicas dentro de estos métodos.
