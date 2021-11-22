package com.olx.service;

import com.olx.dto.Advertise;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface AdvertiseService {

    Advertise addAdvertisement(Advertise advertise,
                               String authToken);

    Advertise updateAdvertisement(int adId,
                                  Advertise advertise,
                                  String authToken);

    List<Advertise> getAdvertisementByUser(String authToken);

    Advertise getAdvertisementOfUserById(int adId, String authToken);

    @Transactional
    boolean deleteAdvertisementById(int adId, String authToken);

    List<Advertise> searchAdvertisementBySearchCriteria(
            String searchText,
            int category,
            String postedBy,
            String dateCondition,
            LocalDate onDate,
            LocalDate fromDate,
            LocalDate toDate,
            String sortBy,
            String sortOn,
            int startIndex,
            int records,
            int status
    );

    List<Advertise> searchAdvertisementBySearchText(String searchText);

    Advertise getAdvertisementById(int adId, String authToken);
}