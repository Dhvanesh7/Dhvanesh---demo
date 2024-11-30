package arreys;

public class SilverHights {

	public static void main(String[] args) {

		String[] UAE = { "Dubai", "Abu Dhabi", "Sharjah", "Al Ain", "Ajman", "Ras Al Khaimah", "Fujairah",
				"Umm Al Quwain", "Kalba", "Madinat Zayed", "Khor Fakkan" };

		System.out.println("Total Number " + UAE.length);
		System.out.println("------------------");
		for (int i = 0; i < UAE.length; i++) {
			System.out.println(UAE[i]);

		}
		System.out.println("------------------");

		char[] ch = { 'D', 'H', 'V', 'A', 'N', 'E', 'S', 'H' };

		System.out.println("Total Number " + ch.length);

		System.out.println("-----------------");

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		System.out.println("--------------------");

		boolean[] tf = { true, false };

		System.out.println("ANS " + tf.length);

		System.out.println("----------------");

		for (int i = 0; i < tf.length; i++) {
			System.out.println(tf[i]);
		}
		System.out.println("----------------");

		double[] db = { 22.5, 22.5, 47.3, 446.5, 983.4, 12.1 };

		System.out.println("ANS " + db.length);

		System.out.println("--------------");

		for (int i = 0; i < db.length; i++)
			
		{
			System.out.println(db[i]);
		}

	}
}
