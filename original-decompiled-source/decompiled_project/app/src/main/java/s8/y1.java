package s8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt", f = "AppNavigation.kt", l = {599}, m = "navigateWhenResumed")
/* loaded from: classes.dex */
public final class y1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public String f24760a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24761b;

    /* renamed from: c, reason: collision with root package name */
    public int f24762c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24761b = obj;
        this.f24762c |= PKIFailureInfo.systemUnavail;
        return b2.b(null, null, null, null, this);
    }
}
