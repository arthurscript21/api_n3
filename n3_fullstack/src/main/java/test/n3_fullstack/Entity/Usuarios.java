/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.Entity;
import jakarta.persistence.*;

/**
 *
 * @author PAAWSA02LC1009
 */
@Entity
@Table(name="USUARIO")
public class Usuarios {
    
    @Id
    @GeneratedValue
    private  int user_id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id_fk", nullable = false)
    private Usuarios usuario;
    
    @Column(name="NombreCompleto")
    private String nombreCompleto;
    
    @Column(name="contrasena")
    private String contrasena;

    @Column(name="direccion")
    private String direccion;

    @Column(name="correo")
    private String correo;
    
    @Column(name="telefono")
    private int telefono;
    
    @Column(name="comuna")
    private String comuna;
    
    @Column(name="region")
    private String region;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user_id=" + user_id + ", usuario=" + usuario + ", nombreCompleto=" + nombreCompleto + ", contrasena=" + contrasena + ", direccion=" + direccion + ", correo=" + correo + '}';
    }

}
