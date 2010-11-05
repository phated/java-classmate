package com.fasterxml.classmate;

import java.util.*;

public class ResolvedInterface extends ResolvedType
{
    /**
     * List of interfaces this type implements; may be empty but never null
     */
    protected final List<ResolvedType> _superInterfaces;

    /*
    /**********************************************************************
    /* Life cycle
    /**********************************************************************
     */

    public ResolvedInterface(Class<?> erased, TypeBindings bindings,
            List<ResolvedType> superInterfaces)
    {
        super(erased, bindings);
        _superInterfaces = superInterfaces;
    }

    /*
    /**********************************************************************
    /* Accessors for related types
    /**********************************************************************
     */
    
    public ResolvedType getParentClass() {
        // interfaces do not have parent class, just interfaces
        return null;
    }

    @Override
    public List<ResolvedType> getImplementedInterfaces() {
        return _superInterfaces;
    }
    
    @Override
    public ResolvedType getArrayElementType() {
        // interfaces are never arrays, so:
        return null;
    }

    /*
    /**********************************************************************
    /* Simple property accessors
    /**********************************************************************
     */

    @Override
    public boolean isInterface() { return true; }

    @Override
    public boolean isConcrete() { return false; }

    @Override
    public boolean isArray() { return false; }

    @Override
    public boolean isPrimitive() { return false; }
}


