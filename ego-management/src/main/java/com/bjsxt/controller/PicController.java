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
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class PicController {
    @Resource
    private PicService picServiceImpl;

    @RequestMapping("insert")
    public String insert(MultipartFile file, HttpServletRequest req){

        //指定上传图片的保存路径(绝对路径)
//        String path = req.getServletContext().getRealPath("/");
        String path = "D:/IDEA/workspace/ego-parpent/ego-management/src/main/webapp/files";
        //获取上传的文件的全名称
        String fileName = file.getOriginalFilename();
        System.out.println("path: " + path + " fileName: " + fileName);

        try {
//            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(req.getServletContext().getRealPath("files"), file.getOriginalFilename()));
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path, file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pic pic = new Pic();
//        pic.setPath(file.getOriginalFilename());
        pic.setPath(fileName);
//        System.out.println("file.getOriginalFilename(): " + file.getOriginalFilename() + "pic.path" + pic.getPath());
        int index = picServiceImpl.insPic(pic);
        if(index > 0) {
            return "redirect:/show";
        }else {
            return "/add.jsp";
        }
    }

    @RequestMapping("show")
    public String show(Model model){
//        List<Pic> pic = picServiceImpl.show();
//        System.out.println("pic List");
//        for(Pic p: pic) {
//            System.out.println(p.toString());
//        }
        model.addAttribute("list", picServiceImpl.show());
        return "/main.jsp";
    }

    @RequestMapping("delete")
    public String delete(int id){
        int index = picServiceImpl.delById(id);
        return "redirect:/show";
    }

    @RequestMapping("selById")
    public String selById(int id, Model model) {
        Pic pic  = picServiceImpl.selById(id);
        model.addAttribute("pic", pic);
        if(pic == null) {
            return "/index.jsp";
        }
        return "/show.jsp";
    }

    @RequestMapping("update")
    public String updById(Pic pic) {
        int index = picServiceImpl.updById(pic);
        return "redirect:/show";
    }

}
