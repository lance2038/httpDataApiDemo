package com.lance.common.base.dao.hibernate;

import java.io.Serializable;

public class Condition implements Serializable
{
    private static final long serialVersionUID = 1L;
    protected String field;

    public String getField()
    {
        return field;
    }

}