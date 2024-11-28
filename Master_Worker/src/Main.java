import java.util.ArrayList;
import java.util.List;
import java. util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Float> test = new ArrayList<Float>();
		
		
		Random rd = new Random();
		
		for(int i =1;i<=100;i++)
		{
			test.add(rd.nextFloat());
		}
		Auftrag aufgabe = new Auftrag(test);
		Queue toDo = new Queue(aufgabe);
		Worker m1 = new Worker(toDo);
		System.out.println(test);
		
		List<Float> test2 =m1.quicksort(test);
		
		System.out.println(test2);
	}

}
