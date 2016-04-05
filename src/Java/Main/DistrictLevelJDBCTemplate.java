package Java.Main;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 * Created by BartowB on 4/5/2016.
 */
public class DistrictLevelJDBCTemplate implements DistrictLevelDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String state, Integer day, Integer week, Integer month, Date last_sub, Date next_sub,
                       String typeRep, String reportID, Integer notifyTimeFrame, boolean isSent){

        String SQL = "insert into tablename () values ()";

        jdbcTemplate.update(SQL,state,day,week,month,last_sub,next_sub,typeRep,reportID,notifyTimeFrame, isSent);

    }

    public StateLevel getStateLevel(Integer reportID){

        String SQL = "select * from  where reportID = ?";

        StateLevel stateLevel = jdbcTemplate.queryForObject(SQL,
                new Object[]{reportID}, new stateMapper());
        return stateLevel;

    }

    public List<StateLevel> listStatelevel(){

    }

    public void delete(){

    }

    public void updateSub(){

    }
}
