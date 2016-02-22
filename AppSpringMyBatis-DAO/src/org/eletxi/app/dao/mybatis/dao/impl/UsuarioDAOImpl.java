package org.eletxi.app.dao.mybatis.dao.impl;

import java.sql.SQLException;

import org.eletxi.app.dao.mybatis.dao.UsuarioDAO;
import org.eletxi.app.dao.mybatis.mapper.UsuarioMapper;
import org.eletxi.app.dao.mybatis.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase 'UsuarioDAOImpl'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	/**
	 * Atributo 'mapper'.
	 */
	@Autowired
	private UsuarioMapper mapper;

	@Override
	public final UsuarioVO buscarPorCodigo(final String codigo) throws SQLException {
		try {
			return this.mapper.buscarPorCodigo(codigo);
		} catch (Exception ex) {
			throw new SQLException("Ha ocurrido un error al acceder a la tabla USUARIOS: " + ex.getMessage());
		}
	}

	@Override
	public final int insert(final UsuarioVO usuarioVO) throws SQLException {
		try {
			return this.mapper.insert(usuarioVO);
		} catch (Exception ex) {
			throw new SQLException("Ha ocurrido un error al acceder a la tabla USUARIOS: " + ex.getMessage());
		}
	}

	@Override
	public final int delete(final UsuarioVO usuarioVO) throws SQLException {
		try {
			return this.mapper.delete(usuarioVO);
		} catch (Exception ex) {
			throw new SQLException("Ha ocurrido un error al acceder a la tabla USUARIOS: " + ex.getMessage());
		}
	}

	@Override
	public final int update(final UsuarioVO usuarioVO) throws SQLException {
		try {
			return this.mapper.update(usuarioVO);
		} catch (Exception ex) {
			throw new SQLException("Ha ocurrido un error al acceder a la tabla USUARIOS: " + ex.getMessage());
		}
	}
}
