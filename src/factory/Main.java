package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {
	

	public static void main(String[] args) {
		SymptomFactory symptomFactory=new SymptomFactory();
		
		Medicament m=new Medicament("Ibuprofeno",symptomFactory);
		MedicalGUI mgui=new MedicalGUI(m);

		Covid19Pacient p1=new Covid19Pacient("aitor", 35, symptomFactory);
		new PacientSymptomGUI(p1);

	}

}
