package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1916, 1951}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes.dex */
public final class z extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.compose.ui.platform.c f15000a;

    /* renamed from: b, reason: collision with root package name */
    public p.z f15001b;

    /* renamed from: c, reason: collision with root package name */
    public rh.j f15002c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.c f15004e;

    /* renamed from: f, reason: collision with root package name */
    public int f15005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.compose.ui.platform.c cVar, vg.c cVar2) {
        super(cVar2);
        this.f15004e = cVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f15003d = obj;
        this.f15005f |= PKIFailureInfo.systemUnavail;
        return this.f15004e.l(this);
    }
}
