package b0;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import c0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: t0, reason: collision with root package name */
    public int f1974t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1975u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f1976v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1977w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1978x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f1979y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1980z0 = false;
    public int A0 = 0;
    public int B0 = 0;
    public final b.a C0 = new b.a();
    public b.InterfaceC0025b D0 = null;

    @Override // b0.i
    public final void S() {
        for (int i6 = 0; i6 < this.f1972s0; i6++) {
            e eVar = this.f1971r0[i6];
            if (eVar != null) {
                eVar.G = true;
            }
        }
    }

    public final void U(e eVar, e.a aVar, int i6, e.a aVar2, int i7) {
        b.InterfaceC0025b interfaceC0025b;
        e eVar2;
        while (true) {
            interfaceC0025b = this.D0;
            if (interfaceC0025b != null || (eVar2 = this.V) == null) {
                break;
            } else {
                this.D0 = ((f) eVar2).f1940v0;
            }
        }
        b.a aVar3 = this.C0;
        aVar3.f2062a = aVar;
        aVar3.f2063b = aVar2;
        aVar3.f2064c = i6;
        aVar3.f2065d = i7;
        ((ConstraintLayout.b) interfaceC0025b).b(eVar, aVar3);
        eVar.O(aVar3.f2066e);
        eVar.L(aVar3.f2067f);
        eVar.E = aVar3.h;
        eVar.I(aVar3.f2068g);
    }

    public void T(int i6, int i7, int i8, int i9) {
    }
}
