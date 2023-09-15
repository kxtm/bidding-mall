package com.chunjies.office.controller.portal;

import com.chunjies.office.common.base.IController;
import com.chunjies.office.common.utils.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@RestController
public class IndexController extends IController {


    @GetMapping("/")
    public ResponseEntity index() {

        return ResponseEntity.ok(new Result());
    }

}
