package cn.service.impl;

import cn.dao.PetTableDao;
import cn.pojo.PetTable;
import cn.service.LoginService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private PetTableDao pto;


    @Override
    public String getAll() {
        List<PetTable> all = pto.getAll();
        String s = JSON.toJSONString(all);
        return s;
    }
}
