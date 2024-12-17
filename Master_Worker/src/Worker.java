import java.util.ArrayList;
public class Worker extends Thread{

	
	Master master;
	
	public Worker(Master master)
	{
		this.master = master;
	}
	
	
	void quicksortStep(ArrayList<Float> list)
	{
		// Abschluss muss gesichert sein und es kann passieren dass das Pivot element das Größte oder kleinste ist und somit eine leere Liste entsteht. 
		
		// Rückgabewert
		
		// Das Pivotelement zu welcher Basis 2 neue Listen entstehen
		float pivot = list.get(list.size()-1);
		// Definition der neuen Listen
		ArrayList<Float> newlist1 = new ArrayList<Float>();
		ArrayList<Float> newlist2 = new ArrayList<Float>();
		// Es wird durch die komplette Liste durchgegangen und einzelne Elemente mit dem Pivotelement verglichen dabei wird das Pivotelement selbst nicht noch einmal hinzugefügt
		for (int i =0;i<list.size()-1;i++)
		{
			
			if(list.get(i)<=pivot)
			{
				newlist1.add(list.get(i));
			}
			else if(list.get(i)>pivot){
				newlist2.add(list.get(i));
			}
		}
		// Durch rekursion wird der gesamte Prozess mit beiden neuen Listen ebenfalls durchgeführt
		this.master.addToQueue(newlist1);
		this.master.addToQueue(newlist2);
		int position = this.determinePosition(newlist1,pivot);
		this.master.addToLösung(position,pivot);
		
	}
	
	synchronized int determinePosition(ArrayList<Float> list1,float value)
	{
		boolean found = false;
		int position = list1.size();
		int newPosition = position;
		while(found == false)
		{
			int counter =0;
			
			for(int i =0;i<newPosition;i++)
			{
				if(this.master.auftrag.lösung.containsKey(i)) counter++;
			}
			newPosition =position +counter;
			if(this.master.auftrag.lösung.containsKey(position)==false) found = true; 
			
		}
		
		
		return position;
	}
	
	
	
	
	public void run()
	{
		
	}
	
	
	
	
	
	
}
