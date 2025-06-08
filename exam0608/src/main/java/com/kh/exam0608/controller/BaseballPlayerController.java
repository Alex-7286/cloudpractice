package com.kh.exam0608.controller;

import com.kh.exam0608.service.BaseballPlayerService;
import com.kh.exam0608.vo.BaseballPlayerVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
public class BaseballPlayerController {

    private final BaseballPlayerService service;

    @PostMapping
    public BaseballPlayerVo insert(@RequestBody BaseballPlayerVo vo){
        return service.insert(vo);
    }

    @GetMapping
    public List<BaseballPlayerVo> list(){
        return service.list();
    }


}
