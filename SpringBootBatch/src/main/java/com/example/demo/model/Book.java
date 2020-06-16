package com.example.demo.model;

import com.example.demo.utils.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;


@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "date" })
public class Book {
    private Long id;
    private String name;
    private String author;
    private Date date;

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    //@XmlElement(name = "date")
    public void setDate(Date date)
    {
        this.date = date;
    }

    // constructor, getters and setters

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public Date getDate()
    {
        return date;
    }
}
