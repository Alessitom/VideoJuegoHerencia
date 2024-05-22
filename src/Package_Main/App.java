package Package_Main;
import Package_Clases.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class App {
    static List<Personaje>ArrayList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Personaje personaje1 = new Personaje("Spencer");
        Personaje personaje2 = new Personaje("Crayola");


        int num = random.nextInt(1,3);

        if(num ==1){
            personaje1 = new Heroe(personaje1.getNombre(), TipoHeroe.values()[new Random().nextInt(TipoHeroe.values().length)]);
            personaje1.gritar();
            
        }if(num==2){
            personaje2 = new Villano(personaje2.getNombre(),TipoVillano.values()[new Random().nextInt(TipoVillano.values().length)]);

            personaje2.gritar();
        }

        while(personaje1.getVida()>0 && personaje2.getVida()>0){

            num = random.nextInt(2)+1;
            if(num==1){
                if(comprobarVida(personaje1)){
                    personaje1.atacar(personaje1);
                    Personaje nuevo = new Personaje(personaje1);
                    ArrayList.add(nuevo);
                    personaje2.recibirdaño(personaje1.getDaño(), personaje2);
                    System.out.println(" ");
                    if(!comprobarVida(personaje2)){
                        personaje2.setVida(0);
                        System.out.println(personaje2.getNombre()+ " Ha muerto");
                        if(personaje1 instanceof Heroe){
                            System.out.println(((Heroe) personaje1).Hamatado(personaje1));
                        }
                    }
                }
            }
            if(num==2){
                if(comprobarVida(personaje2)){
                    personaje2.atacar(personaje2);
                    Personaje nuevo2 = new Personaje(personaje2);
                    ArrayList.add(nuevo2);
                    System.out.println(" ");
                    personaje1.recibirdaño(personaje2.getDaño(), personaje1);
                    if(!comprobarVida(personaje1)){
                        personaje1.setVida(0);
                        System.out.println(personaje1.getNombre()+ " Ha muerto");
                        if(personaje2 instanceof Villano){
                            System.out.println(((Villano) personaje2).Hamatado(personaje2));
                        }
                    }
                }
            }


           

            
        }
        System.out.println(" ");

        System.out.println("========================================");
        System.out.println(" ");

        ListadoDaño();
       
        
    }
   public static void ListadoDaño() {
    List<Personaje> NuevaLista = new ArrayList<>();
    StringBuilder Listado = new StringBuilder();
    Listado.append("Personaje | Daño realizado\n");
    Listado.append("--------- | ---------------\n");
    
    // Agrega todos los elementos de ArrayList a NuevaLista
    NuevaLista.addAll(ArrayList);
    
    // Ordena NuevaLista utilizando el comparador de daño ascendente
    Collections.sort(NuevaLista, Comparador_Danio.Descendente());
    
    // Itera sobre NuevaLista y agrega los datos al StringBuilder
    for (Personaje e : NuevaLista) {
        Listado.append(e.getNombre() + "   |  " + e.getDaño() + "\n");
    }
    Listado.append("Las espadas han sido Excalibur y la Tizona");
    // Imprime el listado de daños
    System.out.println(Listado.toString());
}


    

    public static boolean comprobarVida(Personaje personaje){
        if(personaje.getVida()>0){
            return true;
        }else
            personaje.setVida(0);
            return false;
    }

}
