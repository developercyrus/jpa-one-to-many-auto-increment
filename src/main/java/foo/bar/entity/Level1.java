package foo.bar.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "LEVEL1")
public class Level1 {
	@Id
	@Column(name = "PK")    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "level1")
    private List<Level2> level2s;
    
	@Column(name = "NAME")
    private String name;

    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    
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
