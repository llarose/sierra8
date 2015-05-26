package ca.usherbrooke.gegi.sierra6.client.application;

public class Utilities {

    public static native void console(String text)
/*-{
    console.log(text);
}-*/;
}
