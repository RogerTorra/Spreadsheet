/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Spreadsheet.SomeValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static Spreadsheet.Spreadsheet.*;
import static Spreadsheet.SomeValue.*;
/**
 *
 * @author rtv1
 */
public class cellsTest {
    
    @Before
    public void setup(){
        put("a1",40);
        put("a3");
    }
    
    @Test
    public void value_test(){
        assertEquals(new SomeValue(40), get("a1"));
    }
    
    @Test
    public void cell_has_no_value_if_depends_on_empty_cells(){
     assertFalse(get("a3").hasValue());
    }
    
    public cellsTest() {
    }

    
}
