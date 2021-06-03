/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Void Wind
 */
public class Settings {

    public static Font myFont = new Font("Times New Roman", Font.PLAIN, 22);
    public static Color backgroundColor = new Color(255, 204, 213);
    public static Color componentBackgroundColor = new Color(255, 230, 234);

    public static void setFrameInterface(JFrame frame) {
        // Set background color
        frame.getContentPane().setBackground(backgroundColor);
    }
}
