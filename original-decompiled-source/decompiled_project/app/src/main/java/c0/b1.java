package c0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {377, 378}, m = "scroll")
/* loaded from: classes.dex */
public final class b1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public w0 f4349a;

    /* renamed from: b, reason: collision with root package name */
    public t.b1 f4350b;

    /* renamed from: c, reason: collision with root package name */
    public vg.i f4351c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f4353e;

    /* renamed from: f, reason: collision with root package name */
    public int f4354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w0 w0Var, vg.c cVar) {
        super(cVar);
        this.f4353e = w0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f4352d = obj;
        this.f4354f |= PKIFailureInfo.systemUnavail;
        return this.f4353e.c(null, null, this);
    }
}
