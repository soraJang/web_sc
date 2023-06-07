package com.web_sc.vo;

public class MusicVO {

    private String id;
    private String name;
    private String author;
    private String singer;
    private String size;

    public MusicVO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MusicVO{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", singer='" + singer + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
