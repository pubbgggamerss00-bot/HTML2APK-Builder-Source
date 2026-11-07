package m0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {430}, m = "awaitDown")
/* loaded from: classes.dex */
public final class x0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f17543a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17544b;

    /* renamed from: c, reason: collision with root package name */
    public int f17545c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f17544b = obj;
        this.f17545c |= PKIFailureInfo.systemUnavail;
        return e1.a(null, this);
    }
}
