package u0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
/* loaded from: classes.dex */
public final class o<I> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29086a;

    /* renamed from: b, reason: collision with root package name */
    public int f29087b;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29086a = obj;
        this.f29087b |= PKIFailureInfo.systemUnavail;
        return androidx.compose.material3.internal.a.a(null, null, this);
    }
}
