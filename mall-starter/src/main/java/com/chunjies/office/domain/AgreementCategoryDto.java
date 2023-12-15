package com.chunjies.office.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

/**
 * 协议分类dto
 */
@Schema(name = "协议分类")
public class AgreementCategoryDto implements Serializable {

    //协议ID
    @SchemaProperty(name = "协议ID")
    @NotBlank(message = "请选择有效协议")
    private String agreementId;
    //分类Id
    @SchemaProperty(name = "分类ID")
    @NotBlank(message = "请选择有效分类")
    private String categoryId;
    //供应商id
    @SchemaProperty(name = "供应商ID")
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
