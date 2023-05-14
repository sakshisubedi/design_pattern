package com.structural.facade.hometheater;

/**
 * HFDP example
 */
public class FacadePattern {
        public static void main(String[] args) {
            // instantiate components here
            // instantiation can be done at facade as well
            HomeTheaterFacade homeTheater =
                    new HomeTheaterFacade(new Amplifer(), new Tuner(), new DvdPlayer(), new CdPlayer(),
                            new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
            homeTheater.watchMovie("Raiders of the Lost Ark");
            homeTheater.endMovie();
        }
}
