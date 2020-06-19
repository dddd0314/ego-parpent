package com.bjsxt.controller;

import com.bjsxt.pojo.Pic;
import com.bjsxt.service.PicService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class PicController {

    @Resource
    private PicService picServiceImpl;

    @RequestMapping("show")
    public String show(Model model){
        List<Pic> list = picServiceImpl.show();
        model.addAttribute("list", list);
        return "main.jsp";
    }

    @RequestMapping("insert")
    public String add(MultipartFile file, HttpServletRequest req) throws IOException {
        //图片存储的位置
        String path = "D:\\IDEA\\workspace\\ego-parpent\\ego-portal\\src\\main\\webapp\\files";
        //图片的名称
        String fileName = file.getOriginalFilename();

        FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path, fileName));

        Pic pic = new Pic();
        pic.setPath(fileName);

        int index = picServiceImpl.insPic(pic);

        if(index > 0) {
            return "redirect:/show";
        }else {
            return "/add.jsp";
        }
    }

    @RequestMapping("delete")
    public String delete(int id) {
        int index = picServiceImpl.delById(id);
        return "redirect:/show";
    }

    @RequestMapping("update")
    public String update(Pic pic) {
        int index = picServiceImpl.updById(pic);
        System.out.println("index " + index);
        return "redirect:/show";
    }

}
