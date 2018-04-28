package com.bcgm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BloodpressureTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloodpressureTestExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andBfcdateIsNull() {
            addCriterion("bfcdate is null");
            return (Criteria) this;
        }

        public Criteria andBfcdateIsNotNull() {
            addCriterion("bfcdate is not null");
            return (Criteria) this;
        }

        public Criteria andBfcdateEqualTo(Date value) {
            addCriterion("bfcdate =", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateNotEqualTo(Date value) {
            addCriterion("bfcdate <>", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateGreaterThan(Date value) {
            addCriterion("bfcdate >", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("bfcdate >=", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateLessThan(Date value) {
            addCriterion("bfcdate <", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateLessThanOrEqualTo(Date value) {
            addCriterion("bfcdate <=", value, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateIn(List<Date> values) {
            addCriterion("bfcdate in", values, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateNotIn(List<Date> values) {
            addCriterion("bfcdate not in", values, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateBetween(Date value1, Date value2) {
            addCriterion("bfcdate between", value1, value2, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andBfcdateNotBetween(Date value1, Date value2) {
            addCriterion("bfcdate not between", value1, value2, "bfcdate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultIsNull() {
            addCriterion("bloodpressure_result is null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultIsNotNull() {
            addCriterion("bloodpressure_result is not null");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultEqualTo(String value) {
            addCriterion("bloodpressure_result =", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultNotEqualTo(String value) {
            addCriterion("bloodpressure_result <>", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultGreaterThan(String value) {
            addCriterion("bloodpressure_result >", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultGreaterThanOrEqualTo(String value) {
            addCriterion("bloodpressure_result >=", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultLessThan(String value) {
            addCriterion("bloodpressure_result <", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultLessThanOrEqualTo(String value) {
            addCriterion("bloodpressure_result <=", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultLike(String value) {
            addCriterion("bloodpressure_result like", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultNotLike(String value) {
            addCriterion("bloodpressure_result not like", value, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultIn(List<String> values) {
            addCriterion("bloodpressure_result in", values, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultNotIn(List<String> values) {
            addCriterion("bloodpressure_result not in", values, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultBetween(String value1, String value2) {
            addCriterion("bloodpressure_result between", value1, value2, "bloodpressureResult");
            return (Criteria) this;
        }

        public Criteria andBloodpressureResultNotBetween(String value1, String value2) {
            addCriterion("bloodpressure_result not between", value1, value2, "bloodpressureResult");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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