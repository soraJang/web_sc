package com.web_sc.controller;

import com.web_sc.vo.MusicVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MenuController {

    @RequestMapping("/menu")
    public List<MusicVO> getMenuList() {
        System.out.println("menu");
        List<MusicVO> list = new ArrayList<MusicVO>();

        list.add(new MusicVO(UUID.randomUUID().toString(), "노래1"));
        list.add(new MusicVO(UUID.randomUUID().toString(), "노래2"));
        list.add(new MusicVO(UUID.randomUUID().toString(), "노래3"));
        list.add(new MusicVO(UUID.randomUUID().toString(), "노래4"));

        return list;
    }
}
