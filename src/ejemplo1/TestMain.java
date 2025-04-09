package ejemplo1;
import com.google.gson.Gson;


public class TestMain {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla",97);
        String json = gson.toJson(p);
        System.out.println(json);
    }
}