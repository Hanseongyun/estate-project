package com.estate.back.repository.resultSet;

public interface GetRatioDataResultSet {

    String getYearMonth();

    Double getReturn40();
    Double getReturn4060();
    Double getReturn6085();
    Double getReturn85();

    Double getLeaseRatio40();
    Double getLeaseRatio4060();
    Double getLeaseRatio6085();
    Double getLeaseRatio85();

    Double getmonthRentRatio40();
    Double getmonthRentRatio4060();
    Double getmonthRentRatio6085();
    Double getmonthRentRatio85();
}
