package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {782}, m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes.dex */
public final class n1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s1 f30003a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f30004b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f30006d;

    /* renamed from: e, reason: collision with root package name */
    public int f30007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(s1 s1Var, vg.c cVar) {
        super(cVar);
        this.f30006d = s1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30005c = obj;
        this.f30007e |= PKIFailureInfo.systemUnavail;
        return this.f30006d.b(0L, this);
    }
}
