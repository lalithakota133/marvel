package demo;

import java.util.ArrayDeque;
import java.util.Queue;

public class tickets {
public static void main(String args[])
{
Queue <String> que = new ArrayDeque <String>();
System.out.println("BOOKING LIST");
que.add("SITA");
que.add("HARI");
que.add("MADHU");
que.add("LATHA");
que.add("JEEVAN");
que.add("SREENU");
System.out.println(que);
System.out.println("iterating queue");
int i=0;

for(String d:que)
{
	System.out.println(i+1 +"."+" "+ d);
	i++;
	}
System.out.println("\n");
Object[] s=que.toArray();
System.out.println("CONVERTING queue TO array:");
for(Object o:s)
{
System.out.print(o+" ");
}

System.out.println("\n");
System.out.println("LENGTH OF THE QUEUE IS " + " " + que.size());
System.out.println( que.remove() + " " + "ur booking has been COMPLETED!!!");
System.out.println("NOW LENGTH OF THE QUEUE IS " + " " + que.size());
que.offer("PRIYA");
que.offer("LUCKY");

System.out.println("\n");
System.out.println("QUEUE LENGTH IS "+" "+que.size() +" "+ " & UPDATED QUEUE IS:");
int j=0;
for(String d:que)
{
	System.out.println(j+1 +"."+" "+ d);
	j++;
}
}
}
