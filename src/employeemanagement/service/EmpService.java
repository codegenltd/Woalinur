/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement.service;

import employeemanagement.employeeDAO.EmpDAO;
import employeemanagement.model.EmpModel;

/**
 *
 * @author HP
 */
public class EmpService {
    public EmpModel Spanel (EmpModel e){
        EmpDAO dao = new EmpDAO();
        EmpModel em = dao.DAOPanel(e);
    return e;
    }
}
