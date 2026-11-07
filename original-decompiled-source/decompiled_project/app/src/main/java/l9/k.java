package l9;

import android.os.PowerManager;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.util.BackgroundExecutionHelper", f = "BackgroundExecutionHelper.kt", l = {72}, m = "runWithWakeLock")
/* loaded from: classes.dex */
public final class k<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public String f16847a;

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f16848b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f16850d;

    /* renamed from: e, reason: collision with root package name */
    public int f16851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, vg.c cVar) {
        super(cVar);
        this.f16850d = lVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f16849c = obj;
        this.f16851e |= PKIFailureInfo.systemUnavail;
        return this.f16850d.a(null, null, 0L, null, this);
    }
}
