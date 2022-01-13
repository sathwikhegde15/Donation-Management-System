/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Pratik Gawand
 */
public class DonationRequest extends WorkRequest {

    private String status;
    private ArrayList<Need> needList;
    private ArrayList<Need> recievedNeedsList;

    public DonationRequest() {
        super();
        this.needList = new ArrayList<Need>();
        this.recievedNeedsList = new ArrayList<Need>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Need> getNeedList() {
        return needList;
    }

    public void setNeedList(ArrayList<Need> needList) {
        this.needList = needList;
    }

    public ArrayList<Need> getRecievedNeedsList() {
        return recievedNeedsList;
    }

    public void setRecievedNeedsList(ArrayList<Need> recievedNeedsList) {
        this.recievedNeedsList = recievedNeedsList;
    }

    
}
