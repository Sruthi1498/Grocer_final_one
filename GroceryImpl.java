/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.ArrayList;

public class GroceryImpl implements Grocery {

    ArrayList<Product> products = new ArrayList<>();
    private Product product;

    private int id;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    @Override
    public void display() {

    for(Product prod : products) {
          System.out.println(
                    prod.get_id() + "- " +
                            prod.get_name() + " " +
                            prod.get_price() + " " 
                           
            );
    }
    }

    @Override

    public void create() {

        
        products.add(new Product(101,"POTATO",30));
        products.add(new Product (102,"TOMATO",40));
        products.add(new Product(103,"ONION",50));
        products.add(new Product(104,"LADIES FINGER",60));
        products.add(new Product(105,"COCONUT",20));
        
    }

    public Product read(int id) {
          
          
             for (Product prod: products) {
            if (prod.get_id() == id) {
                product = prod;
                break;
            }
        }
        return product;
          }
         
    }

  

