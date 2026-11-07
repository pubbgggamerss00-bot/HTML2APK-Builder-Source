package z;

import java.util.Arrays;
import java.util.Comparator;
import z.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends z.b {

    /* renamed from: f, reason: collision with root package name */
    public e[] f15408f;

    /* renamed from: g, reason: collision with root package name */
    public e[] f15409g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public b f15410i;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f15413t - eVar2.f15413t;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public e f15411a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f15411a != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    str = str + this.f15411a.f15419z[i6] + " ";
                }
            }
            return str + "] " + this.f15411a;
        }
    }

    @Override // z.b, z.c.a
    public final e a(boolean[] zArr) {
        int i6 = -1;
        for (int i7 = 0; i7 < this.h; i7++) {
            e[] eVarArr = this.f15408f;
            e eVar = eVarArr[i7];
            if (!zArr[eVar.f15413t]) {
                b bVar = this.f15410i;
                bVar.f15411a = eVar;
                int i8 = 8;
                if (i6 == -1) {
                    while (i8 >= 0) {
                        float f6 = bVar.f15411a.f15419z[i8];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i6 = i7;
                                break;
                            }
                            i8--;
                        }
                    }
                } else {
                    e eVar2 = eVarArr[i6];
                    while (true) {
                        if (i8 >= 0) {
                            float f7 = eVar2.f15419z[i8];
                            float f8 = bVar.f15411a.f15419z[i8];
                            if (f8 == f7) {
                                i8--;
                            } else if (f8 < f7) {
                            }
                        }
                    }
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f15408f[i6];
    }

    @Override // z.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // z.b
    public final void i(c cVar, z.b bVar, boolean z6) {
        e eVar = bVar.f15387a;
        if (eVar == null) {
            return;
        }
        float[] fArr = eVar.f15419z;
        b.a aVar = bVar.f15390d;
        int iA = aVar.a();
        for (int i6 = 0; i6 < iA; i6++) {
            e eVarC = aVar.c(i6);
            float fE = aVar.e(i6);
            b bVar2 = this.f15410i;
            bVar2.f15411a = eVarC;
            if (eVarC.s) {
                boolean z7 = true;
                for (int i7 = 0; i7 < 9; i7++) {
                    float[] fArr2 = bVar2.f15411a.f15419z;
                    float f6 = (fArr[i7] * fE) + fArr2[i7];
                    fArr2[i7] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        bVar2.f15411a.f15419z[i7] = 0.0f;
                    } else {
                        z7 = false;
                    }
                }
                if (z7) {
                    d.this.k(bVar2.f15411a);
                }
            } else {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f7 = fArr[i8];
                    if (f7 != 0.0f) {
                        float f8 = f7 * fE;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        bVar2.f15411a.f15419z[i8] = f8;
                    } else {
                        bVar2.f15411a.f15419z[i8] = 0.0f;
                    }
                }
                j(eVarC);
            }
            this.f15388b = (bVar.f15388b * fE) + this.f15388b;
        }
        k(eVar);
    }

    public final void j(e eVar) {
        int i6;
        int i7 = this.h + 1;
        e[] eVarArr = this.f15408f;
        if (i7 > eVarArr.length) {
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            this.f15408f = eVarArr2;
            this.f15409g = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length * 2);
        }
        e[] eVarArr3 = this.f15408f;
        int i8 = this.h;
        eVarArr3[i8] = eVar;
        int i9 = i8 + 1;
        this.h = i9;
        if (i9 > 1 && eVarArr3[i8].f15413t > eVar.f15413t) {
            int i10 = 0;
            while (true) {
                i6 = this.h;
                if (i10 >= i6) {
                    break;
                }
                this.f15409g[i10] = this.f15408f[i10];
                i10++;
            }
            Arrays.sort(this.f15409g, 0, i6, new a());
            for (int i11 = 0; i11 < this.h; i11++) {
                this.f15408f[i11] = this.f15409g[i11];
            }
        }
        eVar.s = true;
        eVar.a(this);
    }

    public final void k(e eVar) {
        int i6 = 0;
        while (i6 < this.h) {
            if (this.f15408f[i6] == eVar) {
                while (true) {
                    int i7 = this.h;
                    if (i6 >= i7 - 1) {
                        this.h = i7 - 1;
                        eVar.s = false;
                        return;
                    } else {
                        e[] eVarArr = this.f15408f;
                        int i8 = i6 + 1;
                        eVarArr[i6] = eVarArr[i8];
                        i6 = i8;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // z.b
    public final String toString() {
        b bVar = this.f15410i;
        String str = " goal -> (" + this.f15388b + ") : ";
        for (int i6 = 0; i6 < this.h; i6++) {
            bVar.f15411a = this.f15408f[i6];
            str = str + bVar + " ";
        }
        return str;
    }
}
