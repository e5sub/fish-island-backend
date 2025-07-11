package com.cong.fishisland.model.dto.game;

import lombok.Data;

import java.io.Serializable;

/**
 * 你画我猜游戏绘画数据保存请求
 *
 * @author cong
 */
@Data
public class DrawDataSaveRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间ID
     */
    private String roomId;

    /**
     * 绘画数据 (Base64编码)
     */
    private String drawData;
} 