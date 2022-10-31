package metier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl  implements  IMetierProduit{

List <Produit> prod =new ArrayList<>();

    public MetierProduitImpl() {

    }
//    public MetierProduitImpl(long id, String nom, String marque, double prix, int nbStock) {
//        super(id, nom, marque, prix, nbStock);
//    }


    @Override
    public Produit add(Produit p) {
        if(!prod.contains(p)){
            prod.add(p);
        return p;
        }else{

        return null;}
    }

    @Override
    public List<Produit> getAll() {
        List<Produit> temp=new ArrayList<>();
        prod.forEach((prd)->{
            temp.add(prd);

        });
  return temp;  }

    @Override
    public Produit findById(long id) {


       for (Produit prd :prod){
            if(prd.getId()==id){

            return prd;}
        };

    return null;}

    @Override
    public void delete(long id) {
        for (Produit prd :prod){
            if(prd.getId()==id) {
                      prod.remove(prd);
            }
        };
    }


    @Override
    public List<Produit> findByNom(String nom) {
        List<Produit> temp =new ArrayList<>();

        for (Produit prd :prod){
            if(prd.getNom().equals(nom)) {
                temp.add(prd);
            }}
            return temp;  }
}
