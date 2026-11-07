package b2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;

@vg.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE}, m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class d extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3516b;

    /* renamed from: c, reason: collision with root package name */
    public int f3517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, vg.c cVar) {
        super(cVar);
        this.f3516b = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3515a = obj;
        this.f3517c |= PKIFailureInfo.systemUnavail;
        return this.f3516b.b(0L, this);
    }
}
