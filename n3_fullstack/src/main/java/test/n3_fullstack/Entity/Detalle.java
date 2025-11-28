package test.n3_fullstack.Entity;

import jakarta.persistence.*;
// Se eliminó la importación de java.util.List, ya no es necesaria.

@Entity
@Table(name="DETALLE") // Nombre de tabla corregido (uso mayúsculas por convención)
public class Detalle {
    
    @Id
    @GeneratedValue
    private int detalle_id;
    
    @Column(name="cantidad")
    private int cantidad;
    
    @Column(name = "total")
    private int total;
    
    @Column(name = "descuento")
    private int descuento;
    
    /* 🔔 LLAVE FORÁNEA 1: Muchos detalles pertenecen a UNA Boleta
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boleta_id_fk", nullable = false)
    private Boleta boleta;
    
    // 🔔 LLAVE FORÁNEA 2: Muchos detalles usan UN Producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id_fk", nullable = false)
    private Producto producto;*/

    public Detalle(int detalle_id, int cantidad, int total, int descuento) {
        this.detalle_id = detalle_id;
        this.cantidad = cantidad;
        this.total = total;
        this.descuento = descuento;
    }

    public Detalle() {
    }

    public int getDetalle_id() {
        return detalle_id;
    }

    public void setDetalle_id(int detalle_id) {
        this.detalle_id = detalle_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Detalle{" + "detalle_id=" + detalle_id + ", cantidad=" + cantidad + ", total=" + total + ", descuento=" + descuento + '}';
    }

       
}