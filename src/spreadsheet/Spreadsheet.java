package Spreadsheet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtv1
 */
public class Spreadsheet {
    
    private static final Sheet SHEET = new Sheet(5);
    
    public static void put(String name,double value){
        SHEET.setCell(name,value);
    }
     public static void put(String name){
        SHEET.setCell(name);
    }
    public static MaybeValue get(String name){
       return SHEET.getCell(name).getMvalue(); 
    }
    public static void clear(){
        SHEET.clear();
    }
    public static Expression plus(double a, double b){
        return new Expression();
    }
}
