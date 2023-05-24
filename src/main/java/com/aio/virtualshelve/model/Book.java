package com.aio.virtualshelve.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 6012075650187699748L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;
    private Long startYear;
    private Long finishYear;
}
