import java.util.ArrayList;
import java.util.List;
import java. util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Float> test = new ArrayList<Float>();
		Worker m1 = new Worker();
		Random rd = new Random();
		for(int i =1;i<=100;i++)
		{
			test.add(rd.nextFloat());
		}
		
		System.out.println(test);
		
		List<Float> test2 =m1.quicksort(test);
		
		System.out.println(test2);
	}

}
