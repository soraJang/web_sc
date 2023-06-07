package com.web_sc.controller;

import com.web_sc.vo.MusicVO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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
//        return Arrays.stream(new String[]{"a", "b", "c"}).toList();
    }

    @RequestMapping("/test/get/**")
    @ResponseBody
    public Map<String, String> getRouterAPI(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String queryStr = request.getQueryString();

        Map<String, String> obj = new HashMap<String, String>();
        obj.put("type", "GET");
        obj.put("url", requestURI);
        obj.put("queryStr", queryStr);

        return obj;
    }

    @RequestMapping("/test/post")
    @ResponseBody
    public Map<String, String> postRouterAPI(HttpServletRequest request, @RequestBody(required = false) String requestBody) {
        String requestURI = request.getRequestURI();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(requestBody, headers);

        Map<String, String> obj = new HashMap<String, String>();
        obj.put("type", "POST");
        obj.put("url", requestURI);
        obj.put("entity", requestBody);

        return obj;

    }

}
