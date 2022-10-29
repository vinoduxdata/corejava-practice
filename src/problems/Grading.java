package problems;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            
       
        
         int grade=sc.nextInt();
        
		if(grade<38){
		
		}
		else{
			int q=grade/5;
			int r=grade%5;
			
			if(r<=3){
				grade=((q+=1)*5);
			}
			
        }
		System.out.println(grade);
	}

    }}