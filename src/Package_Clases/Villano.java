package Package_Clases;

public class Villano extends Personaje implements EspadaVillano  {

    private final TipoVillano tipo;
    
    

    public Villano(String nombre, TipoVillano tipo) {
        super(nombre);
        this.tipo = tipo;
    }


    

    @Override
    public void gritar() {
        
        System.out.println(Nombre+" "+tipo+" VENCERÉ JAJAJAJA!!!!");
    }

    @Override
    public void recibirdaño(float daño, Personaje personaje1) {
        super.recibirdaño(daño, personaje1);
    }

    @Override
    public float atacar(Personaje personaje) {
        return super.atacar(personaje);
    }

    @Override
    public String Hamatado(Personaje personaje) {
        return EspadaVillano.super.Hamatado(personaje);
    }

    

    
   
    




   


    

}
