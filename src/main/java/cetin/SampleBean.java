package cetin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean(name="denemeBean")
@ViewScoped 
public class SampleBean {
	
	private String databinding;
	private List<User> lstUser;

	public String getDatabinding() {
		if (!FacesContext.getCurrentInstance().isPostback() ) {
			
			getUsers();
		}
		
		return databinding;
	}
	

	private void getUsers() {
		User u;
		for (int i = 0; i < 30; i++) {
			u=new User();
			u.setName("name "+i+1);
			u.setLastname("lastname "+i+1);
			
			if (getLstUser()!=null) {
				getLstUser().add(u);	
			}
		}
		
	}


	public void setDatabinding(String databinding) {
		this.databinding = databinding;
	}


	public List<User> getLstUser() {
		return lstUser;
	}


	public void setLstUser(List<User> lstUser) {
		this.lstUser = lstUser;
	}
	
	

}
