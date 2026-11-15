package App;

public class Termometro {

    public double temperatura;

    public Termometro (){
        this.temperatura = 36.2;
    }
    public void subir (double grados){
        temperatura= temperatura + grados;     
    }
     public void bajar (double grados){
        temperatura= temperatura - grados;
    }
    public String mostrarTemperatura (){
        return  "" + temperatura + "c";
    }
    public static void main(String[] args) throws Exception {
        Termometro ter = new Termometro();
        System.out.println("Temperatura inicial  : " + ter.mostrarTemperatura());
        ter.subir(2);
        System.out.println("Temperatura subida  : " + ter.mostrarTemperatura());
        ter.bajar(5);
        System.out.println("Temperatura  bajada : " + ter.mostrarTemperatura());
    }



    
}
