package org.jf.dexlib2.immutable;

import java.util.Set;
import nc.r;
import nc.v;
import org.jf.dexlib2.base.BaseMethodParameter;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableMethodParameter extends BaseMethodParameter {
    private static final ImmutableConverter<ImmutableMethodParameter, MethodParameter> CONVERTER = new ImmutableConverter<ImmutableMethodParameter, MethodParameter>() { // from class: org.jf.dexlib2.immutable.ImmutableMethodParameter.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(MethodParameter methodParameter) {
            return methodParameter instanceof ImmutableMethodParameter;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableMethodParameter makeImmutable(MethodParameter methodParameter) {
            return ImmutableMethodParameter.of(methodParameter);
        }
    };
    protected final v<? extends ImmutableAnnotation> annotations;
    protected final String name;
    protected final String type;

    public ImmutableMethodParameter(String str, Set<? extends Annotation> set, String str2) {
        this.type = str;
        this.annotations = ImmutableAnnotation.immutableSetOf(set);
        this.name = str2;
    }

    public static r<ImmutableMethodParameter> immutableListOf(Iterable<? extends MethodParameter> iterable) {
        return CONVERTER.toList(iterable);
    }

    public static ImmutableMethodParameter of(MethodParameter methodParameter) {
        return methodParameter instanceof ImmutableMethodParameter ? (ImmutableMethodParameter) methodParameter : new ImmutableMethodParameter(methodParameter.getType(), methodParameter.getAnnotations(), methodParameter.getName());
    }

    @Override // org.jf.dexlib2.iface.MethodParameter
    public Set<? extends Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.MethodParameter, org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.base.BaseMethodParameter, org.jf.dexlib2.iface.MethodParameter, org.jf.dexlib2.iface.debug.LocalInfo
    public String getSignature() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.type;
    }

    public ImmutableMethodParameter(String str, v<? extends ImmutableAnnotation> vVar, String str2) {
        this.type = str;
        this.annotations = ImmutableUtils.nullToEmptySet(vVar);
        this.name = str2;
    }
}
