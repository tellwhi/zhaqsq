package com.monster.zhaqsq.bean;

public class UserAndCom {
	
	
	
	
	
	
    public UserAndCom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAndCom(Integer uncId, Integer uId, Integer cId, UserBasic userBasic, CommunityBasic communityBasic) {
		super();
		this.uncId = uncId;
		this.uId = uId;
		this.cId = cId;
		this.userBasic = userBasic;
		this.communityBasic = communityBasic;
	}

	private Integer uncId;

    private Integer uId;

    private Integer cId;

    private UserBasic userBasic;
    
    private CommunityBasic communityBasic;

    public Integer getUncId() {
        return uncId;
    }

    public void setUncId(Integer uncId) {
        this.uncId = uncId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

	public UserBasic getUserBasic() {
		return userBasic;
	}

	public void setUserBasic(UserBasic userBasic) {
		this.userBasic = userBasic;
	}

	public CommunityBasic getCommunityBasic() {
		return communityBasic;
	}

	public void setCommunityBasic(CommunityBasic communityBasic) {
		this.communityBasic = communityBasic;
	}
}