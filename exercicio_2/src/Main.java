
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 57;
		
		

		for (int contador = 3; contador <= 10;contador++) 
		{
			if (contador < 5 || contador == 8) 
			{
				soma = soma - contador;
				System.out.println("Soma aqui está valendo: " + soma);
			} 
			else 
			{
				soma = soma + contador;
				System.out.println("Soma aqui está valendo: " + soma);

			}
			
		}
		
		System.out.println("O valor da soma é " + soma);

	}

}
