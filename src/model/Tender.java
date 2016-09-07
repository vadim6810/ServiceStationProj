package src.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Legat on 8/29/2016.
 */
public class Tender {
    Integer id;
    Integer idClient;
    String tenderDescription;
    Date date;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String typeVehicle;
    CarManufacture carManufacture;
    boolean tenderState;



    public Tender(CarManufacture carManufacture, Date date, Integer id, Integer idClient, String tenderDescription, boolean tenderState, String typeVehicle) {
        this.carManufacture = carManufacture;
        this.date = new Date(dateFormat.format(date));
        this.id = id++;
        this.idClient = idClient;
        this.tenderDescription = tenderDescription;
        this.tenderState = tenderState;
        this.typeVehicle = typeVehicle;
    }
 /*   public List<Tender> getTenderByClient(int idClient){
        return idClient;
    }
    public List<Tender> getTenderForContractor(String rangeWork, String typeVehicle,String carManufacture){
        return idClient;
    }*/
    public void addTender(){

    }
    public void removeTender(){

    }
    public void changeTender(){

    }
}