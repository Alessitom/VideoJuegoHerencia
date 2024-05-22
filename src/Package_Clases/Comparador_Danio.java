package Package_Clases;

import java.util.Comparator;

public interface Comparador_Danio extends Comparator<Personaje> {

    static  Comparador_Danio Ascendente(){
    
        return (personaje1,personaje2)->Float.compare(personaje1.getDaño(), personaje2.getDaño());
    }

    static  Comparador_Danio Descendente(){
    
        return (personaje1,personaje2)->Float.compare(personaje2.getDaño(), personaje1.getDaño());
    }
}
