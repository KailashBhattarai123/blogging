package com.kailash.ecommerce.Ecommerce.payloads;


import com.kailash.ecommerce.Ecommerce.entities.Category;
import com.kailash.ecommerce.Ecommerce.entities.Comment;
import com.kailash.ecommerce.Ecommerce.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private String title;
    private String content;

    private String imageName;

    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();


}
