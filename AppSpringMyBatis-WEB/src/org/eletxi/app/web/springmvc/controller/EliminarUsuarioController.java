package org.eletxi.app.web.springmvc.controller;

import org.eletxi.app.jar.spring.service.UsuarioService;
import org.eletxi.app.web.springmvc.model.Usuario;
import org.eletxi.app.web.springmvc.model.cast.UsuarioCast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Clase 'EliminarUsuarioController'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Controller
@RequestMapping(value = "/eliminar-usuario.action")
@SessionAttributes("usuario")
public class EliminarUsuarioController {

	/**
	 * Atributo 'usuarioService'.
	 */
	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Método 'eliminarUsuarioAction'.
	 * @param usuario - Usuario.
	 * @param status - SessionStatus.
	 * @return String.
	 */
	@RequestMapping
	public final String eliminarUsuarioAction(@ModelAttribute("usuario") final Usuario usuario,
			final SessionStatus status) {
		if (this.usuarioService.eliminar(UsuarioCast.modelToVO(usuario)) == 0) {
			return "home";
		} else {
			status.setComplete();
			return "redirect:login.action";
		}
	}
}
