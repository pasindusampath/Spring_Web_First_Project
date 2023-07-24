package lk.ijse.gdse.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("students")
public class StudentController {

    @RequestMapping("student")
    public String loadMainPage() {
        return "main";
    }

    @RequestMapping("addStudent")
    public String loadNewCustomerPage(Model model){
        model.addAttribute("student",new Student());
        model.addAttribute("city","Panadura");
        return "newStudent";
    }

    @RequestMapping(value="save")
    public String saveStudent(@ModelAttribute("student") Student student){
        System.out.println(student);
        return "addedStudent";
    }

}
