package com.dbq.entity;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by @author dabaoqiang on 2023/5/22.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest  implements Serializable {

    private static final long serialVersionUID = -2005077445556230393L;

    @NotNull(message = "id 不能为空")
    private String id;

    @Size(max = 33)
    @NotEmpty(message = "author 不能为空")
    private String author;

    @Pattern(regexp = "(^Man$|^Woman$|^UGM$)", message = "title 值不在可选范围")
    @NotNull(message = "title 不能为空")
    private String title;


}
