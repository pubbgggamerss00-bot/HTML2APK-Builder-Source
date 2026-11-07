package e0;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f8311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b bVar, ph.i0 i0Var) {
        super(0);
        this.f8310a = bVar;
        this.f8311b = i0Var;
    }

    @Override // eh.a
    public final Boolean invoke() {
        boolean z10;
        b bVar = this.f8310a;
        if (bVar.d()) {
            ph.h.c(this.f8311b, null, null, new a0(bVar, null), 3);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
