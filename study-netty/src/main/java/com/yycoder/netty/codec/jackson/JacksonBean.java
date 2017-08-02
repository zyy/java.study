package com.yycoder.netty.codec.jackson;

import java.util.List;
import java.util.Map;

/**
 * Created by yangyang.zhao on 2017/8/2.
 */
public class JacksonBean {
    private int age;
    private String name;
    private List<String> sons;
    private Map<String, String> addrs;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSons() {
        return sons;
    }

    public void setSons(List<String> sons) {
        this.sons = sons;
    }

    public Map<String, String> getAddrs() {
        return addrs;
    }

    public void setAddrs(Map<String, String> addrs) {
        this.addrs = addrs;
    }
}
