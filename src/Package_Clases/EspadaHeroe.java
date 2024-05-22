package Package_Clases;
public interface EspadaHeroe {

    default public  String Hamatado(Personaje personaje){
        
        return "Ha matado con la Espada Excalibur el heroe "+personaje.getNombre();
    }
}
