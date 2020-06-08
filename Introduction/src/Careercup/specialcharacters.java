package Careercup;

public class specialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Happy%^&*Christmas*&*&*)NewYear";
		String str1[] = str.replaceAll("[^a-zA-Z]", " ").split(" ");
		int temp = 0;
		String longestWord = "";
		for(int i=0; i<str1.length;i++) {
		if(temp < str1[i].length()) {
		temp = str1[i].length();
		longestWord = str1[i];
		}
		}
		System.out.println(longestWord+" is the largest word with "+temp +" characters");
		}

	}


