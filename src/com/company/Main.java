package com.company;

import com.company.controller.Controller;
import com.company.model.FakeModel;
import com.company.model.MainModel;
import com.company.model.Model;
import com.company.view.EditUserView;
import com.company.view.UsersView;

public class Main {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView =new EditUserView();
        Controller controller = new Controller();
        controller.setEditUserView(editUserView);

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();

        usersView.fireEventOpenUserEditForm(126);

        usersView.fireEventShowDeletedUsers();
    }
}
