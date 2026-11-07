package kotlin.jvm.internal;

import e5.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5.t;
import p5.u;
import p5.v;
import p5.w;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements v5.c<Object>, c {

    /* renamed from: t, reason: collision with root package name */
    public static final Map<Class<Object>, Integer> f13551t;
    public final Class<?> s;

    static {
        List listC = e5.l.c(p5.a.class, p5.l.class, p5.p.class, p5.q.class, p5.r.class, p5.s.class, t.class, u.class, v.class, w.class, p5.b.class, p5.c.class, p5.d.class, p5.e.class, p5.f.class, p5.g.class, p5.h.class, p5.i.class, p5.j.class, p5.k.class, p5.m.class, p5.n.class, p5.o.class);
        ArrayList arrayList = new ArrayList(e5.m.d(listC));
        int i6 = 0;
        for (Object obj : listC) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new d5.c((Class) obj, Integer.valueOf(i6)));
            i6 = i7;
        }
        f13551t = x.k(arrayList);
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
        HashMap map3 = new HashMap();
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
        j.d("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(x5.o.D(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<Object>, Integer> entry : f13551t.entrySet()) {
            Class<Object> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e5.w.i(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key2, x5.o.D(str2, '.', str2));
        }
    }

    public d(Class<?> cls) {
        j.e("jClass", cls);
        this.s = cls;
    }

    @Override // kotlin.jvm.internal.c
    public final Class<?> a() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && f5.b.g(this).equals(f5.b.g((v5.c) obj));
    }

    public final int hashCode() {
        return f5.b.g(this).hashCode();
    }

    public final String toString() {
        return this.s.toString() + " (Kotlin reflection is not available)";
    }
}
