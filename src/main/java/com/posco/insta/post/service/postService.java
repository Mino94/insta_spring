package com.posco.insta.post.service;

import com.posco.insta.post.model.PostDto;
import com.posco.insta.post.model.SelectPostJoinUserDto;
import com.posco.insta.user.model.UserDto;

import java.util.List;

public interface postService {

    List<PostDto> findPost();
    List<PostDto> findUserById(PostDto postDto); // 내가한거
    List<SelectPostJoinUserDto> getPostByUserId(PostDto postDto);
    List<SelectPostJoinUserDto> getPostByKey(String key);
    int deleteMypost(PostDto postDto);
    List<SelectPostJoinUserDto> findPostsByNotUserId(PostDto postDto);

    int updatePostById(PostDto postDto);

    int insertPost(PostDto postDto);
    SelectPostJoinUserDto getPostByJoinId(PostDto postDto);
    List<SelectPostJoinUserDto> getPostByMyFollowing(PostDto postDto);

}
