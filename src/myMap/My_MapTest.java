package myMap;

import java.util.TreeMap;

public class My_MapTest {
    public static void main(String[] args) {
        TreeMap<Integer, UserInfo> bankUser = new TreeMap<>();
        bankUser.put(118887, new UserInfo("Ashot Ashotyan", "AB0459686",
                "043 558877", 48, true));
        bankUser.put(118888, new UserInfo("Bagrat Bagratyan", "AK0459786",
                "077 002873", 28, false));
        bankUser.put(118889, new UserInfo("Syune Bakunts", "AR0859286",
                "099 852147", 22, true));

//        System.out.println(bankUser);
        System.out.println(bankUser.get(118889).toString());
    }
}
