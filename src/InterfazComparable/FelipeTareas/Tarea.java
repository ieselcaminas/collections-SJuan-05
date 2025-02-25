package InterfazComparable.FelipeTareas;

public class Tarea implements Comparable<Tarea>{
    private int tiempo;
    private int prioridad;

    public Tarea(int tiempo, int prioridad){
        this.tiempo = tiempo;
        this.prioridad = prioridad;
    }

    public int getTiempo(){
        return this.tiempo;
    }
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }

    public int getPrioridad(){
        return this.prioridad;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    @Override
    public String toString(){
        return this.tiempo + " - " + this.prioridad;
    }

    public int compareTo(Tarea other){
        if (this.prioridad ==  other.getPrioridad()){

            return this.tiempo - other.tiempo;
        } else {

            return this.prioridad - other.prioridad;
        }
    }
}
