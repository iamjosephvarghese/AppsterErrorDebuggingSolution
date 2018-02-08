package techkshetra18.appster.appstererror;

/**
 * Created by joseph on 09/02/18.
 */

public class Users {

    String userName;
    String timestamp;


    public Users(String userName, String timestamp) {
        this.userName = userName;
        this.timestamp = timestamp;
    }


    public Users() {
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
