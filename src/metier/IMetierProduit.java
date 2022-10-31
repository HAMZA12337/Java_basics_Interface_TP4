package metier;
import java.util.*;
public interface IMetierProduit {

     Produit add(Produit p) ;
     List<Produit> getAll() ;
     Produit findById(long id) ;
     void delete(long id) ;






}
