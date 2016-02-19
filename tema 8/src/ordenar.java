

public class ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] orden={6,5,1,6};
		
		
		for (int i = 0; i < orden.length-1; i++) {
			for (int cont = 0; cont < orden.length-1; cont++) {
				
			
			if (orden[cont]<orden[cont+1]) {
			int k = orden[cont];
			orden[cont]=orden[cont+1];
			orden[cont+1]=k;
				
			}

			}
			
			
		}
		
		for (int i = 0; i < orden.length; i++) {
			System.out.println(orden[i]);
		}
	
		
	}

}
