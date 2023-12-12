package com.example.adminapi.domain;

import java.util.ArrayList;
import java.util.List;

public class ExternalDataProvider {

    private static List<ExternalData> externalDataList = new ArrayList<>();

    static {
        externalDataList.add(new ExternalData("1", "첫번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("2", "두번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("3", "세번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("4", "네번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("5", "다섯 번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("6", "여섯 번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("7", "일곱 번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("8", "여덟 번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("9", "아홉 번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("10", "열번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("11", "열 한번째", "정주희", new ArrayList<>()));
        externalDataList.add(new ExternalData("12", "열 두번째", "정주희", new ArrayList<>()));
    }

    public static List<ExternalData> getExternalData() {
        return externalDataList;
    }

    public static ExternalData getExternalDataById(String id) {
        return externalDataList.stream()
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
