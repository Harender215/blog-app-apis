package com.blog.application.services;

import java.util.List;

import com.blog.application.entities.Post;
import com.blog.application.payloads.PostDto;
import com.blog.application.payloads.PostResponse;

public interface PostService {

	//create 
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer PostId);
	
	//delete
	void deletePost(Integer PostId);
	
	//getAllPosts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	
	//get Single Post
	PostDto getPostById(Integer postId);
	
	//get All post by a category
	List<PostDto> getPostsByCategory(Integer CategoryId);
	
	//get All Post by a user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search Posts
	List<PostDto> searchPost(String keyword);
	
	
}
