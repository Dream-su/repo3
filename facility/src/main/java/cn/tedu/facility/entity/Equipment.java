package cn.tedu.facility.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 设备实体类
 */
@Data
@Accessors(chain = true)
public class Equipment {
    private Integer id;//设备编号
    private String devicename;//设备名称
    private String types;//型号
    private String brand;//品牌
    private String genre;//leix
    private String status;//状态
    private String site;//所在地
    private String siteid;
    private String locationid;

}
