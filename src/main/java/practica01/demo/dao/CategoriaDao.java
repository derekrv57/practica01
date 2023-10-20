/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.demo.dao;

import practica01.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author derek
 */
public interface CategoriaDao extends JpaRepository <Categoria,Long>{
    
}
