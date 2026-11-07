package rh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes2.dex */
public final class d<E> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c<E> f23596b;

    /* renamed from: c, reason: collision with root package name */
    public int f23597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, vg.c cVar2) {
        super(cVar2);
        this.f23596b = cVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f23595a = obj;
        this.f23597c |= PKIFailureInfo.systemUnavail;
        Object objD = c.D(this.f23596b, this);
        return objD == ug.a.f29706a ? objD : new l(objD);
    }
}
