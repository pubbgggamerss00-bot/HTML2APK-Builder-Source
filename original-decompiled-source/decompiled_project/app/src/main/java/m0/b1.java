package m0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {126, 130}, m = "touchSelection")
/* loaded from: classes.dex */
public final class b1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f17259a;

    /* renamed from: b, reason: collision with root package name */
    public i0.b3 f17260b;

    /* renamed from: c, reason: collision with root package name */
    public c2.b0 f17261c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17262d;

    /* renamed from: e, reason: collision with root package name */
    public int f17263e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f17262d = obj;
        this.f17263e |= PKIFailureInfo.systemUnavail;
        return e1.c(null, null, null, this);
    }
}
