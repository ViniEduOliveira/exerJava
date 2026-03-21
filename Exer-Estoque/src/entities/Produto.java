package entities;

public class Produto {
	private String name;
	private Double precoProd;
	private Integer qtdProd;
	
	public Produto() {
		
	}
	
	public Produto(String name, Double precoProd, Integer qtdProd) {
		this.name = name;
		this.precoProd = precoProd;
		this.qtdProd = qtdProd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}

	public Integer getQtdProd() {
		return qtdProd;
	}

	public Integer addQtdEtq(Integer quantidade) {
		return this.qtdProd += quantidade;
	}
	
	public boolean removeQtdEtq(Integer quantidade) {
		if (quantidade > this.qtdProd) {
	        System.out.println("Estoque insuficiente!");
	        return false;
	    }
		this.qtdProd -= quantidade;
	    return true;
	}	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Produto: ");
		sb.append(this.name);
		sb.append(" | Preço: ");
		sb.append(String.format("%.2f", precoProd));
		sb.append(" | Estoque atual: ");
		sb.append(qtdProd);
		return sb.toString();
	}
}
