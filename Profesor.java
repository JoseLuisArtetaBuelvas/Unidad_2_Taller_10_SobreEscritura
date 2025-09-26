package Unidad_2_Taller_10_SobreEscrituraMetodos;

public class Profesor extends Persona{
    public Profesor(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void presentarse(){
        super.presentarse();
        System.out.println("Soy Profesor");
    }
}
