package org.eletxi.app.web.springmvc.model.cast;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;
import org.eletxi.app.web.springmvc.model.Usuario;

/**
 * Clase 'UsuarioCast'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
public final class UsuarioCast {

	/**
	 * Método 'UsuarioCast'.
	 */
	private UsuarioCast() {
		super();
	}

	/**
	 * Método 'modelToVO'.
	 * @param usuario - Usuario.
	 * @return UsuarioVO
	 */
	public static UsuarioVO modelToVO(final Usuario usuario) {
		UsuarioVO usuarioVO = new UsuarioVO();
		usuarioVO.setCodigo(usuario.getCodigo());
		usuarioVO.setNombre(usuario.getNombre());
		usuarioVO.setApellidos(usuario.getApellidos());
		usuarioVO.setClave(usuario.getClave());
		return usuarioVO;
	}

	/**
	 * Método 'voToModel'.
	 * @param usuarioVO - UsuarioVO.
	 * @return Usuario.
	 */
	public static Usuario voToModel(final UsuarioVO usuarioVO) {
		Usuario usuario = new Usuario();
		usuario.setCodigo(usuarioVO.getCodigo());
		usuario.setNombre(usuarioVO.getNombre());
		usuario.setApellidos(usuarioVO.getApellidos());
		usuario.setClave(usuarioVO.getClave());
		return usuario;
	}
}
