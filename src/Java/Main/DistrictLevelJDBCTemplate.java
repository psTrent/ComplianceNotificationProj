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
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String state, String cycle, Date last_sub, Date next_sub,
                       String typeRep, String reportID, Integer notifyTimeFrame,boolean isSent){

        String SQL = "insert into state_reporting_notification(state_abbre,cycle,last_submit,next_submit,report_category,report_name,report_id,notification_length,sent)" +
                "VALUES (?,?,?,?,?,?,?,?,?)";

        jdbcTemplateObject.update(SQL,state,cycle,last_sub,next_sub,typeRep,reportID,notifyTimeFrame,isSent);

    }



    public void delete(){

    }

    public void updateSub(){

    }
}
