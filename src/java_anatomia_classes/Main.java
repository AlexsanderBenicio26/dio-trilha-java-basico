package java_anatomia_classes;

public class Main {

	public static void main(String[] args) {

		String primeiroNome = "Alexsander";
		String segundoNome = "Benicio";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
		System.out.println("Olá GitHub");
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}

}
