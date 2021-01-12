package com.jesper.seckill.util;

import java.util.UUID;

/**
 * Created by jiangyunxiong on 2018/5/22.
 * <p>
 * 唯一id生成类
 */
public class UUIDUtil {

    /**
     * uuid生成全球唯一id，本地生成，没有网络开销，效率高；缺点长度较长，没有递增趋势性，不易维护，常用于生成token令牌。
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
