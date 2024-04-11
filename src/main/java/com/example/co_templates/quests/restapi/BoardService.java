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
        int pk_id = number;
        item.put("PK_ID", pk_id);
        item.put("TITLE", title);
        item.put("CONTENTS", contents);
        this.itemList.add(item);

        return this.itemList;
    }
    public ArrayList<HashMap<String, Object>> list(String pageNumber){
        return this.itemList;
    }
    public HashMap<String, Object> view(int pk_id){
        HashMap<String,Object> itemDetails = new HashMap<>();
                itemDetails = this.itemList.get(pk_id-1);
            
        
        return itemDetails;
    }
    public ArrayList<HashMap<String, Object>> delete(int pk_id){
            this.itemList.remove(pk_id-1);
        return this.itemList;
    }
}
