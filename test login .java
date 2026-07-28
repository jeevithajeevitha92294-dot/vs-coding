public class TestLogin {

    public static void main(String[] args) {

        boolean result = Login.checkLogin(
            "Albena",
            "12345"
        );

        System.out.println(result);
    }
}
