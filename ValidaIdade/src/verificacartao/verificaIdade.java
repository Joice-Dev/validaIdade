
package verificacartao;

import java.util.Scanner;

public class verificaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
	    int idade = ler.nextInt();
	   final int abertura = 17;
		
	    
		
	   
		if (idade <= abertura) {
		        System.out.println("De acordo com a sua idade, você pode solicitar abertura da conta Kids."
		        		+ "\n A conta Kids é um tipo de conta destinada a menores de 18 anos, com recursos um"
		        		+ "\n pouco mais limitados e total possibilidade de controle dos pais.");
		System.out.print("Deseja saber quantos anos faltam para concluir"
				+ "\n a abertura de sua conta?: "
				+ "\n 1- SIM "
				+ "\n 2- NÃO "
				);
		 int opcao = ler.nextInt();
		 int anos = abertura - idade +1;
		 
		 switch (opcao){
         case 1:
		 
		 if (anos == 1) {
				System.out.println("Ainda falta "+anos+ " ano para concluir a abertura de sua conta.");
			}else {
				System.out.println("Ainda faltam "+anos+ " anos para concluir a abertura de sua conta.");
			}
		 case 2:
		    	   
		        System.out.println("Agradecemos a preferência.");

			
		
		
  } 
	        

}else {
		        	  System.out.println("Autorizado a dar entrada na abertura de conta neste banco.");
		        }
}		
}		


	


