package Unidad_2_Taller_10_SobreEscrituraMetodos;

public class Estudiante extends Persona{
    public Estudiante(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void presentarse(){
        super.presentarse();
        System.out.println("Soy estudiante");
    }
}
