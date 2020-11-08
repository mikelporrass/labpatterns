package iterator;

import java.util.Comparator;

import domain.Covid19Pacient;
import domain.Symptom;

public class severityIndex implements Comparator<Symptom> {

	public int compare(Symptom o1, Symptom o2) {
		if(o1.getSeverityIndex() == o2.getSeverityIndex())
			return 0;
		if (o1.getSeverityIndex() < o2.getSeverityIndex())
			return -1;
		else
			return 1;
		
	}

}
