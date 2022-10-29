package basics;

public final class MyStaticClass {
	   private MyStaticClass () { // private constructor
	       myStaticMember = 1;
	   }
	   private static int myStaticMember;
	   public static void setMyStaticMember(int val) {
	       myStaticMember = val;
	   }
	   public static int getMyStaticMember() {
	       return myStaticMember;
	   }
	   public static int squareMyStaticMember() {
	       return myStaticMember * myStaticMember;
	   }
	}