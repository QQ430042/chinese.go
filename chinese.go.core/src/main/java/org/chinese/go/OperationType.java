package org.chinese.go;

/**
 * 
 *	操作类型定义
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
public enum OperationType {	
	
	add("add","新增"),
	delete("delete","删除"),
	update("update","更新"),
	query("query","查询"),
	get("get","查看"),	
	
	publish("publish","发布"),
	
	leadingIn("leadingIn","导入"),
	leadingOut("leadingOut","导出"),
	
	start("start","发起"),
	end("end","结束"),
	
	open("open","开启"),
	approve("approve","审批"),
	close("close","关闭");
	
	private String code;
	
	private String desc;
	
	OperationType(String code, String desc) {
		this.code=code;
		this.desc=desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
