package Java.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Java.Main.StateLevelJDBCTemplate;
/**
 * Created by BartowB on 4/4/2016.
 * takes calendar event data and stores it into a database
 * -database will be mySQL
 * -send users emails to run reports based on current roles
 * -state level and district level
 * -
 */
public class Notifier {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        StateLevelJDBCTemplate stateLevelJDBCTemplate =
                (Java.Main.StateLevelJDBCTemplate)context.getBean("stateLevelJDBCTemplate");



    //receive data, aka last run date, next run date, etc.


    //push our data to separate database


    //keep track of if notification is sent, to keep from spamming


    //




    }

}
