/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Duoc
 */
@Entity
@Table(name="boleta")
public class Boleta {
    @Id
    @GeneratedValue
    private int boleta_id;

    @Column(name="usuario")
    private String usuarioboleta;

    @Column(name="productos")
    private String productoboleta;

    @Column(name="cantidad")
    private int cantidadbolesta;

    @Column(name="precio")
    private int precioboleta;

    @Column(name="total")
    private int totalboleta;
    
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id_fk", nullable = false)
    private Usuarios usuario;

    public int getBoleta_id() {
        return boleta_id;
    }

    public void setBoleta_id(int boleta_id) {
        this.boleta_id = boleta_id;
    }

    public String getUsuarioboleta() {
        return usuarioboleta;
    }

    public void setUsuarioboleta(String usuarioboleta) {
        this.usuarioboleta = usuarioboleta;
    }

    public String getProductoboleta() {
        return productoboleta;
    }

    public void setProductoboleta(String productoboleta) {
        this.productoboleta = productoboleta;
    }

    public int getCantidadbolesta() {
        return cantidadbolesta;
    }

    public void setCantidadbolesta(int cantidadbolesta) {
        this.cantidadbolesta = cantidadbolesta;
    }

    public int getPrecioboleta() {
        return precioboleta;
    }

    public void setPrecioboleta(int precioboleta) {
        this.precioboleta = precioboleta;
    }

    public int getTotalboleta() {
        return totalboleta;
    }

    public void setTotalboleta(int totalboleta) {
        this.totalboleta = totalboleta;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Boleta{" + "boleta_id=" + boleta_id + ", usuarioboleta=" + usuarioboleta + ", productoboleta=" + productoboleta + ", cantidadbolesta=" + cantidadbolesta + ", precioboleta=" + precioboleta + ", totalboleta=" + totalboleta + ", usuario=" + usuario + '}';
    }

    

    

    
}
