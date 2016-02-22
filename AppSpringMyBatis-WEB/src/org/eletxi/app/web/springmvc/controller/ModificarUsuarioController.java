package org.eletxi.app.web.springmvc.controller;

import org.eletxi.app.jar.spring.service.UsuarioService;
import org.eletxi.app.web.springmvc.model.Usuario;
import org.eletxi.app.web.springmvc.model.cast.UsuarioCast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Clase 'EliminarUsuarioController'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Controller
@RequestMapping(value = "/modificar-usuario.action")
@SessionAttributes("usuario")
public class ModificarUsuarioController {

	/**
	 * Atributo 'usuarioService'.
	 */
	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Método 'modificarUsuarioJsp'.
	 * @param model - Model.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public final String modificarUsuarioJsp(final Model model) {
		return "modificar-usuario";
	}

	/**
	 * Método 'modificarUsuarioAction'.
	 * @param usuario - Usuario.
	 * @param status - SessionStatus.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public final String modificarUsuarioAction(@ModelAttribute("usuario") final Usuario usuario,
			final SessionStatus status) {
		if (this.usuarioService.modificar(UsuarioCast.modelToVO(usuario)) == 0) {
			return "modificar-usuario";
		} else {
			return "home";
		}
	}
}
