package c2;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<o> f4684a = new z0.b<>(new o[16]);

    /* renamed from: b, reason: collision with root package name */
    public final p.h0<p> f4685b = new p.h0<>(10);

    public boolean a(p.q<b0> qVar, g2.v vVar, j jVar, boolean z10) {
        z0.b<o> bVar = this.f4684a;
        o[] oVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = oVarArr[i11].a(qVar, vVar, jVar, z10) || z11;
        }
        return z11;
    }

    public void b(j jVar) {
        z0.b<o> bVar = this.f4684a;
        int i10 = bVar.f34702c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (bVar.f34700a[i10].f4676d.f7321a == 0) {
                bVar.k(i10);
            }
        }
    }
}
