package com.laowang.sptest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("cpu like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("cpu not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(String value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(String value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(String value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(String value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(String value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLike(String value) {
            addCriterion("memory like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotLike(String value) {
            addCriterion("memory not like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<String> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<String> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(String value1, String value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(String value1, String value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andDisplaycardIsNull() {
            addCriterion("displayCard is null");
            return (Criteria) this;
        }

        public Criteria andDisplaycardIsNotNull() {
            addCriterion("displayCard is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaycardEqualTo(String value) {
            addCriterion("displayCard =", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardNotEqualTo(String value) {
            addCriterion("displayCard <>", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardGreaterThan(String value) {
            addCriterion("displayCard >", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardGreaterThanOrEqualTo(String value) {
            addCriterion("displayCard >=", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardLessThan(String value) {
            addCriterion("displayCard <", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardLessThanOrEqualTo(String value) {
            addCriterion("displayCard <=", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardLike(String value) {
            addCriterion("displayCard like", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardNotLike(String value) {
            addCriterion("displayCard not like", value, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardIn(List<String> values) {
            addCriterion("displayCard in", values, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardNotIn(List<String> values) {
            addCriterion("displayCard not in", values, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardBetween(String value1, String value2) {
            addCriterion("displayCard between", value1, value2, "displaycard");
            return (Criteria) this;
        }

        public Criteria andDisplaycardNotBetween(String value1, String value2) {
            addCriterion("displayCard not between", value1, value2, "displaycard");
            return (Criteria) this;
        }

        public Criteria andMainboardIsNull() {
            addCriterion("mainBoard is null");
            return (Criteria) this;
        }

        public Criteria andMainboardIsNotNull() {
            addCriterion("mainBoard is not null");
            return (Criteria) this;
        }

        public Criteria andMainboardEqualTo(String value) {
            addCriterion("mainBoard =", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotEqualTo(String value) {
            addCriterion("mainBoard <>", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardGreaterThan(String value) {
            addCriterion("mainBoard >", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardGreaterThanOrEqualTo(String value) {
            addCriterion("mainBoard >=", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLessThan(String value) {
            addCriterion("mainBoard <", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLessThanOrEqualTo(String value) {
            addCriterion("mainBoard <=", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLike(String value) {
            addCriterion("mainBoard like", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotLike(String value) {
            addCriterion("mainBoard not like", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardIn(List<String> values) {
            addCriterion("mainBoard in", values, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotIn(List<String> values) {
            addCriterion("mainBoard not in", values, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardBetween(String value1, String value2) {
            addCriterion("mainBoard between", value1, value2, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotBetween(String value1, String value2) {
            addCriterion("mainBoard not between", value1, value2, "mainboard");
            return (Criteria) this;
        }

        public Criteria andProductyearIsNull() {
            addCriterion("productYear is null");
            return (Criteria) this;
        }

        public Criteria andProductyearIsNotNull() {
            addCriterion("productYear is not null");
            return (Criteria) this;
        }

        public Criteria andProductyearEqualTo(String value) {
            addCriterion("productYear =", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearNotEqualTo(String value) {
            addCriterion("productYear <>", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearGreaterThan(String value) {
            addCriterion("productYear >", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearGreaterThanOrEqualTo(String value) {
            addCriterion("productYear >=", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearLessThan(String value) {
            addCriterion("productYear <", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearLessThanOrEqualTo(String value) {
            addCriterion("productYear <=", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearLike(String value) {
            addCriterion("productYear like", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearNotLike(String value) {
            addCriterion("productYear not like", value, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearIn(List<String> values) {
            addCriterion("productYear in", values, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearNotIn(List<String> values) {
            addCriterion("productYear not in", values, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearBetween(String value1, String value2) {
            addCriterion("productYear between", value1, value2, "productyear");
            return (Criteria) this;
        }

        public Criteria andProductyearNotBetween(String value1, String value2) {
            addCriterion("productYear not between", value1, value2, "productyear");
            return (Criteria) this;
        }

        public Criteria andMaxversionIsNull() {
            addCriterion("maxVersion is null");
            return (Criteria) this;
        }

        public Criteria andMaxversionIsNotNull() {
            addCriterion("maxVersion is not null");
            return (Criteria) this;
        }

        public Criteria andMaxversionEqualTo(String value) {
            addCriterion("maxVersion =", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionNotEqualTo(String value) {
            addCriterion("maxVersion <>", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionGreaterThan(String value) {
            addCriterion("maxVersion >", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionGreaterThanOrEqualTo(String value) {
            addCriterion("maxVersion >=", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionLessThan(String value) {
            addCriterion("maxVersion <", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionLessThanOrEqualTo(String value) {
            addCriterion("maxVersion <=", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionLike(String value) {
            addCriterion("maxVersion like", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionNotLike(String value) {
            addCriterion("maxVersion not like", value, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionIn(List<String> values) {
            addCriterion("maxVersion in", values, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionNotIn(List<String> values) {
            addCriterion("maxVersion not in", values, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionBetween(String value1, String value2) {
            addCriterion("maxVersion between", value1, value2, "maxversion");
            return (Criteria) this;
        }

        public Criteria andMaxversionNotBetween(String value1, String value2) {
            addCriterion("maxVersion not between", value1, value2, "maxversion");
            return (Criteria) this;
        }

        public Criteria andRayversionIsNull() {
            addCriterion("rayVersion is null");
            return (Criteria) this;
        }

        public Criteria andRayversionIsNotNull() {
            addCriterion("rayVersion is not null");
            return (Criteria) this;
        }

        public Criteria andRayversionEqualTo(String value) {
            addCriterion("rayVersion =", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionNotEqualTo(String value) {
            addCriterion("rayVersion <>", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionGreaterThan(String value) {
            addCriterion("rayVersion >", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionGreaterThanOrEqualTo(String value) {
            addCriterion("rayVersion >=", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionLessThan(String value) {
            addCriterion("rayVersion <", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionLessThanOrEqualTo(String value) {
            addCriterion("rayVersion <=", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionLike(String value) {
            addCriterion("rayVersion like", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionNotLike(String value) {
            addCriterion("rayVersion not like", value, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionIn(List<String> values) {
            addCriterion("rayVersion in", values, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionNotIn(List<String> values) {
            addCriterion("rayVersion not in", values, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionBetween(String value1, String value2) {
            addCriterion("rayVersion between", value1, value2, "rayversion");
            return (Criteria) this;
        }

        public Criteria andRayversionNotBetween(String value1, String value2) {
            addCriterion("rayVersion not between", value1, value2, "rayversion");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeIsNull() {
            addCriterion("maxRendererTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeIsNotNull() {
            addCriterion("maxRendererTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeEqualTo(Date value) {
            addCriterionForJDBCTime("maxRendererTime =", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("maxRendererTime <>", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeGreaterThan(Date value) {
            addCriterionForJDBCTime("maxRendererTime >", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maxRendererTime >=", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeLessThan(Date value) {
            addCriterionForJDBCTime("maxRendererTime <", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maxRendererTime <=", value, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeIn(List<Date> values) {
            addCriterionForJDBCTime("maxRendererTime in", values, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("maxRendererTime not in", values, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maxRendererTime between", value1, value2, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxrenderertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maxRendererTime not between", value1, value2, "maxrenderertime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeIsNull() {
            addCriterion("maxCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeIsNotNull() {
            addCriterion("maxCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeEqualTo(Date value) {
            addCriterionForJDBCTime("maxCreateTime =", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("maxCreateTime <>", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("maxCreateTime >", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maxCreateTime >=", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeLessThan(Date value) {
            addCriterionForJDBCTime("maxCreateTime <", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("maxCreateTime <=", value, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("maxCreateTime in", values, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("maxCreateTime not in", values, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maxCreateTime between", value1, value2, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andMaxcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("maxCreateTime not between", value1, value2, "maxcreatetime");
            return (Criteria) this;
        }

        public Criteria andAeversionIsNull() {
            addCriterion("aeVersion is null");
            return (Criteria) this;
        }

        public Criteria andAeversionIsNotNull() {
            addCriterion("aeVersion is not null");
            return (Criteria) this;
        }

        public Criteria andAeversionEqualTo(String value) {
            addCriterion("aeVersion =", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionNotEqualTo(String value) {
            addCriterion("aeVersion <>", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionGreaterThan(String value) {
            addCriterion("aeVersion >", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionGreaterThanOrEqualTo(String value) {
            addCriterion("aeVersion >=", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionLessThan(String value) {
            addCriterion("aeVersion <", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionLessThanOrEqualTo(String value) {
            addCriterion("aeVersion <=", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionLike(String value) {
            addCriterion("aeVersion like", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionNotLike(String value) {
            addCriterion("aeVersion not like", value, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionIn(List<String> values) {
            addCriterion("aeVersion in", values, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionNotIn(List<String> values) {
            addCriterion("aeVersion not in", values, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionBetween(String value1, String value2) {
            addCriterion("aeVersion between", value1, value2, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeversionNotBetween(String value1, String value2) {
            addCriterion("aeVersion not between", value1, value2, "aeversion");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeIsNull() {
            addCriterion("aeOutputTime is null");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeIsNotNull() {
            addCriterion("aeOutputTime is not null");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeEqualTo(Date value) {
            addCriterionForJDBCTime("aeOutputTime =", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("aeOutputTime <>", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("aeOutputTime >", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("aeOutputTime >=", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeLessThan(Date value) {
            addCriterionForJDBCTime("aeOutputTime <", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("aeOutputTime <=", value, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeIn(List<Date> values) {
            addCriterionForJDBCTime("aeOutputTime in", values, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("aeOutputTime not in", values, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("aeOutputTime between", value1, value2, "aeoutputtime");
            return (Criteria) this;
        }

        public Criteria andAeoutputtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("aeOutputTime not between", value1, value2, "aeoutputtime");
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