package ctrl;

import java.security.Principal;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import mdl.Utilisateur;

@Named
public class MyController {
	
	
	@PersistenceContext(name="pu")
	private EntityManager em;
	
//	public List<Utilisateur> listAll(){
//		Query q = em.createQuery("SELECT b FROM Utilisateur b");
//		return q.getResultList();
//	}
	
//	@PostConstruct
//	public void init() {
//		Utilisateur u = new Utilisateur();
//		
//		u.setLogin("user3");
//		u.setPassword("user3");
//		
//		em.persist(u);
//	}
	
	
	public String logout() {
		FacesContext contxt = FacesContext.getCurrentInstance();
		ExternalContext ec = contxt.getExternalContext();
		final HttpServletRequest req = (HttpServletRequest)ec.getRequest();
		req.getSession(false).invalidate();
		
		return "logout";
	}
	
	// security.pkg
//	@Resource
//	private FacesContext ctx;
	
	public Principal getUser() {
		return FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
	}
	
	private String userName;
	
	public String getUsername() {
		Principal p = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
		return p.getName();
	}
	
	
}
