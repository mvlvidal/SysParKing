package sysparking.api.model;

public class ModeloVeiculoVO extends AbstractVO {

	private MarcaVeiculoVO marca;
	
	private TipoVeiculoVO tipoVeiculo;

	public MarcaVeiculoVO getMarca() {
		return marca;
	}

	public void setMarca(MarcaVeiculoVO marca) {
		this.marca = marca;
	}

	public TipoVeiculoVO getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoVO tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
		
}
