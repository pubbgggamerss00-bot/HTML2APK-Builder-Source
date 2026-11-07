package t;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {688, 720}, m = "applyToFling-BMRW4eQ")
/* loaded from: classes.dex */
public final class f extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public g f25211a;

    /* renamed from: b, reason: collision with root package name */
    public long f25212b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f25214d;

    /* renamed from: e, reason: collision with root package name */
    public int f25215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, vg.c cVar) {
        super(cVar);
        this.f25214d = gVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f25213c = obj;
        this.f25215e |= PKIFailureInfo.systemUnavail;
        return this.f25214d.b(0L, null, this);
    }
}
