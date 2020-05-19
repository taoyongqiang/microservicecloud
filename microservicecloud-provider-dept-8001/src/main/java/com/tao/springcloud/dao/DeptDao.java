package com.tao.springcloud.dao;

import com.tao.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    boolean add (Dept dept);

    Dept queryById (Long id);

    List<Dept> findAll ();
}
