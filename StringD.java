import java.util.Scanner;
class StringD
{
public static void main(String args[])
{
String str1="Direct Assignment";
char[] ch={'c','h','a','r','d','e','m','o'};
String str2=new String(ch);

String str3=new String("through object");
Scanner sc=new Scanner(System.in);
String str4=sc.nextLine();
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
System.out.println(str4);
}
}
