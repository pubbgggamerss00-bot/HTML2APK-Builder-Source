package t0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {636}, m = "snapElevation")
/* loaded from: classes.dex */
public final class c4 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public d4 f25578a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d4 f25580c;

    /* renamed from: d, reason: collision with root package name */
    public int f25581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(d4 d4Var, vg.c cVar) {
        super(cVar);
        this.f25580c = d4Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25579b = obj;
        this.f25581d |= PKIFailureInfo.systemUnavail;
        return this.f25580c.b(this);
    }
}
