package u0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {520}, m = "anchoredDrag")
/* loaded from: classes.dex */
public final class q extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a0 f29115a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29117c;

    /* renamed from: d, reason: collision with root package name */
    public int f29118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, vg.c cVar) {
        super(cVar);
        this.f29117c = a0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29116b = obj;
        this.f29118d |= PKIFailureInfo.systemUnavail;
        return this.f29117c.b(null, null, this);
    }
}
