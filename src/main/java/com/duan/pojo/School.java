package com.duan.pojo;

public class School {
    private Integer id;
    private String schoolName;

    public School() {
    }

    public School(Integer id, String schoolName) {
        this.id = id;
        this.schoolName = schoolName;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置
     * @param schoolName
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return "School{id = " + id + ", schoolName = " + schoolName + "}";
    }
}
