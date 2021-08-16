package gpstudy.collect;

import lombok.Data;

@Data
public class Order {
    private Integer orderType;

    /**
     * 店铺id
     */
    private String storeId;

    private Integer comeFrom;//商品来源。1是shopNc
}
