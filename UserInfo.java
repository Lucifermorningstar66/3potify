public class UserInfo {

    public static String toString;

    public String username;
    public String password;
    public String gender;
    public String dateOfBirth;
    public String typeOfUser;

    public UserInfo(String username, String password, String gender, String dateOfBirth, String typeOfUser) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.typeOfUser = typeOfUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public String toString()
    {
        return    "  username  : " + this.username + ".\n"
                + "  password  : " + this.password + ".\n"
                + "  gender  : " + this.gender + ".\n"
                + "  date of birth  : " + this.dateOfBirth + ".\n"
                + "  type of user   : " + this.typeOfUser + ".\n";
    }

}
