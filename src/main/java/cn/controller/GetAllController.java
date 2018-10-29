package cn.controller;

import cn.pojo.PetTable;
import cn.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test/")
@Controller
public class GetAllController {

    @Autowired
    private LoginService los;


    @ResponseBody
    @RequestMapping(value="getall")
    public String all(){
        String showall = los.getAll();
        return showall ;
    }


    @ResponseBody
    @RequestMapping("setall")
    public String setall(@RequestBody PetTable pt){
        System.out.println(pt.getPname() + "----" + pt.getPid());
        return "成功" ;
    }

}
