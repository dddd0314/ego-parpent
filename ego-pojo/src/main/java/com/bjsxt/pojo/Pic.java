package com.bjsxt.pojo;

public class Pic {
    private int id;
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }

    public void setPath(String path) {
        this.path = path;
    }


}
