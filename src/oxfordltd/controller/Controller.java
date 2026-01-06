/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oxfordltd.controller;

import oxfordltd.Service.Service;
import oxfordltd.model.StudentsModel;

/**
 *
 * @author HP
 */
public class Controller {
    public StudentsModel create (StudentsModel st){
        Service sr = new Service();
        StudentsModel str = sr.insert(st);
    return str;
    };
}
