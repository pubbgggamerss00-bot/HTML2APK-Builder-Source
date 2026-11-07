package s7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
/* loaded from: classes.dex */
public final class n extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24571a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24572b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24573c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f24575e;

    /* renamed from: f, reason: collision with root package name */
    public int f24576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, vg.c cVar) {
        super(cVar);
        this.f24575e = kVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24574d = obj;
        this.f24576f |= PKIFailureInfo.systemUnavail;
        return k.c(this.f24575e, null, null, null, null, this);
    }
}
