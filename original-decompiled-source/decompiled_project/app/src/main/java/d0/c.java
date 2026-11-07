package d0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {49}, m = "waitForFirstLayout")
/* loaded from: classes.dex */
public final class c extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public ph.m f7066a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f7068c;

    /* renamed from: d, reason: collision with root package name */
    public int f7069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, vg.c cVar) {
        super(cVar);
        this.f7068c = dVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f7067b = obj;
        this.f7069d |= PKIFailureInfo.systemUnavail;
        return this.f7068c.a(this);
    }
}
