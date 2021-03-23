package com.coll.OnlineCollaborate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coll.OnlineCollaborate.model.BlogComments;
import com.coll.OnlineCollaborate.service.IBlogCommentsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class BlogCommentsController {

	@Autowired
	IBlogCommentsService blogCommentsService;
	
	@PostMapping("save-blogComments")
	public boolean saveBlogComments(@RequestBody BlogComments blogComments) {
		return blogCommentsService.addBlogComments(blogComments);
	}
	
	@GetMapping("blogComments-list")
	public List<BlogComments> allBlogComments(){
		return blogCommentsService.getAllBlogComments();
		
	}
	
	@DeleteMapping("delete-blogComments/{blogComments}")
	public boolean deleteBlogComments(@PathVariable("blogComments") BlogComments blogComments) {
		return blogCommentsService.deleteBlogComments(blogComments);
	}
	
	@GetMapping("blogComments/{blogCommentsId}")
	public BlogComments BlogCommentsById (@PathVariable("blogCommentsId")int blogCommentsId) {
		return blogCommentsService.getBlogCommentsById(blogCommentsId);
		
	}
	
	@PostMapping("update-blogComments/{blogComments}")
	public boolean updateBlogComments(@RequestBody BlogComments blogComments,@PathVariable("blogCommentsId")int blogCommentsId) {
		blogComments.setBlogCommentId(blogCommentsId);
		return blogCommentsService.updateBlogComments(blogComments);
	}
	
}
