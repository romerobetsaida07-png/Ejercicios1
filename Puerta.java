package App;

public class Puerta {
    public boolean abierta = false;

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public String estado() {
        if (this.abierta) {
            return "Puerta abierta";
        } else {
            return "Puerta cerrada";
        }
    }

    public static void main(String[] args) throws Exception {
        Puerta puerta = new Puerta();
        System.out.println(puerta.estado());

        puerta.abrir();
        System.out.println(puerta.estado());

        puerta.cerrar();
        System.out.println(puerta.estado());
    }
    
}
