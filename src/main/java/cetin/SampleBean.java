package cetin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ManagedBean(name = "denemeBean")
@ViewScoped
public class SampleBean implements Serializable {

	private static final long serialVersionUID = 7961263138805994351L;

	private String databinding;
	private List<User> lstUser;

	public String getDatabinding() {
		if (!FacesContext.getCurrentInstance().isPostback()) {

			getUsers();
		}

		return databinding;
	}

	private void foo() {
		System.out.println("Fooooo");
		System.out.println("Fooo2");

		int x = 3;

	}

	private void getUsers() {
		User u;

		if (getLstUser() == null) {
			setLstUser(new CopyOnWriteArrayList<User>());
		}

		
			for (int i = 0; i < 30; i++) {
				u = new User();
				u.setName("name " + i + 1);
				u.setLastname("lastname " + i + 1);

				getLstUser().add(u);

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
