package impl;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.Contractor;
import dao.Tender;
import interfaces.TenderRepository;

public class TenderHibernate implements TenderRepository {
	@PersistenceContext(unitName="springHibernate")
	EntityManager tend;
	
	@Override
	public boolean addTender(Tender tender) {
		if(getTender(tender.getId()) != null)
			return false;
		tend.persist(tender);
		return true;
	}

	@Override
	public boolean deleteTender(int id) {
		Tender tender = getTender(id);
		if(tender == null)
			return false;
		tend.remove(tender);
		return true;
	}
	public Iterator<Tender> iterator() {
		Query query = tend.createQuery("select c from Tender c");
		return query.getResultList().iterator();
	}
	public Tender getTender(int id){
		return tend.find(Tender.class, id);
	}
	

}
