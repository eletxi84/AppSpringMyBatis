package org.eletxi.app.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.eletxi.app.dao.mybatis.vo.UsuarioVO;

/**
 * Interfaz 'UsuarioMapper'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
public interface UsuarioMapper {

	/**
	 * Constante 'COLUMNAS'.
	 */
	String COLUMNAS = "CODIGO, NOMBRE, APELLIDOS, CLAVE";

	/**
	 * Método 'buscarPorCodigo'. Busca el usuario con el código pasado como parametro en la tabla USUARIOS.
	 * @param codigo - String con el código del usuario que se busca en la tabla USUARIOS.
	 * @return UsuarioVO.
	 */
	@Results({
		@Result(property = "codigo", column = "CODIGO"),
		@Result(property = "nombre", column = "NOMBRE"),
		@Result(property = "apellidos", column = "APELLIDOS"),
		@Result(property = "clave", column = "CLAVE")
	})
	@Select("SELECT * FROM USUARIOS WHERE CODIGO = #{codigo}")
	UsuarioVO buscarPorCodigo(@Param("codigo") String codigo);

	/**
	 * Método 'insert'. Inserta el 'usuarioVO' recibido como parametro en la tabla USUARIOS.
	 * @param usuarioVO - UsuarioVO que se va a insertar en la tabla USUARIOS.
	 * @return int.
	 */
	@Insert({
		"INSERT INTO USUARIOS (", UsuarioMapper.COLUMNAS, ")",
		"VALUES (#{usuarioVO.codigo}, #{usuarioVO.nombre}, #{usuarioVO.apellidos}, #{usuarioVO.clave})"
	})
	int insert(@Param("usuarioVO") UsuarioVO usuarioVO);

	/**
	 * Método 'delete'. Eliminar el 'usuarioVO' recibido como parametro de la tabla USUARIOS.
	 * @param usuarioVO - UsuarioVO que se va a eliminar de la tabla USUARIOS.
	 * @return int.
	 */
	@Delete("DELETE FROM USUARIOS WHERE CODIGO = #{usuarioVO.codigo}")
	int delete(@Param("usuarioVO") UsuarioVO usuarioVO);

	/**
	 * Método 'update'. Actualiza el 'usuarioVO' recibido como parametro en la tabla USUARIOS.
	 * @param usuarioVO - UsuarioVO que se va a actualizar en la tabla USUARIOS.
	 * @return int.
	 */
	@Delete({
		"UPDATE USUARIOS",
		"SET NOMBRE = #{usuarioVO.nombre}, APELLIDOS = #{usuarioVO.apellidos}, CLAVE = #{usuarioVO.clave}",
		"WHERE CODIGO = #{usuarioVO.codigo}"
	})
	int update(@Param("usuarioVO") UsuarioVO usuarioVO);
}
