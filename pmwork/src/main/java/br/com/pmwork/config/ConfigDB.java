package br.com.pmwork.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="br.com.pmwork.model.repositories")
public class ConfigDB {
	
	public DataSource dataSource() throws IllegalStateException, PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/pmwork");
		dataSource.setUser("pmwork");
		dataSource.setPassword("tcc2016");
//		dataSource.setJdbcUrl("jdbc:mysql://br-cdbr-azure-south-b.cloudapp.net:3306/pmwork");
//		dataSource.setUser("bfb8cef90e3341");
//		dataSource.setPassword("46c467e5");
		return dataSource;
		
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setPackagesToScan("br.com.pmwork.model.entity");
		entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		entityManagerFactoryBean.setJpaDialect(hibernateJpaDialect());
		
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		return entityManagerFactoryBean;
	}
	@Bean
	public HibernateJpaDialect hibernateJpaDialect(){
		return new HibernateJpaDialect();
	}
	
	@Bean
	public JpaTransactionManager transactionManager() throws Exception {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
}
