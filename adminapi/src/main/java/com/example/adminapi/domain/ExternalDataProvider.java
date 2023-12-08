package com.example.adminapi.domain;

import java.util.ArrayList;
import java.util.List;

public class ExternalDataProvider {

    public static List<ExternalData> getExternalData() {
        List<ExternalData> externalDataList = new ArrayList<>();

        externalDataList.add(new ExternalData("1", "첫번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("2", "두번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("3", "세번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("4", "네번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("5", "다섯번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("6", "여섯번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("7", "일곱번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("8", "여덟번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("9", "아홉번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("10", "열번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("11", "열한번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("12", "열두번째", "정주희", new ArrayList<>()));


        return externalDataList;
    }
}
