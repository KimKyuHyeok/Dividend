package com.sideproject.Dividend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ScrapeResult {

    private Company company;

    private List<Dividend> dividendEntities;

    private ScrapeResult() {
        this.dividendEntities = new ArrayList<>();
    }
}
