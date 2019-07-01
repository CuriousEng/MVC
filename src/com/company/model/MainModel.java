package com.company.model;


import com.company.bean.User;
import com.company.model.service.UserService;
import com.company.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    UserService userService = new UserServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> list = new ArrayList<>(userService.getUsersBetweenLevels(1, 100));
        modelData.setUsers(list);
    }
}
