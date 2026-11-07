package u;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {EACTags.MESSAGE_REFERENCE}, m = "awaitFirstRightClickDown")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f28888a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28889b;

    /* renamed from: c, reason: collision with root package name */
    public int f28890c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28889b = obj;
        this.f28890c |= PKIFailureInfo.systemUnavail;
        return c2.y.b(null, this);
    }
}
