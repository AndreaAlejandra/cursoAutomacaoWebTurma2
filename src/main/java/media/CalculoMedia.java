package media;

public class CalculoMedia {
	
	private double nota1;
	private double nota2;
	
	public CalculoMedia(double nota1, double _nota2) {
		
		this.nota1 = nota1;
		nota2 = _nota2;
	}
	
	public String getSituacao() {
		
		double soma = nota1 + nota2;
		if (soma<12) {
			return "Reprovado";
		}else {
			return "Aprovado";
		}
	}

}
