package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor // 自动生成带参数构造函数
@NoArgsConstructor  // 自动生成无参构造函数
public class XpResult {
    private int oldLevel;
    private int newLevel;
    private int addedXp;
    private boolean levelUp; // boolean 类型的 getter 习惯用 isLevelUp()

    public boolean isLevelUp() {
        return levelUp;
    }

    public int getOldLevel() {
        return oldLevel;
    }

    public void setOldLevel(int oldLevel) {
        this.oldLevel = oldLevel;
    }

    public int getNewLevel() {
        return newLevel;
    }

    public void setNewLevel(int newLevel) {
        this.newLevel = newLevel;
    }

    public int getAddedXp() {
        return addedXp;
    }

    public void setAddedXp(int addedXp) {
        this.addedXp = addedXp;
    }

    public void setLevelUp(boolean levelUp) {
        this.levelUp = levelUp;
    }
}