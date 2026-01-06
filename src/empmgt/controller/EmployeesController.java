/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.controller;

import empmgt.Service.EmployeesService;
import empmgt.model.EmployeesModel;

/**
 *
 * @author HP
 */
public class EmployeesController {
    public EmployeesModel create (EmployeesModel e){
        EmployeesService cc = new EmployeesService();
        EmployeesModel empdate = cc.create(e);
    return empdate;
    }
}
