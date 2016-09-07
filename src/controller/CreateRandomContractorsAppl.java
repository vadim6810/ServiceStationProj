package src.controller;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import src.dao.Contractor;
import src.interfaces.ContractorRepository;

public class CreateRandomContractorsAppl {

	private static final int N_CONTRACTORS = 10;
	private static final int MAX_NAMES = 100;
	private static final int MAX_EMAILS = 100;

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		ContractorRepository repository = (ContractorRepository) ctx.getBean("contractors");
		createContractors(repository);
		/*System.out.println(repository.getContractor(10));
		System.out.println(repository.iterator().next());
		Iterator<Contractor> it = repository.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
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
