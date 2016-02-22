package org.eletxi.app.dao.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Clase 'SpringJdbcConfig'. Clase de configuraci�n de Spring (@Configrable) para configurar SpringJDBC.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versi�n inicial.
 */
@Configuration
@MapperScan("org.eletxi.app.dao.mybatis.mapper")
public class SpringJdbcConfig {

	/**
	 * M�todo 'getDataSource'.
	 * @return DataSource.
	 */
	@Bean
	public DataSource getDataSource() {
		/* Opci�n 1: Conectarse directamente indicando el driver de BD, la URL de conexi�n, el nombre de usuario y la
		 * contrase�a. No es la opci�n m�s recomendable, ya que cualquier cambio en la BD implica cambios de c�digo. */
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/eletxi");
		dataSource.setUsername("eletxi");
		dataSource.setPassword("eletxi");
		return dataSource;
		/* Opci�n 2: Crear un recurso en el servidor y hacer un lookup para obtener el DataSource. Esta es la opci�n
		 * m�s recomendable, ya que los cambios en la BD se hacen en el servodor sin necesidad de modificar el
		 * c�digo. */
	}

	/**
	 * M�todo 'getSqlSessionFactory'.
	 * @return SqlSessionFactory.
	 * @throws Exception.
	 */
	@Bean
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(this.getDataSource());
		return sqlSessionFactory.getObject();
    }
}
