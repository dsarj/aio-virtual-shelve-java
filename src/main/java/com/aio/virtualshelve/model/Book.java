package com.aio.virtualshelve.model;

import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "TB_BOOK")
public class Book implements Serializable {

    @Id
    @Column(name = "ID")
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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUTHOR", referencedColumnName = "ID")
    private Author author;


}
