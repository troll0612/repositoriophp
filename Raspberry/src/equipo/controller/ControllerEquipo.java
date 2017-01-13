package equipo.controller;

import java.io.IOException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import equipo.model.entities.RaspberryPi;
import equipo.model.manager.ManagerEquipo;
import equipo.view.util.JSFUtil;

@ManagedBean
@SessionScoped
public class ControllerEquipo {
	private String mes;
	private String tipoCompra;
	private int cantidad;
	private List<RaspberryPi> lista;
	private ManagerEquipo managerEquipo;
	private double precio;
	private double valor;

	@PostConstruct
	public void iniciar() {
		managerEquipo = new ManagerEquipo();
		lista = managerEquipo.crearLista();
		cantidad = 0;
	}

	public void actionListenerVender() throws IOException {
		precio = valor * cantidad;
		JSFUtil.crearMensajeInfo("Venta Exitosa!!..");
		if (tipoCompra.equals("efectivo")) {
			precio = precio - 3;
		}
		if (Integer.parseInt(mes) >= 2 && Integer.parseInt(mes) <= 10) {
			precio = precio - (precio * 0.15);
		}
		FacesContext contex = FacesContext.getCurrentInstance();
		contex.getExternalContext().redirect("pagado.xhtml");
	}

	public void actionListenerReset() {
		System.out.println("si esta actualizando/..........!!!!!!!!");
		lista = managerEquipo.crearLista();
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<RaspberryPi> getLista() {
		return lista;
	}

	public void setLista(List<RaspberryPi> lista) {
		this.lista = lista;
	}

	public ManagerEquipo getManagerEquipo() {
		return managerEquipo;
	}

	public void setManagerEquipo(ManagerEquipo managerEquipo) {
		this.managerEquipo = managerEquipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}