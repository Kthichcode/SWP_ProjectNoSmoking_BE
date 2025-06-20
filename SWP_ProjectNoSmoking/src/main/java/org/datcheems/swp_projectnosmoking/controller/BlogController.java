package org.datcheems.swp_projectnosmoking.controller;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.datcheems.swp_projectnosmoking.dto.request.BlogPostRequest;
import org.datcheems.swp_projectnosmoking.dto.response.BlogResponse;
import org.datcheems.swp_projectnosmoking.dto.response.ResponseObject;
import org.datcheems.swp_projectnosmoking.entity.BlogPost;
import org.datcheems.swp_projectnosmoking.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blog")
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class BlogController {

    BlogService  blogService;


    @PostMapping("/create")
    public ResponseEntity<ResponseObject<BlogResponse>> createBlogPost(@RequestBody BlogPostRequest request) {
        return blogService.createBlog(request);
    }
}
