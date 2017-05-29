package foo.bar.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "LEVEL3")
public class Level3 {
	@Id
	@Column(name = "PK")    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;
	
	@Column(name = "NAME")
    private String name;

    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    
    @JoinColumn(name = "LEVEL2_PK", referencedColumnName="PK")
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)  
	private Level2 level2;
	

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
	
	public void setLevel2(Level2 level2) {
		this.level2 = level2;
	}
}
