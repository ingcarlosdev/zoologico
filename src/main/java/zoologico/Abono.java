
package zoologico;

import javax.swing.JOptionPane;

public class Abono {
    private double precio;
    private String beneficio;

    public Abono(double precio, String beneficio) {
        this.precio = precio;
        this.beneficio = beneficio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
    
    public void mostrarAbono(double pPrecio, String pBeneficio){
        JOptionPane.showMessageDialog(null, "Este abono tiene como beneficio:\n"+pBeneficio+"\nTiene un valor de:\n"+pPrecio);
    }
}
