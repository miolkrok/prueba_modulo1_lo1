package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelos.Vehiculos;
import ec.edu.uce.service.IMatriculaVehiculoService;

@SpringBootApplication
public class PruebaModulo1LoApplication {
	
	@Autowired
	private IMatriculaVehiculoService vehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo1LoApplication.class, args);
		
		Vehiculos vehiculo1 = new Vehiculos();
		vehiculo1.setMarca("");
		vehiculo1.setPaisOrigen(null);
		vehiculo1.setPlaca("");
		vehiculo1.setPropietario("");
		
	}

}
