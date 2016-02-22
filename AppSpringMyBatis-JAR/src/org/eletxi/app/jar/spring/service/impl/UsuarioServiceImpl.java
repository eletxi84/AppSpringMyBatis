package org.eletxi.app.jar.spring.service.impl;

import java.sql.SQLException;

import org.eletxi.app.dao.mybatis.dao.UsuarioDAO;
import org.eletxi.app.dao.mybatis.vo.UsuarioVO;
import org.eletxi.app.jar.spring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase 'UsuarioServiceImpl'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	/**
	 * Atributo 'usuarioDAO'.
	 */
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public final UsuarioVO login(final String codigo, final String clave) {
		UsuarioVO usuarioVO;
		try {
			usuarioVO = this.usuarioDAO.buscarPorCodigo(codigo);
		} catch (SQLException sqlEx) {
			return null;
		}
		if (usuarioVO != null && usuarioVO.getClave().equals(clave)) {
			return usuarioVO; 
		} else {
			return null;
		}
	}

	@Override
	public final int registrar(final UsuarioVO usuarioVO) {
		try {
			return this.usuarioDAO.insert(usuarioVO);
		} catch (SQLException sqlEx) {
			return 0;
		}
	}

	@Override
	public final int eliminar(final UsuarioVO usuarioVO) {
		try {
			return this.usuarioDAO.delete(usuarioVO);
		} catch (SQLException sqlEx) {
			return 0;
		}
	}

	@Override
	public final int modificar(final UsuarioVO usuarioVO) {
		try {
			return this.usuarioDAO.update(usuarioVO);
		} catch (SQLException sqlEx) {
			return 0;
		}
	}
}
