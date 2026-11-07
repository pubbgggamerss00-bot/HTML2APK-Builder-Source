package e0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {636, 641}, m = "scroll$suspendImpl")
/* loaded from: classes.dex */
public final class z0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public d1 f8332a;

    /* renamed from: b, reason: collision with root package name */
    public t.b1 f8333b;

    /* renamed from: c, reason: collision with root package name */
    public vg.i f8334c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f8336e;

    /* renamed from: f, reason: collision with root package name */
    public int f8337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d1 d1Var, vg.c cVar) {
        super(cVar);
        this.f8336e = d1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f8335d = obj;
        this.f8337f |= PKIFailureInfo.systemUnavail;
        return d1.s(this.f8336e, null, null, this);
    }
}
