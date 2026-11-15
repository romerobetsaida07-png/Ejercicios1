package App;

public class Reproductor {
    public String cancion = " -Quiero ver-" ;
    public boolean reproduciendo = false ;

    public Reproductor (String cancion  , boolean reproduciendo ){
        this.cancion = cancion;
        this.reproduciendo = reproduciendo; 
    }
    public void reproducir  ( String cancion ){
        this.cancion=cancion ;
        this.reproduciendo=true;

    }
    public void pausar (){
        
        this.reproduciendo=false ;
    }
    public String estado () {
        if (this.reproduciendo) {
            return "la cancion  "  + cancion + "se esta reproduciendo " ;

        }else {
            return " la cancion "  + cancion + " esta pausada " ;
        }

    }
    public static void main(String[] args) throws Exception {
        Reproductor  reproductor  = new Reproductor ("-Quiero ver-", false);
        

        reproductor.reproducir("-Quiero ver-");
        System.out.println(reproductor.estado());

        reproductor.pausar();
        System.out.println(reproductor.estado());
    }
}
        
    
        



    

