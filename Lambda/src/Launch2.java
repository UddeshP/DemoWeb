@FunctionalInterface
interface Demo1
{
	void add(int a,int b);
}
public class Launch2 {

	public static void main(String[] args) {
		Demo1 add=(a,b)->
		{
			int res=a+b;
			System.out.println(res);
		};
		add.add(10,10);
	}

}
