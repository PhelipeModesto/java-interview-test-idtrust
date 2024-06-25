
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sex = "masculino";
		int age = 66;
		
		// a) masculino;74
		// b) feminino;4
		// c) feminino;13
		// d) masculino;60
		// e) masculino;19
		// f) feminino;60
		
		if (sex == "masculino" && age >= 65)
		{
			System.out.println("APOSENTADO");
		}
		else if (sex == "feminino" && age >= 60)
		{
			System.out.println("APOSENTADA");
		}
		else if (age >=13 && age <=18)
		{
			System.out.println("ADOLESCENTE");
		}
		else if (age <13)
		{
			System.out.println("CRIANÇAS");
		}
		else 
		{
			System.out.println("ADULTO");
		}

	}

}
