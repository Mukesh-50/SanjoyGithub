package day4;

public class ConditionalStatement6 {

	public static void main(String[] args) {

		// day 1,2,3,4,5,6,7 1-Monday 2-Tuesday 3-Wednesday
		
		// free fall case with switch

		int day = 1;

		switch (day) 
		{
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Please enter number from 1-7");
		}

	}

}
