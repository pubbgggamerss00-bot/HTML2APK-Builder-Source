package q5;

import p5.d1;

/* loaded from: classes.dex */
public final class m implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f22005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s f22006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1.u f22007c;

    public m(h1.u uVar, p5.s sVar, o oVar) {
        this.f22005a = oVar;
        this.f22006b = sVar;
        this.f22007c = uVar;
    }

    @Override // x0.k0
    public final void a() {
        d1 d1VarB = this.f22005a.b();
        p5.s sVar = this.f22006b;
        d1VarB.f(sVar);
        this.f22007c.remove(sVar);
    }
}
