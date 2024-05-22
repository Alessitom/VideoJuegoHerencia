package Package_Clases;

import java.util.Random;

public   class Personaje {

    protected  String Nombre;
    protected float Vida;
    private static final float MAX_VIDA = 100;
    protected float daño;

    public Personaje(String nombre) {
        Nombre = nombre;
        Vida = MAX_VIDA;
        this.daño = daño;
    }
   

    public Personaje(Personaje otro) {
        this.Nombre = otro.Nombre;
        this.Vida = otro.Vida;
        this.daño = otro.daño;
    }
    


    public void gritar(){

    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getVida() {
        return Vida;
    }

    public void setVida(float vida) {
        Vida = vida;
    }

    public static float getMaxVida() {
        return MAX_VIDA;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public  float atacar(Personaje personaje){
        Random random = new Random();
        personaje.setDaño( random.nextFloat(1, MAX_VIDA));
        System.out.println(personaje.getNombre()+" Ha atacado con "+personaje.getDaño()+" de daño");
        return personaje.getDaño();
        
    }

    public void recibirdaño(float daño,Personaje personaje1){

        if(personaje1.getVida()>=0){
            personaje1.setVida(personaje1.getVida()-daño);
            if(personaje1.getVida()<0)
            {
                personaje1.setVida(0);
            }
            System.out.println("A "+personaje1.getNombre()+ " le queda "+personaje1.getVida()+" de vida");

        }else{
            System.out.println(personaje1.getNombre()+" ya está muerto");
        }
        
    }
    
    
}
