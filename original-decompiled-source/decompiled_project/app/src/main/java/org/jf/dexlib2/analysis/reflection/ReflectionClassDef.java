package org.jf.dexlib2.analysis.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.e;
import lc.l;
import nc.g0;
import nc.j0;
import nc.r;
import nc.v;
import nc.w0;
import org.jf.dexlib2.analysis.reflection.util.ReflectionUtils;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;

/* loaded from: classes3.dex */
public class ReflectionClassDef extends BaseTypeReference implements ClassDef {
    private static final int DIRECT_MODIFIERS = 10;
    private final Class cls;

    public ReflectionClassDef(Class cls) {
        this.cls = cls;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public int getAccessFlags() {
        return this.cls.getModifiers();
    }

    @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
    public Set<? extends Annotation> getAnnotations() {
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends Method> getDirectMethods() {
        return new Iterable<Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.5
            @Override // java.lang.Iterable
            public Iterator<Method> iterator() {
                return j0.b(new g0(j0.e(ReflectionClassDef.this.cls.getDeclaredConstructors()), new e<Constructor, Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.5.1
                    @Override // lc.e
                    public Method apply(Constructor constructor) {
                        return new ReflectionConstructor(constructor);
                    }
                }), new g0(j0.d(j0.e(ReflectionClassDef.this.cls.getDeclaredMethods()), new l<java.lang.reflect.Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.5.2
                    @Override // lc.l
                    public boolean apply(java.lang.reflect.Method method) {
                        return (method == null || (method.getModifiers() & 10) == 0) ? false : true;
                    }
                }), new e<java.lang.reflect.Method, Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.5.3
                    @Override // lc.e
                    public Method apply(java.lang.reflect.Method method) {
                        return new ReflectionMethod(method);
                    }
                }));
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends Field> getInstanceFields() {
        return new Iterable<Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.3
            @Override // java.lang.Iterable
            public Iterator<Field> iterator() {
                return new g0(j0.d(j0.e(ReflectionClassDef.this.cls.getDeclaredFields()), new l<java.lang.reflect.Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.3.1
                    @Override // lc.l
                    public boolean apply(java.lang.reflect.Field field) {
                        return (field == null || Modifier.isStatic(field.getModifiers())) ? false : true;
                    }
                }), new e<java.lang.reflect.Field, Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.3.2
                    @Override // lc.e
                    public Field apply(java.lang.reflect.Field field) {
                        return new ReflectionField(field);
                    }
                });
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public List<String> getInterfaces() {
        return r.m(new g0(j0.e(this.cls.getInterfaces()), new e<Class, String>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.1
            @Override // lc.e
            public String apply(Class cls) {
                if (cls == null) {
                    return null;
                }
                return ReflectionUtils.javaToDexName(cls.getName());
            }
        }));
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSourceFile() {
        return null;
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends Field> getStaticFields() {
        return new Iterable<Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.2
            @Override // java.lang.Iterable
            public Iterator<Field> iterator() {
                return new g0(j0.d(j0.e(ReflectionClassDef.this.cls.getDeclaredFields()), new l<java.lang.reflect.Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.2.1
                    @Override // lc.l
                    public boolean apply(java.lang.reflect.Field field) {
                        return field != null && Modifier.isStatic(field.getModifiers());
                    }
                }), new e<java.lang.reflect.Field, Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.2.2
                    @Override // lc.e
                    public Field apply(java.lang.reflect.Field field) {
                        return new ReflectionField(field);
                    }
                });
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public String getSuperclass() {
        if (Modifier.isInterface(this.cls.getModifiers())) {
            return "Ljava/lang/Object;";
        }
        Class superclass = this.cls.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return ReflectionUtils.javaToDexName(superclass.getName());
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return ReflectionUtils.javaToDexName(this.cls.getName());
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Iterable<? extends Method> getVirtualMethods() {
        return new Iterable<Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.6
            @Override // java.lang.Iterable
            public Iterator<Method> iterator() {
                return new g0(j0.d(j0.e(ReflectionClassDef.this.cls.getDeclaredMethods()), new l<java.lang.reflect.Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.6.1
                    @Override // lc.l
                    public boolean apply(java.lang.reflect.Method method) {
                        return method != null && (method.getModifiers() & 10) == 0;
                    }
                }), new e<java.lang.reflect.Method, Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.6.2
                    @Override // lc.e
                    public Method apply(java.lang.reflect.Method method) {
                        return new ReflectionMethod(method);
                    }
                });
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Set<? extends Field> getFields() {
        return new AbstractSet<Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.4
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Field> iterator() {
                return new g0(j0.e(ReflectionClassDef.this.cls.getDeclaredFields()), new e<java.lang.reflect.Field, Field>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.4.1
                    @Override // lc.e
                    public Field apply(java.lang.reflect.Field field) {
                        return new ReflectionField(field);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ReflectionClassDef.this.cls.getDeclaredFields().length;
            }
        };
    }

    @Override // org.jf.dexlib2.iface.ClassDef
    public Set<? extends Method> getMethods() {
        return new AbstractSet<Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.7
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Method> iterator() {
                return j0.b(new g0(j0.e(ReflectionClassDef.this.cls.getDeclaredConstructors()), new e<Constructor, Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.7.1
                    @Override // lc.e
                    public Method apply(Constructor constructor) {
                        return new ReflectionConstructor(constructor);
                    }
                }), new g0(j0.e(ReflectionClassDef.this.cls.getDeclaredMethods()), new e<java.lang.reflect.Method, Method>() { // from class: org.jf.dexlib2.analysis.reflection.ReflectionClassDef.7.2
                    @Override // lc.e
                    public Method apply(java.lang.reflect.Method method) {
                        return new ReflectionMethod(method);
                    }
                }));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ReflectionClassDef.this.cls.getDeclaredMethods().length + ReflectionClassDef.this.cls.getDeclaredConstructors().length;
            }
        };
    }
}
