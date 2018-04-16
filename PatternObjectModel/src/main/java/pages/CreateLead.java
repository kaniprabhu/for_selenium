package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	public CreateLead() {
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.ID, using="createLeadForm_companyName")
private WebElement eleCname;

public CreateLead typeCname(String cName) {
	type(eleCname, cName);
	return this;
}

@FindBy(how=How.ID, using="createLeadForm_firstName")
private WebElement eleFname;

public CreateLead typeFname(String data) {
	type(eleCname, data);
	return this;
}

@FindBy(how=How.ID, using="createLeadForm_lastName")
private WebElement eleLname;

public CreateLead typelname(String data) {
	type(eleCname, data);
	return this;
}

@FindBy(how=How.NAME , using="submitButton")
private WebElement elesubmitbutton;

public ViewLead clickSubmitButton()
{
	click(elesubmitbutton);
	return new ViewLead();
}

}
