package com.dbq.study.spring.boot.jpa.dao;

import com.dbq.study.spring.boot.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author dabaoqiang on 2023/5/18.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
