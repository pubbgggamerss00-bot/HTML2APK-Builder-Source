package v7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
/* loaded from: classes.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public hi.g f30659a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30660b;

    /* renamed from: c, reason: collision with root package name */
    public int f30661c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30660b = obj;
        this.f30661c |= PKIFailureInfo.systemUnavail;
        return g.c(null, this);
    }
}
