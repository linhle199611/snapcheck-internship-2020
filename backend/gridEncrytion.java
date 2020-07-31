import java.lang.*;

public class gridEncrytion {
    public static void main(String[] args) {
        String sample = "ifmanwasmeant tostayonthegroun dgodwo uldhavegivenusroots";
        String sample0 = "hav   eanic  eday";
        String sample1 = "feedthedog";
        String sample2 = "chillout";

        String solution = encrytion(sample);
        String solution0 = encrytion(sample0);
        String solution1 = encrytion(sample1);
        String solution2 = encrytion(sample2);

        System.out.println("Sample Input: " + sample);
        System.out.println("Sample Output: " + solution);
        System.out.println("\nSample Input 0: " + sample0);
        System.out.println("Sample Output 0: " + solution0);
        System.out.println("\nSample Input 1: " + sample1);
        System.out.println("Sample Output 1: " + solution1);
        System.out.println("\nSample Input 2: " + sample2);
        System.out.println("Sample Output 2: " + solution2);
    }

    private static String encrytion(String s)
    {
    	s = s.replaceAll("\\s","");		//remove space if necessary
    	int count = 0, lenStr = s.length();
    	int arrSize = (int)Math.sqrt(lenStr);
    	int row = 0, col = arrSize + 1;
    	if(arrSize * (arrSize+1) < lenStr)	// if the length of string is bigger than row * col. increament the row by 1
    			row = arrSize + 1;
    	else
    			row = arrSize;
    	char[][] arr = new char[row][col];
    	String result = "";

    	for(int i = 0 ; i < arr.length ; i++)
    	{
    		for(int j = 0 ; j < arr[0].length ; j++)
			{
				if(count >= s.length())		// check if the size of string less than the array size
					break;
				arr[i][j] = s.charAt(count);	//copy  string into array
				count++;	
			}
    	}

    	for(int i = 0 ; i < arr[0].length ; i++)
    	{
    		for(int j = 0 ; j < arr.length; j++)
			{
				result += arr[j][i];
			}
			result += " ";
    	}
    	return result;
    }
}