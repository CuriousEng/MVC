package com.company.view;


import com.company.controller.Controller;
import com.company.model.ModelData;

public class EditUserView implements View{
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
            System.out.println("\t" + modelData.getActiveUser().toString());
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
