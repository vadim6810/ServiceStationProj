package src.impl;

import org.springframework.transaction.annotation.Transactional;
import src.dao.Contractor;
import src.interfaces.ContractorRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Iterator;

public class ContractorHibernate implements ContractorRepository {
	
	@PersistenceContext(unitName="springHibernate")
	
	EntityManager em;

	@Transactional
	public boolean addContractor(Contractor contractor) {
		
		if(getContractor(contractor.getId()) != null)
			return false;
		em.persist(contractor);
		return true;
	}

	@Transactional
	public boolean deleteContractor(int id) {
		
		Contractor contractor = getContractor(id);
		if(contractor == null)
			return false;
		em.remove(contractor);
		return true;
	}

	public Iterator<Contractor> iterator() {
		Query query = em.createQuery("select c from Contractor c");
		return query.getResultList().iterator();
	}

	public Contractor getContractor(int id){
		
		return em.find(Contractor.class, id);
	}
}
