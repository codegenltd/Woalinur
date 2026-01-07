/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ideal;

/**
 *
 * @author HP
 */
public class Service {
    public Model Insert (Model e){
        Dao dao = new Dao();
        Model m = dao.save(e);
        
    return e;
    };
}
