package s8;

/* loaded from: classes.dex */
public final class x1 implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f24752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f24753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l f24755d;

    public x1(androidx.lifecycle.t tVar, p5.x xVar, String str, eh.l lVar) {
        this.f24752a = tVar;
        this.f24753b = xVar;
        this.f24754c = str;
        this.f24755d = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() {
        boolean z10;
        androidx.lifecycle.t tVar = this.f24752a;
        boolean z11 = tVar instanceof p5.s;
        p5.x xVar = this.f24753b;
        if (z11) {
            p5.s sVarG = xVar.f21304b.g();
            if (!kotlin.jvm.internal.r.a(sVarG != null ? sVarG.f21273f : null, ((p5.s) tVar).f21273f)) {
                z10 = false;
            }
        } else {
            xVar.b(this.f24755d, this.f24754c);
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
