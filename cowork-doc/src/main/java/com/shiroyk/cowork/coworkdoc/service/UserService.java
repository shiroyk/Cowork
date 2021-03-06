package com.shiroyk.cowork.coworkdoc.service;

import com.shiroyk.cowork.coworkcommon.constant.ResultCode;
import com.shiroyk.cowork.coworkcommon.dto.APIResponse;
import com.shiroyk.cowork.coworkcommon.dto.UserDto;
import com.shiroyk.cowork.coworkdoc.client.UserFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserService {
    private final UserFeignClient userFeignClient;

    public UserDto getUser(String id) {
        APIResponse<UserDto> res = userFeignClient.getUser(id);
        if (ResultCode.Ok.equals(res.getCode())) {
            return res.getData();
        }
        return null;
    }

    public Set<String> getUserDocStar(String id) {
        APIResponse<Set<String>> res = userFeignClient.getUserDocStar(id);
        if (ResultCode.Ok.equals(res.getCode())) {
            return res.getData();
        }
        return new HashSet<>();
    }

    public APIResponse<?> putUserDocStar(String id, String docId) {
        return userFeignClient.putUserDocStar(id, docId);
    }

    public void deleteUserDocStar(String id, String docId) {
        userFeignClient.deleteUserDocStar(id, docId);
    }

    public Set<String> getUserRecentDoc(String uid) {
        APIResponse<Set<String>> res = userFeignClient.getUserRecentDoc(uid);
        if (ResultCode.Ok.equals(res.getCode())) {
            return res.getData();
        }
        return new HashSet<>();
    }

    public void addUserRecentDoc(String uid, String docId) {
        userFeignClient.addUserRecentDoc(uid, docId);
    }

}
