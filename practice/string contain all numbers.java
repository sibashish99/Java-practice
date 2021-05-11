
class GFG
{
static int MAX = 10;
static boolean isDigit(char ch)
{
	if (ch >= '0' && ch <= '9')
		return true;
	return false;
}

static boolean allDigits(String str, int len)
{

	boolean []present = new boolean[MAX];

	for (int i = 0; i < len; i++)
	{
		if (isDigit(str.charAt(i)))
		{
			int digit = str.charAt(i) - '0';
			present[digit] = true;
		}
	}


	for (int i = 0; i < MAX; i++)
	{

		if (!present[i])
			return false;
	}

	return true;
}

public static void main(String[] args)
{
	String str = "Geeks12345for69708";
	int len = str.length();

	if (allDigits(str, len))
		System.out.print("Yes");
	else
		System.out.print("No");
}
}

