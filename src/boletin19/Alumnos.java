package boletin19;

import java.util.ArrayList;

public class Alumnos implements Comparable{
    private String nombre;
    private int nota;

    public Alumnos(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
        
    public int compareTo(Object o) {
        Alumnos al =(Alumnos)o;
        if(this.nombre.compareToIgnoreCase(al.nombre)==0)
            return 0;
        else if (this.nombre.compareToIgnoreCase(al.nombre)>0)
            return 1;
        else
            return -1;
    }
}
    

