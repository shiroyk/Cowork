package com.shiroyk.cowork.coworkcommon.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shiroyk.cowork.coworkcommon.model.doc.DocUrl;
import com.shiroyk.cowork.coworkcommon.model.doc.Owner;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DocDto {
    private String id;
    private DocUrl url;
    private String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Owner owner;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object ownerDetail;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean putDoc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean delete;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public DocDto() {
    }

    public DocDto(String id, DocUrl url, String title, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public DocDto(String id, DocUrl url, String title, boolean delete, Owner owner, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.delete = delete;
        this.owner = owner;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public DocDto(String id, DocUrl url, String title, Owner owner, boolean putDoc, boolean delete, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.owner = owner;
        this.putDoc = putDoc;
        this.delete = delete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public DocDto(String id, DocUrl url, String title, Owner owner, Object ownerDetail, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.owner = owner;
        this.ownerDetail = ownerDetail;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
