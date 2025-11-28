/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.Entity;

import jakarta.persistence.CascadeType;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author Duoc
 */
@Entity
@Table(name="Categoria")
public class Categoria {
    @Id
    @GeneratedValue
    private int categoria_id;

    @Column(name="categoriaNombre")
    private String nombreCategoria;
    
    /*@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Producto> productos;*/

    public Categoria(int categoria_id, String nombreCategoria) {
        this.categoria_id = categoria_id;
        this.nombreCategoria = nombreCategoria;
    }

    public Categoria() {
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "categoria_id=" + categoria_id + ", nombreCategoria=" + nombreCategoria + '}';
    }

    
    
    
}
