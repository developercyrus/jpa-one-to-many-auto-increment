package foo.bar.pojo;

import java.util.Date;
import java.util.List;

public class Level2 {
	protected Integer pk;
	protected List<Level3> level3s;
	protected String name;
	protected Date createTime;

    public Level2(String name) {
    	this.name = name;
    	this.createTime = new Date();
    }
    
	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public List<Level3> getLevel3s() {
		return level3s;
	}

	public void setLevel2s(List<Level3> level3s) {
		this.level3s = level3s;
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
