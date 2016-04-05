package Java.Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by BartowB on 4/5/2016.
 */
public class stateMapper implements RowMapper<StateLevel> {
    public StateLevel mapRow(ResultSet rs, int rowNum) throws SQLException {
        StateLevel stateLevel = new StateLevel();
        stateLevel.setID(rs.getInt("id"));
        stateLevel.setState(rs.getString("state_abbre"));
        stateLevel.setRepName(rs.getString("report_name"));
        stateLevel.setCycle(rs.getString("cycle"));
        stateLevel.setLast_sub(rs.getDate("last_submit"));
        stateLevel.setNext_sub(rs.getDate("next_submit"));
        stateLevel.setTypeRep(rs.getString("report_category"));
        stateLevel.setReportID(rs.getInt("report_id"));
        stateLevel.setNotifyTimeFrame(rs.getInt("notification_length"));
        stateLevel.setIsSent(rs.getBoolean("sent"));
        return stateLevel;
    }
}
