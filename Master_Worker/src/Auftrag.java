import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auftrag {

	ArrayList<Float> aufgabe ;
	ArrayList<Float> lösung;
	public Auftrag(ArrayList<Float> aufgabe)
	{
		this.aufgabe = aufgabe;
		for(int i =0;i<aufgabe.size();i++)
		{
			this.lösung.add(null);
		}
		
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
