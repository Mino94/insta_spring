package com.posco.insta.post.service;

import com.posco.insta.post.model.PostDto;
import com.posco.insta.post.model.SelectPostJoinUserDto;
import com.posco.insta.user.model.UserDto;
import com.posco.insta.post.repository.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements postService{
    @Autowired
    PostMapper postMapper;


    @Override
    public List<PostDto> findPost() {
        return postMapper.getPost();
    }

    @Override
    public List<PostDto> findUserById(PostDto postDto) {
        return postMapper.getPostById(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> getPostByUserId(PostDto postDto) {
        return postMapper.findPostsByUserId(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> getPostByKey(String key) {
        return postMapper.getPostByKey(key);
    }

    @Override
    public int deleteMypost(PostDto postDto) {
        return postMapper.deletePostByUserIdAndId(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> findPostsByNotUserId(PostDto postDto) {
        return postMapper.findPostsByNotUserId(postDto);
    }

    @Override
    public int updatePostById(PostDto postDto) {
        return postMapper.updatePostById(postDto);
    }

    @Override
    public int insertPost(PostDto postDto) {
        return postMapper.insertPost(postDto);
    }

    @Override
    public SelectPostJoinUserDto getPostByJoinId(PostDto postDto) {
        return postMapper.getPostByJoinId(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> getPostByMyFollowing(PostDto postDto) {

        return postMapper.getPostByMyFollowing(postDto);
    }
}
