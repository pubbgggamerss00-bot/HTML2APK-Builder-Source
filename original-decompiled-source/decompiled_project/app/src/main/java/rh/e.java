package rh;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes2.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c<Object> f23599b;

    /* renamed from: c, reason: collision with root package name */
    public int f23600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, vg.c cVar2) {
        super(cVar2);
        this.f23599b = cVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f23598a = obj;
        this.f23600c |= PKIFailureInfo.systemUnavail;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f23580b;
        Object objF = this.f23599b.F(null, 0, 0L, this);
        return objF == ug.a.f29706a ? objF : new l(objF);
    }
}
