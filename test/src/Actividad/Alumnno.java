package Actividad;

public class Alumnno {
    String nombre = "";
    Integer edad = 0;
    String carrera = "";
    Integer cuatrimestre = 0;
    Boolean inscrito = Boolean.FALSE;

    // Constructor
    public Alumnno(
            String nombre,
            int edad,
            String carrera,
            int cuatrimestre,
            boolean inscrito
    ){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.inscrito = inscrito;

    }

    public String mostrar(){
        return "Nombre "+this.nombre+"\n"+
                "Edad "+this.edad+"\n"+
                "Carrera "+this.carrera+"\n"+
                "Cuatrimestre "+this.cuatrimestre+"\n"+
                "inscrito "+this.inscrito+"\n";
    }


}
