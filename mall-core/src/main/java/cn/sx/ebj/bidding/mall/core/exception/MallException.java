package cn.sx.ebj.bidding.mall.core.exception;

public class MallException extends RuntimeException{

    private Integer code;

    public MallException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
