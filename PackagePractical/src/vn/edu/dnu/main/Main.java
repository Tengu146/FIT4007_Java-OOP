package vn.edu.dnu.main;

import vn.edu.dnu.library.Book;

public class Main {
    public static void main(String[] args) {
        Baby baby01 = new Baby();
        baby01.numBabiesMade = 100;
        Baby baby02 = new Baby();
        System.out.println(baby01.numBabiesMade);
        System.out.println(baby02.numBabiesMade);
    }
}