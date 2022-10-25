package whgw.study.apipractice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whgw.study.apipractice.model.*;
import whgw.study.apipractice.mapper.*;


import java.io.OutputStream;

@RestController
@MapperScan(basePackages = {"whgw.study.apipractice.mapper.*"})
public class IndexController {
    @Autowired
    ItemsMapper itemsMapper;

    @RequestMapping("/")
    public String index() {
        Items item = new Items();
        item.setId(11);
        item.setName("api10");
        int i = itemsMapper.insert(item);
        return "success";
    }
}
