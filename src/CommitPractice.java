
public class CommitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		/* // object �迭���� ��ü Ÿ���� �����͸� ��� ���� �� �ִ�.
		Object[] a = new Object[10];
		
		a[0] = "hello";
		a[1] = new String("world");
		// a[2] = new Date();
		//a[3] = new Person("ȫ�浿", 13);
		a[4] = new int[] { 1, 2, 3 };
		a[5] = new String[] { "one", "two", "three" };
		a[6] = new Integer(3);
		a[7] = new Double(3.14);
		a[8] = 3;
		a[9] = 3.14;

		for (Object o : a) {
			System.out.println(o);
		} // a[4]�� a[5]�� Ŭ������ �̸��� ���´�.

		System.out.println(a[6] == a[8]); // identity ��
		System.out.println(a[6].equals(a[8])); // equality ��
		*/
		
		/* // getClass().getName() �ǽ�
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 1, 2, 3 };
		String[] c = new String[] { "one", "two", "three" };
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(a.equals(b)); // �迭�� ���� �����Ǹ� �� ��
		*/

		/* // String format �ǽ�
		String s;
		s = String.format("Integer : %d\n", 15);
		System.out.print(s);

		s = String.format("Floating point number with 3 decimal digits: %.3f\n", 1.21312939123);
		System.out.print(s);

		s = String.format("Floating point number with 8 decimal digits: %.8f\n\n", 1.21312939123);
		System.out.print(s);

		s = String.format("String: %s, integer: %d, float: %.6f\n\n", "Hello World", 89, 9.231435);
		System.out.print(s);

		s = String.format("%-12s%-12s%s\n", "Column 1", "Column 2", "Column3");
		System.out.print(s);

		s = String.format("%-12d%-12d%07d\n\n", 15, 12, 5);
		System.out.print(s);

		s = String.format("%-8s%12s%12s\n", "Column 1", "Column 2", "Column3");
		System.out.print(s);

		s = String.format("%-8.5s%12d%12.4f\n\n", "Hello World", 1234567, 3.141592);
		System.out.print(s);

		s = String.format("%-12s%-12s\n", "Column 1", "Column 2");
		System.out.print(s);

		s = String.format("%-12.5f%.20f", 12.23429837482, 9.10212023134);
		System.out.print(s);*/
	}

}