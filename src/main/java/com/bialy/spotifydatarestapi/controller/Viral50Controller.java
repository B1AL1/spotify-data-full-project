package com.bialy.spotifydatarestapi.controller;

import com.bialy.spotifydatarestapi.model.Viral50;
import com.bialy.spotifydatarestapi.service.Viral50Service;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/viral50")
@AllArgsConstructor
public class Viral50Controller {
    private final Viral50Service viral50Service;

    @GetMapping
    public Page<Viral50> fetchAllViral50(@RequestParam(required = false) Integer page)
    {
        int pageNumber = page != null && page > 0 ? page : 1;
        return viral50Service.getAllViral50(pageNumber - 1);
    }

    @GetMapping("/{region}")
    public Page<Viral50> fetchAllViral50ByRegion(@PathVariable String region,
                                                 @RequestParam(required = false) Integer page,
                                                 @RequestParam(required = false) Sort.Direction sortDate,
                                                 @RequestParam(required = false) Sort.Direction sortRank)
    {
        int pageNumber = page != null && page > 0 ? page : 1;
        if(sortDate != null && sortRank != null) {
            return viral50Service.getAllViral50ByRegionSortByDateAndRank(region, pageNumber - 1, sortDate, sortRank);
        }
        else if(sortDate != null && sortRank == null)
        {
            return viral50Service.getAllViral50ByRegionSortByDate(region, pageNumber - 1, sortDate);
        }
        else if(sortDate == null && sortRank != null)
        {
            return viral50Service.getAllViral50ByRegionSortByRank(region, pageNumber - 1, sortRank);
        }
        else
            return viral50Service.getAllViral50ByRegion(region, pageNumber - 1);
    }
}
