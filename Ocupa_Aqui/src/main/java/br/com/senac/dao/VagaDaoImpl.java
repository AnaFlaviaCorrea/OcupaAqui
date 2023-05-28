/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.dao;

import br.com.senac.entidade.Vaga;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author anafl
 */
public class VagaDaoImpl extends BaseDaoImpl<Vaga, Long>
        implements VagaDao {

    @Override
    public Vaga pesquisarPorId(Long id, Session sessao) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
