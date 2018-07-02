package umn.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umn.mobile.model.MasterItem;
import umn.mobile.repository.MasterItemRepo;

import java.util.List;

@Service
public class MasterItemService {
    @Autowired
    private MasterItemRepo masterItemRepo;

    public MasterItemService(){}

    public MasterItem saveMasterItem(MasterItem masterItem){
        return masterItemRepo.save(masterItem);
    }

    public MasterItem getMasterItemById(Long item_id){
        return masterItemRepo.findOne(item_id);
    }

    public List<MasterItem> getAllMasterItem(){
        return masterItemRepo.findAll();
    }

    public void deleteMasterItem(Long item_id) {
        masterItemRepo.delete(item_id);
    }
}
