package b0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t.b1;

@vg.e(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {365, 366}, m = "scroll")
/* loaded from: classes.dex */
public final class r0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m0 f3421a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f3422b;

    /* renamed from: c, reason: collision with root package name */
    public vg.i f3423c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f3425e;

    /* renamed from: f, reason: collision with root package name */
    public int f3426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(m0 m0Var, vg.c cVar) {
        super(cVar);
        this.f3425e = m0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3424d = obj;
        this.f3426f |= PKIFailureInfo.systemUnavail;
        return this.f3425e.c(null, null, this);
    }
}
