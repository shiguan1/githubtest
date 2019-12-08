import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.setId(10);
        user.setName("nihao");
        user.setSex(false);

        System.out.println(JSON.toJSONString(user));
    }


    private static Integer add(int a, int b) {

        Integer c = 0;
        c = a + b;
        return c;
    }
}
