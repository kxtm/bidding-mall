package cn.sx.ebj.bidding.mall.face.impl;

import cn.sx.ebj.bidding.mall.face.IMsgJobFace;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/25
 * {@code @description} 定时任务逻辑
 */

@Service("msgJobFace")
@Transactional
public class MsgJobFaceImpl implements IMsgJobFace {
    @Override
    public void getMsg() {

    }
}
