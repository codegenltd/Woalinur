/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oxfordltd.Service;

import oxfordltd.dao.Dao;
import oxfordltd.model.StudentsModel;

/**
 *
 * @author HP
 */
public class Service {
    public StudentsModel insert (StudentsModel st){
        Dao dao = new Dao();
        StudentsModel sto = dao.save(st);
        
    return sto;
    };
}
