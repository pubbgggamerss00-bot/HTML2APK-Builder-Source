package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.ti;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final w.g<RecyclerView.b0, a> f1603a = new w.g<>();

    /* renamed from: b, reason: collision with root package name */
    public final w.d<RecyclerView.b0> f1604b = new w.d<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final ti f1605d = new ti(20, 3);

        /* renamed from: a, reason: collision with root package name */
        public int f1606a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.j.b f1607b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.j.b f1608c;

        public static a a() {
            a aVar = (a) f1605d.c();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.b0 b0Var, RecyclerView.j.b bVar) {
        w.g<RecyclerView.b0, a> gVar = this.f1603a;
        a aVarA = gVar.get(b0Var);
        if (aVarA == null) {
            aVarA = a.a();
            gVar.put(b0Var, aVarA);
        }
        aVarA.f1608c = bVar;
        aVarA.f1606a |= 8;
    }

    public final RecyclerView.j.b b(RecyclerView.b0 b0Var, int i6) {
        a aVarI;
        RecyclerView.j.b bVar;
        w.g<RecyclerView.b0, a> gVar = this.f1603a;
        int iD = gVar.d(b0Var);
        if (iD >= 0 && (aVarI = gVar.i(iD)) != null) {
            int i7 = aVarI.f1606a;
            if ((i7 & i6) != 0) {
                int i8 = i7 & (~i6);
                aVarI.f1606a = i8;
                if (i6 == 4) {
                    bVar = aVarI.f1607b;
                } else {
                    if (i6 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVarI.f1608c;
                }
                if ((i8 & 12) == 0) {
                    gVar.g(iD);
                    aVarI.f1606a = 0;
                    aVarI.f1607b = null;
                    aVarI.f1608c = null;
                    a.f1605d.d(aVarI);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.b0 b0Var) {
        a aVar = this.f1603a.get(b0Var);
        if (aVar == null) {
            return;
        }
        aVar.f1606a &= -2;
    }

    public final void d(RecyclerView.b0 b0Var) {
        w.d<RecyclerView.b0> dVar = this.f1604b;
        int iE = dVar.e() - 1;
        while (true) {
            if (iE < 0) {
                break;
            }
            if (b0Var == dVar.f(iE)) {
                Object[] objArr = dVar.f14840u;
                Object obj = objArr[iE];
                Object obj2 = w.e.f14842a;
                if (obj != obj2) {
                    objArr[iE] = obj2;
                    dVar.s = true;
                }
            } else {
                iE--;
            }
        }
        a aVarRemove = this.f1603a.remove(b0Var);
        if (aVarRemove != null) {
            aVarRemove.f1606a = 0;
            aVarRemove.f1607b = null;
            aVarRemove.f1608c = null;
            a.f1605d.d(aVarRemove);
        }
    }
}
