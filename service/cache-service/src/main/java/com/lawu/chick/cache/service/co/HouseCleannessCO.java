package com.lawu.chick.cache.service.co;

import java.io.Serializable;

/**
 * @author meishuquan
 * @date 2018/6/1.
 */
public class HouseCleannessCO implements Serializable {

    private static final long serialVersionUID = -7791111079776835455L;

    private Integer houseCleanness;

    private Integer attenuationJoyfulVal;

    private Integer attenuationTimes;

    public Integer getHouseCleanness() {
        return houseCleanness;
    }

    public void setHouseCleanness(Integer houseCleanness) {
        this.houseCleanness = houseCleanness;
    }

    public Integer getAttenuationJoyfulVal() {
        return attenuationJoyfulVal;
    }

    public void setAttenuationJoyfulVal(Integer attenuationJoyfulVal) {
        this.attenuationJoyfulVal = attenuationJoyfulVal;
    }

    public Integer getAttenuationTimes() {
        return attenuationTimes;
    }

    public void setAttenuationTimes(Integer attenuationTimes) {
        this.attenuationTimes = attenuationTimes;
    }
}
