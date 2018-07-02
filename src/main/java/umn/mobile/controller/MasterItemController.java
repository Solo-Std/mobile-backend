package umn.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umn.mobile.model.MasterItem;
import umn.mobile.service.MasterItemService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/masteritem")
public class MasterItemController {
    @Autowired
    private MasterItemService masterItemService;

    //ShowAllMasterItem
    @GetMapping(value = "", produces = {"application/json"})
    public List<MasterItem> showAllMasterItem() {
        return masterItemService.getAllMasterItem();
    }

    //ShowMasterItemById
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public MasterItem showMasterItemById(@PathVariable("id") Long item_id){
        return masterItemService.getMasterItemById(item_id);
    }

    //CreateNewMasterItem
    @PostMapping(value = "", produces = {"application/json"})
    public ResponseEntity<MasterItem> createMasterItem(@RequestBody MasterItem masterItem){
        masterItemService.saveMasterItem(masterItem);
        return new ResponseEntity<>(masterItem, HttpStatus.CREATED);
    }

    //UpdateExistingMasterItem
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<MasterItem> updateMasterItem(@Valid @RequestBody MasterItem masterItem,
                                                       @PathVariable("id") Long item_id){
        masterItem.setItem_id(item_id);
        masterItemService.saveMasterItem(masterItem);
        return new ResponseEntity<>(masterItem, HttpStatus.CREATED);
    }

    //DeleteMasterItemById
    @DeleteMapping(value = "/{id}", produces = {"application/json"})
    public void deleteMasterItemById(@PathVariable("id") Long item_id){
        masterItemService.deleteMasterItem(item_id);
    }
}
