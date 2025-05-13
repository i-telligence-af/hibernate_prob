package test.config.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = {"test.repository"},
    entityManagerFactoryRef = "testEntityManagerFactory",
    transactionManagerRef = "testTransactionManager"
)
@EntityScan({"test.entity"})
public class XeditEventsJPAConfiguration {

    private final Environment environment;

    @Autowired
    public XeditEventsJPAConfiguration(Environment environment) {
        this.environment = environment;
    }

    private Map<String, String> getProperties() {

        Map<String, String> ret = new HashMap<String, String>();

        // add physical naming strategy for hibernate:
        ret.put("hibernate.physical_naming_strategy", "org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy");

        return ret;

    }

    @Bean(name="testEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean xeditEntityManagerFactory(DataSource dataSource, EntityManagerFactoryBuilder builder) {

        LocalContainerEntityManagerFactoryBean ret = builder
                .dataSource(dataSource)
                .packages("test.entity")
                .properties(getProperties())
                .build();

        return ret;

    }

    @Bean(name="testTransactionManager")
    public PlatformTransactionManager xeditTransactionManager(@Qualifier("testEntityManagerFactory") LocalContainerEntityManagerFactoryBean testEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(testEntityManagerFactory.getObject()));
    }

}
