package com.talent.entity;

import java.util.ArrayList;
import java.util.List;

public class moneyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public moneyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money
     *
     * @mbggenerated
     */
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

        public Criteria andMidIsNull() {
            addCriterion("Mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("Mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("Mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("Mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("Mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("Mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("Mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("Mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("Mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("Mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("Mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("Tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("Tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("Tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("Tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("Tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("Tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("Tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("Tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("Tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("Tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("Tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("Bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("Bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("Bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("Bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("Bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("Bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("Bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("Bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("Bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("Bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("Bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("Mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("Mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(String value) {
            addCriterion("Mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(String value) {
            addCriterion("Mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(String value) {
            addCriterion("Mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(String value) {
            addCriterion("Mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(String value) {
            addCriterion("Mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLike(String value) {
            addCriterion("Mtime like", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotLike(String value) {
            addCriterion("Mtime not like", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<String> values) {
            addCriterion("Mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<String> values) {
            addCriterion("Mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(String value1, String value2) {
            addCriterion("Mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(String value1, String value2) {
            addCriterion("Mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMmoneyIsNull() {
            addCriterion("Mmoney is null");
            return (Criteria) this;
        }

        public Criteria andMmoneyIsNotNull() {
            addCriterion("Mmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMmoneyEqualTo(String value) {
            addCriterion("Mmoney =", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotEqualTo(String value) {
            addCriterion("Mmoney <>", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThan(String value) {
            addCriterion("Mmoney >", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("Mmoney >=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThan(String value) {
            addCriterion("Mmoney <", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThanOrEqualTo(String value) {
            addCriterion("Mmoney <=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLike(String value) {
            addCriterion("Mmoney like", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotLike(String value) {
            addCriterion("Mmoney not like", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyIn(List<String> values) {
            addCriterion("Mmoney in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotIn(List<String> values) {
            addCriterion("Mmoney not in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyBetween(String value1, String value2) {
            addCriterion("Mmoney between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotBetween(String value1, String value2) {
            addCriterion("Mmoney not between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMotherIsNull() {
            addCriterion("Mother is null");
            return (Criteria) this;
        }

        public Criteria andMotherIsNotNull() {
            addCriterion("Mother is not null");
            return (Criteria) this;
        }

        public Criteria andMotherEqualTo(String value) {
            addCriterion("Mother =", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotEqualTo(String value) {
            addCriterion("Mother <>", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThan(String value) {
            addCriterion("Mother >", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherGreaterThanOrEqualTo(String value) {
            addCriterion("Mother >=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThan(String value) {
            addCriterion("Mother <", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLessThanOrEqualTo(String value) {
            addCriterion("Mother <=", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherLike(String value) {
            addCriterion("Mother like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotLike(String value) {
            addCriterion("Mother not like", value, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherIn(List<String> values) {
            addCriterion("Mother in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotIn(List<String> values) {
            addCriterion("Mother not in", values, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherBetween(String value1, String value2) {
            addCriterion("Mother between", value1, value2, "mother");
            return (Criteria) this;
        }

        public Criteria andMotherNotBetween(String value1, String value2) {
            addCriterion("Mother not between", value1, value2, "mother");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money
     *
     * @mbggenerated
     */
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