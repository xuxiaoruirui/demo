package gpstudy.strategy.test.factory;

import lombok.Data;

import java.util.Arrays;
import java.util.Optional;

@Data
public class MerchantJoin {
    private String storeName;

    public static void main(String[] args) {
        System.out.println();
        Arrays.asList(MerchantJoin.class.getDeclaredFields()).stream()
                .forEach(declaredField-> Optional.ofNullable(declaredField.getName())
                        .orElseThrow(()->
                                new RuntimeException(declaredField.getName())));

    }
    void checkParam(MerchantJoin merchantJoin){
        Arrays.asList(MerchantJoin.class.getDeclaredFields()).stream()

                .forEach(declaredField-> Optional.ofNullable(declaredField.getName())
                        .orElseThrow(()->
                                new RuntimeException(declaredField.getName())));

    }
}