package org.jf.dexlib2.writer.pool;

import h1.m;
import i0.u2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import lc.e;
import nc.e1;
import nc.j0;
import nc.n0;
import nc.r;
import nc.y;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.writer.pool.TypeListPool;

/* loaded from: classes3.dex */
class PoolClassDef extends BaseTypeReference implements ClassDef {
    final ClassDef classDef;
    final y<PoolMethod> directMethods;
    final y<Field> instanceFields;
    final TypeListPool.Key<List<String>> interfaces;
    final y<Field> staticFields;
    final y<PoolMethod> virtualMethods;
    int classDefIndex = -1;
    int annotationDirectoryOffset = 0;

    public PoolClassDef(ClassDef classDef) {
        this.classDef = classDef;
        this.interfaces = new TypeListPool.Key<>(r.k(classDef.getInterfaces()));
        Iterable<? extends Field> staticFields = classDef.getStaticFields();
        int i10 = y.f18789f;
        n0 n0Var = n0.f18723a;
        this.staticFields = y.q(n0Var, staticFields);
        this.instanceFields = y.q(n0Var, classDef.getInstanceFields());
        Iterable<? extends Method> directMethods = classDef.getDirectMethods();
        e<Method, PoolMethod> eVar = PoolMethod.TRANSFORM;
        this.directMethods = y.q(n0Var, u2.j(directMethods, eVar));
        this.virtualMethods = y.q(n0Var, u2.j(classDef.getVirtualMethods(), eVar));
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public int getAccessFlags() {
        return this.classDef.getAccessFlags();
    }

    @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
    public Set<? extends Annotation> getAnnotations() {
        return this.classDef.getAnnotations();
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public List<String> getInterfaces() {
        return (List) this.interfaces.types;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSourceFile() {
        return this.classDef.getSourceFile();
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSuperclass() {
        return this.classDef.getSuperclass();
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.classDef.getType();
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<PoolMethod> getDirectMethods() {
        return this.directMethods;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<Field> getFields() {
        return new AbstractCollection<Field>() { // from class: org.jf.dexlib2.writer.pool.PoolClassDef.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<Field> iterator() {
                e1<Field> it = PoolClassDef.this.staticFields.iterator();
                e1<Field> it2 = PoolClassDef.this.instanceFields.iterator();
                r.a aVar = r.f18735b;
                Object[] objArr = {it, it2};
                m.c(2, objArr);
                return j0.f(r.i(2, objArr), n0.f18723a);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return PoolClassDef.this.instanceFields.size() + PoolClassDef.this.staticFields.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<Field> getInstanceFields() {
        return this.instanceFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Collection<PoolMethod> getMethods() {
        return new AbstractCollection<PoolMethod>() { // from class: org.jf.dexlib2.writer.pool.PoolClassDef.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<PoolMethod> iterator() {
                e1<PoolMethod> it = PoolClassDef.this.directMethods.iterator();
                e1<PoolMethod> it2 = PoolClassDef.this.virtualMethods.iterator();
                r.a aVar = r.f18735b;
                Object[] objArr = {it, it2};
                m.c(2, objArr);
                return j0.f(r.i(2, objArr), n0.f18723a);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return PoolClassDef.this.virtualMethods.size() + PoolClassDef.this.directMethods.size();
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<Field> getStaticFields() {
        return this.staticFields;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public SortedSet<PoolMethod> getVirtualMethods() {
        return this.virtualMethods;
    }
}
