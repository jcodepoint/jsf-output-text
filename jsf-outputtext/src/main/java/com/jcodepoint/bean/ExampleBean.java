package com.jcodepoint.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotEmpty;

@Named("exampleBean")
@RequestScoped
public class ExampleBean {

	private String texto1;
	private String texto2;
	private String textoHtml;
	
	@PostConstruct
	public void init() {
		this.texto1 = "Ejemplo con h:outputText usando Managed Bean.";
		this.texto2 = "Titulo 2";
		this.textoHtml = "<ul><li>Bread</li><li>Cookie</li></ul>";
	}
	
	public String getTexto1() {
		return texto1;
	}
	
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}
	
	public String getTexto2() {
		return texto2;
	}
	
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}
	
	public String getTextoHtml() {
		return textoHtml;
	}
	
	public void setTextoHtml(String textoHtml) {
		this.textoHtml = textoHtml;
	}

	public String example2() {
		System.out.println("ExampleBean.example2() : ENTRADA");
		return "inicio2";
	}

	public String example1() {
		System.out.println("ExampleBean.example1() : ENTRADA");
		return "inicio";
	}
	
}
