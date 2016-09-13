package controller;


import java.util.Iterator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.Contractor;
import dao.Tender;
import interfaces.ContractorRepository;
import interfaces.TenderRepository;


public class CreateRandomContractorsAppl {

	private static final int N_CONTRACTORS = 10;
	private static final int MAX_NAMES = 100;
	private static final int MAX_EMAILS = 100;

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		ContractorRepository repository = (ContractorRepository) ctx.getBean("contractors");
		TenderRepository tendRepository = (TenderRepository) ctx.getBean("tenders");
		//createContractors(repository);
		System.out.println(tendRepository.getTender(1));
		//System.out.println(repository.getContractor(10));
		//System.out.println(repository.iterator().next());
		Iterator<Tender> it = tendRepository.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ctx.close();
	}

	private static void createContractors(ContractorRepository repository) {
		
		for(int i = 0; i < N_CONTRACTORS; i++){
			repository.addContractor(getContractor());
		}
	}

	private static Contractor getContractor() {
		
		String name = "name" + getRandomNumber(1, MAX_NAMES);
		String email = "email" + getRandomNumber(1, MAX_EMAILS);
		return new Contractor(name, email);
	}

	private static int getRandomNumber(int min, int max) {
		
		return (int) (min+Math.random()*(max-min+1));
	}

}
