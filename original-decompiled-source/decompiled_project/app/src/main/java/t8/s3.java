package t8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel", f = "AiSessionViewModel.kt", l = {454}, m = "refreshName")
/* loaded from: classes.dex */
public final class s3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m3 f28450a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f28452c;

    /* renamed from: d, reason: collision with root package name */
    public int f28453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(m3 m3Var, vg.c cVar) {
        super(cVar);
        this.f28452c = m3Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28451b = obj;
        this.f28453d |= PKIFailureInfo.systemUnavail;
        return this.f28452c.l(this);
    }
}
