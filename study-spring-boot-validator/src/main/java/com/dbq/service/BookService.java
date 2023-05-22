package com.dbq.service;

import com.dbq.entity.BookRequest;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Created by @author dabaoqiang on 2023/5/22.
 */
@Validated
public interface BookService {

    /**
     * saveBook
     * @param bookRequest
     */
   void saveBook(@Valid BookRequest bookRequest);
}
