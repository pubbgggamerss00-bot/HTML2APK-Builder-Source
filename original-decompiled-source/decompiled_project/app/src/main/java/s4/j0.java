package s4;

import java.io.FileInputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
/* loaded from: classes.dex */
public final class j0<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24271a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f24272b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0<T> f24274d;

    /* renamed from: e, reason: collision with root package name */
    public int f24275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, vg.c cVar) {
        super(cVar);
        this.f24274d = k0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24273c = obj;
        this.f24275e |= PKIFailureInfo.systemUnavail;
        return k0.f(this.f24274d, this);
    }
}
