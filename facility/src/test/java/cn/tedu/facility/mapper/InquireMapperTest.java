package cn.tedu.facility.mapper;

import cn.tedu.facility.entity.Equipment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class InquireMapperTest {
    @Autowired
    InquireMapper inquire;
    @Test
    void findAll(){
        List<Equipment> tags= inquire.findAll();
        for (Equipment equipment : tags){
            System.out.println(equipment);
        }
    }

    @Test
    public void deleteByStuId() {
        Integer row = inquire.deleteStu(13);
        System.err.println(row);
    }

    @Test
    public void findByStuId() {
        Equipment student = inquire.findByStuId(21);
        System.err.println(student);
    }

    @Test
    public void updateStu() {
        Integer types = 301;
        Equipment s = new Equipment();
        s.setDevicename("中型铲车");
        s.setTypes(String.valueOf(101));
        s.setBrand("柳工");
        s.setGenre("轻汽");
        s.setStatus("在库");
        s.setSite("南宁");
        Integer row = inquire.updateByStuId(s);
        System.err.println(row);
    }

    @Test
    public void addStu() {
        Equipment s = new Equipment();
        s.setDevicename("中型铲车");
        s.setTypes("101");
        s.setBrand("柳工");
        s.setGenre("轻汽");
        s.setStatus("在库");
        s.setSite("南宁");
        Integer rows = inquire.addStu(s);
        System.err.println(rows);
    }
}
