package arreys;

public class Camera {  // max number gotava mate

	public static void main(String[] args) {

		int[] arr = {18,11,55,84,98,556,45,8989,11,222,888888};
		int max = arr[0];
	
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
			System.out.println("maximum number is " + max);
	}

}
