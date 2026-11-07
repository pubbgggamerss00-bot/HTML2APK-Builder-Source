package org.jf.dexlib2.immutable;

import java.util.Set;
import java.util.SortedSet;
import nc.n0;
import nc.r;
import nc.v;
import nc.w0;
import nc.y;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableMethod extends BaseMethodReference implements Method {
    private static final ImmutableConverter<ImmutableMethod, Method> CONVERTER = new ImmutableConverter<ImmutableMethod, Method>() { // from class: org.jf.dexlib2.immutable.ImmutableMethod.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(Method method) {
            return method instanceof ImmutableMethod;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableMethod makeImmutable(Method method) {
            return ImmutableMethod.of(method);
        }
    };
    protected final int accessFlags;
    protected final v<? extends ImmutableAnnotation> annotations;
    protected final String definingClass;
    protected final v<HiddenApiRestriction> hiddenApiRestrictions;
    protected final ImmutableMethodImplementation methodImplementation;
    protected final String name;
    protected final r<? extends ImmutableMethodParameter> parameters;
    protected final String returnType;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImmutableMethod(String str, String str2, Iterable<? extends MethodParameter> iterable, String str3, int i10, Set<? extends Annotation> set, Set<HiddenApiRestriction> set2, MethodImplementation methodImplementation) {
        v<HiddenApiRestriction> vVarJ;
        this.definingClass = str;
        this.name = str2;
        this.parameters = ImmutableMethodParameter.immutableListOf(iterable);
        this.returnType = str3;
        this.accessFlags = i10;
        this.annotations = ImmutableAnnotation.immutableSetOf(set);
        if (set2 == null) {
            int i11 = v.f18759c;
            vVarJ = w0.f18781j;
        } else {
            Set<HiddenApiRestriction> set3 = set2;
            int i12 = v.f18759c;
            if (!(set3 instanceof v) || (set3 instanceof SortedSet)) {
                Object[] array = set3.toArray();
                vVarJ = v.j(array.length, array);
            } else {
                vVarJ = (v) set3;
                if (vVarJ.f()) {
                }
            }
        }
        this.hiddenApiRestrictions = vVarJ;
        this.methodImplementation = ImmutableMethodImplementation.of(methodImplementation);
    }

    public static y<ImmutableMethod> immutableSetOf(Iterable<? extends Method> iterable) {
        return CONVERTER.toSortedSet(n0.f18723a, iterable);
    }

    public static ImmutableMethod of(Method method) {
        return method instanceof ImmutableMethod ? (ImmutableMethod) method : new ImmutableMethod(method.getDefiningClass(), method.getName(), method.getParameters(), method.getReturnType(), method.getAccessFlags(), method.getAnnotations(), method.getHiddenApiRestrictions(), method.getImplementation());
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass;
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        return this.hiddenApiRestrictions;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.returnType;
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Annotatable
    public v<? extends ImmutableAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.Method
    public ImmutableMethodImplementation getImplementation() {
        return this.methodImplementation;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public r<? extends CharSequence> getParameterTypes() {
        return this.parameters;
    }

    @Override // org.jf.dexlib2.iface.Method
    public r<? extends ImmutableMethodParameter> getParameters() {
        return this.parameters;
    }

    public ImmutableMethod(String str, String str2, r<? extends ImmutableMethodParameter> rVar, String str3, int i10, v<? extends ImmutableAnnotation> vVar, v<HiddenApiRestriction> vVar2, ImmutableMethodImplementation immutableMethodImplementation) {
        this.definingClass = str;
        this.name = str2;
        this.parameters = ImmutableUtils.nullToEmptyList(rVar);
        this.returnType = str3;
        this.accessFlags = i10;
        this.annotations = ImmutableUtils.nullToEmptySet(vVar);
        this.hiddenApiRestrictions = ImmutableUtils.nullToEmptySet(vVar2);
        this.methodImplementation = immutableMethodImplementation;
    }
}
