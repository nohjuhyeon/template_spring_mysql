package com.example.co_templates.quests.restapi;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;;

@Service
public class BoardService {
    public ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();

    public ArrayList<HashMap<String, Object>> insert(String title, String contents) { 
        HashMap<String, Object> item = new HashMap<>();
        int number = this.itemList.size()+1;
        String pk_id = "PK_ID_"+ number;
        item.put("PK_ID", pk_id);
        item.put("TITLE", title);
        item.put("CONTENTS", contents);
        this.itemList.add(item);

        return this.itemList;
    }
    public ArrayList<HashMap<String, Object>> list(String pageNumber){
        return this.itemList;
    }
    public HashMap<String, Object> view(String pk_id){
        HashMap<String,Object> itemDetails = new HashMap<>();
        for (int i = 0; i < this.itemList.size();i++){
            if (this.itemList.get(i).get("PK_ID").equals(pk_id)){
            itemDetails = this.itemList.get(i);
        }
    }
        
        return itemDetails;
    }
    public ArrayList<HashMap<String, Object>> delete(String pk_id){
        for (int i = 0; i < this.itemList.size();i++){
            if (this.itemList.get(i).get("PK_ID").equals(pk_id)){
                this.itemList.remove(i);
        }
    }
        return this.itemList;
    }
}
