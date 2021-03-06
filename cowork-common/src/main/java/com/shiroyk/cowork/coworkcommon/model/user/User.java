package com.shiroyk.cowork.coworkcommon.model.user;

import com.shiroyk.cowork.coworkcommon.constant.Role;
import com.shiroyk.cowork.coworkcommon.dto.UserDto;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class User {
    @Id
    private String id;
    private String username;
    private String nickname;
    private String email;
    private String password;
    private String avatar;
    private Role role;
    private Boolean isEnable = true;
    private Set<String> group = new HashSet<>();
    private Set<RecentDoc> recent = new HashSet<>();
    private Set<String> star = new HashSet<>();
    @CreatedDate
    private LocalDateTime createTime;
    @LastModifiedDate
    private LocalDateTime updateTime;

    public User() {
    }

    public User(String username, String email, String password, Role role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDto toUserDtoS() {
        return new UserDto(id, username, nickname, email);
    }

    public UserDto toUserDtoM() {
        return new UserDto(id, username, nickname, email, avatar);
    }

    public UserDto toUserDtoL() {
        return new UserDto(id, username, nickname, email, group, avatar);
    }

    public void setIsEnable() {
        isEnable = !isEnable;
    }
}
