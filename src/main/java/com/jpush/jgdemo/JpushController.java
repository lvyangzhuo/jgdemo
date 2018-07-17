package com.jpush.jgdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author Lyz
 * @time 2018-7-17 13:45
 */
@RestController
public class JpushController {

    @Autowired
    private Jpush jpush;

    @RequestMapping("/push")
    public Map addArticle() {
        //设置推送参数
        Map<String, String> parm = new HashMap<String, String>();
        //文章标题
        parm.put("Atitle", "这是一篇萌萌哒的文章");
        //设置提示信息,内容是文章标题
        parm.put("msg", "看见说明成功了");
        //设置id
        parm.put("id", "1");
        //调用ios的
        System.out.println("推送参数："+parm);
        jpush.jpushAll(parm);
        return parm;
    }

    @RequestMapping("demo")
    public void demo(){
        System.out.println("demo");
    }

}
