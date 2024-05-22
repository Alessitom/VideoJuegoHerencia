package Package_Clases;
public interface EspadaVillano {

    default public  String Hamatado(Personaje personaje){
        
        return "Ha matado con la Espada tizona el villano "+personaje.getNombre();
    }
}
