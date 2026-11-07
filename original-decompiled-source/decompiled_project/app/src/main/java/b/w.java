package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3277a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f3278b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.p f3279c;

    public w(boolean z10) {
        this.f3277a = z10;
    }

    public void a() {
    }

    public abstract void b();

    public void c(c backEvent) {
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
    }

    public void d(c backEvent) {
        kotlin.jvm.internal.r.e(backEvent, "backEvent");
    }

    public final void e() {
        Iterator<T> it = this.f3278b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eh.a, kotlin.jvm.internal.p] */
    public final void f(boolean z10) {
        this.f3277a = z10;
        ?? r12 = this.f3279c;
        if (r12 != 0) {
            r12.invoke();
        }
    }
}
