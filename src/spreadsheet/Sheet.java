package Spreadsheet;


import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtv1
 */
public class Sheet {
    int rows, cols;
    Map<String, Cell> Cells;
    public Sheet(int size) {
        this.rows = rows;
        this.cols = cols;
        Cells = new HashMap<String, Cell>();
    }
    public void setCell(String name,double value){
        Cell nCell = new Cell(value);
        Cells.put(name,nCell);
    }
     void setCell(String name) {
        Cell nCell = new Cell();
        Cells.put(name,nCell);
    }
    public Cell getCell(String name){
        return Cells.get(name);
    }

   
}
