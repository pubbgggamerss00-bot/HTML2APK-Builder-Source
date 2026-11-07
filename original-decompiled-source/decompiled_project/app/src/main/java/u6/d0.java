package u6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends t6.d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f29274h = t6.s.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final t0 f29275a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.i f29276b;

    /* renamed from: c, reason: collision with root package name */
    public final List<? extends t6.e0> f29277c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29278d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f29279e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29280f;

    /* renamed from: g, reason: collision with root package name */
    public t6.x f29281g;

    public d0() {
        throw null;
    }

    public d0(t0 t0Var, List<? extends t6.e0> list) {
        this.f29275a = t0Var;
        this.f29276b = t6.i.f28024a;
        this.f29277c = list;
        this.f29278d = new ArrayList(list.size());
        this.f29279e = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = list.get(i10).f28013a.toString();
            kotlin.jvm.internal.r.d(string, "id.toString()");
            this.f29278d.add(string);
            this.f29279e.add(string);
        }
    }

    public static HashSet a(d0 d0Var) {
        HashSet hashSet = new HashSet();
        d0Var.getClass();
        return hashSet;
    }
}
