package b2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {223, 225}, m = "dispatchPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class c extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3513b;

    /* renamed from: c, reason: collision with root package name */
    public int f3514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, vg.c cVar) {
        super(cVar);
        this.f3513b = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3512a = obj;
        this.f3514c |= PKIFailureInfo.systemUnavail;
        return this.f3513b.a(0L, 0L, this);
    }
}
