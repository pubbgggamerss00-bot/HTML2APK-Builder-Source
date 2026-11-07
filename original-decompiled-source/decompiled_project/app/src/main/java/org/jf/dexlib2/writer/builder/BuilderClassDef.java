package org.jf.dexlib2.writer.builder;

import h1.m;
import i0.u2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import lc.f;
import nc.b0;
import nc.j0;
import nc.k0;
import nc.n0;
import nc.r;
import nc.u0;
import nc.x0;
import nc.y;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;

/* loaded from: classes3.dex */
public class BuilderClassDef extends BaseTypeReference implements ClassDef {
    final int accessFlags;
    final BuilderAnnotationSet annotations;
    final SortedSet<BuilderMethod> directMethods;
    final SortedSet<BuilderField> instanceFields;
    final BuilderTypeList interfaces;
    final BuilderStringReference sourceFile;
    final SortedSet<BuilderField> staticFields;
    final BuilderEncodedValues.BuilderArrayEncodedValue staticInitializers;
    final BuilderTypeReference superclass;
    final BuilderTypeReference type;
    final SortedSet<BuilderMethod> virtualMethods;
    int classDefIndex = -1;
    int annotationDirectoryOffset = 0;

    public BuilderClassDef(BuilderTypeReference builderTypeReference, int i10, BuilderTypeReference builderTypeReference2, BuilderTypeList builderTypeList, BuilderStringReference builderStringReference, BuilderAnnotationSet builderAnnotationSet, SortedSet<BuilderField> sortedSet, SortedSet<BuilderField> sortedSet2, Iterable<? extends BuilderMethod> iterable, BuilderEncodedValues.BuilderArrayEncodedValue builderArrayEncodedValue) {
        if (iterable == null) {
            r.a aVar = r.f18735b;
            iterable = u0.f18756e;
        }
        if (sortedSet == null) {
            int i11 = y.f18789f;
            sortedSet = x0.f18787h;
        }
        if (sortedSet2 == null) {
            int i12 = y.f18789f;
            sortedSet2 = x0.f18787h;
        }
        this.type = builderTypeReference;
        this.accessFlags = i10;
        this.superclass = builderTypeReference2;
        this.interfaces = builderTypeList;
        this.sourceFile = builderStringReference;
        this.annotations = builderAnnotationSet;
        this.staticFields = sortedSet;
        this.instanceFields = sortedSet2;
        b0 b0VarF = u2.f(iterable, MethodUtil.METHOD_IS_DIRECT);
        int i13 = y.f18789f;
        n0 n0Var = n0.f18723a;
        this.directMethods = y.q(n0Var, b0VarF);
        this.virtualMethods = y.q(n0Var, u2.f(iterable, MethodUtil.METHOD_IS_VIRTUAL));
        this.staticInitializers = builderArrayEncodedValue;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public List<String> getInterfaces() {
        return k0.d(this.interfaces, f.f16942a);
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSourceFile() {
        BuilderStringReference builderStringReference = this.sourceFile;
        if (builderStringReference == null) {
            return null;
        }
        return builderStringReference.getString();
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSuperclass() {
        BuilderTypeReference builderTypeReference = this.superclass;
        if (builderTypeReference == null) {
            return null;
        }
        return builderTypeReference.getType();
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.type.getType();
    }

    @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
    public BuilderAnnotationSet getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<BuilderMethod> getDirectMethods() {
        return this.directMethods;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<BuilderField> getFields() {
        return new AbstractCollection<BuilderField>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassDef.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<BuilderField> iterator() {
                Iterator<BuilderField> it = BuilderClassDef.this.staticFields.iterator();
                Iterator<BuilderField> it2 = BuilderClassDef.this.instanceFields.iterator();
                r.a aVar = r.f18735b;
                Object[] objArr = {it, it2};
                m.c(2, objArr);
                return j0.f(r.i(2, objArr), n0.f18723a);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return BuilderClassDef.this.instanceFields.size() + BuilderClassDef.this.staticFields.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<BuilderField> getInstanceFields() {
        return this.instanceFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<BuilderMethod> getMethods() {
        return new AbstractCollection<BuilderMethod>() { // from class: org.jf.dexlib2.writer.builder.BuilderClassDef.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<BuilderMethod> iterator() {
                Iterator<BuilderMethod> it = BuilderClassDef.this.directMethods.iterator();
                Iterator<BuilderMethod> it2 = BuilderClassDef.this.virtualMethods.iterator();
                r.a aVar = r.f18735b;
                Object[] objArr = {it, it2};
                m.c(2, objArr);
                return j0.f(r.i(2, objArr), n0.f18723a);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return BuilderClassDef.this.virtualMethods.size() + BuilderClassDef.this.directMethods.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<BuilderField> getStaticFields() {
        return this.staticFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<BuilderMethod> getVirtualMethods() {
        return this.virtualMethods;
    }
}
