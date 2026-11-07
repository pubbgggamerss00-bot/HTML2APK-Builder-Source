package i5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import qg.k0;
import sh.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14161a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14162b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14163c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f14164d;

    /* renamed from: e, reason: collision with root package name */
    public final a f14165e;

    public b(Map<String, ? extends Object> initialState) {
        r.e(initialState, "initialState");
        this.f14161a = k0.k(initialState);
        this.f14162b = new LinkedHashMap();
        this.f14163c = new LinkedHashMap();
        this.f14164d = new LinkedHashMap();
        this.f14165e = new a(this);
    }

    public final void a(Object obj, String key) {
        r.e(key, "key");
        this.f14161a.put(key, obj);
        j0 j0Var = (j0) this.f14163c.get(key);
        if (j0Var != null) {
            j0Var.setValue(obj);
        }
        j0 j0Var2 = (j0) this.f14164d.get(key);
        if (j0Var2 != null) {
            j0Var2.setValue(obj);
        }
    }
}
