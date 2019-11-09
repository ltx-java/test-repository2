package org.xxpay.dal.dao.model;
import java.io.Serializable;
import java.util.Date;

//创建实体类

public class AgentInfo implements Serializable {

    /**
     * 代理商ID
     *
     * @mbggenerated
     */
    private String agentId;

    /**
     * 代理商名称
     *
     * @mbggenerated
     */
    private String agentname;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
    public String getAgentName() {
        return agentname;
    }
    public void setAgentName(String agentname) {

        this.agentname = agentname;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agentId=").append(agentId);
        sb.append(", agentname=").append(agentname);
        sb.append(", createTime=").append(createTime);

        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AgentInfo other = (AgentInfo) that;
        return (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
                && (this.getAgentName() == null ? other.getAgentName() == null : this.getAgentName().equals(other.getAgentName()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

}
