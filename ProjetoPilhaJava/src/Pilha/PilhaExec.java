

package Pilha;

public class PilhaExec extends autor {
	
	public static String VarComum="Sou uma variável publica";
		
	public static void main(String args[]) {
		System.out.println(Max);
		System.out.println(" ");
		System.out.println("Início do Comando principal 1");
		Metodo1(VarComum, VarComum);
		Metodo2();
		Metodo3();
		Metodo4();
		Metodo5();
		System.out.println(VarComum + "Fim do comando principal 1");			
	}
	
	public static void Metodo1(String M1A, String M1B ) {
		System.out.println("**Iniciando o metodo1");
		System.out.println(VarComum);
		M1A= "Primeira Variável do metodo1";
		M1B= "Segunda variável do metodo1";
		System.out.println("**" + M1A);	
		System.out.println("**" + M1B);		
		System.out.println(M1A + " / " + M1B + "  /  Fim do metodo1.");			
	}
	
	public static void Metodo2() {
		System.out.println("**Inicio o metodo2");
		System.out.println(VarComum);
		System.out.println("**Fim do metodo 2");		
	}
	
	public static void Metodo3() {
		int x = 1;
		System.out.println("**Iniciando o metodo3");
		while (x<10) {
			System.out.println("***" + x);
			x++;
		}		
	}
	
	public static void Metodo4() {
		System.out.println("**Inicio do metodo4");	
		System.out.println("**Fim do metodo4");	
	}
	
	public static void Metodo5() {
		System.out.println("**Inicio do metodo5");
		Metodo1(VarComum, VarComum);
		Metodo2();
		Metodo3();
		Metodo4();
		System.out.println(VarComum + "  /  Fim d metodo5");		
	}
	
	
	
	
	
	
	
	

}
