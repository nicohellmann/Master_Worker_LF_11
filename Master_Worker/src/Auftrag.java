import java.util.ArrayList;
import java.util.HashMap;
public class Auftrag {

	ArrayList<Float> aufgabe ;
	HashMap<Integer,Float> lösung;
	public Auftrag(ArrayList<Float> aufgabe)
	{
		
		this.aufgabe = aufgabe;
		lösung = new HashMap<>();
		
		
	}
	
	public int countLösungElementAll()
	{
		int counter =0;
		for(int i =0;i<this.lösung.size();i++)
		{
			if(this.lösung.get(i) != null)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public int countLösungElementToIndex(int index)
	{
		int counter =0;
		if(index <0)
		{
			return -1;
		}
		for(int i =0;i<=index;i++)
		{
			if(this.lösung.get(i) != null)
			{
				counter++;
			}
		}
		return counter;
	}
	
}
