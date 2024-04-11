package com.example.co_templates.quests.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.co_templates.services.CommonCodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class BoardController {

    @Autowired BoardService BoardService;

    @GetMapping("/q/r/board/list/{pageNumber}")
    public ResponseEntity<List<HashMap<String, Object>>> list(@PathVariable("pageNumber") String pageNumber) {
        ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();
        // CommonCodeService commonCodeService = new CommonCodeService();
        itemList = BoardService.list(pageNumber);
    
        return ResponseEntity.ok().body(itemList);
    }
    @GetMapping("/q/r/board/insert/{title}/{contents}")
    public ResponseEntity<List<HashMap<String, Object>>> insert(@PathVariable("title") String title, @PathVariable("contents") String contents) {
        ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();
        // CommonCodeService commonCodeService = new CommonCodeService();
        itemList = BoardService.insert(title,contents);
    
        return ResponseEntity.ok().body(itemList);
    }
    @GetMapping("q/r/board/view/{pk_id}")
    public ResponseEntity<HashMap<String, Object>> view(@PathVariable("pk_id") int pkId) {
        HashMap<String, Object> itemDetails = new HashMap<>();
        itemDetails = BoardService.view(pkId);

        return ResponseEntity.ok().body(itemDetails);
    }
    @GetMapping("q/r/board/delete/{pk_id}")
    public ResponseEntity<ArrayList<HashMap<String, Object>>> delete(@PathVariable("pk_id") int pkId) {
        ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();
        itemList = BoardService.delete(pkId);

        return ResponseEntity.ok().body(itemList);
    }
}
