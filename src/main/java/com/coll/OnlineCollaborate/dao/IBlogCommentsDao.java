package com.coll.OnlineCollaborate.dao;

import java.util.List;

import com.coll.OnlineCollaborate.model.BlogComments;

public interface IBlogCommentsDao {
List<BlogComments> getAllBlogComments();
BlogComments getBlogCommentsById(int blogCommentId);
boolean addBlogComments(BlogComments blogComments);
boolean updateBlogComments(BlogComments blogComments);
boolean deleteBlogComments(BlogComments blogComments);
}
