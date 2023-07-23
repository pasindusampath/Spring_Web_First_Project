package lk.ijse.gdse.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("student")
    public String loadMainPage() {
        return "main";
    }

    @RequestMapping("addStudent")
    public String loadNewCustomerPage(){
        return "newStudent";
    }

}
