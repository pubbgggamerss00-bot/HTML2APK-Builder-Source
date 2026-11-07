package org.jf.dexlib2.immutable;

import i0.u2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import nc.j0;
import nc.r;
import nc.u0;
import nc.v;
import nc.y;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.util.FieldUtil;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.util.ImmutableConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableClassDef extends BaseTypeReference implements ClassDef {
    private static final ImmutableConverter<ImmutableClassDef, ClassDef> CONVERTER = new ImmutableConverter<ImmutableClassDef, ClassDef>() { // from class: org.jf.dexlib2.immutable.ImmutableClassDef.3
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(ClassDef classDef) {
            return classDef instanceof ImmutableClassDef;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableClassDef makeImmutable(ClassDef classDef) {
            return ImmutableClassDef.of(classDef);
        }
    };
    protected final int accessFlags;
    protected final v<? extends ImmutableAnnotation> annotations;
    protected final y<? extends ImmutableMethod> directMethods;
    protected final y<? extends ImmutableField> instanceFields;
    protected final r<String> interfaces;
    protected final String sourceFile;
    protected final y<? extends ImmutableField> staticFields;
    protected final String superclass;
    protected final String type;
    protected final y<? extends ImmutableMethod> virtualMethods;

    public ImmutableClassDef(String str, int i10, String str2, Collection<String> collection, String str3, Collection<? extends Annotation> collection2, Iterable<? extends Field> iterable, Iterable<? extends Method> iterable2) {
        r<String> rVarK;
        if (iterable == null) {
            r.a aVar = r.f18735b;
            iterable = u0.f18756e;
        }
        if (iterable2 == null) {
            r.a aVar2 = r.f18735b;
            iterable2 = u0.f18756e;
        }
        this.type = str;
        this.accessFlags = i10;
        this.superclass = str2;
        if (collection == null) {
            r.a aVar3 = r.f18735b;
            rVarK = u0.f18756e;
        } else {
            rVarK = r.k(collection);
        }
        this.interfaces = rVarK;
        this.sourceFile = str3;
        this.annotations = ImmutableAnnotation.immutableSetOf(collection2);
        this.staticFields = ImmutableField.immutableSetOf(u2.f(iterable, FieldUtil.FIELD_IS_STATIC));
        this.instanceFields = ImmutableField.immutableSetOf(u2.f(iterable, FieldUtil.FIELD_IS_INSTANCE));
        this.directMethods = ImmutableMethod.immutableSetOf(u2.f(iterable2, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableMethod.immutableSetOf(u2.f(iterable2, MethodUtil.METHOD_IS_VIRTUAL));
    }

    public static v<ImmutableClassDef> immutableSetOf(Iterable<? extends ClassDef> iterable) {
        return CONVERTER.toSet(iterable);
    }

    public static ImmutableClassDef of(ClassDef classDef) {
        return classDef instanceof ImmutableClassDef ? (ImmutableClassDef) classDef : new ImmutableClassDef(classDef.getType(), classDef.getAccessFlags(), classDef.getSuperclass(), classDef.getInterfaces(), classDef.getSourceFile(), classDef.getAnnotations(), classDef.getStaticFields(), classDef.getInstanceFields(), classDef.getDirectMethods(), classDef.getVirtualMethods());
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSourceFile() {
        return this.sourceFile;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSuperclass() {
        return this.superclass;
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.type;
    }

    @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
    public v<? extends ImmutableAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public v<? extends ImmutableMethod> getDirectMethods() {
        return this.directMethods;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<? extends ImmutableField> getFields() {
        return new AbstractCollection<ImmutableField>() { // from class: org.jf.dexlib2.immutable.ImmutableClassDef.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<ImmutableField> iterator() {
                return j0.b(ImmutableClassDef.this.staticFields.iterator(), ImmutableClassDef.this.instanceFields.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return ImmutableClassDef.this.instanceFields.size() + ImmutableClassDef.this.staticFields.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public v<? extends ImmutableField> getInstanceFields() {
        return this.instanceFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public r<String> getInterfaces() {
        return this.interfaces;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<? extends ImmutableMethod> getMethods() {
        return new AbstractCollection<ImmutableMethod>() { // from class: org.jf.dexlib2.immutable.ImmutableClassDef.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<ImmutableMethod> iterator() {
                return j0.b(ImmutableClassDef.this.directMethods.iterator(), ImmutableClassDef.this.virtualMethods.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return ImmutableClassDef.this.virtualMethods.size() + ImmutableClassDef.this.directMethods.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public v<? extends ImmutableField> getStaticFields() {
        return this.staticFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public v<? extends ImmutableMethod> getVirtualMethods() {
        return this.virtualMethods;
    }

    public ImmutableClassDef(String str, int i10, String str2, Collection<String> collection, String str3, Collection<? extends Annotation> collection2, Iterable<? extends Field> iterable, Iterable<? extends Field> iterable2, Iterable<? extends Method> iterable3, Iterable<? extends Method> iterable4) {
        r<String> rVarK;
        this.type = str;
        this.accessFlags = i10;
        this.superclass = str2;
        if (collection == null) {
            r.a aVar = r.f18735b;
            rVarK = u0.f18756e;
        } else {
            rVarK = r.k(collection);
        }
        this.interfaces = rVarK;
        this.sourceFile = str3;
        this.annotations = ImmutableAnnotation.immutableSetOf(collection2);
        this.staticFields = ImmutableField.immutableSetOf(iterable);
        this.instanceFields = ImmutableField.immutableSetOf(iterable2);
        this.directMethods = ImmutableMethod.immutableSetOf(iterable3);
        this.virtualMethods = ImmutableMethod.immutableSetOf(iterable4);
    }

    public ImmutableClassDef(String str, int i10, String str2, r<String> rVar, String str3, v<? extends ImmutableAnnotation> vVar, y<? extends ImmutableField> yVar, y<? extends ImmutableField> yVar2, y<? extends ImmutableMethod> yVar3, y<? extends ImmutableMethod> yVar4) {
        this.type = str;
        this.accessFlags = i10;
        this.superclass = str2;
        this.interfaces = ImmutableUtils.nullToEmptyList(rVar);
        this.sourceFile = str3;
        this.annotations = ImmutableUtils.nullToEmptySet(vVar);
        this.staticFields = ImmutableUtils.nullToEmptySortedSet(yVar);
        this.instanceFields = ImmutableUtils.nullToEmptySortedSet(yVar2);
        this.directMethods = ImmutableUtils.nullToEmptySortedSet(yVar3);
        this.virtualMethods = ImmutableUtils.nullToEmptySortedSet(yVar4);
    }
}
