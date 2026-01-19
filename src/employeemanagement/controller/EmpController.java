/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.controller;

import employeemanagement.model.EmpModel;
import employeemanagement.service.EmpService;

/**
 *
 * @author HP
 */
public class EmpController {
    public EmpModel Cpanel(EmpModel e){
        EmpService sr = new EmpService();
        EmpModel tr = sr.Spanel(e);
    return e;
    }
}
