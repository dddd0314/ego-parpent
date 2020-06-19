package com.bjsxt.service;

import com.bjsxt.pojo.Pic;

import java.util.List;

public interface PicService {
    List<Pic> show();
    int insPic(Pic pic);
    int delById(int id);
    int updById(Pic pic);

}
