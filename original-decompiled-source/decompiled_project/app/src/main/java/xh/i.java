package xh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
/* loaded from: classes2.dex */
public final class i extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public h f33596a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h<Object> f33598c;

    /* renamed from: d, reason: collision with root package name */
    public int f33599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, vg.c cVar) {
        super(cVar);
        this.f33598c = hVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f33597b = obj;
        this.f33599d |= PKIFailureInfo.systemUnavail;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f33581f;
        return this.f33598c.g(this);
    }
}
