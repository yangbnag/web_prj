package com.spring.core.chap01_2;

public class WesternRestaurant implements Restaurent {

    private Chef chef; // 가정 : 코스 요리가 바뀔 때마다 해당 코스요리를 잘하는 요리사로 바뀐다.
    private Course course;

    public WesternRestaurant(Chef chef, Course course){
        this.chef = chef;
        this.course = course;
    }


    @Override
    public void reserve() {
        course.combineMenu();
    }

    @Override
    public void order() {
        chef.cook();
    }
}
