package d0;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final b f7127a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final p.l0<Object, b> f7128b = p.w0.b();

    /* renamed from: c, reason: collision with root package name */
    public Object f7129c;

    /* renamed from: d, reason: collision with root package name */
    public b f7130d;

    public final b a(Object obj) {
        b bVar = this.f7130d;
        if (this.f7129c == obj && bVar != null) {
            return bVar;
        }
        p.l0<Object, b> l0Var = this.f7128b;
        b bVarD = l0Var.d(obj);
        if (bVarD == null) {
            b bVar2 = this.f7127a;
            bVar2.getClass();
            b bVar3 = new b();
            bVar3.f7054a = bVar2.f7054a;
            bVar3.f7055b = bVar2.f7055b;
            l0Var.l(obj, bVar3);
            bVarD = bVar3;
        }
        b bVar4 = bVarD;
        this.f7129c = obj;
        this.f7130d = bVar4;
        return bVar4;
    }
}
