import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try(Reader reader = new FileReader("/Users/luantrancong/IdeaProjects/demoGson/src/test/java/staff.json")){
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
