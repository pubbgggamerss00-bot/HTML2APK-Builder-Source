package t8;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel", f = "AiSessionViewModel.kt", l = {281, 282, 293, 366, 371}, m = "stream")
/* loaded from: classes.dex */
public final class w3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m3 f28544a;

    /* renamed from: b, reason: collision with root package name */
    public String f28545b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f28546c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28547d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f28548e;

    /* renamed from: f, reason: collision with root package name */
    public String f28549f;

    /* renamed from: g, reason: collision with root package name */
    public String f28550g;

    /* renamed from: h, reason: collision with root package name */
    public String f28551h;

    /* renamed from: j, reason: collision with root package name */
    public String f28552j;

    /* renamed from: k, reason: collision with root package name */
    public int f28553k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f28554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m3 f28555m;

    /* renamed from: n, reason: collision with root package name */
    public int f28556n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(m3 m3Var, vg.c cVar) {
        super(cVar);
        this.f28555m = m3Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f28554l = obj;
        this.f28556n |= PKIFailureInfo.systemUnavail;
        return this.f28555m.n(0, null, null, null, null, this);
    }
}
