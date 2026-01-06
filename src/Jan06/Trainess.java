/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author md.woalinur
 */
public class Trainess {
    private int id;
    private String TrainessAddress;

    public Trainess(int id, String TrainessAddress) {
        this.id = id;
        this.TrainessAddress = TrainessAddress;
    }

    public int getId() {
        return id;
    }

    public String getTrainessAddress() {
        return TrainessAddress;
    }

    @Override
    public String toString() {
        return "Trainess{" + "id=" + id + ", TrainessAddress=" + TrainessAddress + '}';
    }
    
}
