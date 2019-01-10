package cn.dreamsports.china.util;

/**
 * 返回操作结果json对象
 */
public class AjaxResult {
    private Boolean success=true;
    private String message="操作成功!";
    private Object obg;

    public static AjaxResult getAjaxResult(){
        return new AjaxResult();
    }
    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {

        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.success=false;
        this.message = message;
        return this;
    }

    public Object getObg() {
        return obg;
    }

    public AjaxResult setObg(Object obg) {
        this.obg = obg;
        return this;
    }
}
