package Java.Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper

/**
 * Created by BartowB on 4/5/2016.
 */
public class districtMapper implements RowMapper<DistrictLevel> {
    public DistrictLevel mapRow(ResultSet rs, int rowNum) throws SQLException {
        DistrictLevel districtLevel = new districtLevel();
        districtLevel.setState(rs.getInt(""));
        districtLevel.setFreq(rs.getInt(""));
        districtLevel.setLast_sub(rs.getInt(""));
        districtLevel.setNext_sub(rs.getInt(""));
        districtLevel.setTypeRep(rs.getInt(""));
        districtLevel.setReportID(rs.getInt(""));
        districtLevel.setNotifyTimeFrame(rs.getInt(""));
        districtLevel.setisSent(rs.getInt(""));
        districtLevel.setDistrictID(rs.getInt(""));
        districtLevel.setRoleRequired(rs.getInt(""));
        return districtLevel;
    }
}
