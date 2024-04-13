package com.blog.application.services;

import java.util.List;

import com.blog.application.entities.Post;
import com.blog.application.payloads.PostDto;

public interface PostService {

	//create 
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer PostId);
	
	//delete
	void deletePost(Integer PostId);
	
	//getAllPosts
	List<PostDto> getAllPost();
	
	//get Single Post
	PostDto getPostById(Integer postId);
	
	//get All post by a category
	List<PostDto> getPostByCategory(Integer CategoryId);
	
	//get All Post by a user
	List<PostDto> getPostByUser(Integer userId);
	
	//search Posts
	List<PostDto> searchPost(String keyword);
	
	
}
