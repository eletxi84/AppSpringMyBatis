package org.eletxi.app.jar.spring.service;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;

/**
 * Interfaz 'UsuarioService'.
 */
public interface UsuarioService {

	/**
	 * Método 'login'.
	 * @param codigo - String.
	 * @param clave - String.
	 * @return UsuarioVO.
	 */
	UsuarioVO login(String codigo, String clave);

	/**
	 * Método 'registrar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int registrar(UsuarioVO usuarioVO);

	/**
	 * Método 'eliminar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int eliminar(UsuarioVO usuarioVO);

	/**
	 * Método 'modificar'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 */
	int modificar(UsuarioVO usuarioVO);
}
