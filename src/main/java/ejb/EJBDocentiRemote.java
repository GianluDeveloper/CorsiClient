package ejb;

import javax.ejb.Remote;

import dto.DocentiDto;
import response.Response;
import response.ResponseDao;
import util.RicercaDb;

@Remote
public interface EJBDocentiRemote {

	public Response insert(DocentiDto o);

	public Response update(DocentiDto o);

	public Response delete(DocentiDto o);

	public ResponseDao<DocentiDto> find(RicercaDb o);

	public ResponseDao<DocentiDto> findAll(Boolean reverse);

	public ResponseDao<DocentiDto> findById(Integer id);

}
