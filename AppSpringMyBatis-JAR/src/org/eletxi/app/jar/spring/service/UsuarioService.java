package org.eletxi.app.jar.spring.service;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;

/**
 * Interfaz 'UsuarioService'.
 */
public interface UsuarioService {

	/**
	 * M�todo 'login'.
	 * @param codigo - String.
	 * @param clave - String.
	 * @return UsuarioVO.
	 */
	UsuarioVO login(String codigo, String clave);

	/**
	 * M�todo 'registrar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int registrar(UsuarioVO usuarioVO);

	/**
	 * M�todo 'eliminar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int eliminar(UsuarioVO usuarioVO);

	/**
	 * M�todo 'modificar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int modificar(UsuarioVO usuarioVO);
}
