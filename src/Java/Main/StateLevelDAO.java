package Java.Main;

import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

/**
 * Created by BartowB on 4/5/2016.
 */
public interface StateLevelDAO {

    public void setDataSource(DataSource ds);

    public void create(int id, String state, String cycle, Date last_sub, Date next_sub,
                       String typeRep, String reportID, Integer notifyTimeFrame, boolean isSent);

    public StateLevel getStateLevel(Date next_sub, Integer notifyTimeFrame);

    public List<StateLevel> listStateLevel();

    public void delete();

    public void update();
}
