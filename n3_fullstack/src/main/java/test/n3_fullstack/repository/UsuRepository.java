/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.n3_fullstack.Entity.Usuarios;

/**
 *
 * @author PAAWSA02LC1009
 */
public interface UsuRepository extends JpaRepository<Usuarios, Integer> {
    public Usuarios nombreCompleto(String nombre);
}
