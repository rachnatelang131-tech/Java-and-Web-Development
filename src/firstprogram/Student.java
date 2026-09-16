package firstprogram;

public class Student {
	public static void main(String[] args) {
		String name="Riya";
		int rollno=56;
		int math=75;
		int sci=85;
		
		int total_marks=math+sci;
		double percentage=(total_marks/200.0)*100;
		
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(math);
		System.out.println(sci);
		System.out.println(total_marks);
		System.out.println(percentage);
	}

}
