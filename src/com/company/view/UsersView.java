package com.company.view;

import com.company.bean.User;
import com.company.controller.Controller;
import com.company.model.ModelData;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User user: modelData.getUsers()) {
            System.out.println("\t" + user.toString());
        }
        System.out.println("===================================================");
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
