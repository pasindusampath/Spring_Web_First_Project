package lk.ijse.gdse.test;

import java.util.LinkedHashMap;

public class Student {
    private String studentName;
    private String studentAddress;
    private String studentMobileNo;
    private String city;
    private String studentId;
    private LinkedHashMap<String,String> cityData;
    public Student(){
        cityData=new DataBase().map;
    }

    public Student(String studentName, String studentAddress, String studentMobileNo, String city, String studentId, LinkedHashMap<String, String> cityData) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentMobileNo = studentMobileNo;
        this.city = city;
        this.studentId = studentId;
        this.cityData = cityData;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LinkedHashMap<String, String> getCityData() {
        return cityData;
    }

    public void setCityData(LinkedHashMap<String, String> cityData) {
        this.cityData = cityData;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentMobileNo() {
        return studentMobileNo;
    }

    public void setStudentMobileNo(String studentMobileNo) {
        this.studentMobileNo = studentMobileNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentMobileNo='" + studentMobileNo + '\'' +
                ", city='" + city + '\'' +
                ", studentId='" + studentId + '\'' +
                ", cityData=" + cityData +
                '}';
    }
}
