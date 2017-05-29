package foo.bar.pojo;

import java.util.Date;
import java.util.List;

public class Level1 {
    protected Integer pk;
    protected List<Level2> level2s;
    protected String name;
    protected Date createTime;

    public Level1(String name) {
    	this.name = name;
    	this.createTime = new Date();
    }
	
	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public List<Level2> getLevel2s() {
		return level2s;
	}

	public void setLevel2s(List<Level2> level2s) {
		this.level2s = level2s;
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
