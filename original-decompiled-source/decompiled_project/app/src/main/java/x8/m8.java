package x8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectReorderState", f = "ProjectReorderState.kt", l = {132}, m = "settle")
/* loaded from: classes.dex */
public final class m8 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public n8 f32939a;

    /* renamed from: b, reason: collision with root package name */
    public long f32940b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n8 f32942d;

    /* renamed from: e, reason: collision with root package name */
    public int f32943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var, vg.c cVar) {
        super(cVar);
        this.f32942d = n8Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32941c = obj;
        this.f32943e |= PKIFailureInfo.systemUnavail;
        return this.f32942d.h(this);
    }
}
