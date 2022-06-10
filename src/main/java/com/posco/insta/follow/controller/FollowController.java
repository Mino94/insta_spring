package com.posco.insta.follow.controller;

import com.posco.insta.aspect.TokenRequired;
import com.posco.insta.config.SecurityService;
import com.posco.insta.follow.model.FollowDto;
import com.posco.insta.follow.service.FollowServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@TokenRequired
@RequestMapping("follow")
public class FollowController {
    @Autowired
    FollowDto followDto;
    @Autowired
    FollowServiceImpl followService;
    @Autowired
    SecurityService securityService;

    @GetMapping("/my/follower")
    @Operation(description = "내 follower 받아옴")
    public List<FollowDto> getMyFollower(FollowDto followDto) {
        followDto.setFollowing(securityService.getIdAtToken());
        return followService.getFollower(followDto);
    }

    @GetMapping("/follower/{id}")
    @Operation(description = "다른사람 follower 받아옴")
    public List<FollowDto> getFollowerById(@PathVariable String id) {
        followDto.setFollowing(Integer.valueOf(id));
        return followService.getFollower(followDto);
    }

    @GetMapping("/my/following")
    @Operation(description = "내 following 받아옴")
    public List<FollowDto> getMyFollowing(FollowDto followDto) {
        followDto.setFollowing(securityService.getIdAtToken());
        return followService.getFollowing(followDto);
    }

    @GetMapping("/following/{id}")
    @Operation(description = "다른사람 following 받아옴")
    public List<FollowDto> getFollowingById(FollowDto followDto) {
        followDto.setFollowing(securityService.getIdAtToken());
        return followService.getFollowing(followDto);
    }

    @PostMapping("/{id}")
    @Operation(description = "내가 다른사람 follow 함")
    public Integer postFollow(@PathVariable String id) {
        followDto.setFollowing(securityService.getIdAtToken());
        followDto.setFollower(Integer.valueOf(id));
        return followService.insertFollow(followDto);
    }

    @DeleteMapping("/{id}")
    @Operation(description = "내가 다른사람 follow 취소함")
    public Integer deleteFollow(@PathVariable String id) {
        followDto.setFollowing(securityService.getIdAtToken());
        followDto.setFollower(Integer.valueOf(id));
        return followService.deleteFollow(followDto);
    }
}