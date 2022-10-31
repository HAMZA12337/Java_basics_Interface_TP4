package metier;
import java.util.*;
public interface IMetierProduit {

     Produit add(Produit p) ;
     List<Produit> getAll() ;
     Produit findById(long id) ;
     List<Produit>   findByNom(String nom) ;
     void delete(long id) ;






}
