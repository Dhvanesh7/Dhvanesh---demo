package arreys;

public class Vowel {

	
	public class VowelCounterArray {
	    public static void main(String[] args) {
	        String[] inputArray = {"Dhvanesh", "harsh", "Darshna", "Yamumesh", "Avi"};
	        int[] vowelCounts = countVowelsInArray(inputArray);

	        for (int i = 0; i < inputArray.length; i++) {
	            System.out.println("Total number of vowels in \"" + inputArray[i] + "\": " + vowelCounts[i]);
	        }
	    }

	    public static int[] countVowelsInArray(String[] arr) {
	        int[] vowelCounts = new int[arr.length];
	        String vowels = "aeiouAEIOU";

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            for (int j = 0; j < arr[i].length(); j++) {
	                if (vowels.indexOf(arr[i].charAt(j)) != -1) {
	                    count++;
	                }
	            }
	            vowelCounts[i] = count;
	        }

	        return vowelCounts;
	    }
	}

}
