package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {

    public DriverManagerDataSource Conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/cajachica");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        return dataSource;
    }
}
