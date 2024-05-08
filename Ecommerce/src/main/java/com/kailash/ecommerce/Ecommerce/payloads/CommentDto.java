package com.kailash.ecommerce.Ecommerce.payloads;

import com.kailash.ecommerce.Ecommerce.entities.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private int  id;
    private String content;
}
