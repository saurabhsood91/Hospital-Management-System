/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author saurabh
 */
public abstract class bill {

    protected int bill_id;
    protected String bill_type;

    public abstract void generateBill();
    public abstract void setBill();
    public abstract void searchBill();

}
