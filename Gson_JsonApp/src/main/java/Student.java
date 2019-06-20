import java.util.HashSet;
import java.util.Set;

public class Student {

    private long studentId;
    private String studentName;
    private Set <Phone> studentPhoneNumbers = new HashSet<Phone>(0);

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set <Phone> getStudentPhoneNumbers() {
        return studentPhoneNumbers;
    }

    public void setStudentPhoneNumbers(Set <Phone> studentPhoneNumbers) {
        this.studentPhoneNumbers = studentPhoneNumbers;
    }

    @Override
    public String toString() {
        return "Student [studentId = " + studentId + ", StudentName = " + studentName + ", studentPhoneNumbers = " + studentPhoneNumbers + "]";
    }

}
