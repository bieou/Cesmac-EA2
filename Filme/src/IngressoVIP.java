
public class IngressoVIP extends Ingresso {

	public IngressoVIP(String filme, String tipoDeIngresso, String horarioDaSessao) {
		super(filme, tipoDeIngresso, horarioDaSessao);
		
	}
	public void acessoLanchonete(boolean vip, boolean filme) {
		if (vip){
			System.out.print("Lanchonete do cinema liberada");
		}
		if (filme) {
			System.out.print(" sessão 3D");
		}
		
		else {
			System.out.print(" sessão 2D");
		}
	};
	
	public void acessoLanchonete() {
		System.out.print("Compre um ingresso vip");
		System.out.print(" sessão 2D");
	}
	
	
}
