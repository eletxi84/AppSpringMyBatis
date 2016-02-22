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

/**
 * Clase 'RegistrarUsuarioController'.
 * @author Omar
 *
 */
@Controller
@RequestMapping(value = "/registrar-usuario.action")
@SessionAttributes("usuario")
public class RegistrarUsuarioController {

	/**
	 * Atributo 'usuarioService'.
	 */
	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Método 'registrarUsuarioJsp'.
	 * @param model - Model.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public final String registrarUsuarioJsp(final Model model) {
		model.addAttribute("usuario-nuevo", new Usuario());
		return "registrar-usuario";
	}

	/**
	 * Método 'registrarUsuarioAction'.
	 * @param usuarioNuevo - Usuario.
	 * @param model - Model.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public final String registrarUsuarioAction(@ModelAttribute("usuario-nuevo") final Usuario usuarioNuevo,
			final Model model) {
		if (this.usuarioService.registrar(UsuarioCast.modelToVO(usuarioNuevo)) == 0) {
			return "registrar-usuario";
		} else {
			model.addAttribute("usuario", usuarioNuevo);
			return "redirect:login.action";
		}
	}
}
