package z;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.yw;
import java.util.Arrays;
import z.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f15379b;

    /* renamed from: c, reason: collision with root package name */
    public final yw f15380c;

    /* renamed from: a, reason: collision with root package name */
    public int f15378a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f15381d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15382e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f15383f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f15384g = new float[8];
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f15385i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15386j = false;

    public a(b bVar, yw ywVar) {
        this.f15379b = bVar;
        this.f15380c = ywVar;
    }

    @Override // z.b.a
    public final int a() {
        return this.f15378a;
    }

    @Override // z.b.a
    public final boolean b(e eVar) {
        int i6 = this.h;
        if (i6 != -1) {
            for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
                if (this.f15382e[i6] == eVar.f15413t) {
                    return true;
                }
                i6 = this.f15383f[i6];
            }
        }
        return false;
    }

    @Override // z.b.a
    public final e c(int i6) {
        int i7 = this.h;
        for (int i8 = 0; i7 != -1 && i8 < this.f15378a; i8++) {
            if (i8 == i6) {
                return ((e[]) this.f15380c.f11096v)[this.f15382e[i7]];
            }
            i7 = this.f15383f[i7];
        }
        return null;
    }

    @Override // z.b.a
    public final void clear() {
        int i6 = this.h;
        for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
            e eVar = ((e[]) this.f15380c.f11096v)[this.f15382e[i6]];
            if (eVar != null) {
                eVar.b(this.f15379b);
            }
            i6 = this.f15383f[i6];
        }
        this.h = -1;
        this.f15385i = -1;
        this.f15386j = false;
        this.f15378a = 0;
    }

    @Override // z.b.a
    public final void d() {
        int i6 = this.h;
        for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
            float[] fArr = this.f15384g;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f15383f[i6];
        }
    }

    @Override // z.b.a
    public final float e(int i6) {
        int i7 = this.h;
        for (int i8 = 0; i7 != -1 && i8 < this.f15378a; i8++) {
            if (i8 == i6) {
                return this.f15384g[i7];
            }
            i7 = this.f15383f[i7];
        }
        return 0.0f;
    }

    @Override // z.b.a
    public final void f(e eVar, float f6) {
        if (f6 == 0.0f) {
            h(eVar, true);
            return;
        }
        int i6 = this.h;
        b bVar = this.f15379b;
        if (i6 == -1) {
            this.h = 0;
            this.f15384g[0] = f6;
            this.f15382e[0] = eVar.f15413t;
            this.f15383f[0] = -1;
            eVar.D++;
            eVar.a(bVar);
            this.f15378a++;
            if (this.f15386j) {
                return;
            }
            int i7 = this.f15385i + 1;
            this.f15385i = i7;
            int[] iArr = this.f15382e;
            if (i7 >= iArr.length) {
                this.f15386j = true;
                this.f15385i = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i6 != -1 && i9 < this.f15378a; i9++) {
            int i10 = this.f15382e[i6];
            int i11 = eVar.f15413t;
            if (i10 == i11) {
                this.f15384g[i6] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i6;
            }
            i6 = this.f15383f[i6];
        }
        int length = this.f15385i;
        int i12 = length + 1;
        if (this.f15386j) {
            int[] iArr2 = this.f15382e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i12;
        }
        int[] iArr3 = this.f15382e;
        if (length >= iArr3.length && this.f15378a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f15382e;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    length = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f15382e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i14 = this.f15381d * 2;
            this.f15381d = i14;
            this.f15386j = false;
            this.f15385i = length - 1;
            this.f15384g = Arrays.copyOf(this.f15384g, i14);
            this.f15382e = Arrays.copyOf(this.f15382e, this.f15381d);
            this.f15383f = Arrays.copyOf(this.f15383f, this.f15381d);
        }
        this.f15382e[length] = eVar.f15413t;
        this.f15384g[length] = f6;
        if (i8 != -1) {
            int[] iArr6 = this.f15383f;
            iArr6[length] = iArr6[i8];
            iArr6[i8] = length;
        } else {
            this.f15383f[length] = this.h;
            this.h = length;
        }
        eVar.D++;
        eVar.a(bVar);
        int i15 = this.f15378a + 1;
        this.f15378a = i15;
        if (!this.f15386j) {
            this.f15385i++;
        }
        int[] iArr7 = this.f15382e;
        if (i15 >= iArr7.length) {
            this.f15386j = true;
        }
        if (this.f15385i >= iArr7.length) {
            this.f15386j = true;
            this.f15385i = iArr7.length - 1;
        }
    }

    @Override // z.b.a
    public final void g(e eVar, float f6, boolean z6) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i6 = this.h;
            b bVar = this.f15379b;
            if (i6 == -1) {
                this.h = 0;
                this.f15384g[0] = f6;
                this.f15382e[0] = eVar.f15413t;
                this.f15383f[0] = -1;
                eVar.D++;
                eVar.a(bVar);
                this.f15378a++;
                if (this.f15386j) {
                    return;
                }
                int i7 = this.f15385i + 1;
                this.f15385i = i7;
                int[] iArr = this.f15382e;
                if (i7 >= iArr.length) {
                    this.f15386j = true;
                    this.f15385i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i6 != -1 && i9 < this.f15378a; i9++) {
                int i10 = this.f15382e[i6];
                int i11 = eVar.f15413t;
                if (i10 == i11) {
                    float[] fArr = this.f15384g;
                    float f7 = fArr[i6] + f6;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i6] = f7;
                    if (f7 == 0.0f) {
                        if (i6 == this.h) {
                            this.h = this.f15383f[i6];
                        } else {
                            int[] iArr2 = this.f15383f;
                            iArr2[i8] = iArr2[i6];
                        }
                        if (z6) {
                            eVar.b(bVar);
                        }
                        if (this.f15386j) {
                            this.f15385i = i6;
                        }
                        eVar.D--;
                        this.f15378a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i6;
                }
                i6 = this.f15383f[i6];
            }
            int length = this.f15385i;
            int i12 = length + 1;
            if (this.f15386j) {
                int[] iArr3 = this.f15382e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i12;
            }
            int[] iArr4 = this.f15382e;
            if (length >= iArr4.length && this.f15378a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f15382e;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        length = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f15382e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i14 = this.f15381d * 2;
                this.f15381d = i14;
                this.f15386j = false;
                this.f15385i = length - 1;
                this.f15384g = Arrays.copyOf(this.f15384g, i14);
                this.f15382e = Arrays.copyOf(this.f15382e, this.f15381d);
                this.f15383f = Arrays.copyOf(this.f15383f, this.f15381d);
            }
            this.f15382e[length] = eVar.f15413t;
            this.f15384g[length] = f6;
            if (i8 != -1) {
                int[] iArr7 = this.f15383f;
                iArr7[length] = iArr7[i8];
                iArr7[i8] = length;
            } else {
                this.f15383f[length] = this.h;
                this.h = length;
            }
            eVar.D++;
            eVar.a(bVar);
            this.f15378a++;
            if (!this.f15386j) {
                this.f15385i++;
            }
            int i15 = this.f15385i;
            int[] iArr8 = this.f15382e;
            if (i15 >= iArr8.length) {
                this.f15386j = true;
                this.f15385i = iArr8.length - 1;
            }
        }
    }

    @Override // z.b.a
    public final float h(e eVar, boolean z6) {
        int i6 = this.h;
        if (i6 == -1) {
            return 0.0f;
        }
        int i7 = 0;
        int i8 = -1;
        while (i6 != -1 && i7 < this.f15378a) {
            if (this.f15382e[i6] == eVar.f15413t) {
                if (i6 == this.h) {
                    this.h = this.f15383f[i6];
                } else {
                    int[] iArr = this.f15383f;
                    iArr[i8] = iArr[i6];
                }
                if (z6) {
                    eVar.b(this.f15379b);
                }
                eVar.D--;
                this.f15378a--;
                this.f15382e[i6] = -1;
                if (this.f15386j) {
                    this.f15385i = i6;
                }
                return this.f15384g[i6];
            }
            i7++;
            i8 = i6;
            i6 = this.f15383f[i6];
        }
        return 0.0f;
    }

    @Override // z.b.a
    public final void i(float f6) {
        int i6 = this.h;
        for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
            float[] fArr = this.f15384g;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f15383f[i6];
        }
    }

    @Override // z.b.a
    public final float j(b bVar, boolean z6) {
        float fK = k(bVar.f15387a);
        h(bVar.f15387a, z6);
        b.a aVar = bVar.f15390d;
        int iA = aVar.a();
        for (int i6 = 0; i6 < iA; i6++) {
            e eVarC = aVar.c(i6);
            g(eVarC, aVar.k(eVarC) * fK, z6);
        }
        return fK;
    }

    @Override // z.b.a
    public final float k(e eVar) {
        int i6 = this.h;
        for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
            if (this.f15382e[i6] == eVar.f15413t) {
                return this.f15384g[i6];
            }
            i6 = this.f15383f[i6];
        }
        return 0.0f;
    }

    public final String toString() {
        int i6 = this.h;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i7 = 0; i6 != -1 && i7 < this.f15378a; i7++) {
            str = (androidx.camera.core.c.b(str, " -> ") + this.f15384g[i6] + " : ") + ((e[]) this.f15380c.f11096v)[this.f15382e[i6]];
            i6 = this.f15383f[i6];
        }
        return str;
    }
}
