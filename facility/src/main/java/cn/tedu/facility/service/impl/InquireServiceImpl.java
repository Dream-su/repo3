package cn.tedu.facility.service.impl;

import cn.tedu.facility.entity.Equipment;
import cn.tedu.facility.ex.ServiceException;
import cn.tedu.facility.mapper.InquireMapper;
import cn.tedu.facility.service.InquireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquireServiceImpl implements InquireService {

    @Autowired
    InquireMapper inquire;

    /**
     * 新增设备信息
     * @param stu 设备信息
     */
    @Override
    public void insertStu(Equipment stu) {
        inquire.addStu(stu);
    }

    /**
     * 查询所有设备信息
     * @return
     */
    @Override
    public List<Equipment> getTagList() {
        return inquire.findAll();
    }

    /**
     * 根据id编号删除设备
     * @param id 型号
     */
    @Override
    public void deleteByStuId(Integer id) {
        Integer row = inquire.deleteStu(id);
        if (row!=1) {
            throw new ServiceException("删除数据时出现异常，请联系管理员");
        }
    }

    /**
     * 根据id编号查询
     * @param id 型号
     * @return
     */
    @Override
    public Equipment getByStuId(Integer id) {
        Equipment equ = inquire.findByStuId(id);
        if (equ==null) {
            throw new ServiceException("数据不存在");
        }
        return equ;
    }

    /**
     * 根据id编号修改
     * @param equ 新设备信息
     */
    @Override
    public void changeStu(Equipment equ) {
        Integer row = inquire.updateByStuId(equ);
        if (row!=1) {
            throw new ServiceException("修改数据时出现异常，请联系管理员");
        }
    }

    /**
     * 根据设备编号查询设备信息
     * @param id 型号
     * @return
     * 用于修改状态所在地信息
     */
    @Override
    public Equipment getByStuIds(Integer id) {
        Equipment equ = inquire.findByStuIds(id);
        if (equ==null) {
            throw new ServiceException("数据不存在");
        }
        return equ;
    }

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * 用于修改状态所在地信息
     */
    @Override
    public void changeStus(Equipment equ) {
        Integer row = inquire.updateByStuIds(equ);
        if (row!=1) {
            throw new ServiceException("修改数据时出现异常，请联系管理员");
        }
    }


}

