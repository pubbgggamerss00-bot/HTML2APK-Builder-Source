package m0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {159, 183}, m = "mouseSelection")
/* loaded from: classes.dex */
public final class y0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f17580a;

    /* renamed from: b, reason: collision with root package name */
    public q f17581b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f17582c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17583d;

    /* renamed from: e, reason: collision with root package name */
    public int f17584e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f17583d = obj;
        this.f17584e |= PKIFailureInfo.systemUnavail;
        return e1.b(null, null, null, null, this);
    }
}
