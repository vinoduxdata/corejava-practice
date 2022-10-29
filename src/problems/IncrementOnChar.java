package problems;

public class IncrementOnChar {
public static void main(String[] args) {
char a='a';
char A='A';
char b='+';
char c='1';

System.out.println("a post incremented to become "+(a++));
System.out.println("a  pre incremented to become "+(++a));

System.out.println("A post incremented to become "+(A++));
System.out.println("A pre incremented to become "+(++A));

System.out.println("+ post incremented to become "+(b++));
System.out.println("+ pre incremented to become "+(++b));

System.out.println("1 postincremented to become "+(c++));
System.out.println("1 pre incremented to become "+(++c));

}
}
