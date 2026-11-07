package j9;

import j9.x1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesViewModel", f = "TemplatesViewModel.kt", l = {517, 518, 524, 582, 585}, m = "useTemplateInternal")
/* loaded from: classes.dex */
public final class z1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f15665a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15666b;

    /* renamed from: c, reason: collision with root package name */
    public x1.a f15667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15668d;

    /* renamed from: e, reason: collision with root package name */
    public long f15669e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1 f15671g;

    /* renamed from: h, reason: collision with root package name */
    public int f15672h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(x1 x1Var, vg.c cVar) {
        super(cVar);
        this.f15671g = x1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f15670f = obj;
        this.f15672h |= PKIFailureInfo.systemUnavail;
        return x1.f(this.f15671g, null, null, this);
    }
}
