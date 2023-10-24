package com.aio.virtualshelve.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "TB_BOOK")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "START_YEAR")
    private Long startYear;
    @Column(name = "FINISH_YEAR")
    private Long finishYear;
    @Column(name = "PAGES")
    private Long pages;
    @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "ID")
    private Author author;


}
