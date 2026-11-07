package t;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit")
/* loaded from: classes.dex */
public final class r0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s0 f25327a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f25329c;

    /* renamed from: d, reason: collision with root package name */
    public int f25330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, vg.c cVar) {
        super(cVar);
        this.f25329c = s0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25328b = obj;
        this.f25330d |= PKIFailureInfo.systemUnavail;
        return s0.U1(this.f25329c, this);
    }
}
