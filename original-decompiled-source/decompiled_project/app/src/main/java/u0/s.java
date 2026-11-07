package u0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {567}, m = "anchoredDrag")
/* loaded from: classes.dex */
public final class s extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a0 f29132a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29134c;

    /* renamed from: d, reason: collision with root package name */
    public int f29135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, vg.c cVar) {
        super(cVar);
        this.f29134c = a0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29133b = obj;
        this.f29135d |= PKIFailureInfo.systemUnavail;
        return this.f29134c.a(null, null, null, this);
    }
}
