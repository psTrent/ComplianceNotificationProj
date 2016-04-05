package Java.Main;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by BartowB on 4/5/2016.
 */
public class StateLevelJDBCTemplate implements StateLevelDAO{

    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;


    public void setDatasource(DataSource datasource){
        this.datasource = datasource;
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    public void create()
}
