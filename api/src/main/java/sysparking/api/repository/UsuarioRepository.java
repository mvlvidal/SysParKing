package sysparking.api.repository;

import org.springframework.data.repository.CrudRepository;

import sysparking.api.model.UsuarioVO;

public interface UsuarioRepository extends CrudRepository<UsuarioVO, Long> {

}
