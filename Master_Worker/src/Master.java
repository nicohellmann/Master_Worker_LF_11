import java.util.ArrayList;

public class Master 
{
	Auftrag auftrag;
	Worker[] worker;
	QuickSortQueue sortSteps;
	
	public Master(Auftrag auftrag, int anzahlWorker, QuickSortQueue sortSteps)
	{
		this.auftrag = auftrag;
		this.worker = new Worker[anzahlWorker];
		this.sortSteps = sortSteps;
		for(int i =0;i<anzahlWorker;i++)
		{
			worker[i] = new Worker(this);
		}
	}
	
	public synchronized void setElementToLösung(float element, int position)
	{
		
	}
	
	public synchronized void addToQueue(ArrayList<Float> add) 
	{
		this.sortSteps.sortSteps.add(add);
	}
	
	public synchronized void addToLösung( int position , float value) 
	{
		this.auftrag.lösung.put(position, value);
	}
 }
