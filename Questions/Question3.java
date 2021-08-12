package Questions;

import java.util.Arrays;


public class Question3 {
	
	
	public static void main(String[] args) {
		StringBuilder input=new StringBuilder("aabcdaafhbdr");
		manipulateString(input.reverse().toString());
	}

	private static void manipulateString(String input) {
		String uniquesString=removeDuplicate(input.toCharArray(),input.toCharArray().length);
		System.out.print(uniquesString);
		
	}
	
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;    
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];  // modifying and storing in same array.
            }
        }
        return String.valueOf(Arrays.copyOf(str, index)); // return String with no dublicates
    }
}

