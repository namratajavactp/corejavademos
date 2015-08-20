import static java.lang.System.*;

public class varargs {
	void print(int a,int y,String...s)
	{
	out.println(a+","+y);
	for(int i=0;i<s.length;i++)
		out.print(s[i]+"\t");
	out.println();
	}
	int max(int...num){
		int x=num[0];
		for(int i:num){
			if(i>x)
				x=i;
		}
		return x;
	}
public static void main(String[] arg)
{
	varargs v1=new varargs();
	v1.print(3,2,"java","java 5");
	out.println("Next invoke");
	v1.print(1,2,"a","b","c","d","e");
	out.println("Max of 23,34,45,65,32,12 is:"+v1.max(23,34,45,65,32,12));
}
}
