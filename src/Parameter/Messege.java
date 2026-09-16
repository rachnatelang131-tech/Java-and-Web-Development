package Parameter;

public class Messege {
			public void messege(String visitors, int value) {
				System.out.println(visitors + "," + value);
			}

			public static void main(String[] args) {
				Messege m = new Messege();

				m.messege("rachna", 13);
				m.messege("rishabh", 23);
				m.messege("ronny", 43);}
		}
