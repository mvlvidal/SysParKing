package sysparking.api.model;

import java.util.Calendar;

public class VagaVO extends AbstractVO {
	
	private UsuarioVO usuarioAtendimento;
	
	private AndarVO andar;
	
	private VeiculoVO veiculo;
	
	private Calendar dataHoraEntrada;
	
	private Calendar dataHoraSaida;

	public UsuarioVO getUsuarioAtendimento() {
		return usuarioAtendimento;
	}

	public void setUsuarioAtendimento(UsuarioVO usuarioAtendimento) {
		this.usuarioAtendimento = usuarioAtendimento;
	}

	public AndarVO getAndar() {
		return andar;
	}

	public void setAndar(AndarVO andar) {
		this.andar = andar;
	}

	public VeiculoVO getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoVO veiculo) {
		this.veiculo = veiculo;
	}

	public Calendar getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public void setDataHoraEntrada(Calendar dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}

	public Calendar getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(Calendar dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
	
}
