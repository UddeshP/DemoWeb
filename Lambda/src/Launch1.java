@FunctionalInterface //annotation for compiler and java developer also
interface Demo
{
	void disp();
}
/*Traditional way of implementing the code
class Trial implements Demo
{
	public void disp()
	{
		System.out.println("Hello java lovers");
	}
}
*/
public class Launch1 {

	public static void main(String[] args) {
//Lambda Expression and Functional Interface both work together 
		/*Demo d=()->
		{System.out.println("Hello Uddesh Patole");
		};
		*/		
		//Trial t=new Trial();
		//t.disp();
		Demo d=new Demo() {
			public void disp()
			{
				System.out.println("hello");
			}
			
		};
		d.disp();
	}

}
