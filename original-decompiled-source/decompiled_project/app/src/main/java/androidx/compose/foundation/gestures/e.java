package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {544}, m = "processDragStop")
/* loaded from: classes.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public b f872a;

    /* renamed from: b, reason: collision with root package name */
    public a.d f873b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f875d;

    /* renamed from: e, reason: collision with root package name */
    public int f876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, vg.c cVar) {
        super(cVar);
        this.f875d = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f874c = obj;
        this.f876e |= PKIFailureInfo.systemUnavail;
        return b.Y1(this.f875d, null, this);
    }
}
