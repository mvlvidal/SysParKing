package sysparking.api.model;

import java.util.List;

public class MarcaVeiculoVO extends AbstractVO {
	
	private String nome;
	
	private List<ModeloVeiculoVO> listaModelos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ModeloVeiculoVO> getListaModelos() {
		return listaModelos;
	}

	public void setListaModelos(List<ModeloVeiculoVO> listaModelos) {
		this.listaModelos = listaModelos;
	}
		
}
