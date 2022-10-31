package presentation;

import metier.MetierProduitImpl;
import metier.Produit;

import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void main(String[] args) {


        MetierProduitImpl test1 = new MetierProduitImpl();

        Produit p1= new Produit(1222,"pc portable","hp",122.23,12);
        Produit p2= new Produit(19922,"pc portable","hp",122.23,12);
        Produit p3= new Produit(12992,"pc portable","hp",122.23,12);
        test1.add(p1);
        test1.add(p2);
        test1.add(p3);
        for (Produit prd: test1.getAll()
             ) {
            System.out.println(prd);
            System.out.println("----------------------------------------------------");
        }

//test1.delete(1222);
        System.out.println(test1.findById(1222));
//        for (Produit prd: test1.getAll()
//        ) {
//            System.out.println(prd);
//            System.out.println("----------------------------------------------------");
//        }



    }
}