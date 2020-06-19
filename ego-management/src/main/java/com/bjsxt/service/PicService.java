package com.bjsxt.service;

import com.bjsxt.pojo.Pic;

import java.util.List;

public interface PicService {
    int insPic(Pic pic);
    List<Pic> show();
    int delById(int id);
    Pic selById(int id);
    int updById(Pic pic);
}
