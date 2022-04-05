package sysparking.api.repository;

import org.springframework.data.repository.CrudRepository;

import sysparking.api.model.PessoaVO;

public interface PessoaRepository extends CrudRepository<PessoaVO, Long> {

}
