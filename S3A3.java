import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class S3A3 {   //variables declaration
	static int roll_no;
	private String name;
	private float marks;
	static final String course="Java";
	BufferedReader br;

	S3A3()throws IOException // constructor declaration
	{
	br=new BufferedReader(new InputStreamReader(System.in)); // accept student detail
	System.out.println("Enter name");
	name=br.readLine();
	System.out.println("Enter marks");
	marks=Float.parseFloat(br.readLine());
	}
	public void display() // display method declaration
	{
	System.out.println(++roll_no +" "+name+" "+marks+" "+course);
	}
	
	public static void main(String ...args)throws IOException
	{
		S3A3 s1=new S3A3();
		S3A3 s2=new S3A3();
		S3A3 s3=new S3A3();
		s1.display(); //calling display method
		s2.display();
		s3.display();
		
	}

}
