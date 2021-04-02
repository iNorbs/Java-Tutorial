package Practice;

public class Ifs {
	/**
	 * Depending on the number of the day, return the corresponding
	 * name of that day.
	 * 
	 * @param int day of the week
	 * @return the correct day of the week, Monday=1, Tuesday=2, etc.
	 * @throws Exception 
	 */
	public static String weather(int day) {
		return ""; //TODO Fix This
	}
	
	/**
	 * 
	 * @param Integer array
	 * @return the average of the whole array
	 */
	public static double getAverage(double[] array) {
		
		return 0.0; //TODO Fix This
	}
	
	
	public static void main(String[] args) {
		double[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] arr2 = {6, 42, 100, 1};
		double[] arr3 = {100, 200, 50};
		//Weather tests
		testWeather(1, "Monday");
		testWeather(2, "Tuesday");
		testWeather(3, "Wednesday");
		testWeather(4, "Thursday");
		testWeather(5, "Friday");
		testWeather(6, "Saturday");
		testWeather(7, "Sunday");
		
		//Average tests
		testGetAverage(arr1, 5.5);
		testGetAverage(arr2, 37.25);
		testGetAverage(arr3, 116.666666667);
		
		
		
		
		System.out.println("Tests Succsessfull");
	}
	
	private static void testWeather(int day, String expected) {
		String test = weather(day);
		if (!test.equalsIgnoreCase(expected)) {
			System.out.println(expected + " test failed.");
		}
	}
	
	private static void testGetAverage(double[] array, double average) {
		double actual = getAverage(array);
		if (actual != average) {
			System.out.println("Average test failed.");
		}
	}
}