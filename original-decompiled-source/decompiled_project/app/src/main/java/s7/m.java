package s7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
/* loaded from: classes.dex */
public final class m extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public k f24566a;

    /* renamed from: b, reason: collision with root package name */
    public hi.g f24567b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f24569d;

    /* renamed from: e, reason: collision with root package name */
    public int f24570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, vg.c cVar) {
        super(cVar);
        this.f24569d = kVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24568c = obj;
        this.f24570e |= PKIFailureInfo.systemUnavail;
        return k.b(this.f24569d, null, this);
    }
}
