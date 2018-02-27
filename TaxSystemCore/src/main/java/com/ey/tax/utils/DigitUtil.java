package com.ey.tax.utils;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_EVEN;

/**
 * Created by zhuji on 2/6/2018.
 */
public final class DigitUtil {
    /**
     *
     * @param multiplicand 被乘数
     * @param multiplier 乘数
     * @return
     */
    public static BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier){
        return multiplicand.multiply(multiplier).setScale(8,ROUND_HALF_EVEN);
    }

    /**
     *
     * @param dividend 被除数
     * @param divider 除数
     * @return
     */
    public static BigDecimal divide(BigDecimal dividend,BigDecimal divider){
        return dividend.divide(divider,8,ROUND_HALF_EVEN);
    }

    /**
     *
     * @param subtrahend 被减数
     * @param minuend 减数
     * @return
     */
    public static BigDecimal subtract(BigDecimal subtrahend, BigDecimal minuend){
        return subtrahend.subtract(minuend).setScale(8,ROUND_HALF_EVEN);
    }

    /**
     *
     * @param addend 被加数
     * @param augend 加数
     * @return
     */
    public static BigDecimal add(BigDecimal addend, BigDecimal augend){
        return addend.add(augend).setScale(8,ROUND_HALF_EVEN);
    }
}
