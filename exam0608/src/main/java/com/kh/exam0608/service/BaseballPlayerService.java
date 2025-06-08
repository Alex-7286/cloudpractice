package com.kh.exam0608.service;

import com.kh.exam0608.vo.BaseballPlayerVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseballPlayerService {
    private final Map<Long, BaseballPlayerVo> bpmap = new HashMap<>();
    private Long id = 1L;

    public BaseballPlayerVo insert(BaseballPlayerVo vo) {
        vo.setId(id++);
        bpmap.put(vo.getId(), vo);
        return vo;
    }

    public List<BaseballPlayerVo> list() {
        return new ArrayList<>(bpmap.values());
    }
}
