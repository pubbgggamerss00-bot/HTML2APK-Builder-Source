package org.jf.dexlib2.writer.pool;

import java.util.List;
import java.util.Set;
import lc.e;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;

/* loaded from: classes3.dex */
class PoolMethod extends BaseMethodReference implements Method {
    public static final e<Method, PoolMethod> TRANSFORM = new e<Method, PoolMethod>() { // from class: org.jf.dexlib2.writer.pool.PoolMethod.1
        @Override // lc.e
        public PoolMethod apply(Method method) {
            return new PoolMethod(method);
        }
    };
    protected int annotationSetRefListOffset = 0;
    protected int codeItemOffset = 0;
    private final Method method;

    public PoolMethod(Method method) {
        this.method = method;
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.method.getAccessFlags();
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Annotatable
    public Set<? extends Annotation> getAnnotations() {
        return this.method.getAnnotations();
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.method.getDefiningClass();
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        return this.method.getHiddenApiRestrictions();
    }

    @Override // org.jf.dexlib2.iface.Method
    public MethodImplementation getImplementation() {
        return this.method.getImplementation();
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.method.getName();
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public List<? extends CharSequence> getParameterTypes() {
        return this.method.getParameterTypes();
    }

    @Override // org.jf.dexlib2.iface.Method
    public List<? extends MethodParameter> getParameters() {
        return this.method.getParameters();
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.method.getReturnType();
    }
}
