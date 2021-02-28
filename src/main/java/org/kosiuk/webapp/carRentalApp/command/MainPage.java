package org.kosiuk.webapp.carRentalApp.command;

import org.kosiuk.webapp.carRentalApp.constants.Path;

import javax.servlet.http.HttpServletRequest;

public class MainPage implements Command{

    @Override
    public String execute(HttpServletRequest request) {

        return Path.INDEX_PATH;

    }
}
