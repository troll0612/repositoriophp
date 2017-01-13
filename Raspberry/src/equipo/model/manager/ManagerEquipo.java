package equipo.model.manager;

import java.util.ArrayList;
import java.util.List;
import equipo.model.entities.RaspberryPi;

public class ManagerEquipo {

	public List<RaspberryPi> crearLista() {
		List<RaspberryPi> lista = new ArrayList<RaspberryPi>();
		RaspberryPi a = new RaspberryPi("RB Pi model 1A", 30);
		lista.add(a);
		a = new RaspberryPi("RB Pi model 1B", 32.5);
		lista.add(a);
		a = new RaspberryPi("RB Pi model 2B", 40.3);
		lista.add(a);
		a = new RaspberryPi("Compute Module Development Kit ", 75.2);
		lista.add(a);
		a = new RaspberryPi("RB Pi Touch Display", 15);
		lista.add(a);
		a = new RaspberryPi("RB Pi Case", 5);
		lista.add(a);
		a = new RaspberryPi("USB WiFi Dongle ", 25.6);
		lista.add(a);
		return lista;
	}

	public List<RaspberryPi> venderEquipo(List<RaspberryPi> lista, String modelo) throws Exception {
		for (RaspberryPi a : lista) {
			if (a.getModelo().equals(modelo)) {
				//if (a.isVendido())
				//	throw new Exception("Ya esta vendido.");
				//a.setVendido(true);
			}
		}
		//throw new Exception("No existe el modelo");
		return lista;
	}

}
