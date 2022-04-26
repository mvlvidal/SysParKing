package sysparking.api.service;

import java.util.List;

import sysparking.api.model.EstacionamentoVO;

public interface EstacionamentoService {
	
	public EstacionamentoVO inserir(EstacionamentoVO estacionamento);
	
	public EstacionamentoVO alterar(EstacionamentoVO estacionamento);
	
	public Boolean excluir(Long idEstacionamento);
	
	public List<EstacionamentoVO> consultar(String nome);
	
	public EstacionamentoVO selecionar(Long idEstacionamento);
	
	public List<EstacionamentoVO> listar();
}
