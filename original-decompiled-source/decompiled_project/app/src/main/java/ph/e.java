package ph;

import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m = "joinAll")
/* loaded from: classes2.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f21522a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21523b;

    /* renamed from: c, reason: collision with root package name */
    public int f21524c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21523b = obj;
        this.f21524c |= PKIFailureInfo.systemUnavail;
        return a9.c2.b(null, this);
    }
}
