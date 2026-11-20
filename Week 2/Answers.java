import java.util.Arrays;

public class Answers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Task 1:
		System.out.println("Task 1:");
		System.out.println(reverse(1234));
		
		// Task 2:
		/*
		 * 13
		 * 70
		 * F
		 * 
		 * This is because typcasting a+b truncates the decimal
		 * The ASCII value of A is 65
		 * Adding 5 makes the value 70 and ASCII value 70 is F
		 */
		
		//Task 3:
		System.out.println("\nTask 3:");
		countVowels("Airplane");
		
		//Task 4:
		System.out.println("\nTask 4:");
		String age = "25";
        String salary = "45000.75";
        String active = "true";

        Integer ageObj = Integer.valueOf(age);
        Double salaryObj = Double.valueOf(salary);
        Boolean activeObj = Boolean.valueOf(active);

        double incremented = salaryObj * 1.10;

        System.out.println("Age: " + ageObj + " (" + ageObj.getClass().getSimpleName() + ")");
        System.out.println("Salary: " + salaryObj + " (" + salaryObj.getClass().getSimpleName() + ")");
        System.out.println("Salary after 10%: " + incremented);
        System.out.println("Active: " + activeObj + " (" + activeObj.getClass().getSimpleName() + ")");

        int unboxed = ageObj;
        Integer boxed = 727;
        System.out.println(unboxed + ", " + boxed);

        //Task 5
        System.out.println("\nTask 5:");
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));

        //Task 6
        System.out.println("\nTask 6:");
        int a = 10, b = 100;
        System.out.printf("a:%d b:%d\n",a,b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("a:%ds b:%d\n",a,b);
        
        //Task 7
        /*
         * 1.
         * 		10
         * 		100
         * 2. a copy is passed into the function, not the reference to the value itself
         * 3. Since the parameter is an array, it passes a pointer to the array
         * 4. 
         */
        
        //Task 8
        System.out.println("\nTask 8:");
        System.out.println(removeDuplicates("programming"));
        
        //Task 9
        System.out.println("\nTask 9:");
        firstNonRepeated("swiss");
        firstNonRepeated("aabbcc");
        
        //Task 10
        /*
         * true
         * false
         * true
         * Java Programming
         * Java
         * 
         * in the first one, they are both pooled from the same string object
         * s3 creates a new reference 
         * equals() compares the string itself
         * string builder is mutable so it doesn't need to do sb = sb.append()
         * String is immutable
         */
        
        //Task 11
        System.out.println("\nTask 11:");
        System.out.println(lengthOfLongest("abcabcbb"));
        System.out.println(lengthOfLongest("pwwkew"));
        
        //Task 12
        System.out.println("\nTask 12:");
        System.out.println(compress("aaabbccccd"));
        System.out.println(compress("abc"));
        
        //Task 13
        System.out.println("\nTask 13:");
        System.out.println(reverseWords("Java is easy to learn"));
        
        //Task 14
        /*
         * StringBuilder is not thread safe, as concurrently updating can cause corruption
         * StringBuffer synchronizes append so it is safe
         * StringBuffer is safer but StringBuilder is faster
         */
        
        //Task 15
        
        /*
         	class Employee {
		    private int id;
		    private String name;
		    private double basicSalary;
		    private double bonusPercent;
		    private boolean active;
		
		    Employee(int id, String name, double basicSalary, double bonusPercent, boolean active) {
		        this.id = id; this.name = name;
		        this.basicSalary = basicSalary;
		        this.bonusPercent = bonusPercent; this.active = active;
		    }
		
		    double bonus()      { return basicSalary * bonusPercent / 100; }
		    double finalSalary(){ return basicSalary + bonus(); }
		    boolean above75k()  { return finalSalary() > 75000; }
		
		    String reversedName() { return new StringBuilder(name).reverse().toString(); }
		
		    void print() {
		        System.out.println("Employee ID: " + id);
		        System.out.println("Employee Name: " + name.toUpperCase());
		        System.out.println("Basic Salary: " + basicSalary);
		        System.out.println("Bonus: " + bonus());
		        System.out.println("Final Salary: " + finalSalary());
		        System.out.println("Active: " + active);
		        System.out.println("Reversed Name: " + reversedName());
		        System.out.println("Salary above 75000: " + (above75k() ? "Yes" : "No"));
		    }
		}
         */

	}
	
	public static int reverse(int num) {
		int reverse = 0;
		int sign = num < 0 ? -1 : 1;
		num = Math.abs(num);
		
		while(num > 0) {
			reverse = reverse * 10 + (int)(num%10);
			num /= 10;
		}
		
		return sign * reverse;
	}
	
	public static void countVowels(String str) {
		int vowel = 0, constant = 0;
		
		String vowels = "aeiouAEIOU";
		
		for(int i = 0 ; i < str.length() ; i++) {
			for(int j = 0 ; j < vowels.length(); j++) {
				if(vowels.charAt(j) == str.charAt(i)) {
					vowel++;
					break;
				}
			}
		}
		constant = str.length() - vowel;
		System.out.println("Vowels: " + vowel + "\tConstants: " + constant);
	}

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		
		str1 = str1.trim().toLowerCase();
		str2 = str2.trim().toLowerCase();
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for(int i = 0 ; i < str1.length() ; i++) {
			count1[str1.charAt(i) - 'a']++;
			count2[str2.charAt(i) - 'a']++;
		}
		
		for(int i = 0 ; i < count1.length ; i++) {
			if(count1[i] != count2[i]) return false;
		}
		
		return true;
	}

	public static StringBuilder removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			if (sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
		}
		
		return sb;
	}

	public static void firstNonRepeated(String str) {
		str = str.trim().toLowerCase();
		int[] count = new int[26];
		for(int i = 0 ; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		for(int i = 0 ; i < count.length ; i++) {
			if(count[i] == 1) {
				System.out.println(count[i]);
				return;
			}
		}
		System.out.println("No non-repeated character");
	}
	
	public static int lengthOfLongest(String str) {
		if(str.length() < 2) return str.length();
		
		int[] index = new int[26];
		Arrays.fill(index, -1);
		int max = 0, start = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			char c  = str.charAt(i);
			if(index[c - 'a'] >= start) {
				start = index[c - 'a'] + 1;
			}
			index[c - 'a'] = i;
			max = max < i - start + 1 ? i - start + 1 : max;
		}
		
		return max;
		
		
	}

	public static String compress(String str) {
		if(str == null || str.isEmpty()) return str;
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
	}
	
	public static String reverseWords(String s) {
	    String[] words = s.trim().split("\\s+");
	    StringBuilder sb = new StringBuilder();

	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]);
	        if (i > 0) sb.append(" ");
	    }
	    return sb.toString();
	}
}
