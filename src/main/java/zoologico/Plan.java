
package zoologico;

import javax.swing.JOptionPane;

public class Plan {
    private double precioA;
    private double precioN;
    private String recorrido;
    private String comida;

    public Plan(double precioA, double precioN, String recorrido, String comida) {
        this.precioA = precioA;
        this.precioN = precioN;
        this.recorrido = recorrido;
        this.comida = comida;
    }

    public double getPrecioA() {
        return precioA;
    }

    public void setPrecioA(double precioA) {
        this.precioA = precioA;
    }

    public double getPrecioN() {
        return precioN;
    }

    public void setPrecioN(double precioN) {
        this.precioN = precioN;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    
    public void mostrarPlan(double pPrecioA, double pPrecioN, String pRecorrido, String pComida){
        JOptionPane.showMessageDialog(null, "Este plan tiene un recorrido por\n"+pRecorrido+"\n"+pComida+"\nTiene un valor de:\n"+pPrecioA+"\n"+pPrecioN);
    }
}
