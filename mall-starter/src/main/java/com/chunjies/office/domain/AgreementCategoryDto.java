package com.chunjies.office.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 协议分类dto
 */
@ApiModel("协议分类")
public class AgreementCategoryDto implements Serializable {

    //协议ID
    @ApiModelProperty(value = "协议ID", required = true)
    @NotBlank(message = "请选择有效协议")
    private String agreementId;
    //分类Id
    @ApiModelProperty(value = "分类ID", required = true)
    @NotBlank(message = "请选择有效分类")
    private String categoryId;
    //供应商id
    @ApiModelProperty(value = "供应商ID", required = true)
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
