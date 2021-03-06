package com.lawu.chick.repository.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EggDistributionRecordDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public EggDistributionRecordDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
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
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChicksIsNull() {
            addCriterion("chicks is null");
            return (Criteria) this;
        }

        public Criteria andChicksIsNotNull() {
            addCriterion("chicks is not null");
            return (Criteria) this;
        }

        public Criteria andChicksEqualTo(Long value) {
            addCriterion("chicks =", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksNotEqualTo(Long value) {
            addCriterion("chicks <>", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksGreaterThan(Long value) {
            addCriterion("chicks >", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksGreaterThanOrEqualTo(Long value) {
            addCriterion("chicks >=", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksLessThan(Long value) {
            addCriterion("chicks <", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksLessThanOrEqualTo(Long value) {
            addCriterion("chicks <=", value, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksIn(List<Long> values) {
            addCriterion("chicks in", values, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksNotIn(List<Long> values) {
            addCriterion("chicks not in", values, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksBetween(Long value1, Long value2) {
            addCriterion("chicks between", value1, value2, "chicks");
            return (Criteria) this;
        }

        public Criteria andChicksNotBetween(Long value1, Long value2) {
            addCriterion("chicks not between", value1, value2, "chicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksIsNull() {
            addCriterion("allocated_chicks is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksIsNotNull() {
            addCriterion("allocated_chicks is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksEqualTo(Long value) {
            addCriterion("allocated_chicks =", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksNotEqualTo(Long value) {
            addCriterion("allocated_chicks <>", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksGreaterThan(Long value) {
            addCriterion("allocated_chicks >", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksGreaterThanOrEqualTo(Long value) {
            addCriterion("allocated_chicks >=", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksLessThan(Long value) {
            addCriterion("allocated_chicks <", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksLessThanOrEqualTo(Long value) {
            addCriterion("allocated_chicks <=", value, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksIn(List<Long> values) {
            addCriterion("allocated_chicks in", values, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksNotIn(List<Long> values) {
            addCriterion("allocated_chicks not in", values, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksBetween(Long value1, Long value2) {
            addCriterion("allocated_chicks between", value1, value2, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andAllocatedChicksNotBetween(Long value1, Long value2) {
            addCriterion("allocated_chicks not between", value1, value2, "allocatedChicks");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsIsNull() {
            addCriterion("expected_allocations is null");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsIsNotNull() {
            addCriterion("expected_allocations is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsEqualTo(BigDecimal value) {
            addCriterion("expected_allocations =", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsNotEqualTo(BigDecimal value) {
            addCriterion("expected_allocations <>", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsGreaterThan(BigDecimal value) {
            addCriterion("expected_allocations >", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expected_allocations >=", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsLessThan(BigDecimal value) {
            addCriterion("expected_allocations <", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expected_allocations <=", value, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsIn(List<BigDecimal> values) {
            addCriterion("expected_allocations in", values, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsNotIn(List<BigDecimal> values) {
            addCriterion("expected_allocations not in", values, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expected_allocations between", value1, value2, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andExpectedAllocationsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expected_allocations not between", value1, value2, "expectedAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsIsNull() {
            addCriterion("real_allocations is null");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsIsNotNull() {
            addCriterion("real_allocations is not null");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsEqualTo(BigDecimal value) {
            addCriterion("real_allocations =", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsNotEqualTo(BigDecimal value) {
            addCriterion("real_allocations <>", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsGreaterThan(BigDecimal value) {
            addCriterion("real_allocations >", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_allocations >=", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsLessThan(BigDecimal value) {
            addCriterion("real_allocations <", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_allocations <=", value, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsIn(List<BigDecimal> values) {
            addCriterion("real_allocations in", values, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsNotIn(List<BigDecimal> values) {
            addCriterion("real_allocations not in", values, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_allocations between", value1, value2, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andRealAllocationsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_allocations not between", value1, value2, "realAllocations");
            return (Criteria) this;
        }

        public Criteria andGrantChicksIsNull() {
            addCriterion("grant_chicks is null");
            return (Criteria) this;
        }

        public Criteria andGrantChicksIsNotNull() {
            addCriterion("grant_chicks is not null");
            return (Criteria) this;
        }

        public Criteria andGrantChicksEqualTo(Long value) {
            addCriterion("grant_chicks =", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksNotEqualTo(Long value) {
            addCriterion("grant_chicks <>", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksGreaterThan(Long value) {
            addCriterion("grant_chicks >", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksGreaterThanOrEqualTo(Long value) {
            addCriterion("grant_chicks >=", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksLessThan(Long value) {
            addCriterion("grant_chicks <", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksLessThanOrEqualTo(Long value) {
            addCriterion("grant_chicks <=", value, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksIn(List<Long> values) {
            addCriterion("grant_chicks in", values, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksNotIn(List<Long> values) {
            addCriterion("grant_chicks not in", values, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksBetween(Long value1, Long value2) {
            addCriterion("grant_chicks between", value1, value2, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantChicksNotBetween(Long value1, Long value2) {
            addCriterion("grant_chicks not between", value1, value2, "grantChicks");
            return (Criteria) this;
        }

        public Criteria andGrantsIsNull() {
            addCriterion("grants is null");
            return (Criteria) this;
        }

        public Criteria andGrantsIsNotNull() {
            addCriterion("grants is not null");
            return (Criteria) this;
        }

        public Criteria andGrantsEqualTo(BigDecimal value) {
            addCriterion("grants =", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsNotEqualTo(BigDecimal value) {
            addCriterion("grants <>", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsGreaterThan(BigDecimal value) {
            addCriterion("grants >", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grants >=", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsLessThan(BigDecimal value) {
            addCriterion("grants <", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grants <=", value, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsIn(List<BigDecimal> values) {
            addCriterion("grants in", values, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsNotIn(List<BigDecimal> values) {
            addCriterion("grants not in", values, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grants between", value1, value2, "grants");
            return (Criteria) this;
        }

        public Criteria andGrantsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grants not between", value1, value2, "grants");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteIsNull() {
            addCriterion("gmt_allocations_complete is null");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteIsNotNull() {
            addCriterion("gmt_allocations_complete is not null");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteEqualTo(Date value) {
            addCriterion("gmt_allocations_complete =", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteNotEqualTo(Date value) {
            addCriterion("gmt_allocations_complete <>", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteGreaterThan(Date value) {
            addCriterion("gmt_allocations_complete >", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_allocations_complete >=", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteLessThan(Date value) {
            addCriterion("gmt_allocations_complete <", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteLessThanOrEqualTo(Date value) {
            addCriterion("gmt_allocations_complete <=", value, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteIn(List<Date> values) {
            addCriterion("gmt_allocations_complete in", values, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteNotIn(List<Date> values) {
            addCriterion("gmt_allocations_complete not in", values, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteBetween(Date value1, Date value2) {
            addCriterion("gmt_allocations_complete between", value1, value2, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtAllocationsCompleteNotBetween(Date value1, Date value2) {
            addCriterion("gmt_allocations_complete not between", value1, value2, "gmtAllocationsComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteIsNull() {
            addCriterion("gmt_grant_complete is null");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteIsNotNull() {
            addCriterion("gmt_grant_complete is not null");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteEqualTo(Date value) {
            addCriterion("gmt_grant_complete =", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteNotEqualTo(Date value) {
            addCriterion("gmt_grant_complete <>", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteGreaterThan(Date value) {
            addCriterion("gmt_grant_complete >", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_grant_complete >=", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteLessThan(Date value) {
            addCriterion("gmt_grant_complete <", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteLessThanOrEqualTo(Date value) {
            addCriterion("gmt_grant_complete <=", value, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteIn(List<Date> values) {
            addCriterion("gmt_grant_complete in", values, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteNotIn(List<Date> values) {
            addCriterion("gmt_grant_complete not in", values, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteBetween(Date value1, Date value2) {
            addCriterion("gmt_grant_complete between", value1, value2, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtGrantCompleteNotBetween(Date value1, Date value2) {
            addCriterion("gmt_grant_complete not between", value1, value2, "gmtGrantComplete");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table egg_distribution_record
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
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