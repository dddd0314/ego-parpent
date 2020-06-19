package com.bjsxt.service.impl;

import com.bjsxt.mapper.PicMapper;
import com.bjsxt.pojo.Pic;
import com.bjsxt.service.PicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PicServiceImpl implements PicService {
    @Resource
    private PicMapper picMapper;

    @Override
    public List<Pic> show() {
        return picMapper.selAll();
    }

    @Override
    public int insPic(Pic pic) {
        return picMapper.insPic(pic);
    }

    @Override
    public int delById(int id) {
        return picMapper.delById(id);
    }

    @Override
    public int updById(Pic pic) {
        return picMapper.updById(pic);
    }
}
