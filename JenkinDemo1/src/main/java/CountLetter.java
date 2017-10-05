
public class CountLetter {
public int CountA(String word)
{
	int count =0;
	int i;
	String reverse="";
	for(i=0;i<word.length();i++)
	{
		//reverse.=word.charAt(i);
		if(word.charAt(i)=='a' || word.charAt(i)=='A')
		{
			count++;
		}
	}
	return count;
}
}
