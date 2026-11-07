package t8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel", f = "AiSessionViewModel.kt", l = {380, 398}, m = "recover")
/* loaded from: classes.dex */
public final class r3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m3 f28428a;

    /* renamed from: b, reason: collision with root package name */
    public String f28429b;

    /* renamed from: c, reason: collision with root package name */
    public String f28430c;

    /* renamed from: d, reason: collision with root package name */
    public int f28431d;

    /* renamed from: e, reason: collision with root package name */
    public int f28432e;

    /* renamed from: f, reason: collision with root package name */
    public int f28433f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28434g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f28435h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m3 f28436j;

    /* renamed from: k, reason: collision with root package name */
    public int f28437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(m3 m3Var, vg.c cVar) {
        super(cVar);
        this.f28436j = m3Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28435h = obj;
        this.f28437k |= PKIFailureInfo.systemUnavail;
        return this.f28436j.k(0, null, null, false, this);
    }
}
