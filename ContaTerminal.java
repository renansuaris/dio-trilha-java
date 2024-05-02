import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome ");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite seu número da conta: ");
		int numero_conta = Integer.parseInt(sc.nextLine());
		
		System.out.println("Por favor, digite seu saldo: ");
		float saldo = Float.parseFloat(sc.nextLine());
		
		System.out.println(String.format("Olá %s,  obrigado por criar uma conta em nosso banco, sua agência é %s,"
				+ " conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero_conta, saldo));
		

	}

}
