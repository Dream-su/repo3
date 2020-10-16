package cn.tedu.facility.service;

import cn.tedu.facility.entity.Equipment;

import java.util.List;

public interface InquireService {
    /**
     * 新增设备信息
     * @param stu 设备信息
     */
    void insertStu(Equipment stu);

    /**
     * 查询所有设备的数据
     *
     * @return 所有设备的集合
     */
    List<Equipment> getTagList();

    /**
     * 根据设备编号删除设备信息
     * @param id 型号
     * @return 受影响行数
     */
    void deleteByStuId(Integer id);

    /**
     * 根据设备编号查询设备信息
     * @param id 型号
     * @return 设备 信息
     */
    Equipment getByStuId(Integer id);

    /**
     * 修改设备信息
     * @param equ 新设备信息
     */
    void changeStu(Equipment equ);

    /**
     * 根据设备编号查询设备信息
     * @param id 型号
     * @return 设备 信息
     * 用于修改状态所在地信息
     */
    Equipment getByStuIds(Integer id);

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * 用于修改状态所在地信息
     */
    void changeStus(Equipment equ);

}
