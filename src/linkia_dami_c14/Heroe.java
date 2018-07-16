package linkia_dami_c14;

import java.util.Objects;

/**
 *
 * @author dmorenoar
 */
public class Heroe{
    private String nombre;
    private String[] poderes;

    public Heroe(String nombre) {
        this.nombre = nombre;
    }

    public Heroe(String nombre, String[] poderes) {
        this.nombre = nombre;
        this.poderes = poderes;
    }

    public Heroe(Heroe h){
        this.nombre = h.getNombre();
        this.poderes = h.getPoderes();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String[] getPoderes() {
        return poderes;
    }
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }
    
    //[ataque1,ataque2,ataque3]
    //[módulo1,módulo2,módulo3]
    public void setPoder(String poder, int ataque){
        poderes[ataque] = poder;
    }
    
    public void resetPoder(int ataque){
        poderes[ataque] = "Sin ataque";
    }
    
    //Recibimos la posición del poder a mostrar y además todo el array de poderes
    public String mostrarPoder(int pos, String[] poderes){
        return poderes[pos];
    }
    
    public void mostrarPoderesHeroeForma1(Heroe h){
        
        /*Heroe
            [Poderes]
                ->
        */
        String[] poderes = h.getPoderes();
        
        for(int i=0;i<h.getPoderes().length;i++){
            System.out.println(poderes[i]);
        }
    }
    
    public void mostrarPoderesHeroeForma2(Heroe h){
       for(int i=0;i<h.getPoderes().length;i++){
            System.out.println(mostrarPoder(i, h.getPoderes()));
        } 
    }
    
    //Para hacer una representación textual de un objeto
    @Override
    public String toString() {
        return "Heroe{" + "nombre=" + nombre + ", poderes=" + mostrarPoderes() + '}';
    }
    public String mostrarPoderes(){
        return poderes[0] + "," + poderes[1] + "," + poderes[2];
    }

    //Para clonar un objeto
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    //@Override sirve para sobreescribir un método
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Heroe other = (Heroe) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
  
}
