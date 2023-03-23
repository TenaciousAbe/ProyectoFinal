package herencia.pasteleria;
public class PastelFiestaCumple extends Pastel {
    //atributo velas (privado), sabor chocolate
    private int velas;
    //private String sabor;
    //private double precio;
    public PastelFiestaCumple(){
        super();
        setSabor("Chocolate");
        //super(getSabor(), getPrecio());
    }
    public void setVelas(int velas){
        this.velas = velas;
    }
    /*public String getSabor(){
        return this.sabor;
    }
    public double getPrecio(){
        return this.precio;
    }*/
    public double getVelas(){
        return this.velas;
    }
}
