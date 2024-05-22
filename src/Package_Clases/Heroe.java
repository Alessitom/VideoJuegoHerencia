package Package_Clases;

public class Heroe extends Personaje implements EspadaHeroe {

    private TipoHeroe tipo;
    

   

    public Heroe(String nombre, TipoHeroe tipo) {
        super(nombre);
        this.tipo = tipo;
    }






    @Override
    public void gritar() {
        
        System.out.println(Nombre+" "+tipo+" NO VENCERAS!!!!");
    }

    @Override
    public void recibirdaño(float daño, Personaje personaje1) {
        super.recibirdaño(daño, personaje1);
    }

    @Override
    public float atacar(Personaje personaje) {
        return super.atacar(personaje);
    }




    public TipoHeroe getTipo() {
        return tipo;
    }




    public void setTipo(TipoHeroe tipo) {
        this.tipo = tipo;
    }






    @Override
    public String Hamatado(Personaje personaje) {
        return "Ha matado con la Espada Excalibur el heroe "+personaje.getNombre();
    }






    


    
   
    
}
