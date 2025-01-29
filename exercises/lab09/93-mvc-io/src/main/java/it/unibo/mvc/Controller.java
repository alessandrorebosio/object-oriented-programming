package it.unibo.mvc;

import java.util.List;

/**
 *
 */
public interface Controller {
    public void setNextString(final String nextString);

    public String getNextString();

    public List<String> history();

    public void printCurretString();
}
