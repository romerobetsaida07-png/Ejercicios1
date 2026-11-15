package App;

public class Semaforo {
    public String Color;

    public void CambiarRojo(){
        this.Color ="Rojo";
    }
    public void CambiarAmarillo(){
        this.Color= "Amarillo";
    }
    public void CambiarVerde(){
        this.Color = "verde";
    }
    public String MostrarColor() {
        return Color;
    }
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.CambiarVerde();
        System.out.println(semaforo.MostrarColor());
        semaforo.CambiarRojo();
        System.out.println(semaforo.MostrarColor());
        semaforo.CambiarAmarillo();
        System.out.println(semaforo.MostrarColor());
    }


    
}
