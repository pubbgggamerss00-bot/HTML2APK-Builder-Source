package n8;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository", f = "SettingsRepository.kt", l = {BERTags.FLAGS}, m = "setLanguage")
/* loaded from: classes.dex */
public final class b0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m1 f18382a;

    /* renamed from: b, reason: collision with root package name */
    public String f18383b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f18385d;

    /* renamed from: e, reason: collision with root package name */
    public int f18386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(m1 m1Var, vg.c cVar) {
        super(cVar);
        this.f18385d = m1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18384c = obj;
        this.f18386e |= PKIFailureInfo.systemUnavail;
        return this.f18385d.c(null, this);
    }
}
