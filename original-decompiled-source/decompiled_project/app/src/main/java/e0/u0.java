package e0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {610, 617}, m = "animateScrollToPage")
/* loaded from: classes.dex */
public final class u0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public d1 f8304a;

    /* renamed from: b, reason: collision with root package name */
    public s.l f8305b;

    /* renamed from: c, reason: collision with root package name */
    public int f8306c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f8308e;

    /* renamed from: f, reason: collision with root package name */
    public int f8309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(d1 d1Var, vg.c cVar) {
        super(cVar);
        this.f8308e = d1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f8307d = obj;
        this.f8309f |= PKIFailureInfo.systemUnavail;
        return this.f8308e.f(0, null, this);
    }
}
