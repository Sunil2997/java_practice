public class Swap{

public static void main (String arg[]){
int a=10;
int b=20;
System.out.println("old values a: "+a +" b  : "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("old values a: "+a +" b  : "+b);

}

}