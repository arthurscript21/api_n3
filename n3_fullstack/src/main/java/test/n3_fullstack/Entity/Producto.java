/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author PAAWSA02LC1009
 */
@Entity
@Table(name="PRODUCTO")
public class Producto {
    @Id
    @GeneratedValue
    private int Producto_id;

    @Column(name="nombreProducto")
    private String nombreProducto;

    @Column(name="precio")
    private int precio;

    @Column(name="detalle")
    private String detalle;
    
    @Column(name = "stock")
    private int stock;
            
    @Column(name = "stockCritico")
    private int stockCritico;
    
    @Column(name = "url")
    private String url;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categotia_id_fk", nullable = false)
    private Categoria categoria;
    
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    private List<Detalle> detalles;

    public int getProducto_id() {
        return Producto_id;
    }

    public void setProducto_id(int Producto_id) {
        this.Producto_id = Producto_id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(int stockCritico) {
        this.stockCritico = stockCritico;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Producto{" + "Producto_id=" + Producto_id + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", detalle=" + detalle + ", stock=" + stock + ", stockCritico=" + stockCritico + ", url=" + url + ", categoria=" + categoria + ", detalles=" + detalles + '}';
    }

    
    
}
