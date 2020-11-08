package adapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import domain.Covid19Pacient;
import domain.Symptom;
public class IteratorAdapter implements InvertedIterator {
	List<Symptom> symptoms;
	int position = 0;
	Covid19Pacient covid19Pacient;

	public IteratorAdapter(Covid19Pacient p) {
		// TODO Auto-generated constructor stub
		covid19Pacient = p;
		symptoms = new ArrayList<Symptom>(covid19Pacient.getSymptoms());
	}
	@Override
	public Object previous() {
		Symptom symptom = symptoms.get(position);
		position--;
		return symptom;
	}
	@Override
	public boolean hasPrevious() {
		return position >= 0;
	}
	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		position = symptoms.size() - 1;

	}

}
