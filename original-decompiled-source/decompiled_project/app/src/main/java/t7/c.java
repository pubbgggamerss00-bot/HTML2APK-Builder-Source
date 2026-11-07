package t7;

import hi.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s7.s;
import vg.e;

@e(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
/* loaded from: classes.dex */
public final class c extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public s f28074a;

    /* renamed from: b, reason: collision with root package name */
    public g f28075b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28076c;

    /* renamed from: d, reason: collision with root package name */
    public int f28077d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28076c = obj;
        this.f28077d |= PKIFailureInfo.systemUnavail;
        return d.a(null, this);
    }
}
