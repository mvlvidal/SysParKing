package sysparking.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sysparking.api.model.EstacionamentoVO;

public interface EstacionamentoRepository extends CrudRepository<EstacionamentoVO, Long>{
	
	public List<EstacionamentoVO> findByLikeNome(String nome);
	
}
