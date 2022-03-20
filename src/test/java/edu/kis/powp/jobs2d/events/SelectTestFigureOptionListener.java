package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	public enum Figure{FIGURE1, FIGURE2}

	private DriverManager driverManager;
	private Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (this.figure){
			case FIGURE1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
		}
	}
}
