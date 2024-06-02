public class Persona {
    private String Nombre;
    private int Edad;
    private String Dni;

    public String getNombre(){
        return Nombre;
    }

    public int getEdad(){
        return Edad;
    }

    public String getDni(){
        return Dni;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad){
        if(Edad > 0){
            this.Edad = Edad;
        }
    }

    public void setDni(String Dni){
        if(Dni.length() == 9){
            this.Dni = Dni;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: ["+getNombre()+"]");
        System.out.println("Edad: ["+getEdad()+"]");
        System.out.println("DNI: ["+getDni()+"]");
    }
}