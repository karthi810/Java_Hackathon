 import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>
{
    public int Weight;
    public int Height;

    public Person(int height, int weight)
    {
        this.Weight = weight;
        this.Height = height;
    }
    
    public int compareTo(Person d) {
		return this.Height - d.Height;
	}
}

