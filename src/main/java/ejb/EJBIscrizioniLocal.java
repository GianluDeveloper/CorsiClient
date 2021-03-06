package ejb;

import javax.ejb.Local;

import dto.IscrizioniDto;
import response.Response;
import response.ResponseDao;
import util.RicercaDb;

@Local
public interface EJBIscrizioniLocal {

	public Response insert(IscrizioniDto o);

	public Response update(IscrizioniDto o);

	public Response delete(IscrizioniDto o);

	public ResponseDao<IscrizioniDto> find(RicercaDb o);

	public ResponseDao<IscrizioniDto> findAll(Boolean reverse);

	public ResponseDao<IscrizioniDto> findById(Integer id);

}
