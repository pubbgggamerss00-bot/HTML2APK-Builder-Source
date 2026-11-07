package t0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {650}, m = "animateElevation")
/* loaded from: classes.dex */
public final class b4 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public d4 f25523a;

    /* renamed from: b, reason: collision with root package name */
    public x.k f25524b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4 f25526d;

    /* renamed from: e, reason: collision with root package name */
    public int f25527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(d4 d4Var, vg.c cVar) {
        super(cVar);
        this.f25526d = d4Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25525c = obj;
        this.f25527e |= PKIFailureInfo.systemUnavail;
        return this.f25526d.a(null, this);
    }
}
