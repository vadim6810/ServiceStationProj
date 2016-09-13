package interfaces;

import dao.Contractor;
import dao.Tender;

public interface TenderRepository extends Iterable<Tender> {
	boolean addTender(Tender tender);
	boolean deleteTender(int id);
	Tender getTender(int id);
}
