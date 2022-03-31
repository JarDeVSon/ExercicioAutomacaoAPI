package user;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.util.Objects;

public class UsersClass {

    private String email;
    private String gender;
    private String name;
    private String status;

    public UsersClass(String email, String gender, String name, String status) {
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.status = status;
    }

    public JSONObject getJson(){
        return new JSONObject(new Gson().toJson(this));
    }
    public String getXml(){
        return XML.toString(getJson());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersClass that = (UsersClass) o;
        return email.equals(that.email)
                && gender.equals(that.gender)
                && name.equals(that.name)
                && status.equals(that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, gender, name, status);
    }
}
