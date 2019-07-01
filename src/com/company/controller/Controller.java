package com.company.controller;

import com.company.model.Model;

public class Controller {
    private Model model;

    public void onShowAllUsers(){
        model.loadUsers();
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
