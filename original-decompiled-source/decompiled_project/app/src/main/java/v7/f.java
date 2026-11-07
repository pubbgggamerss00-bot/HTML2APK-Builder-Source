package v7;

import okhttp3.Request;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s7.p;

@vg.e(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {32}, m = "toRequest")
/* loaded from: classes.dex */
public final class f extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public p f30662a;

    /* renamed from: b, reason: collision with root package name */
    public Request.Builder f30663b;

    /* renamed from: c, reason: collision with root package name */
    public Request.Builder f30664c;

    /* renamed from: d, reason: collision with root package name */
    public String f30665d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30666e;

    /* renamed from: f, reason: collision with root package name */
    public int f30667f;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30666e = obj;
        this.f30667f |= PKIFailureInfo.systemUnavail;
        return g.b(null, this);
    }
}
