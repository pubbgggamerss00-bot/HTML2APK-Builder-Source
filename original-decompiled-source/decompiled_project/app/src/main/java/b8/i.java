package b8;

import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", l = {42}, m = "awaitStarted")
/* loaded from: classes.dex */
public final class i extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.l f3668a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f3669b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3670c;

    /* renamed from: d, reason: collision with root package name */
    public int f3671d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3670c = obj;
        this.f3671d |= PKIFailureInfo.systemUnavail;
        return k.a(null, this);
    }
}
