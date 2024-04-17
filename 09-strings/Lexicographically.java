// Lexicographically next string

// Input : geeks
// Output : geekt
// The last character 's' is changed to 't'.

// Input : raavz
// Output : raawz
// Since we can't increase last character, 
// we increment previous character.

// Input :  zzz
// Output : zzza

class Lexicographically {
public static String nextWord(String str)
{
	
	// if string is empty
	if (str == "")
	return "a";
	
	// Find first character from
	// right which is not z.
	int i = str.length() - 1;
	while (str.charAt(i) == 'z' && i >= 0)
		i--;
		
	// If all characters are 'z', 
	// append an 'a' at the end.
	if (i == -1) 
		str = str + 'a';

// If there are some
// non-z characters 
else
	str = str.substring(0, i) + 
		(char)((int)(str.charAt(i)) + 1) + 
					str.substring(i + 1);
return str; 
}

// Driver Code
public static void main (String[] args)
{
	String str = "samez";
	System.out.print(nextWord(str));
}
}

// This code is contributed 
// by Kirti_Mangal
