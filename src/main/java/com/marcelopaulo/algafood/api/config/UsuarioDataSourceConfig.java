//package com.marcelopaulo.algafood.api.config;
//
//import com.marcelopaulo.algafood.domain.repository.usuario.UsuarioRepository;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(basePackageClasses = UsuarioRepository.class,
//        entityManagerFactoryRef = "usuarioEntityManager")
//public class UsuarioDataSourceConfig {
//
//    @Bean
//    @ConfigurationProperties(prefix = "usuario.datasource")
//    public DataSource usuarioDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
////    @Bean
////    public LocalContainerEntityManagerFactoryBean usuarioEntityManager(
////            EntityManagerFactoryBuilder builder,
////            @Qualifier("usuarioDataSource") DataSource dataSource) {
////        return builder
////                .dataSource(dataSource)
////                .packages("com.algaworks.algafood.domain.model.usuario")
////                .build();
////    }
//}
