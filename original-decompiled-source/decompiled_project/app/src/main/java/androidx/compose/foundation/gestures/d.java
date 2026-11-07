package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {534, 537}, m = "processDragStart")
/* loaded from: classes.dex */
public final class d extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public b f866a;

    /* renamed from: b, reason: collision with root package name */
    public a.c f867b;

    /* renamed from: c, reason: collision with root package name */
    public x.b f868c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f870e;

    /* renamed from: f, reason: collision with root package name */
    public int f871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, vg.c cVar) {
        super(cVar);
        this.f870e = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f869d = obj;
        this.f871f |= PKIFailureInfo.systemUnavail;
        return b.X1(this.f870e, null, this);
    }
}
