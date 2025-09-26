package Unidad_2_Taller_10_SobreEscrituraMetodos;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse(){
        System.out.println("Hola buenas tardes, mi nombre es: " + nombre + " Y tengo " + edad + " años");
    }
}
