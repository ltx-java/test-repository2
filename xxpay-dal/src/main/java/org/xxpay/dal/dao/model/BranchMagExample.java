package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BranchMagExample implements Serializable {

    protected String orderByClause;

    protected boolean distinct;

    protected List<BranchMagExample.Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public BranchMagExample() {
        oredCriteria = new ArrayList<BranchMagExample.Criteria>();
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

    public List<BranchMagExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(BranchMagExample.Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public BranchMagExample.Criteria or() {
        BranchMagExample.Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public BranchMagExample.Criteria createCriteria() {
        BranchMagExample.Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected BranchMagExample.Criteria createCriteriaInternal() {
        BranchMagExample.Criteria criteria = new BranchMagExample.Criteria();
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
        protected List<BranchMagExample.Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<BranchMagExample.Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<BranchMagExample.Criterion> getAllCriteria() {
            return criteria;
        }

        public List<BranchMagExample.Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new BranchMagExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new BranchMagExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new BranchMagExample.Criterion(condition, value1, value2));
        }

        public BranchMagExample.Criteria andBranchIdIsNull() {
            addCriterion("BranchId is null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdIsNotNull() {
            addCriterion("BranchId is not null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdEqualTo(String value) {
            addCriterion("BranchId =", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BranchId <>", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BranchId >", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BranchId >=", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdLessThan(String value) {
            addCriterion("BranchId <", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BranchId <=", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdLike(String value) {
            addCriterion("BranchId like", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdNotLike(String value) {
            addCriterion("BranchId not like", value, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdIn(List<String> values) {
            addCriterion("BranchId in", values, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BranchId not in", values, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BranchId between", value1, value2, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BranchId not between", value1, value2, "BranchId");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateIsNull() {
            addCriterion("State is null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateEqualTo(Byte value) {
            addCriterion("State =", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateNotEqualTo(Byte value) {
            addCriterion("State <>", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateGreaterThan(Byte value) {
            addCriterion("State >", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("State >=", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateLessThan(Byte value) {
            addCriterion("State <", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("State <=", value, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateIn(List<Byte> values) {
            addCriterion("State in", values, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateNotIn(List<Byte> values) {
            addCriterion("State not in", values, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("State between", value1, value2, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("State not between", value1, value2, "state");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (BranchMagExample.Criteria) this;
        }

        public BranchMagExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (BranchMagExample.Criteria) this;
        }
    }

    public static class Criteria extends BranchMagExample.GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

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
