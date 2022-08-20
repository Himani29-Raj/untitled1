package Dumps;

class DBConfiguration{
        String user;
        String password;
}
public class DBHandler{
        DBConfiguration configureDB(String uname , String password){
           return new DBConfiguration();
        }

        public static void main(String[] args) {
                DBHandler r = new DBHandler();
                DBConfiguration dbconf = r.configureDB("manger","manager");
        }
        }
