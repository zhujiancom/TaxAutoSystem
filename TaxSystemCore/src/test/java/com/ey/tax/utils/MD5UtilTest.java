package com.ey.tax.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by zhuji on 2/9/2018.
 */
public class MD5UtilTest {
    @Test
    public void testEncode(){
        String value = MD5Util.encode("abcd1234");
        System.out.println(value);
//        assertThat(value).isEqualTo("5f4dcc3b5aa765d61d8327deb882cf99");
    }
}
