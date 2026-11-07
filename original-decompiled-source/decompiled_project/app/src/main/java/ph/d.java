package ph;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {EACTags.PIN_USAGE_POLICY}, m = "joinAll")
/* loaded from: classes2.dex */
public final class d extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f21516a;

    /* renamed from: b, reason: collision with root package name */
    public int f21517b;

    /* renamed from: c, reason: collision with root package name */
    public int f21518c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21519d;

    /* renamed from: e, reason: collision with root package name */
    public int f21520e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21519d = obj;
        this.f21520e |= PKIFailureInfo.systemUnavail;
        return a9.c2.c(null, this);
    }
}
