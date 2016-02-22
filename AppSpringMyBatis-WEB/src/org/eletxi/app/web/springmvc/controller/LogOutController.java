package org.eletxi.app.web.springmvc.controller;

import org.eletxi.app.web.springmvc.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Clase 'LogOutController'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Controller
@RequestMapping(value = "/log-out.action")
@SessionAttributes("usuario")
public class LogOutController {

	/**
	 * Método 'logOutAction'.
	 * @param usuario - Usuario.
	 * @param status - SessionStatus.
	 * @return String.
	 */
	@RequestMapping
	public final String logOutAction(@ModelAttribute("usuario") final Usuario usuario, final SessionStatus status) {
		status.setComplete();
		return "redirect:login.action";
	}
}
