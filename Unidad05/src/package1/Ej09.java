package package1;

public class Ej09 {

	public static void main(String[] args) {
		
		int resto2=0;
		int resto3=0;
		
		for(int i=1; i<101; i++) {
			
			resto2=i%2;
			resto3=i%3;
					
			if(resto2==0 && resto3==0) {
				System.out.println(i);
			}
			
		}
		
		

	}

}
