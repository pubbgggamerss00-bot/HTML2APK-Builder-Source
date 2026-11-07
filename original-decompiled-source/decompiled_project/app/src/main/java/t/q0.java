package t;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter")
/* loaded from: classes.dex */
public final class q0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s0 f25321a;

    /* renamed from: b, reason: collision with root package name */
    public x.i f25322b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f25324d;

    /* renamed from: e, reason: collision with root package name */
    public int f25325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, vg.c cVar) {
        super(cVar);
        this.f25324d = s0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25323c = obj;
        this.f25325e |= PKIFailureInfo.systemUnavail;
        return s0.T1(this.f25324d, this);
    }
}
