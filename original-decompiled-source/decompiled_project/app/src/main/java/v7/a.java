package v7;

import okhttp3.OkHttpClient;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
/* loaded from: classes.dex */
public final class a<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f30652a;

    /* renamed from: b, reason: collision with root package name */
    public OkHttpClient f30653b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30654c;

    /* renamed from: d, reason: collision with root package name */
    public int f30655d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30654c = obj;
        this.f30655d |= PKIFailureInfo.systemUnavail;
        return b.b(null, null, null, this);
    }
}
