package com.device.model;

import java.util.Date;

public class GameRunRecord {
    /**
     * 
     */
    private Integer id;

    /**
     * 游戏id
     */
    private Integer gameId;

    /**
     * 游戏编码
     */
    private String gameCode;

    /**
     * 运行时长(单位：分钟)
     */
    private Double runTime;

    /**
     * 是否已经同步到服务端
     */
    private String isSync;

    /**
     * 创建日期
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public Double getRunTime() {
        return runTime;
    }

    public void setRunTime(Double runTime) {
        this.runTime = runTime;
    }

    public String getIsSync() {
        return isSync;
    }

    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public GameRunRecord(Integer id, Integer gameId, String gameCode,
			Double runTime, String isSync, Date createTime) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gameCode = gameCode;
		this.runTime = runTime;
		this.isSync = isSync;
		this.createTime = createTime;
	}

	public GameRunRecord() {
		super();
	}
    
}