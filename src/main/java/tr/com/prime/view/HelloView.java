package tr.com.prime.vew;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloView")
@ViewScoped
public class HelloView {

	private String name;

	public void sayHello() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("hello " + name));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
