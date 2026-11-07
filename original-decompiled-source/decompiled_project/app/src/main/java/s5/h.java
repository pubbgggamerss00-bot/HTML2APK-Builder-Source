package s5;

import kotlin.jvm.internal.b0;
import p5.s;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f24467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f24468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f24469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg.l f24471e;

    public /* synthetic */ h(b0 b0Var, b0 b0Var2, l lVar, boolean z10, qg.l lVar2) {
        this.f24467a = b0Var;
        this.f24468b = b0Var2;
        this.f24469c = lVar;
        this.f24470d = z10;
        this.f24471e = lVar2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        s entry = (s) obj;
        kotlin.jvm.internal.r.e(entry, "entry");
        this.f24467a.f16318a = true;
        this.f24468b.f16318a = true;
        this.f24469c.p(entry, this.f24470d, this.f24471e);
        return f0.f21461a;
    }
}
