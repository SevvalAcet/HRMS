package kodlamaio.hrms.business.abstracts;

import java.util.List;



import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {


	DataResult< List<JobPosition> >getAll();
	Result add(JobPosition position);
	Result update(JobPosition position);
	Result delete(JobPosition position);
	
	
}
