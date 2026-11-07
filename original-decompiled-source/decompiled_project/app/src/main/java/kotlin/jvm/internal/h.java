package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h implements kh.c<Object>, g {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<? extends pg.f<?>>, Integer> f16328b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f16329c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f16330d;

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f16331a;

    static {
        List listJ = qg.p.j(eh.a.class, eh.l.class, eh.p.class, eh.q.class, eh.r.class, eh.s.class, eh.t.class, eh.u.class, eh.v.class, eh.w.class, eh.b.class, eh.c.class, eh.d.class, eh.e.class, eh.f.class, eh.g.class, eh.h.class, eh.i.class, eh.j.class, eh.k.class, eh.m.class, eh.n.class, eh.o.class);
        ArrayList arrayList = new ArrayList(qg.p.h(listJ, 10));
        int i10 = 0;
        for (Object obj : listJ) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                qg.p.o();
                throw null;
            }
            arrayList.add(new pg.n((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f16328b = qg.k0.i(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        r.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            r.b(str);
            sb.append(mh.x.T(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends pg.f<?>>, Integer> entry : f16328b.entrySet()) {
            Class<? extends pg.f<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        f16329c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qg.j0.a(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            r.b(str2);
            linkedHashMap.put(key2, mh.x.T(str2, '.', str2));
        }
        f16330d = linkedHashMap;
    }

    public h(Class<?> jClass) {
        r.e(jClass, "jClass");
        this.f16331a = jClass;
    }

    @Override // kh.c
    public final String a() {
        String str;
        Class<?> jClass = this.f16331a;
        r.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap<String, String> map = f16329c;
        if (!zIsArray) {
            String str2 = map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.jvm.internal.g
    public final Class<?> b() {
        return this.f16331a;
    }

    @Override // kh.c
    public final String e() {
        String str;
        Class<?> jClass = this.f16331a;
        r.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f16330d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return mh.x.S(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return mh.x.R(simpleName, '$', simpleName);
        }
        return mh.x.S(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && b3.e.d(this).equals(b3.e.d((kh.c) obj));
    }

    @Override // kh.c
    public final int hashCode() {
        return b3.e.d(this).hashCode();
    }

    @Override // kh.c
    public final boolean i(Object obj) {
        Class<?> jClass = this.f16331a;
        r.e(jClass, "jClass");
        Map<Class<? extends pg.f<?>>, Integer> map = f16328b;
        r.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return m0.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = b3.e.d(h0.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final String toString() {
        return this.f16331a + " (Kotlin reflection is not available)";
    }
}
