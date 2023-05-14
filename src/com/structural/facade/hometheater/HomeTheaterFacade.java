package com.structural.facade.hometheater;

/**
 * The HomeTheaterFacade manages all those subsystem components for the client.
 * It keeps the client simple and flexible.
 *
 * We can upgrade the home theater components without affecting the client.
 *
 * We try to keep subsystems adhering to the Principle of Least Knowledge as well.
 * If this gets too complex and too many friends are intermingling,
 * we can introduce additional facades to form layers of subsystems.
 */
public class HomeTheaterFacade {
    // here's the composition; these are all the components of the subsystem we are going to use
    private Amplifer amplifer;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    // the facade is passed a reference to each component of the subsystem in its constructor.
    // the facade then assigns each to the corresponding instance variable.
    public HomeTheaterFacade(Amplifer amplifer, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifer = amplifer;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }


    // other methods here

    // watchMovie() follows the same sequence we had to do by hand before,
    // but wraps it up in a handy method that does all the work.
    // Notice that for each task we are delegating the responsibility to the
    // corresponding component in the subsystem.
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifer.on();
        amplifer.setDvd(dvd);
        amplifer.setSurroundSound();
        amplifer.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    // endMovie() takes care of shutting everything down for us.
    // Again, each task is delegated to the appropriate component in the subsystem.
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifer.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
