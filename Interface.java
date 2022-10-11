package pgm_task2;

public class Interface {

	public static void main(String[] args) {

		Demo d1=new Demo();
		d1.test();
		d1.mock();
	}

}

interface Sample{
	void test();
	void mock();
}
 class Demo implements Sample
{
	public void test()
	{
		System.out.println("first test your self.........");
	}
    public void mock()
    {
	System.out.println("prepare for mock.........");
    }
}
