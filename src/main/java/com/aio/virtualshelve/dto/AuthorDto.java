package com.aio.virtualshelve.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthorDto implements Serializable {
    private Long id;
    private String name;
}
