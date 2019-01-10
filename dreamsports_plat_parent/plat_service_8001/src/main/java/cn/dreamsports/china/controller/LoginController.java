package cn.dreamsports.china.controller;

import cn.dreamsports.china.domain.Employee;
import cn.dreamsports.china.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return AjaxResult.getAjaxResult();
        }
        return AjaxResult.getAjaxResult().setMessage("用户名或密码错误，请重新输入!");
    }
    @RequestMapping("/employee")
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setUsername("admin");
        employee.setPassword("admin");
        return employee;
    }
}
