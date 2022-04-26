package sysparking.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sysparking.api.model.EstacionamentoVO;
import sysparking.api.repository.EstacionamentoRepository;
import sysparking.api.service.EstacionamentoService;

@Service
public class EstacionamentoServiceImpl implements EstacionamentoService{
	
	@Autowired
	private EstacionamentoRepository estacionamentoRepository;

	@Override
	public EstacionamentoVO inserir(EstacionamentoVO estacionamento) {
		
		EstacionamentoVO estacionamento1 = estacionamento;
		
		if(estacionamento1 != null) {
			return estacionamentoRepository.save(estacionamento);
		}
		
		return null;

	}

	@Override
	public EstacionamentoVO alterar(EstacionamentoVO estacionamento) {
		
		EstacionamentoVO estacionamento1 = estacionamento;
		
		if(estacionamento1 != null) {
			return estacionamentoRepository.save(estacionamento);
		}
		
		return null;
	}

	@Override
	public Boolean excluir(Long idEstacionamento) {

		if(idEstacionamento != null) {
			estacionamentoRepository.delete(estacionamentoRepository.findById(idEstacionamento).get());
			return true;
		}
		
		return false;
	}

	@Override
	public List<EstacionamentoVO> consultar(String nome) {
		
		if(nome != null && nome.isEmpty()) {
			
			return estacionamentoRepository.findByLikeNome(nome);
			
		}
		
		return new ArrayList<>();
	}

	@Override
	public List<EstacionamentoVO> listar() {
		
		List<EstacionamentoVO> lista = new ArrayList<>();
		
		lista = (List<EstacionamentoVO>) estacionamentoRepository.findAll();
		
		return lista;
	}

	@Override
	public EstacionamentoVO selecionar(Long idEstacionamento) {
		
		if(idEstacionamento != null) {
			return estacionamentoRepository.findById(idEstacionamento).get();
		}
		return null;
	}
	
	
	
}
