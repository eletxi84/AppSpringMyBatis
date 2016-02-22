package org.eletxi.app.dao.mybatis.dao;

import java.sql.SQLException;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;

/**
 * Interfaz 'UsuarioDAO'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
public interface UsuarioDAO {

	/**
	 * Método 'buscarPorCodigo'.
	 * @param codigo - String.
	 * @return UsuarioVO.
	 * @throws SQLException si se da algún error en el acceso a Base de Datos.
	 */
	UsuarioVO buscarPorCodigo(String codigo) throws SQLException;

	/**
	 * Método 'insert'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da algún error en el acceso a Base de Datos.
	 */
	int insert(UsuarioVO usuarioVO) throws SQLException;

	/**
	 * Método 'delete'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da algún error en el acceso a Base de Datos.
	 */
	int delete(UsuarioVO usuarioVO) throws SQLException;

	/**
	 * Método 'update'.
	 * @param usuarioVO - UsuarioVO.
	 * @return int.
	 * @throws SQLException si se da algún error en el acceso a Base de Datos.
	 */
	int update(UsuarioVO usuarioVO) throws SQLException;
}
