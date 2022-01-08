package ec.edu.uce.service;

import ec.edu.uce.modelos.Vehiculos;

public interface IMatriculaVehiculoService {

	void calcularMatricula(Vehiculos vehiculo);
	void matricularVehiculo(Vehiculos vehiculo);
	void imprimirVehiculo(Vehiculos vehiculo);
}
