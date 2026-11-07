package androidx.lifecycle;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2325a;

    /* renamed from: b, reason: collision with root package name */
    public final i5.b f2326b;

    public static final class a<T> extends a0<T> {
    }

    public l0(rg.c cVar) {
        this.f2325a = new LinkedHashMap();
        this.f2326b = new i5.b(cVar);
    }

    public final <T> T a(String key) {
        T t3;
        kotlin.jvm.internal.r.e(key, "key");
        i5.b bVar = this.f2326b;
        bVar.getClass();
        LinkedHashMap linkedHashMap = bVar.f14161a;
        try {
            sh.j0 j0Var = (sh.j0) bVar.f14164d.get(key);
            if (j0Var != null && (t3 = (T) j0Var.getValue()) != null) {
                return t3;
            }
            return (T) linkedHashMap.get(key);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(key);
            bVar.f14163c.remove(key);
            return null;
        }
    }

    public final <T> T b(String str) {
        i5.b bVar = this.f2326b;
        bVar.getClass();
        T t3 = (T) bVar.f14161a.remove(str);
        bVar.f14163c.remove(str);
        return t3;
    }

    public final void c(Object obj, String str) {
        if (obj != null) {
            ArrayList arrayList = i5.c.f14166a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException(("Can't put value with type " + obj.getClass() + " into saved state").toString());
        }
        ArrayList arrayList2 = i5.c.f14166a;
        Object obj3 = this.f2325a.get(str);
        a0 a0Var = obj3 instanceof a0 ? (a0) obj3 : null;
        if (a0Var != null) {
            a0Var.h(obj);
        }
        this.f2326b.a(obj, str);
    }

    public l0() {
        this.f2325a = new LinkedHashMap();
        this.f2326b = new i5.b(qg.a0.f22708a);
    }
}
