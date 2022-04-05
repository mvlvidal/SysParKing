package sysparking.api.repository;

import org.springframework.data.repository.CrudRepository;

import sysparking.api.model.VeiculoVO;

public interface VeiculoRepository extends CrudRepository<VeiculoVO, Long> {

}
