package Phantom;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DefaultInjects {

    DefaultInjects(){
        addDefaults();
    }
    private static HashMap<String,String> repository = new HashMap<>();
    public HashMap<String,String> getRepository(){
        return repository;
    }
    /* Default out-of-the-box Phantom Injects */
    private void addDefaults(){
        /* Phantom for Current Date*/
        Date currentDate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        String dateInject = date.format(currentDate);
        repository.put("<%Date%>", dateInject);

        /* Phantom for Current Time*/
        SimpleDateFormat time12 = new SimpleDateFormat("hh:mm a");
        String time12Inject = time12.format(currentDate);
        SimpleDateFormat time24 = new SimpleDateFormat("HH:mm");
        String tim24Inject = time24.format(currentDate);
        repository.put("<%Time12%>",time12Inject);
        repository.put("<%Time24%>",tim24Inject);


    }
}