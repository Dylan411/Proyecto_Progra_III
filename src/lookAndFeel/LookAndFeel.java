/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lookAndFeel;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookAndFeel {
    
    public static void setup() {
        ApplyTheme();
        applyCustomFlatSettings(); //primero aplicar la configuracion de los componentes en el tema antes de instalar el tema
    }
    public static void ApplyTheme() {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkContrastIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("No hay archivo, no hay tema");
        }
    }
    //Aplica las propiedades personalizadas de ciertos componentes en el tema elegido de IntelliJ
    private static void applyCustomFlatSettings() {
        UIManager.put("Button.arc", 999); 
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("Combobox.arc", 999);
        UIManager.put("ScrollBar.TrackInsets", new Insets(2, 4, 2, 4));
        UIManager.put("ScrollBar.track", new Color(255, 47, 67));
        UIManager.put("Component.arrowType", "triangle");
        UIManager.put("Component.innerFocusWidth", 1);
        UIManager.put("ScrollBar.showButtons", true);
        UIManager.put("TabbedPane.showTabSeparators", true);
        UIManager.put("TabbedPane.tabSeparatorsFullHeight", true);
    }
}