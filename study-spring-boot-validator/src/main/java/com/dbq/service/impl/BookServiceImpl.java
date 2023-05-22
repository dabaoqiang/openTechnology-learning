package com.dbq.service.impl;

import com.dbq.entity.BookRequest;
import com.dbq.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Created by @author dabaoqiang on 2023/5/22.
 */
@Service
public class BookServiceImpl implements BookService {


    @Override
    public void saveBook(BookRequest bookRequest) {
        System.out.println(bookRequest.toString());
    }
}
