package h8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ai.AiClient", f = "AiClient.kt", l = {188}, m = "turnState")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12402a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12404c;

    /* renamed from: d, reason: collision with root package name */
    public int f12405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, vg.c cVar) {
        super(cVar);
        this.f12404c = fVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12403b = obj;
        this.f12405d |= PKIFailureInfo.systemUnavail;
        return this.f12404c.d(null, null, false, this);
    }
}
