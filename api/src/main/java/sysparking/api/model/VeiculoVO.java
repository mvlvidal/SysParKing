package sysparking.api.model;

public class VeiculoVO extends AbstractVO{
	
	private ModeloVeiculoVO modeloVeiculo;
	
	private String placa;
	
	private String cor;

	public ModeloVeiculoVO getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(ModeloVeiculoVO modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
