package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentInfoExample implements Serializable {

    //最下面的代码拿到上面来，找不到Criteria类。
    public static class Criteria extends GeneratedCriteria implements Serializable {
        protected Criteria() {
            super();
        }
    }


    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public AgentInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AgentId is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AgentId is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("AgentId =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("AgentId <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("AgentId >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("AgentId >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("AgentId <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("AgentId <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("AgentId like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("AgentId not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("AgentId in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("AgentId not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("AgentId between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("AgentId not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("AgentName is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("AgentName is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("AgentName =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("AgentName <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("AgentName >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("AgentName >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("AgentName <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("AgentName <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("AgentName like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("AgentName not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("AgentName in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("AgentName not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("AgentName between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("AgentName not between", value1, value2, "agentname");
            return (Criteria) this;
        }
        /*
        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andReqKeyIsNull() {
            addCriterion("ReqKey is null");
            return (Criteria) this;
        }

        public Criteria andReqKeyIsNotNull() {
            addCriterion("ReqKey is not null");
            return (Criteria) this;
        }

        public Criteria andReqKeyEqualTo(String value) {
            addCriterion("ReqKey =", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotEqualTo(String value) {
            addCriterion("ReqKey <>", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyGreaterThan(String value) {
            addCriterion("ReqKey >", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ReqKey >=", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLessThan(String value) {
            addCriterion("ReqKey <", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLessThanOrEqualTo(String value) {
            addCriterion("ReqKey <=", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLike(String value) {
            addCriterion("ReqKey like", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotLike(String value) {
            addCriterion("ReqKey not like", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyIn(List<String> values) {
            addCriterion("ReqKey in", values, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotIn(List<String> values) {
            addCriterion("ReqKey not in", values, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyBetween(String value1, String value2) {
            addCriterion("ReqKey between", value1, value2, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotBetween(String value1, String value2) {
            addCriterion("ReqKey not between", value1, value2, "reqKey");
            return (Criteria) this;
        }

        public Criteria andResKeyIsNull() {
            addCriterion("ResKey is null");
            return (Criteria) this;
        }

        public Criteria andResKeyIsNotNull() {
            addCriterion("ResKey is not null");
            return (Criteria) this;
        }

        public Criteria andResKeyEqualTo(String value) {
            addCriterion("ResKey =", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotEqualTo(String value) {
            addCriterion("ResKey <>", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyGreaterThan(String value) {
            addCriterion("ResKey >", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ResKey >=", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLessThan(String value) {
            addCriterion("ResKey <", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLessThanOrEqualTo(String value) {
            addCriterion("ResKey <=", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLike(String value) {
            addCriterion("ResKey like", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotLike(String value) {
            addCriterion("ResKey not like", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyIn(List<String> values) {
            addCriterion("ResKey in", values, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotIn(List<String> values) {
            addCriterion("ResKey not in", values, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyBetween(String value1, String value2) {
            addCriterion("ResKey between", value1, value2, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotBetween(String value1, String value2) {
            addCriterion("ResKey not between", value1, value2, "resKey");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        */

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /*
        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

     */
       /*
        public static class Criteria extends GeneratedCriteria implements Serializable {

            protected Criteria() {
                super();
            }
        }
          */
        public static class Criterion implements Serializable {
            private String condition;

            private Object value;

            private Object secondValue;

            private boolean noValue;

            private boolean singleValue;

            private boolean betweenValue;

            private boolean listValue;

            private String typeHandler;

            public String getCondition() {
                return condition;
            }

            public Object getValue() {
                return value;
            }

            public Object getSecondValue() {
                return secondValue;
            }

            public boolean isNoValue() {
                return noValue;
            }

            public boolean isSingleValue() {
                return singleValue;
            }

            public boolean isBetweenValue() {
                return betweenValue;
            }

            public boolean isListValue() {
                return listValue;
            }

            public String getTypeHandler() {
                return typeHandler;
            }

            protected Criterion(String condition) {
                super();
                this.condition = condition;
                this.typeHandler = null;
                this.noValue = true;
            }

            protected Criterion(String condition, Object value, String typeHandler) {
                super();
                this.condition = condition;
                this.value = value;
                this.typeHandler = typeHandler;
                if (value instanceof List<?>) {
                    this.listValue = true;
                } else {
                    this.singleValue = true;
                }
            }

            protected Criterion(String condition, Object value) {
                this(condition, value, null);
            }

            protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
                super();
                this.condition = condition;
                this.value = value;
                this.secondValue = secondValue;
                this.typeHandler = typeHandler;
                this.betweenValue = true;
            }

            protected Criterion(String condition, Object value, Object secondValue) {
                this(condition, value, secondValue, null);
            }
        }
    }
}



