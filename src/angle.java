
import java.util.Scanner;
public class angle {
private static Scanner input=new Scanner(System.in);
public static void main(String[] args)
{
	int h=0,m=0;
	String time;
	System.out.println("enter time:");
	time=input.next();
	//System.out.println(time);
	if(time.length()==3)
	{
		
		h=Integer.parseInt(String.valueOf(time.charAt(0)));
		m=Integer.parseInt(String.valueOf(time.charAt(2)));
	}
	else if(time.length()==4)
	{
		if(time.charAt(1)==':')
		{
		char[] ch=new char[2];
		h=Integer.parseInt(String.valueOf(time.charAt(0)));
		ch[0]=time.charAt(2);
		ch[1]=time.charAt(3);
		m=Integer.parseInt(new String(ch));	
		}
		else
		{
			char[] ch=new char[2];
			ch[0]=time.charAt(2);
			ch[1]=time.charAt(3);
			h=Integer.parseInt(new String(ch));
			m=Integer.parseInt(String.valueOf(time.charAt(3)));
		}
	}
	else if(time.length()==5)
	{
		char[] ch=new char[2];
		char[] ch1=new char[2];
		ch[0]=time.charAt(0);
		ch[1]=time.charAt(1);
		h = Integer.parseInt(new String(ch));
		ch1[0]=time.charAt(3);
		ch1[1]=time.charAt(4);
		m = Integer.parseInt(new String(ch1));
	}
	else
	{
		System.out.println("enter time in hh:mm format");
	}
	double angle=timeAngle(h,m);
	if(angle>=0)
	{
	System.out.println(angle);
	}
}
private static double timeAngle(int h, int m) {
	 if (h <0 || m < 0 || h >12 || m > 60)
	 {
         System.out.println("Wrong input");
         return -1;
	 }
     if (m == 60)
     {
     m = 0;
     h += 1;
     if(h>12)
     {
     h = h-12;
     }
     } 
	double min=m;
	int minutes=m/5;
	double fraction;
	int count=minutes,k=0;
	while(count<h)
	{
		count++;
		k++;
	}
	double angle=30*k;
	fraction=(min/60)*30;
	angle=angle+fraction;
	if(angle>180)
	{
		angle=360-angle;
	}
	return angle;
}
}
