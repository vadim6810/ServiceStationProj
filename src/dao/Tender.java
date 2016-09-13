package dao;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="tender")

public class Tender {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="id")
    private int id;
	@Column(name="idClient")
	private int idClient;
	@Column(name="tenderDescription")
	private String tenderDescription;
	@Column(name="date")
	private Date date;
	@Column(name="typeVehicle")
    private String typeVehicle;
	@Column(name="carManufacture")
    private String carManufacture;
	@Column(name="tenderState")
    private boolean tenderState;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public Tender(String carManufacture, Date date, int id, int idClient, String tenderDescription, boolean tenderState, String typeVehicle) {
        this.carManufacture = carManufacture;
        this.date = new Date(dateFormat.format(date));
        this.id = id++;
        this.idClient = idClient;
        this.tenderDescription = tenderDescription;
        this.tenderState = tenderState;
        this.typeVehicle = typeVehicle;
    }

    public void addTender(){
    	Tender tender = new Tender(carManufacture, date, id, idClient, tenderDescription, tenderState, typeVehicle);
    }
    
    public Tender() {
	}

	public void removeTender(){

    }
    public void changeTender(){

    }

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
    
}
