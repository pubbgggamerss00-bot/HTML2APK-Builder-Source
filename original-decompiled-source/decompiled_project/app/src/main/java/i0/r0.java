package i0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", l = {167}, m = "getContextMenuItemsAvailability")
/* loaded from: classes.dex */
public final class r0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m0.x2 f13534a;

    /* renamed from: b, reason: collision with root package name */
    public int f13535b;

    /* renamed from: c, reason: collision with root package name */
    public int f13536c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13537d;

    /* renamed from: e, reason: collision with root package name */
    public int f13538e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f13537d = obj;
        this.f13538e |= PKIFailureInfo.systemUnavail;
        return s0.c(null, this);
    }
}
