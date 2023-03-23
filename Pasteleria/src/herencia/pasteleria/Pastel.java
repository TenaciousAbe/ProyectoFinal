package herencia.pasteleria;
public class Pastel {
    private String sabor;
    private double precio;
    public Pastel(String sabor, double precio){
        this.sabor = sabor;
        this.precio = precio;
    }
    public Pastel(){
        setSabor("Vainilla");
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
   public String getSabor(){
       return this.sabor;
   }
   public double getPrecio(){
       return this.precio;
   }
}
