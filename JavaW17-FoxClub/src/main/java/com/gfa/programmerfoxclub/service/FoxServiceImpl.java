package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxServiceImpl implements FoxService {
    private final List<Fox> foxList = new ArrayList<>();
    @Override
    public Fox newFox(Fox fox){
        foxList.add(fox);
        return fox;
    }

}
