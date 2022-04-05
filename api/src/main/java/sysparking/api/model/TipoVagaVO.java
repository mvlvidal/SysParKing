package sysparking.api.model;

import java.util.List;

public class TipoVagaVO extends AbstractVO {
	
	private String nome;
	
	private Double tarifa;
	
	private List<VagaVO> listaVagas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public List<VagaVO> getListaVagas() {
		return listaVagas;
	}

	public void setListaVagas(List<VagaVO> listaVagas) {
		this.listaVagas = listaVagas;
	}
		
}
