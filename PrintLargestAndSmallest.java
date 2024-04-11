package StringClass;

public class PrintLargestAndSmallest {

	public static void main(String[] args) {

		String s1 ="Hlo i am Durgesh";
		String[] s2 = s1.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s2.length; i++) {
			for (int j = i + 1; j < s2.length; j++) {

				if (s2[i].length() > s2[j].length()) {

					min = j;
				}
				else if (s2[i].length() < s2[j].length()) {
					max = j;
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println("Smallest : " + s2[min]);
		System.out.println("largest : " + s2[max]);
	}
}
