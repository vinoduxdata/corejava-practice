package problems;

public class Time24Format {

	public static void main(String[] args) {
		String time="02:00:00PM";
		String s=time.substring(8,10);
		if(s.equalsIgnoreCase("PM")){
		int t1=Integer.parseInt(time.substring(0, 2))+12;
		System.out.println(t1+":"+time.substring(3,8));

	}else
		System.out.println(time.substring(0,8));
	

}}
