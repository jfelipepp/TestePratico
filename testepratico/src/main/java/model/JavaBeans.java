package model;

public class JavaBeans {
	private String cliente;                                                                   
	private String tipo;
	private String status;
	private String categoria;
	private String movimentacao;
	private String horainicio;
	private String horafim;
	private String datainicio;
	private String datafim;
	private String numconteiner;
	
	public JavaBeans() {
		super();
	}
	
	public JavaBeans(String cliente, String tipo, String status, String categoria, String movimentacao,
			String horainicio, String horafim, String datainicio, String datafim, String numconteiner) {
		super();
		this.cliente = cliente;
		this.tipo = tipo;
		this.status = status;
		this.categoria = categoria;
		this.movimentacao = movimentacao;
		this.horainicio = horainicio;
		this.horafim = horafim;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.numconteiner = numconteiner;
	}

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}
	public String getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}
	public String getHorafim() {
		return horafim;
	}
	public void setHorafim(String horafim) {
		this.horafim = horafim;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public String getDatafim() {
		return datafim;
	}
	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}
	public String getNumconteiner() {
		return numconteiner;
	}
	public void setNumconteiner(String numconteiner) {
		this.numconteiner = numconteiner;
	}
	
	
	
	
	
	
}
