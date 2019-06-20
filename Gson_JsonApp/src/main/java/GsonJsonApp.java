import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashSet;
import java.util.Set;

public class GsonJsonApp {

    public static void main(String[] args) {
        serializeStudentObject();
        deserializeUserObject();
    }

    /**
     * Serialize or Convert Java Object to JSON using GSON
     ***/
    private static void serializeStudentObject() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Student student = createStudent();
        String jsonStr = gson.toJson(student);
        System.out.println(jsonStr);
    }

    private static Student createStudent() {
        Student student = new Student();
        student.setStudentId(1000);
        student.setStudentName("Hiram");

        Set<Phone> phones = new HashSet<Phone>();
        Phone phone = new Phone();
        phone.setPhoneId(100);;
        phone.getPhoneNumber("1234567890");
        phone.setPhoneType("Mobile Phone");
        phones.add(phone);

        Phone phone1 = new Phone();
        phone1.setPhoneId(101);
        phone1.setPhoneNumber("2222 3333 44");
        phone1.setPhoneType("Landline Phone");
        phones.add(phone1);

        student.setStudentPhoneNumbers(phones);
        return student;
    }
    /************************** Output **********************************
     * {
     *     "studentId": 1000,
     *     "studentName": "Ramesh",
     *     "studentPhoneNumbers": [
     *      {
     *          "phoneId": 100,
     *          "phoneType": "Mobile Phone",
     *          "phoneNumber": "1234567890"
     *      },
     *      {
     *          "phoneId": 101,
     *          "phoneType": "Landline Phone",
     *          "phoneNumber": "2222 3333 44"
     *      }
     *  ]
     * }
     ********************************************************************/


    /**
     * Deserialize or Convert Json to Java Object using GSON
     ***/
    private static void deserializeUserObject() {
        Gson gson = new Gson();
        String jsonStr = "{\r\n" +
                "  \"studentId\": 1000,\r\n" +
                "  \"studentName\": \"Ramesh\",\r\n" +
                "  \"studentPhoneNumbers\": [\r\n" +
                "    {\r\n" +
                "      \"phoneId\": 100,\r\n" +
                "      \"phoneType\": \"Mobile Phone\",\r\n" +
                "      \"phoneNumber\": \"1234567890\"\r\n" +
                "    },\r\n" +
                "    {\r\n" +
                "      \"phoneId\": 101,\r\n" +
                "      \"phoneType\": \"Landline Phone\",\r\n" +
                "      \"phoneNumber\": \"2222 3333 44\"\r\n" +
                "    }\r\n" +
                "  ]\r\n" +
                "}";
        Student student = gson.fromJson(jsonStr, Student.class);
        System.out.println(student.toString());

        /************************** Output **********************************
         * Student [
         *          studentId=1000,
         *          studentName=Ramesh,
         *          studentPhoneNumbers=[net.javaguides.gson.Phone@5ce65a89,
         *          net.javaguides.gson.Phone@25f38edc]
         *          ]
         ********************************************************************/
    }
}

// Serializing
// https://www.javaguides.net/2018/10/convert-java-object-to-json-using-gson.html

// Deserialize
// https://www.javaguides.net/2018/10/convert-json-to-java-object-using-gson.html