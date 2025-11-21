/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.Entity;

import jakarta.persistence.*;
import java.sql.Date;
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

    @Column(name = "fecha")
    private Date fecha;


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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        return "Boleta{" + "boleta_id=" + boleta_id + ", fecha=" + fecha + ", totalboleta=" + totalboleta + ", usuario=" + usuario + '}';
    }

   

    
}
