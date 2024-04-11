package com.example.co_templates.services;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;;

@Service
public class CommonCodeService {
    public ArrayList<HashMap<String, Object>> list(Integer pageNumber) {
        ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();
 
        HashMap<String, Object> item = new HashMap<>();
        item.put("PK_ID", 1);
        item.put("FK_ID", 10);
        item.put("NAME", "Excalibur");
        itemList.add(item);
    
        item = new HashMap<>();
        item.put("PK_ID", 2);
        item.put("FK_ID", 20);
        item.put("NAME", "Dragon Sword");
        itemList.add(item);

        return itemList;
    }
}
