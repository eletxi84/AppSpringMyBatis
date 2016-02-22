package org.eletxi.app.web.springmvc.controller;

import org.eletxi.app.dao.mybatis.vo.UsuarioVO;
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
 * Clase 'LoginController'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Controller
@RequestMapping(value = "/login.action")
@SessionAttributes("usuario")
public class LoginController {

	/**
	 * Atributo 'usuarioService'.
	 */
	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Método 'crearUsuario'.
	 * @return Usuario.
	 */
	@ModelAttribute("usuario")
	public final Usuario crearUsuario() {
		return null;
	}

	/**
	 * Método 'loginJsp'.
	 * @param usuario - Usuario.
	 * @param model - Model.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public final String loginJsp(@ModelAttribute("usuario") final Usuario usuario, final Model model) {
		if (usuario == null) {
			model.addAttribute("usuario", new Usuario());
			return "login";
		} else {
			return "home";
		}
	}

	/**
	 * Método 'loginAction'.
	 * @param usuario - Usuario.
	 * @param model - Model.
	 * @return String.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public final String loginAction(@ModelAttribute("usuario") final Usuario usuario, final Model model) {
		UsuarioVO usuarioVO = this.usuarioService.login(usuario.getCodigo(), usuario.getClave());
		if (usuarioVO == null) {
			usuario.setClave(null);
			return "login";
		} else {
			model.addAttribute("usuario", UsuarioCast.voToModel(usuarioVO));
			return "home";
		}
	}
}
