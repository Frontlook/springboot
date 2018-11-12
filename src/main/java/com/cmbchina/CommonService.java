package com.cmbchina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.User: ZhongYu Rong
 * Date: 2018/10/31
 * Time: 22:32
 */
@Service
public class CommonService {
    @Autowired
    public ICommon commonmapper;
    public String login(String userName, String password){
        return commonmapper.login(userName, password);
    }
}

