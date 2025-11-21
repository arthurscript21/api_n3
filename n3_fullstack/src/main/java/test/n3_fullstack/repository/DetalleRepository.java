/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.n3_fullstack.Entity.Categoria;
import test.n3_fullstack.Entity.Detalle;

/**
 *
 * @author Duoc
 */
public interface DetalleRepository extends JpaRepository<Detalle, Integer> {    
    public Categoria detalle_id(int detalle_id);

    public Detalle save(Detalle d);
}
