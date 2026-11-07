package u8;

/* loaded from: classes.dex */
public final class d1 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final k8.h f29418b;

    /* renamed from: c, reason: collision with root package name */
    public final sh.l0 f29419c;

    /* renamed from: d, reason: collision with root package name */
    public final sh.l0 f29420d;

    /* renamed from: e, reason: collision with root package name */
    public final sh.l0 f29421e;

    /* renamed from: f, reason: collision with root package name */
    public final sh.l0 f29422f;

    /* renamed from: g, reason: collision with root package name */
    public final sh.l0 f29423g;

    /* renamed from: h, reason: collision with root package name */
    public final sh.l0 f29424h;

    /* renamed from: i, reason: collision with root package name */
    public final sh.l0 f29425i;

    /* renamed from: j, reason: collision with root package name */
    public final sh.l0 f29426j;

    /* renamed from: k, reason: collision with root package name */
    public final sh.l0 f29427k;

    public d1(k8.h gameManager) {
        kotlin.jvm.internal.r.e(gameManager, "gameManager");
        this.f29418b = gameManager;
        this.f29419c = gameManager.f16097d;
        this.f29420d = gameManager.f16101h;
        this.f29421e = gameManager.f16103j;
        this.f29422f = gameManager.f16105l;
        this.f29423g = gameManager.f16107n;
        this.f29424h = gameManager.f16109p;
        this.f29425i = gameManager.f16111r;
        this.f29426j = gameManager.f16113t;
        this.f29427k = gameManager.f16099f;
        sh.z0 z0Var = gameManager.f16094a.f14230j;
    }

    public final void f() {
        Object value;
        k8.i iVar;
        k8.h hVar = this.f29418b;
        sh.z0 z0Var = hVar.f16098e;
        Long l10 = (Long) z0Var.getValue();
        if (l10 != null) {
            long jLongValue = l10.longValue();
            sh.z0 z0Var2 = hVar.f16096c;
            do {
                value = z0Var2.getValue();
                iVar = (k8.i) value;
            } while (!z0Var2.a(value, k8.i.a(iVar, iVar.f16120a + jLongValue, 0L, 0, iVar.f16123d + jLongValue, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65526)));
            z0Var.setValue(null);
            hVar.b(10);
            hVar.j();
        }
    }
}
