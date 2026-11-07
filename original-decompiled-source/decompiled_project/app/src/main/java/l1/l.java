package l1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes.dex */
public final class l extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public b f16671a;

    /* renamed from: b, reason: collision with root package name */
    public rh.j f16672b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f16674d;

    /* renamed from: e, reason: collision with root package name */
    public int f16675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, vg.c cVar) {
        super(cVar);
        this.f16674d = bVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f16673c = obj;
        this.f16675e |= PKIFailureInfo.systemUnavail;
        return this.f16674d.a(this);
    }
}
