package in.manrajsingh.utilities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.manrajsingh.entities.Product;
import in.manrajsingh.entities.Request;
import in.manrajsingh.entities.User;
import in.manrajsingh.model.RequestModel;

@Service
public class RequestServiceUtils {
	
	public List<RequestModel> mapRequestsToModel(List<Request> requests) {
		List<RequestModel> requestModels = new ArrayList<>();
		
		for(Request request: requests) {
			requestModels.add(mapRequest(request));
		}
		return requestModels;
	}
	
	public RequestModel mapRequest(Request request) {
		RequestModel requestModel = new RequestModel();
		requestModel.setReply(request.getReply());
		requestModel.setId(request.getId());
		requestModel.setStatus(request.isStatus());
		User user = request.getUser();
		Product product = request.getProduct();
		requestModel.setUserName(user.getName());
		requestModel.setProductCompany(product.getCompany());
		requestModel.setVersion(product.getVersion());
		requestModel.setProductName(product.getName());
		return requestModel;
	}
}
