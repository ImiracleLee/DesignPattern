package observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paraTypes;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    private void contractParamTypes(Object[] params) {
        this.paraTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paraTypes[i] = params[i].getClass();
        }
    }

    public void invoke() {
        try {
            Method method = object.getClass().getMethod(this.getMethodName(), this.getParaTypes());
            if (method == null) {
                return;
            }
            method.invoke(this.getObject(), this.getParams());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParaTypes() {
        return paraTypes;
    }

    public void setParaTypes(Class[] paraTypes) {
        this.paraTypes = paraTypes;
    }
}
