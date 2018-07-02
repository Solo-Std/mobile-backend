package umn.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umn.mobile.model.RequestDetail;
import umn.mobile.model.RequestHeader;
import umn.mobile.repository.RequestDetailRepo;
import umn.mobile.repository.RequestHeaderRepo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RequestHeaderService {
    @Autowired private RequestHeaderRepo requestHeaderRepo;
    @Autowired private RequestDetailRepo requestDetailRepo;

    public RequestHeaderService(){}

    public String createDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(formatter);
    }

    public Integer getCounter(){
        Integer i = requestHeaderRepo.getCounter();
        if(i==null){
            i=1;
        }
        else{
            i++;
        }

        return i;
    }

    public String createNomorDokumen() {
        return String.format(
                "PL/%s/%04d",
                String.format("%02d%02d",
                        LocalDate.now().getMonthValue(),
                        LocalDate.now().getYear()%100),
                getCounter()
        );
    }

    public String saveRequestHeader(RequestHeader requestHeader, List<RequestDetail> listRequestDetail) {
        try {
            requestHeaderRepo.save(requestHeader);
            requestDetailRepo.save(listRequestDetail);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return "Save Failed!" + ex.getMessage();
        }
        return "Save Success!";
    }

    public RequestHeader getRequestHeaderById(Long request_header_id){
        return requestHeaderRepo.findOne(request_header_id);
    }

    public List<RequestHeader> getAllRequestHeader(){
        return requestHeaderRepo.findAll();
    }

    public void deleteRequestHeader(Long request_header_id) {
        requestHeaderRepo.delete(request_header_id);
    }
}
