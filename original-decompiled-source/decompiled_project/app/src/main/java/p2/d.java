package p2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
/* loaded from: classes.dex */
public final class d extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c f21158a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21159b;

    /* renamed from: c, reason: collision with root package name */
    public f3.n f21160c;

    /* renamed from: d, reason: collision with root package name */
    public int f21161d;

    /* renamed from: e, reason: collision with root package name */
    public int f21162e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f21164g;

    /* renamed from: h, reason: collision with root package name */
    public int f21165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, vg.c cVar2) {
        super(cVar2);
        this.f21164g = cVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21163f = obj;
        this.f21165h |= PKIFailureInfo.systemUnavail;
        return c.a(this.f21164g, null, null, this);
    }
}
