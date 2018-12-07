package cn.bywind.boot.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bywind
 * @since 2018-12-04
 */
public class Bluetooth implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String target;
    private String thismeasurement;
    private String lastmeasurement;
    private String referencerange;
    private String company;
    private Date dates;
    private String targetcode;
    private String usernmae;
    private String state;
    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getThismeasurement() {
        return thismeasurement;
    }

    public void setThismeasurement(String thismeasurement) {
        this.thismeasurement = thismeasurement;
    }

    public String getLastmeasurement() {
        return lastmeasurement;
    }

    public void setLastmeasurement(String lastmeasurement) {
        this.lastmeasurement = lastmeasurement;
    }

    public String getReferencerange() {
        return referencerange;
    }

    public void setReferencerange(String referencerange) {
        this.referencerange = referencerange;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getTargetcode() {
        return targetcode;
    }

    public void setTargetcode(String targetcode) {
        this.targetcode = targetcode;
    }

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bluetooth{" +
        ", id=" + id +
        ", target=" + target +
        ", thismeasurement=" + thismeasurement +
        ", lastmeasurement=" + lastmeasurement +
        ", referencerange=" + referencerange +
        ", company=" + company +
        ", dates=" + dates +
        ", targetcode=" + targetcode +
        ", usernmae=" + usernmae +
        ", state=" + state +
        ", type=" + type +
        "}";
    }
}
