package vip.xingxiaoshuai.tutorial.learn.profiler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("profiler")
@RestController
public class ProfilerController {

    @GetMapping("sum")
    public String slowSum(){
        long start = new Date().getTime();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long time = new Date().getTime()-start;
        return sum+"  时间："+time;
    }

}
