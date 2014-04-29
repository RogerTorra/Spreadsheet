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
class Cell {
    MaybeValue mvalue;
    public Cell() {
        this.mvalue = new NoValue();
    }
    public Cell(double value) {
        this.mvalue = new SomeValue(value);
    }

    public MaybeValue getMvalue() {
        return mvalue;
    }

}
