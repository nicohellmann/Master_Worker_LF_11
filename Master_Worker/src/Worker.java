import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Worker extends Thread{

	
	Queue auftrag;
	
	public Worker(Queue auftrag)
	{
		this.auftrag = auftrag;
	}
	List<Float> quicksort(float[] list)
	{
		if (list.length ==1) return change(list);
		List<Float> re = new ArrayList<Float>();
		float pivot = list[list.length-1];
		
		List<Float> newlist1 = new ArrayList<Float>();
		List<Float> newlist2 = new ArrayList<Float>();
		for (int i =0;i<list.length;i++)
		{
			if(list[i]<pivot)
			{
				newlist1.add(list[i]);
			}
			else {
				newlist2.add(list[i]);
			}
		}
		
		return re;
	}
	
	List<Float> quicksort(List<Float> list)
	{
		// Abschluss muss gesichert sein und es kann passieren dass das Pivot element das Größte oder kleinste ist und somit eine leere Liste entsteht. 
		if (list.size() <=1) return list;
		// Rückgabewert
		List<Float> re = new ArrayList<Float>();
		// Das Pivotelement zu welcher Basis 2 neue Listen entstehen
		float pivot = list.get(list.size()-1);
		// Definition der neuen Listen
		List<Float> newlist1 = new ArrayList<Float>();
		List<Float> newlist2 = new ArrayList<Float>();
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
		re.addAll(quicksort(newlist1));
		re.add(pivot);
		re.addAll(quicksort(newlist2));
		return re;
	}
	
	List<Float> change(float[] list)
	{	
		List<Float> re = new ArrayList<Float>();
		for(int i =0;i<list.length;i++)
		{
			re.add(list[i]);
		}
		return re;
	}
	
	public void run()
	{
		
	}
	
	
	
	
	
	
}
