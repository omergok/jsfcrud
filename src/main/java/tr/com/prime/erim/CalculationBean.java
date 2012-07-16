package tr.com.prime.erim;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "calculationBean")
@ViewScoped
public class CalculationBean {
	
	@Getter
	@Setter
	private Integer firstNum;
	
	@Getter
	@Setter
	private Integer secondNum;
	
	public void sum()
	{

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("sum = " + (firstNum + secondNum)));
	}

}
