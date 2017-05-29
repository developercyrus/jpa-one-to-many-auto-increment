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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "LEVEL2")
public class Level2 {
	@Id
	@Column(name = "PK")  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "level2")
    private List<Level3> level3s;
	
	@Column(name = "NAME")
    private String name;

    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    
    @JoinColumn(name = "LEVEL1_PK", referencedColumnName="PK")
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)  
	private Level1 level1;


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
	
	public void setLevel1(Level1 level1) {
		this.level1 = level1;
	}
}
