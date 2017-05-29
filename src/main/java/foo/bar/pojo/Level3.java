package foo.bar.pojo;

import java.util.Date;

public class Level3 {
	protected Integer pk;
    protected String name;
    protected Date createTime;

    public Level3(String name) {
    	this.name = name;
    	this.createTime = new Date();
    }
	
	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
