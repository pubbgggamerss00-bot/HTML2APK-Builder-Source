package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {552}, m = "processDragCancel")
/* loaded from: classes.dex */
public final class v extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.compose.foundation.gestures.b f30093a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.b f30095c;

    /* renamed from: d, reason: collision with root package name */
    public int f30096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.compose.foundation.gestures.b bVar, vg.c cVar) {
        super(cVar);
        this.f30095c = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30094b = obj;
        this.f30096d |= PKIFailureInfo.systemUnavail;
        return androidx.compose.foundation.gestures.b.W1(this.f30095c, this);
    }
}
