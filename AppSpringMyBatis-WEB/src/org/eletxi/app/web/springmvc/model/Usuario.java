package org.eletxi.app.web.springmvc.model;

/**
 * Clase 'Usuario'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
public class Usuario {

	/**
	 * Atributo 'codigo'.
	 */
	private String codigo;
	/**
	 * Atributo 'nombre'.
	 */
	private String nombre;
	/**
	 * Atributo 'apellidos'.
	 */
	private String apellidos;
	/**
	 * Atributo 'clave'.
	 */
	private String clave;

	/**
	 * Método 'Usuario'. Constructor por defecto.
	 */
	public Usuario() {
		super();
	}

	/**
	 * Método 'getCodigo'. Getter del atributo 'codigo'.
	 * @return String con el valor del atributo 'codigo'.
	 */
	public final String getCodigo() {
		return this.codigo;
			
	}

	/**
	 * Método 'setCodigo'. Setter del atributo 'codigo'.
	 * @param pCodigo - String con el valor a asignar al atributo 'codigo'.
	 */
	public final void setCodigo(final String pCodigo) {
		this.codigo = pCodigo;
	}

	/**
	 * Método 'getNombre'. Getter del atributo 'nombre'.
	 * @return String con el valor del atributo 'nombre'.
	 */
	public final String getNombre() {
		return this.nombre;
	}

	/**
	 * Método 'setNombre'. Setter del atributo 'nombre'.
	 * @param pNombre - String con el valor a asignar al atributo 'nombre'.
	 */
	public final void setNombre(final String pNombre) {
		this.nombre = pNombre;
	}

	/**
	 * Método 'getApellidos'. Getter del atributo 'apellidos'.
	 * @return String con el valor del atributo 'apellidos'.
	 */
	public final String getApellidos() {
		return this.apellidos;
	}

	/**
	 * Método 'setApellidos'. Setter del atributo 'apellidos'.
	 * @param pApellidos - String con el valor a asignar al atributo 'apellidos'.
	 */
	public final void setApellidos(final String pApellidos) {
		this.apellidos = pApellidos;
	}

	/**
	 * Método 'getClave'. Getter del atributo 'clave'.
	 * @return String con el valor del atributo 'clave'.
	 */
	public final String getClave() {
		return this.clave;
	}

	/**
	 * Método 'setClave'. Setter del atributo 'clave'.
	 * @param pClave - String con el valor a asignar al atributo 'clave'.
	 */
	public final void setClave(final String pClave) {
		this.clave = pClave;
	}
}
