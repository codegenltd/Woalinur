/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegenltd.controller;

import codegenltd.model.EmpList;
import oxfordltd.Service.Service;

/**
 *
 * @author HP
 */
public class Controller {
    public EmpList creat (EmpList e){
        Service s = new Service();
   EmpList emp = s.insert(e);
    return emp;
    };
}
