
package chatty.gui.components.textpane;

import java.awt.Color;
import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;

/**
 *
 * @author tduva
 */
public class MyStyleConstants {
    
    enum Attribute {
        BACKGROUND2, HIGHLIGHT_BACKGROUND, SEPARATOR_COLOR, FONT_HEIGHT
    }
    
    public static void setFontHeight(MutableAttributeSet attr, int height) {
        attr.addAttribute(Attribute.FONT_HEIGHT, height);
    }
    
    public static int getFontHeight(AttributeSet attr) {
        Object value = attr.getAttribute(Attribute.FONT_HEIGHT);
        if (value instanceof Integer) {
            return (Integer)value;
        }
        return -1;
    }
    
    public static void setBackground2(MutableAttributeSet attr, Color color) {
        setColor(attr, color, Attribute.BACKGROUND2);
    }
    
    public static Color getBackground2(AttributeSet attr) {
        return getColor(attr, Attribute.BACKGROUND2);
    }
    
    public static void setHighlightBackground(MutableAttributeSet attr, Color color) {
        setColor(attr, color, Attribute.HIGHLIGHT_BACKGROUND);
    }
    
    public static Color getHighlightBackground(AttributeSet attr) {
        return getColor(attr, Attribute.HIGHLIGHT_BACKGROUND);
    }
    
    public static void setSeparatorColor(MutableAttributeSet attr, Color color) {
        setColor(attr, color, Attribute.SEPARATOR_COLOR);
    }
    
    public static Color getSeparatorColor(AttributeSet attr) {
        return getColor(attr, Attribute.SEPARATOR_COLOR);
    }
    
    private static void setColor(MutableAttributeSet attr, Color color, Attribute key) {
        attr.addAttribute(key, color != null ? color : false);
    }
    
    private static Color getColor(AttributeSet attr, Attribute key) {
        Object value = attr.getAttribute(key);
        if (value instanceof Color) {
            return (Color)value;
        }
        return null;
    }
}