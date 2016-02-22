package org.eletxi.app.dao.mybatis.dao;

import java.sql.SQLException;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;

/**
 * Interfaz 'UsuarioDAO'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versi�n inicial.
 */
public interface UsuarioDAO {

	/**
	 * M�todo 'buscarPorCodigo'.
	 * @param codigo - String.
	 * @return UsuarioVO.
	 * @throws SQLException si se da alg�n error en el acceso a Base de Datos.
	 */
	UsuarioVO buscarPorCodigo(String codigo) throws SQLException;

	/**
	 * M�todo 'insert'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da alg�n error en el acceso a Base de Datos.
	 */
	int insert(UsuarioVO usuarioVO) throws SQLException;

	/**
	 * M�todo 'delete'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da alg�n error en el acceso a Base de Datos.
	 */
	int delete(UsuarioVO usuarioVO) throws SQLException;

	/**
	 * M�todo 'update'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da alg�n error en el acceso a Base de Datos.
	 */
	int update(UsuarioVO usuarioVO) throws SQLException;
}
