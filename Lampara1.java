package App;

public class Lampara1 {
    public boolean encendida = false ;

    public void encender (){
        this.encendida=true;

    }

    public void apagar (){
        this.encendida=false ;
    }

    public String estado () {
        if (this.encendida) {
            return "lampara encendida  " ;

        }else {
            return "lampara apagada " ;
        }

    }

    public static void main(String[] args) throws Exception {
        Lampara1 lampara1 = new Lampara1();
        System.out.println(lampara1.estado());

        lampara1.encender();
        System.out.println(lampara1.estado());   

        
    }
    

    
}
