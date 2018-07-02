package umn.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umn.mobile.model.RequestDetail;
import umn.mobile.repository.RequestDetailRepo;

import java.util.List;
import java.util.Set;

@Service
public class RequestDetailService {
    @Autowired
    private RequestDetailRepo requestDetailRepo;

    public RequestDetailService(){}

    public RequestDetail saveRequestDetail(RequestDetail requestDetail){
        return requestDetailRepo.save(requestDetail);
    }

    public RequestDetail getRequestDetailById(Long request_detail_id){
        return requestDetailRepo.findOne(request_detail_id);
    }

    public List<RequestDetail> getAllRequestDetail(){
        return requestDetailRepo.findAll();
    }

    public void deleteRequestDetail(Long request_detail_id) {
        requestDetailRepo.delete(request_detail_id);
    }

    public Set<RequestDetail> getRequestDetailByRequestHeader(Long request_header_id){
        return requestDetailRepo.listOfRequestDetail(request_header_id);
    }
}
