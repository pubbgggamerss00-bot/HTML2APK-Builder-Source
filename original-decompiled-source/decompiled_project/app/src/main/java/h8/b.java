package h8;

import h8.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ai.AiBackgroundTurns", f = "AiBackgroundTurns.kt", l = {141, 147, 151}, m = "apply")
/* loaded from: classes.dex */
public final class b extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a f12360a;

    /* renamed from: b, reason: collision with root package name */
    public a.C0114a f12361b;

    /* renamed from: c, reason: collision with root package name */
    public t f12362c;

    /* renamed from: d, reason: collision with root package name */
    public long f12363d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f12365f;

    /* renamed from: g, reason: collision with root package name */
    public int f12366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, vg.c cVar) {
        super(cVar);
        this.f12365f = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12364e = obj;
        this.f12366g |= PKIFailureInfo.systemUnavail;
        return this.f12365f.b(null, null, this);
    }
}
