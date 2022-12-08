package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иванов";
        post.patronymic = " Иван";
        post.surname = "Иванович";
        post.birthday.day = 11;
        post.birthday.month = 12;
        post.birthday.year = 1995;
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-777-29-58";
        post.subscription = true;
    }
}