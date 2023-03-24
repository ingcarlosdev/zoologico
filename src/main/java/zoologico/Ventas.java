
package zoologico;

import java.util.Date;

public class Ventas extends Cliente {
    private String tipoCompra;
    private double valorCompraN;
    private double valorCompraA;
    private Date fecha;
    private int cantidad;
    private double total;

    public Ventas(String tipoCompra, double valorCompraN, double valorCompraA, Date fecha, int cantidad, double total, String nombre, String cedula, int edad, char genero, int visitas) {
        super(nombre, cedula, edad, genero, visitas);
        this.tipoCompra = tipoCompra;
        this.valorCompraN = valorCompraN;
        this.valorCompraA = valorCompraA;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public double getValorCompraN() {
        return valorCompraN;
    }

    public void setValorCompraN(double valorCompraN) {
        this.valorCompraN = valorCompraN;
    }

    public double getValorCompraA() {
        return valorCompraA;
    }

    public void setValorCompraA(double valorCompraA) {
        this.valorCompraA = valorCompraA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    
}
