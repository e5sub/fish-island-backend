package com.cong.fishisland.model.vo.game;

import lombok.Data;

import java.io.Serializable;

/**
 * Boss视图对象
 *
 * @author cong
 */
@Data
public class BossVO implements Serializable {

    /**
     * Boss ID
     */
    private Long id;

    /**
     * Boss名称
     */
    private String name;

    /**
     * Boss头像
     */
    private String avatar;

    /**
     * Boss血量
     */
    private Integer health;

    /**
     * 击杀Boss的奖励积分
     */
    private Integer rewardPoints;

    /**
     * Boss攻击力
     */
    private Integer attack;

    /**
     * 主动属性 - 暴击率
     */
    private Double critRate;

    /**
     * 主动属性 - 连击率
     */
    private Double comboRate;

    /**
     * 主动属性 - 闪避率
     */
    private Double dodgeRate;

    /**
     * 主动属性 - 格挡率
     */
    private Double blockRate;

    /**
     * 主动属性 - 吸血率
     */
    private Double lifesteal;

    /**
     * 抗性属性 - 抗暴击率
     */
    private Double critResistance;

    /**
     * 抗性属性 - 抗连击率
     */
    private Double comboResistance;

    /**
     * 抗性属性 - 抗闪避率
     */
    private Double dodgeResistance;

    /**
     * 抗性属性 - 抗格挡率
     */
    private Double blockResistance;

    /**
     * 抗性属性 - 抗吸血率
     */
    private Double lifestealResistance;

    private static final long serialVersionUID = 1L;
}





