package com.posco.insta.follow.service;

import com.posco.insta.follow.model.FollowDto;

import java.util.List;

public interface FollowService {
    List<FollowDto> getFollowing(FollowDto followDto);
    List<FollowDto> getFollower(FollowDto followDto);
    FollowDto getFollowerByOne(FollowDto followDto);
    Integer insertFollow(FollowDto followDto);
    Integer deleteFollow(FollowDto followDto);
}
