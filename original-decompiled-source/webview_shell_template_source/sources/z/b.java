package z;

import androidx.camera.core.processing.util.GLUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.yw;
import java.util.ArrayList;
import z.c;
import z.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f15390d;

    /* renamed from: a, reason: collision with root package name */
    public e f15387a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f15388b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f15389c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f15391e = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        int a();

        boolean b(e eVar);

        e c(int i6);

        void clear();

        void d();

        float e(int i6);

        void f(e eVar, float f6);

        void g(e eVar, float f6, boolean z6);

        float h(e eVar, boolean z6);

        void i(float f6);

        float j(b bVar, boolean z6);

        float k(e eVar);
    }

    public b() {
    }

    @Override // z.c.a
    public e a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i6) {
        this.f15390d.f(cVar.j(i6), 1.0f);
        this.f15390d.f(cVar.j(i6), -1.0f);
    }

    public final void c(e eVar, e eVar2, e eVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f15388b = i6;
        }
        if (z6) {
            this.f15390d.f(eVar, 1.0f);
            this.f15390d.f(eVar2, -1.0f);
            this.f15390d.f(eVar3, -1.0f);
        } else {
            this.f15390d.f(eVar, -1.0f);
            this.f15390d.f(eVar2, 1.0f);
            this.f15390d.f(eVar3, 1.0f);
        }
    }

    public final void d(e eVar, e eVar2, e eVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f15388b = i6;
        }
        if (z6) {
            this.f15390d.f(eVar, 1.0f);
            this.f15390d.f(eVar2, -1.0f);
            this.f15390d.f(eVar3, 1.0f);
        } else {
            this.f15390d.f(eVar, -1.0f);
            this.f15390d.f(eVar2, 1.0f);
            this.f15390d.f(eVar3, -1.0f);
        }
    }

    public boolean e() {
        return this.f15387a == null && this.f15388b == 0.0f && this.f15390d.a() == 0;
    }

    public final e f(boolean[] zArr, e eVar) {
        e.a aVar;
        int iA = this.f15390d.a();
        e eVar2 = null;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < iA; i6++) {
            float fE = this.f15390d.e(i6);
            if (fE < 0.0f) {
                e eVarC = this.f15390d.c(i6);
                if ((zArr == null || !zArr[eVarC.f15413t]) && eVarC != eVar && (((aVar = eVarC.A) == e.a.f15420t || aVar == e.a.f15421u) && fE < f6)) {
                    f6 = fE;
                    eVar2 = eVarC;
                }
            }
        }
        return eVar2;
    }

    public final void g(e eVar) {
        e eVar2 = this.f15387a;
        if (eVar2 != null) {
            this.f15390d.f(eVar2, -1.0f);
            this.f15387a.f15414u = -1;
            this.f15387a = null;
        }
        float fH = this.f15390d.h(eVar, true) * (-1.0f);
        this.f15387a = eVar;
        if (fH == 1.0f) {
            return;
        }
        this.f15388b /= fH;
        this.f15390d.i(fH);
    }

    public final void h(c cVar, e eVar, boolean z6) {
        if (eVar.f15417x) {
            float fK = this.f15390d.k(eVar);
            this.f15388b = (eVar.f15416w * fK) + this.f15388b;
            this.f15390d.h(eVar, z6);
            if (z6) {
                eVar.b(this);
            }
            if (this.f15390d.a() == 0) {
                this.f15391e = true;
                cVar.f15394b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z6) {
        float fJ = this.f15390d.j(bVar, z6);
        this.f15388b = (bVar.f15388b * fJ) + this.f15388b;
        if (z6) {
            bVar.f15387a.b(this);
        }
        if (this.f15387a == null || this.f15390d.a() != 0) {
            return;
        }
        this.f15391e = true;
        cVar.f15394b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z6;
        String strB = androidx.camera.core.c.b(this.f15387a == null ? "0" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + this.f15387a, " = ");
        if (this.f15388b != 0.0f) {
            strB = strB + this.f15388b;
            z6 = true;
        } else {
            z6 = false;
        }
        int iA = this.f15390d.a();
        for (int i6 = 0; i6 < iA; i6++) {
            e eVarC = this.f15390d.c(i6);
            if (eVarC != null) {
                float fE = this.f15390d.e(i6);
                if (fE != 0.0f) {
                    String string = eVarC.toString();
                    if (!z6) {
                        if (fE < 0.0f) {
                            strB = androidx.camera.core.c.b(strB, "- ");
                            fE *= -1.0f;
                        }
                        strB = fE == 1.0f ? androidx.camera.core.c.b(strB, string) : strB + fE + " " + string;
                        z6 = true;
                    } else if (fE > 0.0f) {
                        strB = androidx.camera.core.c.b(strB, " + ");
                        if (fE == 1.0f) {
                        }
                        z6 = true;
                    } else {
                        strB = androidx.camera.core.c.b(strB, " - ");
                        fE *= -1.0f;
                        if (fE == 1.0f) {
                        }
                        z6 = true;
                    }
                }
            }
        }
        return !z6 ? androidx.camera.core.c.b(strB, GLUtils.VERSION_UNKNOWN) : strB;
    }

    public b(yw ywVar) {
        this.f15390d = new z.a(this, ywVar);
    }
}
