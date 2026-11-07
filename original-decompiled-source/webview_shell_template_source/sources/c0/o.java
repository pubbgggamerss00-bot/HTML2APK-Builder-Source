package c0;

import androidx.camera.camera2.internal.p0;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f2105f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<b0.e> f2106a;

    /* renamed from: b, reason: collision with root package name */
    public int f2107b;

    /* renamed from: c, reason: collision with root package name */
    public int f2108c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a> f2109d;

    /* renamed from: e, reason: collision with root package name */
    public int f2110e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f2106a.size();
        if (this.f2110e != -1 && size > 0) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                o oVar = arrayList.get(i6);
                if (this.f2110e == oVar.f2107b) {
                    c(this.f2108c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(z.c cVar, int i6) {
        int iN;
        int iN2;
        ArrayList<b0.e> arrayList = this.f2106a;
        if (arrayList.size() == 0) {
            return 0;
        }
        b0.f fVar = (b0.f) arrayList.get(0).V;
        cVar.t();
        fVar.b(cVar, false);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList.get(i7).b(cVar, false);
        }
        if (i6 == 0 && fVar.A0 > 0) {
            b0.b.a(fVar, cVar, arrayList, 0);
        }
        if (i6 == 1 && fVar.B0 > 0) {
            b0.b.a(fVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e6) {
            System.err.println(e6.toString() + "\n" + Arrays.toString(e6.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        }
        this.f2109d = new ArrayList<>();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            b0.e eVar = arrayList.get(i8);
            a aVar = new a();
            new WeakReference(eVar);
            z.c.n(eVar.J);
            z.c.n(eVar.K);
            z.c.n(eVar.L);
            z.c.n(eVar.M);
            z.c.n(eVar.N);
            this.f2109d.add(aVar);
        }
        if (i6 == 0) {
            iN = z.c.n(fVar.J);
            iN2 = z.c.n(fVar.L);
            cVar.t();
        } else {
            iN = z.c.n(fVar.K);
            iN2 = z.c.n(fVar.M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i6, o oVar) {
        int i7 = oVar.f2107b;
        ArrayList<b0.e> arrayList = this.f2106a;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            b0.e eVar = arrayList.get(i8);
            i8++;
            b0.e eVar2 = eVar;
            ArrayList<b0.e> arrayList2 = oVar.f2106a;
            if (!arrayList2.contains(eVar2)) {
                arrayList2.add(eVar2);
            }
            if (i6 == 0) {
                eVar2.p0 = i7;
            } else {
                eVar2.f1924q0 = i7;
            }
        }
        this.f2110e = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i6 = this.f2108c;
        sb.append(i6 == 0 ? "Horizontal" : i6 == 1 ? "Vertical" : i6 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strA = p0.a(sb, this.f2107b, "] <");
        ArrayList<b0.e> arrayList = this.f2106a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            b0.e eVar = arrayList.get(i7);
            i7++;
            strA = strA + " " + eVar.f1911j0;
        }
        return androidx.camera.core.c.b(strA, " >");
    }
}
