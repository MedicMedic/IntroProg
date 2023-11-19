package dozen;
public class Dozen 
{
	public static void main (String[]args) 
	{
		System.out.println(printFigure());
	}
	public static String printFigure()
	{
		String figure="";
		int r=1, c = 0, j = 0,add=1;
		while (r<=5)
		{
			if(r!=1)
			{
				for (j=1;j<r;j++)
				{
					figure+=(" ");
				}
			}
			for(c=9;c>=add;--c)
			{
				figure+="@";
			}
			figure+="\n";
			add=add+2;
			r++;
		}
		figure += add + " "+c+ " "+j+ " "+r;
		return figure;
	}
}
