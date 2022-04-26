package sysparking.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estacionamento")
public class EstacionamentoVO extends AbstractVO {
	
	@Column(nullable = false)
	private String nome;
	
	private List<AndarVO> listaAndares;
	
	@Column(nullable = false)
	private Integer minutosTolerancia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AndarVO> getListaAndares() {
		return listaAndares;
	}

	public void setListaAndares(List<AndarVO> listaAndares) {
		this.listaAndares = listaAndares;
	}

	public Integer getMinutosTolerancia() {
		return minutosTolerancia;
	}

	public void setMinutosTolerancia(Integer minutosTolerancia) {
		this.minutosTolerancia = minutosTolerancia;
	}
		
}
