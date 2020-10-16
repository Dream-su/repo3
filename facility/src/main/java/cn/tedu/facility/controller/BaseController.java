package cn.tedu.facility.controller;

import cn.tedu.facility.ex.ServiceException;
import cn.tedu.facility.utils.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * 控制器类的基类
 */
public class BaseController {
	/**
	 * 操作成功时的状态码
	 */
	public static final int SUCCESS = 2000;
	
	@ExceptionHandler({ServiceException.class, FileUploadException.class})
	public JsonResult<Void> handleException(Throwable ex) {
		
		JsonResult<Void> jsonResult = new JsonResult<>(ex);
		
		if (ex instanceof ServiceException) {
			jsonResult.setState(4000);
		}
		return jsonResult;
		
	}

}
