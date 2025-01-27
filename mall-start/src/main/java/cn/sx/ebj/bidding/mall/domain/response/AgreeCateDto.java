package cn.sx.ebj.bidding.mall.domain.response;


import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

/**
 * 协议分类dto
 */
public class AgreeCateDto implements Serializable {

    //协议ID
    @NotBlank(message = "请选择有效协议")
    private String agreementId;
    //分类Id
    @NotBlank(message = "请选择有效分类")
    private String categoryId;
    //供应商id
    @NotBlank(message = "请选择有效供应商")
    private String supplierId;

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
