package di;

/* loaded from: classes2.dex */
public final class l extends k {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8043c;

    public l(z zVar, boolean z10) {
        super(zVar);
        this.f8043c = z10;
    }

    @Override // di.k
    public final void h(String value) {
        kotlin.jvm.internal.r.e(value, "value");
        if (this.f8043c) {
            super.h(value);
        } else {
            f(value);
        }
    }
}
