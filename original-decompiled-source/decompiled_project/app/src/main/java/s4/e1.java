package s4;

import ph.s1;

/* loaded from: classes.dex */
public final class e1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ph.i0 f24218a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f24219b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.c f24220c;

    /* renamed from: d, reason: collision with root package name */
    public final a f24221d;

    public e1(ph.i0 i0Var, d0 d0Var, eh.p onUndeliveredElement, f0 f0Var) {
        kotlin.jvm.internal.r.e(onUndeliveredElement, "onUndeliveredElement");
        this.f24218a = i0Var;
        this.f24219b = f0Var;
        this.f24220c = rh.k.a(Integer.MAX_VALUE, 6, null);
        this.f24221d = new a();
        s1 s1Var = (s1) i0Var.getCoroutineContext().get(s1.a.f21589a);
        if (s1Var != null) {
            s1Var.invokeOnCompletion(new c1(d0Var, this, onUndeliveredElement));
        }
    }
}
