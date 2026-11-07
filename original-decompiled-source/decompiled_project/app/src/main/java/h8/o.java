package h8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ai.AiProjectStore", f = "AiProjectStore.kt", l = {119}, m = "currentSettingsJson")
/* loaded from: classes.dex */
public final class o extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m f12430a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12432c;

    /* renamed from: d, reason: collision with root package name */
    public int f12433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, vg.c cVar) {
        super(cVar);
        this.f12432c = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12431b = obj;
        this.f12433d |= PKIFailureInfo.systemUnavail;
        return this.f12432c.c(0L, this);
    }
}
