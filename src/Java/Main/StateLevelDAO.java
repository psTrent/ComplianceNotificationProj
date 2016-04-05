package Java.Main;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 * Created by BartowB on 4/5/2016.
 */
public interface StateLevelDAO {

    public void setDataSource(DataSource ds);

    public void create(String state, Integer day, Integer week, Integer month, Date last_sub, Date next_sub,
                       String typeRep, String reportID, Integer notifyTimeFrame, boolean isSent);

    public StateLevel getStateLevel(Integer reportID);

    public List<StateLevel> listStateLevel();

    public void delete();

    public void update();
}
