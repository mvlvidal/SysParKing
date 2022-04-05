package sysparking.api.model;

import java.util.List;

public class AndarVO extends AbstractVO {
	
	private String codigo;
	
	private EstacionamentoVO estacionamento;
	
	private List<VagaVO> listaVagas;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public EstacionamentoVO getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(EstacionamentoVO estacionamento) {
		this.estacionamento = estacionamento;
	}

	public List<VagaVO> getListaVagas() {
		return listaVagas;
	}

	public void setListaVagas(List<VagaVO> listaVagas) {
		this.listaVagas = listaVagas;
	}
		
}
