package e0;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f8303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, ph.i0 i0Var) {
        super(0);
        this.f8302a = bVar;
        this.f8303b = i0Var;
    }

    @Override // eh.a
    public final Boolean invoke() {
        boolean z10;
        b bVar = this.f8302a;
        if (bVar.b()) {
            ph.h.c(this.f8303b, null, null, new z(bVar, null), 3);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
