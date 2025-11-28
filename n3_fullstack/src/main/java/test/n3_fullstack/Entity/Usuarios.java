package test.n3_fullstack.Entity;
import jakarta.persistence.*;


@Entity
@Table(name="USUARIO")
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int user_id;
    private String nombreCompleto;
    private String contrasena;
    private String direccion;
    private String correo;
    @Column(name = "telefono", length = 20)
    private String telefono;
    private String comuna;
    private String region;
    private String rol;

    public Usuarios(int user_id, String nombreCompleto, String contrasena, String direccion, String correo, String telefono, String comuna, String region, String rol) {
        this.user_id = user_id;
        this.nombreCompleto = nombreCompleto;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.comuna = comuna;
        this.region = region;
        this.rol = rol;
    }

    public Usuarios() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user_id=" + user_id + ", nombreCompleto=" + nombreCompleto + ", contrasena=" + contrasena + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", comuna=" + comuna + ", region=" + region + ", rol=" + rol + '}';
    }

    
 
}
