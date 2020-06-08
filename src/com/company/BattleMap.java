package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int dotsToWin;

    private int cellHeight;
    private int cellWidth;

    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (isInit) {
                    mouseReleasedUpdate(e);
                }
            }
        });
    }

    private Result callback = (message -> showFinishDialog(message));

    private void mouseReleasedUpdate(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if (!Logic.gameFinished) {
            Logic.setHumanCoords(cellX, cellY, callback);
        }
        System.out.printf("cellX: %d  cellY: %d \n", cellX, cellY);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void showFinishDialog(String message) {
        JFrame frame = new JFrame();
        int WINDOW_POS_X = GameWindow.WINDOW_POS_X + 100;
        int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y + 200;
        int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 200;
        int WINDOW_HEIGHT = 100;
        frame.setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.add(new JLabel(message, SwingConstants.CENTER));
        frame.setVisible(true);
    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        printGrid(g, panelWidth, panelHeight);

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i, true);
                } else if (Logic.map[i][j] == Logic.DOT_O) {
                    drawX(g, j, i, false);
                }
            }
        }
    }

    private void printGrid(Graphics g, int panelWidth, int panelHeight) {
        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
    }

    private void drawX(Graphics g, int cellX, int cellY, boolean isUser) {
        int x1 = cellX * cellWidth;
        int y1 = cellY * cellHeight;

        int y2 = (cellY + 1) * cellHeight;
        int x2 = (cellX + 1) * cellWidth;

        if (isUser) {
            g.setColor(Color.red);
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y1, x1, y2);
        } else {
            g.setColor(Color.blue);
            g.drawOval(x1 , y1, x2 - x1, y2 - y1);
        }
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin) {
        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.dotsToWin = dotsToWin;

        isInit = true;
        repaint();
    }
}
