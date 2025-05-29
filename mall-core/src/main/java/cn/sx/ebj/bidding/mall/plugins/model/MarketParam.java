package cn.sx.ebj.bidding.mall.plugins.model;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description}
 */
public class MarketParam {

    private String type;

    private String url;

    private String accessKey;

    private String secretKey;


    public MarketParam() {
    }

    public MarketParam(String type) {
        this.type = type;
    }

    public MarketParam(String type, String url, String accessKey, String secretKey) {
        this.type = type;
        this.url = url;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
