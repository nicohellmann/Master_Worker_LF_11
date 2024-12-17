import java.util.ArrayList;
import java. util.Random;
public class Main {

	public static void main(String[] args) {

		ArrayList<Float> test = new ArrayList<Float>();
		
		
		Random rd = new Random();
		
		for(int i =1;i<=100;i++)
		{
			test.add(rd.nextFloat());
		}
		QuickSortQueue steps = new QuickSortQueue();
		Auftrag aufgabe = new Auftrag(test);
		System.out.println(test);
		
		Master master = new Master(aufgabe,3,steps);
		ArrayList<Float> sdf = new ArrayList<Float>(101);
		System.out.println(sdf.size());
		
		System.out.println(sdf);
		System.out.println(aufgabe.lösung.size());
	}

}
