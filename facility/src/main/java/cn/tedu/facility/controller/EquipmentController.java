package cn.tedu.facility.controller;

import cn.tedu.facility.entity.Equipment;
import cn.tedu.facility.mapper.InquireMapper;
import cn.tedu.facility.service.InquireService;
import cn.tedu.facility.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/v1/tags")
public class EquipmentController extends BaseController{
    @Autowired
    InquireService service;
    @Autowired
    InquireMapper mapper;
    @GetMapping("")
    public List<Equipment> getTagList(){
        return service.getTagList();
    }

    /**
     * 新增设备信息
     * @param stu
     * @return
     */
    @RequestMapping("add")
    public JsonResult<Void> insertStu(Equipment stu){
        service.insertStu(stu);
        return new JsonResult<>(SUCCESS);
    }

    /**
     * 查询所有数据展示到页面
     * @return
     */
    @RequestMapping("list")
    public JsonResult<List<Equipment>> findStu(){
        List<Equipment> data = service.getTagList();
        return new JsonResult<List<Equipment>>(SUCCESS,data);
    }

    /**
     * 根据设备编号来删除设备
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public JsonResult<Void> delete(Integer id){
        service.deleteByStuId(id);//00
        return new JsonResult<>(SUCCESS);
    }

    /**
     * 根据设备编号查询信息
     * @param id
     * @return
     */
    @RequestMapping("select_type")
    public JsonResult<Equipment> getByStuId(Integer id){
        Equipment data = service.getByStuId(id);
        return new JsonResult<Equipment>(SUCCESS,data);
    }

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * @return 受影响的行数
     */
    @RequestMapping("change")
    public JsonResult<Void> changeStu(Equipment equ){
        service.changeStu(equ);
        return new JsonResult<>(SUCCESS);
    }

    /**
     * 根据设备编号查询信息
     * @param id
     * @return
     * 用于修改状态所在地信息
     */
    @RequestMapping("select_types")
    public JsonResult<Equipment> getByStuIds(Integer id){
        Equipment data = service.getByStuIds(id);
        return new JsonResult<Equipment>(SUCCESS,data);
    }

    /**
     * 修改设备信息
     * @param equ 新设备信息
     * @return 受影响的行数
     */
    @RequestMapping("changes")
    public JsonResult<Void> changeStus(Equipment equ){
        service.changeStus(equ);
        return new JsonResult<>(SUCCESS);
    }


}
