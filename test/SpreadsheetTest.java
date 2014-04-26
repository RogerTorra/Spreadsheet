/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import spreadsheet.Celda;
import spreadsheet.Spreadsheet;

/**
 *
 * @author Roger_Torra
 */
public class SpreadsheetTest {
    
    /*@Before
    public void setUp(){
    Spreadsheet hoja;
    }*/
    
    @Test
    public void celda_valores_test(){  
        System.out.println("Test 1");
        //construcor default 5x5
        Spreadsheet hoja = new Spreadsheet();
        Celda A1 = hoja.getCelda(1, 1);
        A1.setValue(10.0);
        Celda A2 = hoja.getCelda(1, 2);
        A2.setValue(5.0);
        Celda Total = hoja.getCelda(1, 3);
        Total.setFormula("0.5 * A1 + 0.5 * A2");
        Total.addSubject(A1);
        Total.addSubject(A2);
        System.out.println(hoja.getCelda(1, 3).getValue());
        
    }
    public SpreadsheetTest() {
    }
}