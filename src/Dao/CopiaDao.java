/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidades.Copia;
import java.util.List;

/**
 *
 * @author Alumno
 */
public interface CopiaDao {
    List<Copia> obtenerCopias();
    void guardarCopia(Copia c);
    void eliminarCopia(Copia c);
}
