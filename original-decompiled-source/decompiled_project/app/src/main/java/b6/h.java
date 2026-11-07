package b6;

import androidx.room.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {249, 251, 251}, m = "performSuspending")
/* loaded from: classes.dex */
public final class h<R> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public g0 f3614a;

    /* renamed from: b, reason: collision with root package name */
    public eh.l f3615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3617d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3618e;

    /* renamed from: f, reason: collision with root package name */
    public int f3619f;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f3618e = obj;
        this.f3619f |= PKIFailureInfo.systemUnavail;
        return c.g(null, null, this, false, false);
    }
}
