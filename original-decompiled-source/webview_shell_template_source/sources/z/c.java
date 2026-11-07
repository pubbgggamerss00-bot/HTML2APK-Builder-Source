package z;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.internal.ads.yw;
import e3.i0;
import java.util.ArrayList;
import java.util.Arrays;
import z.d.b;
import z.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f15392q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f15396d;

    /* renamed from: m, reason: collision with root package name */
    public final yw f15404m;

    /* renamed from: p, reason: collision with root package name */
    public b f15407p;

    /* renamed from: a, reason: collision with root package name */
    public int f15393a = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15394b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f15395c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f15397e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f15398f = 32;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f15400i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f15401j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f15402k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f15403l = 32;

    /* renamed from: n, reason: collision with root package name */
    public e[] f15405n = new e[CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL];

    /* renamed from: o, reason: collision with root package name */
    public int f15406o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f15399g = new b[32];

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        e a(boolean[] zArr);
    }

    public c() {
        s();
        yw ywVar = new yw();
        ywVar.f11094t = new i0();
        ywVar.f11095u = new i0();
        ywVar.f11096v = new e[32];
        this.f15404m = ywVar;
        d dVar = new d(ywVar);
        dVar.f15408f = new e[128];
        dVar.f15409g = new e[128];
        dVar.h = 0;
        dVar.f15410i = dVar.new b();
        this.f15396d = dVar;
        this.f15407p = new b(ywVar);
    }

    public static int n(Object obj) {
        e eVar = ((b0.d) obj).f1885i;
        if (eVar != null) {
            return (int) (eVar.f15416w + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final e a(e.a aVar) {
        i0 i0Var = (i0) this.f15404m.f11095u;
        int i6 = i0Var.f12886a;
        e eVar = null;
        if (i6 > 0) {
            int i7 = i6 - 1;
            ?? r32 = (Object[]) i0Var.f12887b;
            ?? r42 = r32[i7];
            r32[i7] = 0;
            i0Var.f12886a = i7;
            eVar = r42;
        }
        e eVar2 = eVar;
        if (eVar2 == null) {
            eVar2 = new e(aVar);
            eVar2.A = aVar;
        } else {
            eVar2.c();
            eVar2.A = aVar;
        }
        int i8 = this.f15406o;
        int i9 = this.f15393a;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            this.f15393a = i10;
            this.f15405n = (e[]) Arrays.copyOf(this.f15405n, i10);
        }
        e[] eVarArr = this.f15405n;
        int i11 = this.f15406o;
        this.f15406o = i11 + 1;
        eVarArr[i11] = eVar2;
        return eVar2;
    }

    public final void b(e eVar, e eVar2, int i6, float f6, e eVar3, e eVar4, int i7, int i8) {
        b bVarL = l();
        if (eVar2 == eVar3) {
            bVarL.f15390d.f(eVar, 1.0f);
            bVarL.f15390d.f(eVar4, 1.0f);
            bVarL.f15390d.f(eVar2, -2.0f);
        } else if (f6 == 0.5f) {
            bVarL.f15390d.f(eVar, 1.0f);
            bVarL.f15390d.f(eVar2, -1.0f);
            bVarL.f15390d.f(eVar3, -1.0f);
            bVarL.f15390d.f(eVar4, 1.0f);
            if (i6 > 0 || i7 > 0) {
                bVarL.f15388b = (-i6) + i7;
            }
        } else if (f6 <= 0.0f) {
            bVarL.f15390d.f(eVar, -1.0f);
            bVarL.f15390d.f(eVar2, 1.0f);
            bVarL.f15388b = i6;
        } else if (f6 >= 1.0f) {
            bVarL.f15390d.f(eVar4, -1.0f);
            bVarL.f15390d.f(eVar3, 1.0f);
            bVarL.f15388b = -i7;
        } else {
            float f7 = 1.0f - f6;
            bVarL.f15390d.f(eVar, f7 * 1.0f);
            bVarL.f15390d.f(eVar2, f7 * (-1.0f));
            bVarL.f15390d.f(eVar3, (-1.0f) * f6);
            bVarL.f15390d.f(eVar4, 1.0f * f6);
            if (i6 > 0 || i7 > 0) {
                bVarL.f15388b = (i7 * f6) + ((-i6) * f7);
            }
        }
        if (i8 != 8) {
            bVarL.b(this, i8);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z6;
        e.a aVar;
        boolean z7;
        e eVar;
        e eVarF;
        boolean z8 = true;
        if (this.f15402k + 1 >= this.f15403l || this.f15401j + 1 >= this.f15398f) {
            o();
        }
        if (bVar.f15391e) {
            z6 = false;
        } else {
            ArrayList<e> arrayList = bVar.f15389c;
            if (this.f15399g.length != 0) {
                boolean z9 = false;
                while (!z9) {
                    int iA = bVar.f15390d.a();
                    for (int i6 = 0; i6 < iA; i6++) {
                        e eVarC = bVar.f15390d.c(i6);
                        if (eVarC.f15414u != -1 || eVarC.f15417x) {
                            arrayList.add(eVarC);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i7 = 0; i7 < size; i7++) {
                            e eVar2 = arrayList.get(i7);
                            if (eVar2.f15417x) {
                                bVar.h(this, eVar2, true);
                            } else {
                                bVar.i(this, this.f15399g[eVar2.f15414u], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z9 = true;
                    }
                }
                if (bVar.f15387a != null && bVar.f15390d.a() == 0) {
                    bVar.f15391e = true;
                    this.f15394b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f6 = bVar.f15388b;
            float f7 = 0.0f;
            if (f6 < 0.0f) {
                bVar.f15388b = f6 * (-1.0f);
                bVar.f15390d.d();
            }
            int iA2 = bVar.f15390d.a();
            float f8 = 0.0f;
            float f9 = 0.0f;
            e eVar3 = null;
            e eVar4 = null;
            int i8 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                aVar = e.a.s;
                if (i8 >= iA2) {
                    break;
                }
                float fE = bVar.f15390d.e(i8);
                float f10 = f7;
                e eVarC2 = bVar.f15390d.c(i8);
                if (eVarC2.A == aVar) {
                    if (eVar3 == null) {
                        z10 = eVarC2.D <= 1;
                    } else if (f8 > fE) {
                        if (eVarC2.D <= 1) {
                        }
                    } else if (z10 || eVarC2.D > 1) {
                    }
                    f8 = fE;
                    eVar3 = eVarC2;
                } else if (eVar3 == null && fE < f10) {
                    if (eVar4 == null) {
                        z11 = eVarC2.D <= 1;
                    } else if (f9 > fE) {
                        if (eVarC2.D <= 1) {
                        }
                    } else if (z11 || eVarC2.D > 1) {
                    }
                    f9 = fE;
                    eVar4 = eVarC2;
                }
                i8++;
                f7 = f10;
            }
            float f11 = f7;
            if (eVar3 == null) {
                eVar3 = eVar4;
            }
            if (eVar3 == null) {
                z7 = true;
            } else {
                bVar.g(eVar3);
                z7 = false;
            }
            if (bVar.f15390d.a() == 0) {
                bVar.f15391e = true;
            }
            if (z7) {
                if (this.f15401j + 1 >= this.f15398f) {
                    o();
                }
                e eVarA = a(e.a.f15420t);
                int i9 = this.f15395c + 1;
                this.f15395c = i9;
                this.f15401j++;
                eVarA.f15413t = i9;
                yw ywVar = this.f15404m;
                ((e[]) ywVar.f11096v)[i9] = eVarA;
                bVar.f15387a = eVarA;
                int i10 = this.f15402k;
                h(bVar);
                if (this.f15402k == i10 + 1) {
                    b bVar2 = this.f15407p;
                    bVar2.f15387a = null;
                    bVar2.f15390d.clear();
                    for (int i11 = 0; i11 < bVar.f15390d.a(); i11++) {
                        bVar2.f15390d.g(bVar.f15390d.c(i11), bVar.f15390d.e(i11), true);
                    }
                    r(this.f15407p);
                    if (eVarA.f15414u == -1) {
                        if (bVar.f15387a == eVarA && (eVarF = bVar.f(null, eVarA)) != null) {
                            bVar.g(eVarF);
                        }
                        if (!bVar.f15391e) {
                            bVar.f15387a.e(this, bVar);
                        }
                        ((i0) ywVar.f11094t).a(bVar);
                        this.f15402k--;
                    }
                }
                eVar = bVar.f15387a;
                if (eVar != null) {
                }
            } else {
                z8 = false;
                eVar = bVar.f15387a;
                if (eVar != null) {
                    return;
                }
                if (eVar.A != aVar && bVar.f15388b < f11) {
                    return;
                } else {
                    z6 = z8;
                }
            }
        }
        if (z6) {
            return;
        }
        h(bVar);
    }

    public final void d(e eVar, int i6) {
        int i7 = eVar.f15414u;
        if (i7 == -1) {
            eVar.d(this, i6);
            for (int i8 = 0; i8 < this.f15395c + 1; i8++) {
                e eVar2 = ((e[]) this.f15404m.f11096v)[i8];
            }
            return;
        }
        if (i7 == -1) {
            b bVarL = l();
            bVarL.f15387a = eVar;
            float f6 = i6;
            eVar.f15416w = f6;
            bVarL.f15388b = f6;
            bVarL.f15391e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f15399g[i7];
        if (bVar.f15391e) {
            bVar.f15388b = i6;
            return;
        }
        if (bVar.f15390d.a() == 0) {
            bVar.f15391e = true;
            bVar.f15388b = i6;
            return;
        }
        b bVarL2 = l();
        if (i6 < 0) {
            bVarL2.f15388b = i6 * (-1);
            bVarL2.f15390d.f(eVar, 1.0f);
        } else {
            bVarL2.f15388b = i6;
            bVarL2.f15390d.f(eVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(e eVar, e eVar2, int i6, int i7) {
        if (i7 == 8 && eVar2.f15417x && eVar.f15414u == -1) {
            eVar.d(this, eVar2.f15416w + i6);
            return;
        }
        b bVarL = l();
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            bVarL.f15388b = i6;
        }
        if (z6) {
            bVarL.f15390d.f(eVar, 1.0f);
            bVarL.f15390d.f(eVar2, -1.0f);
        } else {
            bVarL.f15390d.f(eVar, -1.0f);
            bVarL.f15390d.f(eVar2, 1.0f);
        }
        if (i7 != 8) {
            bVarL.b(this, i7);
        }
        c(bVarL);
    }

    public final void f(e eVar, e eVar2, int i6, int i7) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f15415v = 0;
        bVarL.c(eVar, eVar2, eVarM, i6);
        if (i7 != 8) {
            bVarL.f15390d.f(j(i7), (int) (bVarL.f15390d.k(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(e eVar, e eVar2, int i6, int i7) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f15415v = 0;
        bVarL.d(eVar, eVar2, eVarM, i6);
        if (i7 != 8) {
            bVarL.f15390d.f(j(i7), (int) (bVarL.f15390d.k(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i6;
        if (bVar.f15391e) {
            bVar.f15387a.d(this, bVar.f15388b);
        } else {
            b[] bVarArr = this.f15399g;
            int i7 = this.f15402k;
            bVarArr[i7] = bVar;
            e eVar = bVar.f15387a;
            eVar.f15414u = i7;
            this.f15402k = i7 + 1;
            eVar.e(this, bVar);
        }
        if (this.f15394b) {
            int i8 = 0;
            while (i8 < this.f15402k) {
                if (this.f15399g[i8] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f15399g[i8];
                if (bVar2 != null && bVar2.f15391e) {
                    bVar2.f15387a.d(this, bVar2.f15388b);
                    ((i0) this.f15404m.f11094t).a(bVar2);
                    this.f15399g[i8] = null;
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (true) {
                        i6 = this.f15402k;
                        if (i9 >= i6) {
                            break;
                        }
                        b[] bVarArr2 = this.f15399g;
                        int i11 = i9 - 1;
                        b bVar3 = bVarArr2[i9];
                        bVarArr2[i11] = bVar3;
                        e eVar2 = bVar3.f15387a;
                        if (eVar2.f15414u == i9) {
                            eVar2.f15414u = i11;
                        }
                        i10 = i9;
                        i9++;
                    }
                    if (i10 < i6) {
                        this.f15399g[i10] = null;
                    }
                    this.f15402k = i6 - 1;
                    i8--;
                }
                i8++;
            }
            this.f15394b = false;
        }
    }

    public final void i() {
        for (int i6 = 0; i6 < this.f15402k; i6++) {
            b bVar = this.f15399g[i6];
            bVar.f15387a.f15416w = bVar.f15388b;
        }
    }

    public final e j(int i6) {
        if (this.f15401j + 1 >= this.f15398f) {
            o();
        }
        e eVarA = a(e.a.f15421u);
        float[] fArr = eVarA.f15419z;
        int i7 = this.f15395c + 1;
        this.f15395c = i7;
        this.f15401j++;
        eVarA.f15413t = i7;
        eVarA.f15415v = i6;
        ((e[]) this.f15404m.f11096v)[i7] = eVarA;
        d dVar = this.f15396d;
        dVar.f15410i.f15411a = eVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[eVarA.f15415v] = 1.0f;
        dVar.j(eVarA);
        return eVarA;
    }

    public final e k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f15401j + 1 >= this.f15398f) {
            o();
        }
        if (!(obj instanceof b0.d)) {
            return null;
        }
        b0.d dVar = (b0.d) obj;
        e eVar = dVar.f1885i;
        if (eVar == null) {
            dVar.k();
            eVar = dVar.f1885i;
        }
        int i6 = eVar.f15413t;
        yw ywVar = this.f15404m;
        if (i6 != -1 && i6 <= this.f15395c && ((e[]) ywVar.f11096v)[i6] != null) {
            return eVar;
        }
        if (i6 != -1) {
            eVar.c();
        }
        int i7 = this.f15395c + 1;
        this.f15395c = i7;
        this.f15401j++;
        eVar.f15413t = i7;
        eVar.A = e.a.s;
        ((e[]) ywVar.f11096v)[i7] = eVar;
        return eVar;
    }

    public final b l() {
        Object obj;
        yw ywVar = this.f15404m;
        i0 i0Var = (i0) ywVar.f11094t;
        int i6 = i0Var.f12886a;
        if (i6 > 0) {
            int i7 = i6 - 1;
            Object[] objArr = (Object[]) i0Var.f12887b;
            obj = objArr[i7];
            objArr[i7] = null;
            i0Var.f12886a = i7;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(ywVar);
        }
        bVar.f15387a = null;
        bVar.f15390d.clear();
        bVar.f15388b = 0.0f;
        bVar.f15391e = false;
        return bVar;
    }

    public final e m() {
        if (this.f15401j + 1 >= this.f15398f) {
            o();
        }
        e eVarA = a(e.a.f15420t);
        int i6 = this.f15395c + 1;
        this.f15395c = i6;
        this.f15401j++;
        eVarA.f15413t = i6;
        ((e[]) this.f15404m.f11096v)[i6] = eVarA;
        return eVarA;
    }

    public final void o() {
        int i6 = this.f15397e * 2;
        this.f15397e = i6;
        this.f15399g = (b[]) Arrays.copyOf(this.f15399g, i6);
        yw ywVar = this.f15404m;
        ywVar.f11096v = (e[]) Arrays.copyOf((e[]) ywVar.f11096v, this.f15397e);
        int i7 = this.f15397e;
        this.f15400i = new boolean[i7];
        this.f15398f = i7;
        this.f15403l = i7;
    }

    public final void p() {
        d dVar = this.f15396d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(dVar);
            return;
        }
        for (int i6 = 0; i6 < this.f15402k; i6++) {
            if (!this.f15399g[i6].f15391e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i6 = 0;
        while (true) {
            if (i6 >= this.f15402k) {
                break;
            }
            b bVar = this.f15399g[i6];
            e.a aVar = bVar.f15387a.A;
            e.a aVar2 = e.a.s;
            if (aVar != aVar2) {
                float f6 = 0.0f;
                if (bVar.f15388b < 0.0f) {
                    boolean z6 = false;
                    int i7 = 0;
                    while (!z6) {
                        i7++;
                        float f7 = Float.MAX_VALUE;
                        int i8 = 0;
                        int i9 = -1;
                        int i10 = -1;
                        int i11 = 0;
                        while (i8 < this.f15402k) {
                            b bVar2 = this.f15399g[i8];
                            if (bVar2.f15387a.A != aVar2 && !bVar2.f15391e && bVar2.f15388b < f6) {
                                int iA = bVar2.f15390d.a();
                                int i12 = 0;
                                while (i12 < iA) {
                                    e eVarC = bVar2.f15390d.c(i12);
                                    float f8 = f6;
                                    float fK = bVar2.f15390d.k(eVarC);
                                    if (fK > f8) {
                                        for (int i13 = 0; i13 < 9; i13++) {
                                            float f9 = eVarC.f15418y[i13] / fK;
                                            if ((f9 < f7 && i13 == i11) || i13 > i11) {
                                                i11 = i13;
                                                i10 = eVarC.f15413t;
                                                i9 = i8;
                                                f7 = f9;
                                            }
                                        }
                                    }
                                    i12++;
                                    f6 = f8;
                                }
                            }
                            i8++;
                            f6 = f6;
                        }
                        float f10 = f6;
                        if (i9 != -1) {
                            b bVar3 = this.f15399g[i9];
                            bVar3.f15387a.f15414u = -1;
                            bVar3.g(((e[]) this.f15404m.f11096v)[i10]);
                            e eVar = bVar3.f15387a;
                            eVar.f15414u = i9;
                            eVar.e(this, bVar3);
                        } else {
                            z6 = true;
                        }
                        if (i7 > this.f15401j / 2) {
                            z6 = true;
                        }
                        f6 = f10;
                    }
                }
            }
            i6++;
        }
        r(dVar);
        i();
    }

    public final void r(a aVar) {
        for (int i6 = 0; i6 < this.f15401j; i6++) {
            this.f15400i[i6] = false;
        }
        boolean z6 = false;
        int i7 = 0;
        while (!z6) {
            i7++;
            if (i7 >= this.f15401j * 2) {
                return;
            }
            e eVar = ((b) aVar).f15387a;
            if (eVar != null) {
                this.f15400i[eVar.f15413t] = true;
            }
            e eVarA = aVar.a(this.f15400i);
            if (eVarA != null) {
                boolean[] zArr = this.f15400i;
                int i8 = eVarA.f15413t;
                if (zArr[i8]) {
                    return;
                } else {
                    zArr[i8] = true;
                }
            }
            if (eVarA != null) {
                float f6 = Float.MAX_VALUE;
                int i9 = -1;
                for (int i10 = 0; i10 < this.f15402k; i10++) {
                    b bVar = this.f15399g[i10];
                    if (bVar.f15387a.A != e.a.s && !bVar.f15391e && bVar.f15390d.b(eVarA)) {
                        float fK = bVar.f15390d.k(eVarA);
                        if (fK < 0.0f) {
                            float f7 = (-bVar.f15388b) / fK;
                            if (f7 < f6) {
                                i9 = i10;
                                f6 = f7;
                            }
                        }
                    }
                }
                if (i9 > -1) {
                    b bVar2 = this.f15399g[i9];
                    bVar2.f15387a.f15414u = -1;
                    bVar2.g(eVarA);
                    e eVar2 = bVar2.f15387a;
                    eVar2.f15414u = i9;
                    eVar2.e(this, bVar2);
                }
            } else {
                z6 = true;
            }
        }
    }

    public final void s() {
        for (int i6 = 0; i6 < this.f15402k; i6++) {
            b bVar = this.f15399g[i6];
            if (bVar != null) {
                ((i0) this.f15404m.f11094t).a(bVar);
            }
            this.f15399g[i6] = null;
        }
    }

    public final void t() {
        yw ywVar;
        int i6 = 0;
        while (true) {
            ywVar = this.f15404m;
            e[] eVarArr = (e[]) ywVar.f11096v;
            if (i6 >= eVarArr.length) {
                break;
            }
            e eVar = eVarArr[i6];
            if (eVar != null) {
                eVar.c();
            }
            i6++;
        }
        i0 i0Var = (i0) ywVar.f11095u;
        e[] eVarArr2 = this.f15405n;
        int length = this.f15406o;
        i0Var.getClass();
        if (length > eVarArr2.length) {
            length = eVarArr2.length;
        }
        for (int i7 = 0; i7 < length; i7++) {
            e eVar2 = eVarArr2[i7];
            int i8 = i0Var.f12886a;
            Object[] objArr = (Object[]) i0Var.f12887b;
            if (i8 < objArr.length) {
                objArr[i8] = eVar2;
                i0Var.f12886a = i8 + 1;
            }
        }
        this.f15406o = 0;
        Arrays.fill((e[]) ywVar.f11096v, (Object) null);
        this.f15395c = 0;
        d dVar = this.f15396d;
        dVar.h = 0;
        dVar.f15388b = 0.0f;
        this.f15401j = 1;
        for (int i9 = 0; i9 < this.f15402k; i9++) {
            b bVar = this.f15399g[i9];
        }
        s();
        this.f15402k = 0;
        this.f15407p = new b(ywVar);
    }
}
