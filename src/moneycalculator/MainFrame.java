package moneycalculator;

import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

class MainFrame extends JFrame{

    public MainFrame() {
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setMenuBar(menuBar());
        setLayout(new FlowLayout());
        add(moneyDisplay());
        
        setVisible(true);
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(operationMenu());
        return menuBar;
    }

    private Menu operationMenu() {
        Menu menu = new Menu("Operations");
        menu.add(calculateMenuItem());
        return menu;
    }
    
    private MenuItem calculateMenuItem() {
        MenuItem menuItem = new MenuItem("Execute");
        menuItem.addActionListener(executeCalculate());
        return menuItem;
    }
    
    private ActionListener executeCalculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Execute calculate...");
            }
        };
    }

    private JPanel moneyDisplay() {
        return new SwingMoneyDisplay();
    }
}
