package herencia.pasteleria;
public class PastelBoda extends Pastel {
    //Atributo niveles (privado), sabor almendra
    private int niveles;
    public int niveles(){
        return this.niveles = niveles;
    }
    public PastelBoda(){
        super();
        setSabor("Almendra");
    }
    public void setNiveles(int niveles){
        this.niveles = niveles;
    }
    public double getNiveles(){
        return this.niveles;
    }
}
