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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Producto_id;
    private String nombreProducto;
    private int precio;
    private String detalle;
    private int stock;
    private int stockCritico;
    private String url;
    
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categotia_id_fk", nullable = false)
    private Categoria categoria;*/
    
    /*@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
    private List<Detalle> detalles;*/

    public Producto(String nombreProducto, int precio, String detalle, int stock, int stockCritico, String url, Categoria categoria) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.detalle = detalle;
        this.stock = stock;
        this.stockCritico = stockCritico;
        this.url = url;
        
    }

    public Producto() {
    }

    public int getProducto_id() {
        return Producto_id;
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

    /*public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }*/

    @Override
    public String toString() {
        return "Producto{" + "Producto_id=" + Producto_id + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", detalle=" + detalle + ", stock=" + stock + ", stockCritico=" + stockCritico + ", url=" + url + ", categoria=" +'}';
    }
    
}
