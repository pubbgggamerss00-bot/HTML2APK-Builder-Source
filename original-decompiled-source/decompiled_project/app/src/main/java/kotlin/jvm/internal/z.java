package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class z extends a0 implements kh.h {
    public z(Class cls, String str, String str2, int i10) {
        super(e.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.e
    public final kh.b computeReflected() {
        h0.f16332a.getClass();
        return this;
    }

    @Override // kh.h
    public final void d() {
        ((kh.h) getReflected()).d();
    }

    public Object get(Object obj) {
        d();
        throw null;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
