public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Gabriel Carrillo");
        persona.setEdad(19);
        persona.setDni("123456789");
        
        persona.mostrarInformacion();
        
        persona.setEdad(-5);  // Intentar establecer una edad negativa
        persona.setDni("12345");  // Intentar establecer un DNI con longitud incorrecta
        
        persona.mostrarInformacion();  // Verificar que los cambios no se aplicaron
    }
}