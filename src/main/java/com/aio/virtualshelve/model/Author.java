package com.aio.virtualshelve.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "TB_AUTHOR")
public class Author implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
