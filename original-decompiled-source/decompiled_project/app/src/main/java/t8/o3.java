package t8;

import h8.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel", f = "AiSessionViewModel.kt", l = {410, 413, 421, 426, 434, 436}, m = "finish")
/* loaded from: classes.dex */
public final class o3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m3 f28366a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28367b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28368c;

    /* renamed from: d, reason: collision with root package name */
    public m.a f28369d;

    /* renamed from: e, reason: collision with root package name */
    public int f28370e;

    /* renamed from: f, reason: collision with root package name */
    public long f28371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28372g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f28373h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m3 f28374j;

    /* renamed from: k, reason: collision with root package name */
    public int f28375k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(m3 m3Var, vg.c cVar) {
        super(cVar);
        this.f28374j = m3Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28373h = obj;
        this.f28375k |= PKIFailureInfo.systemUnavail;
        return m3.f(this.f28374j, 0, null, null, this);
    }
}
