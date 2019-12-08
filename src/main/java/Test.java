import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.setName("nihao");
        System.out.println(user);
        System.out.println(JSON.toJSONString(user));
        System.out.println(JSON.toJSON(user));

        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        Object name = jsonObject.get("name");
        System.out.println(name);
    }


    private static Integer add(int a, int b) {

        Integer c = 0;
        c = a + b;
        return c;
    }
}
