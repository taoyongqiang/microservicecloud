package com.tao.springcloud.service.impl;

import com.tao.springcloud.dao.DeptDao;
import com.tao.springcloud.entities.Dept;
import com.tao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description
 * @Author tyq
 * @Date 2020/5/12 1:02
 * @Version V1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.add(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
