package cn.tedu.facility.mapper;

import cn.tedu.facility.entity.Equipment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InquireMapper {
    /**
     * 新增设备信息
     * @param stu 设备信息
     * @return 受影响的行数
     */
    Integer addStu(Equipment stu);

    /**
     * 查询所有的数据
     *
     * @return 所有数据的集合
     */
    List<Equipment> findAll();

    /**
     * 根据设备编号删除设备信息
     * @param id 型号
     * @return 受影响行数
     */
    Integer deleteStu(Integer id);

    /**
     * 根据设备编号查询设备信息
     * @param id 型号
     * @return 设备 信息
     */
    Equipment findByStuId(Integer id);

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * @return 受影响的行数
     */
    Integer updateByStuId(Equipment equ);

    /**
     * 根据设备编号查询设备信息
     * @param id 型号
     * @return 设备 信息
     * 用于修改状态所在地信息
     */
    Equipment findByStuIds(Integer id);

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * @return 受影响的行数
     * 用于修改状态所在地信息
     */
    Integer updateByStuIds(Equipment equ);



}
