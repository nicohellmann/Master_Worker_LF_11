import java.util.ArrayList;

public class Auftrag {

	ArrayList<Float> aufgabe = new ArrayList<Float>();
	ArrayList<Float> lösung = new ArrayList<Float>(aufgabe.size());
	
	public Auftrag(ArrayList<Float> aufgabe)
	{
		this.aufgabe = aufgabe;
	}
}
