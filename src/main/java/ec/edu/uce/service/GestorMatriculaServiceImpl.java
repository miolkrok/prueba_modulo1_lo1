package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelos.Vehiculos;
import ec.edu.uce.repositorio.IMatriculaVehiculosRepo;

@Service
public class GestorMatriculaServiceImpl implements IMatriculaVehiculoService{
	
	@Autowired
	@Qualifier("liviano") 
	private IMatriculaVehiculosRepo vehiculoA;
	
	@Qualifier("pesado")
	private IMatriculaVehiculosRepo vehiculoB;

	@Override
	public void calcularMatricula(Vehiculos vehiculo) {
		if(vehiculo.getPrecio().intValue()>10000) {
			this.vehiculoA.tipo(vehiculo);
		}
		
	}

	@Override
	public void matricularVehiculo(Vehiculos vehiculo) {
		
		
	}

	@Override
	public void imprimirVehiculo(Vehiculos vehiculo) {
		// TODO Auto-generated method stub
		
	}



}
