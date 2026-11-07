package z6;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class b<T> implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a7.i<T> f34775a;

    public b(a7.i<T> tracker) {
        r.e(tracker, "tracker");
        this.f34775a = tracker;
    }

    @Override // z6.e
    public final sh.b b(t6.e constraints) {
        r.e(constraints, "constraints");
        return new sh.b(new a(this, null), tg.i.f28768a, -2, rh.a.f23576a);
    }

    @Override // z6.e
    public final boolean c(WorkSpec workSpec) {
        return a(workSpec) && e(this.f34775a.a());
    }

    public abstract int d();

    public abstract boolean e(T t3);
}
