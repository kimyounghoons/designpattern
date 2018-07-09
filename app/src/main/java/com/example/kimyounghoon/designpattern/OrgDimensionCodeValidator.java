package com.example.kimyounghoon.designpattern;

import java.util.List;
import java.util.Map;

public class OrgDimensionCodeValidator extends AbstractOrgDimensionValidator {


    @Override
    void validate(List<Map<String, String>> dataset) {
        List<Map<String,String>> recordList = dataset;
        for(Map<String,String> orgRecord : recordList){
            String data = orgRecord.get("Code");
            if(data !=null){
                System.out.println("코드 "+data + "이(가) 검증 되었습니다.");
            }
        }
        this.executeNext(dataset);
    }

}
