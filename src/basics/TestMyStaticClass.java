package basics;  

//A top-level Java class mimicking static class behavior
public class TestMyStaticClass {
    public static void main(String []args){
       MyStaticClass.setMyStaticMember(5);
       System.out.println("Static value: " + MyStaticClass.getMyStaticMember());
       System.out.println("Value squared: " + MyStaticClass.squareMyStaticMember());
       // MyStaticClass x = new MyStaticClass(); // results in compile time error
    }
}

