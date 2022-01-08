package ec.edu.uce.repositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelos.Vehiculos;

@Repository
public class VehiculoLivianoRepoImpl implements IMatriculaVehiculosRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(VehiculoLivianoRepoImpl.class);

	@Override
	public void tipo(Vehiculos vehiculos) {

			LOG.info("");
		
	}



}
