package Unidad_2_Taller_10_SobreEscrituraMetodos;

public class ProbarPersonaEstudianteProfesor {
    public static void main(String[] args){
        Persona persona = new Persona("Irany", 21);
        Estudiante estudiante = new Estudiante("Jose", 21);
        Profesor profesor = new Profesor("Jose Arrieta", 45);
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
