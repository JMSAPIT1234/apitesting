package apiJava8artifact;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.api.beans.Student;


public class StudentTest {

	@Test 
	public void getSum() {
			Student sd = new Student();
			System.out.println("Testing the size of Students");
			assertEquals(6,sd.getSize(1, 2,3));
	}

}
