package DAO;

public class AnnuaireProxy implements DAO.Annuaire {
  private String _endpoint = null;
  private DAO.Annuaire annuaire = null;
  
  public AnnuaireProxy() {
    _initAnnuaireProxy();
  }
  
  public AnnuaireProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnnuaireProxy();
  }
  
  private void _initAnnuaireProxy() {
    try {
      annuaire = (new DAO.AnnuaireServiceLocator()).getAnnuaire();
      if (annuaire != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)annuaire)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)annuaire)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (annuaire != null)
      ((javax.xml.rpc.Stub)annuaire)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DAO.Annuaire getAnnuaire() {
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire;
  }
  
  public beans.CategorieBean[] getCategories() throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire.getCategories();
  }
  
  public void addAdresse(beans.AdresseBean b) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.addAdresse(b);
  }
  
  public beans.AdresseBean getAdresse(int idAdresse) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire.getAdresse(idAdresse);
  }
  
  public beans.AnnonceBean[] getAnnonces() throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire.getAnnonces();
  }
  
  public void deleteAnnonce(int id) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.deleteAnnonce(id);
  }
  
  public void addAnnonce(beans.AnnonceBean a, beans.CategorieBean b) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.addAnnonce(a, b);
  }
  
  public void deleteCategorie(int id) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.deleteCategorie(id);
  }
  
  public void addCategorie(java.lang.String nom) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.addCategorie(nom);
  }
  
  public beans.AnnonceBean[] getAnnoncesWithId(int id) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire.getAnnoncesWithId(id);
  }
  
  public void updateAnnonceName(beans.AnnonceBean annonce) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.updateAnnonceName(annonce);
  }
  
  public beans.AnnonceBean[] getAnnoncesWithIdCateg(int id) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    return annuaire.getAnnoncesWithIdCateg(id);
  }
  
  public void updateCategorieName(int id, java.lang.String newName) throws java.rmi.RemoteException{
    if (annuaire == null)
      _initAnnuaireProxy();
    annuaire.updateCategorieName(id, newName);
  }
  
  
}