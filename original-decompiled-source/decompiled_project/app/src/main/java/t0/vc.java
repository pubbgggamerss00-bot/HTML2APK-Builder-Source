package t0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {446, 449}, m = "showSnackbar")
/* loaded from: classes.dex */
public final class vc extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public uc f27249a;

    /* renamed from: b, reason: collision with root package name */
    public kd f27250b;

    /* renamed from: c, reason: collision with root package name */
    public yh.a f27251c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc f27253e;

    /* renamed from: f, reason: collision with root package name */
    public int f27254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(uc ucVar, vg.c cVar) {
        super(cVar);
        this.f27253e = ucVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f27252d = obj;
        this.f27254f |= PKIFailureInfo.systemUnavail;
        return this.f27253e.a(null, this);
    }
}
