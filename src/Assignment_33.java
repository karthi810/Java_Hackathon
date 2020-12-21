import java.util.ArrayList;
import java.util.Collections;
//Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders.
//For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
//Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower.
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
//		   Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)

public class Assignment_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> maxSeqLengths = new ArrayList<Integer>();

		Person obj1 = new Person(65, 100);
		Person obj2 = new Person(70, 150);
		Person obj3 = new Person(56, 90);
		Person obj4 = new Person(75, 190);
		Person obj5 = new Person(60, 95);
		Person obj6 = new Person(68, 110);

		ArrayList<Person> mylist = new ArrayList<>();

		mylist.add(obj1);
		mylist.add(obj2);
		mylist.add(obj3);
		mylist.add(obj4);
		mylist.add(obj5);
		mylist.add(obj6);

		Collections.sort(mylist);
		int[] wts = new int[mylist.size()];
		int j = 0;
		for (Person i : mylist) {
			System.out.print("("+i.Height+","+i.Weight+")"+ " ");
			wts[j++] = i.Weight;
		}
		System.out.println();
		int maxseqlength = findMaxSeqLength(wts);
		System.out.println("length=" + (maxseqlength - 1));

	}


	static int findMaxSeqLength(int[] wts) {
		int fitlength = 0;
		int maxseqlength = 0;
		for (int i = 1; i < wts.length; i++) {
			if (wts[i] > wts[i - 1]) {
				if ((i - 1) == 0 || i == wts.length - 1)
					fitlength += 1;
				fitlength++;
			} else {
				fitlength = 0;
			}
			if (fitlength > maxseqlength)
				maxseqlength = fitlength;
		}
		return maxseqlength;
	}

}
