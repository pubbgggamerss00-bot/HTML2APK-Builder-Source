package h7;

import h7.i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {37}, m = "handle")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public w7.f f12314a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f12316c;

    /* renamed from: d, reason: collision with root package name */
    public int f12317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i.a aVar, vg.c cVar) {
        super(cVar);
        this.f12316c = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12315b = obj;
        this.f12317d |= PKIFailureInfo.systemUnavail;
        return this.f12316c.a(null, null, this);
    }
}
