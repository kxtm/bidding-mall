package com.chunjies.office.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

/**
 * 协议分类dto
 */
@Schema(name = "协议分类")
@Data
public class AgreeCateDto implements Serializable {

    //协议ID
    @SchemaProperty(name = "协议ID")
    @NotBlank(message = "请选择有效协议")
    private String agreementId;
    //分类Id
    @SchemaProperty(name = "商城分类ID")
    @NotBlank(message = "请选择有效分类")
    private String categoryId;
    //供应商id
    @SchemaProperty(name = "供应商ID")
    @NotBlank(message = "请选择有效供应商")
    private String supplierId;

}
