import myMap.UserInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamTest {
    public static void main(String[] args) {
        List<UserInfo> userInfoList=new ArrayList<>(Arrays.asList(new UserInfo("Ani Annanyan","AH0121396",
                "033 889966",27,true),new UserInfo("Bella Abgaryan","AS0897856",
                "099 558844",21,true),new UserInfo("Gor Abgaryan","AP0897857",
                "077 124589",30,false),new UserInfo("Ohan Ordyan","AF0817834",
                "077 124589",42,false)));

        // #1 Get list of all passportId's of userInfo's.
        List<String> passportID=userInfoList
                .stream()
                .map(UserInfo::getPassportId)
                .collect(Collectors.toList());
        System.out.println(passportID);

        // reduce method :
        int maxAge=userInfoList
                .stream()
                .filter(userInfo -> userInfo.isOverdue()==true)
                .map(userInfo -> userInfo.getAge())
                .reduce(Integer::min)
                .get();
        System.out.println(maxAge);


        // #2 Get list of all phoneNumbers of userInfo's without duplicates.
        List<String>phoneN=userInfoList
                .stream()
                .map(UserInfo::getPhoneNumber)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(phoneN);

        // #3 Get list of all nameSurname's of userInfo's :age>=30.
        List<String>nameSurname=userInfoList
                .stream()
                .filter(userInfo -> userInfo.getAge()>=30)
                .map(userInfo -> userInfo.getNameSurname())
                .collect(Collectors.toList());
        System.out.println(nameSurname);

        // #4 Count of userInfo's : age<30.
        long count=userInfoList
                .stream()
                .filter(userInfo -> userInfo.getAge()<30)
                .count();
        System.out.println(count);
    }
}
