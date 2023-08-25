package ru.nikolenko.universityapp.entity;

import ru.nikolenko.universityapp.service.Actions;

public class Student implements Actions.GoUniversity, Actions.DoHomework {
    String placeOfStudy;
    String educator;

    @Override
    public void goUniversity() {
        System.out.println("Я студент и я хожу в университет");
    }

    public void doHomework() {
        System.out.println("Я студент и я делаю домашнее задание");
    }


}
