package com.laowang.sptest.common.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "父Model")
public class BaseModel extends BaseSerializable {
    @ApiModelProperty(value = "id")
    private transient Integer id;
    /**
     * 操作人id
     */
    @ApiModelProperty(value = "操作人id")
    private transient Integer userId;
    /**
     * 操作人的IP
     */
    @ApiModelProperty(value = "操作人的IP")
    private transient String userIp;
    /**
     * 统一属性：持证主体，持证主体代码
     */
    @ApiModelProperty(value = "持证主体")
    private String certholder;
    @ApiModelProperty(value = "持证主体代码")
    private String certholdercode;
}