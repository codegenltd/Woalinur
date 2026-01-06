/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.Service;

import empmgt.Dao.EmployeesDao;
import empmgt.model.EmployeesModel;

/**
 *
 * @author HP
 */
public class EmployeesService {
    public EmployeesModel create (EmployeesModel e){
        EmployeesDao cs = new EmployeesDao();
        EmployeesModel empdata = cs.Insert(e);
    return empdata.Insert(e);
    }
}
