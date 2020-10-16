package cn.tedu.facility;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.facility.mapper")
public class FacilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacilityApplication.class, args);
    }

}
