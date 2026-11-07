package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
/* loaded from: classes.dex */
public final class o0<R> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public q0 f24351a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f24352b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24353c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0<Object> f24355e;

    /* renamed from: f, reason: collision with root package name */
    public int f24356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, vg.c cVar) {
        super(cVar);
        this.f24355e = q0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24354d = obj;
        this.f24356f |= PKIFailureInfo.systemUnavail;
        return this.f24355e.d(null, this);
    }
}
