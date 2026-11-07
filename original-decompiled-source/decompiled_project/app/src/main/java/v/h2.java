package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {102, 153}, m = "animateToZero")
/* loaded from: classes.dex */
public final class h2 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public k2 f29900a;

    /* renamed from: b, reason: collision with root package name */
    public pg.f f29901b;

    /* renamed from: c, reason: collision with root package name */
    public eh.a f29902c;

    /* renamed from: d, reason: collision with root package name */
    public float f29903d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k2 f29905f;

    /* renamed from: g, reason: collision with root package name */
    public int f29906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k2 k2Var, vg.c cVar) {
        super(cVar);
        this.f29905f = k2Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29904e = obj;
        this.f29906g |= PKIFailureInfo.systemUnavail;
        return this.f29905f.a(null, null, this);
    }
}
