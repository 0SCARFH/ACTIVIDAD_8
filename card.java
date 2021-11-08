package actividad_8;

public class card {
	private String palo,color,valor;
	
	public card(String palo, String color, String valor) {
		
		this.palo = palo;
		this.color = color;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valoor) {
		this.valor = valoor;
	}

}
