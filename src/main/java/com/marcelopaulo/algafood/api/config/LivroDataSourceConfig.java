//package com.marcelopaulo.algafood.api.config;
//
//import com.marcelopaulo.algafood.domain.repository.livro.LivroRepository;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(basePackageClasses = LivroRepository.class,
//        entityManagerFactoryRef = "livroEntityManager")
//public class LivroDataSourceConfig {
//
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "livro.datasource")
//    public DataSource livroDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
////    @Bean
////    @Primary
////    public LocalContainerEntityManagerFactoryBean livroEntityManager(
////            EntityManagerFactoryBuilder builder,
////            @Qualifier("livroDataSource") DataSource dataSource) {
////        return builder.dataSource(dataSource)
////                .packages("com.algaworks.algafood.domain.model.livro")
////                .build();
////    }
//}
//
