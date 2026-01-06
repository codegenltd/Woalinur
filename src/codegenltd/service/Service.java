/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegenltd.service;

import codegenltd.model.EmpList;
import oxfordltd.dao.Dao;

/**
 *
 * @author HP
 */
public class Service {
    public EmpList Insert (EmpList e){
        Dao dao = new Dao ();
        EmpList el = dao.save(e);
    return el;
    };
    
}
