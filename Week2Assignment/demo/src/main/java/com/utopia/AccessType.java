package com.utopia;

abstract class AccessType {

    abstract public String add();
    abstract public String update();
    abstract public String delete();
    public String read(){
        return "";
    }

    
}
