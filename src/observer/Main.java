package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		SymptomFactory symptomFactory=new SymptomFactory();
		
		Observable pacient = new Covid19Pacient("aitor", 35,symptomFactory);
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI((Covid19Pacient) pacient);
		PacientThermometerGUI thermo=new PacientThermometerGUI(pacient);
		SemaphorGUI sema=new SemaphorGUI(pacient);
		
	//	Observable pacient1 = new Covid19Pacient("mikel", 35,symptomFactory);
		//PacientObserverGUI pacientGUI1 = new PacientObserverGUI(pacient1);
		//PacientSymptomGUI frame1 = new PacientSymptomGUI((Covid19Pacient) pacient1);
		//PacientThermometerGUI thermo1=new PacientThermometerGUI(pacient1);
		
	//	Observable pacient2 = new Covid19Pacient("peru", 35,symptomFactory);
		//PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
	//	PacientSymptomGUI frame2 = new PacientSymptomGUI((Covid19Pacient) pacient2);
	//	PacientThermometerGUI thermo2=new PacientThermometerGUI(pacient2);
	}

}
