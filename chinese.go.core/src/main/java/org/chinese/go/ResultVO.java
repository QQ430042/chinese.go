package org.chinese.go;


/**
 * 
 *	TODO [类型说明]
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月5日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.core
 *
 * @copyright www.chinesego.org
 */
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
    
    
    
	public Integer getCode() {
		return code;
	}



	public void setCode(Integer code) {
		this.code = code;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResultVO [code=");
		builder.append(code);
		builder.append(", msg=");
		builder.append(msg);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
    
    
}
