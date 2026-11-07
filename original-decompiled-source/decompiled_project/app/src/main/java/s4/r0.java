package s4;

import java.io.FileOutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
/* loaded from: classes.dex */
public final class r0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f24385a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f24386b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0<Object> f24388d;

    /* renamed from: e, reason: collision with root package name */
    public int f24389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, vg.c cVar) {
        super(cVar);
        this.f24388d = s0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24387c = obj;
        this.f24389e |= PKIFailureInfo.systemUnavail;
        return this.f24388d.c(null, this);
    }
}
