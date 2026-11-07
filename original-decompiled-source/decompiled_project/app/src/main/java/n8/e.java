package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator", f = "DocumentProjectCreator.kt", l = {129, 129}, m = "discard")
/* loaded from: classes.dex */
public final class e extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public g f18422a;

    /* renamed from: b, reason: collision with root package name */
    public long f18423b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f18425d;

    /* renamed from: e, reason: collision with root package name */
    public int f18426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, vg.c cVar) {
        super(cVar);
        this.f18425d = gVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18424c = obj;
        this.f18426e |= PKIFailureInfo.systemUnavail;
        return this.f18425d.c(0L, this);
    }
}
