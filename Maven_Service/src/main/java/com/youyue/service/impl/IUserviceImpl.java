package com.youyue.service.impl;

import com.youyue.dao.IUserdao;
import com.youyue.domain.User;
import com.youyue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IUserviceImpl implements IUserService {

@Autowired
private IUserdao iUserdao;
    @Override
    public List<User> findAll() {
        List<User> list = iUserdao.findAll();
        return list;
    }
}
