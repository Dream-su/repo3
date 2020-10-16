package cn.tedu.facility.service;

import cn.tedu.facility.entity.Equipment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class InquireServiceTests {
    @Autowired
    InquireService service;


    @Test
    public void findByStuId() {
        Equipment student = service.getByStuId(202);
        System.err.println(student);
    }


}
