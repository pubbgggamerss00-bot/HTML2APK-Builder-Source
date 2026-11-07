package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f1595a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1596b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1597a;

        /* renamed from: b, reason: collision with root package name */
        public int f1598b;

        /* renamed from: c, reason: collision with root package name */
        public int f1599c;

        /* renamed from: d, reason: collision with root package name */
        public int f1600d;

        /* renamed from: e, reason: collision with root package name */
        public int f1601e;

        public final boolean a() {
            int i6 = this.f1597a;
            int i7 = 2;
            if ((i6 & 7) != 0) {
                int i8 = this.f1600d;
                int i9 = this.f1598b;
                if (((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 112) != 0) {
                int i10 = this.f1600d;
                int i11 = this.f1599c;
                if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 1792) != 0) {
                int i12 = this.f1601e;
                int i13 = this.f1598b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 28672) != 0) {
                int i14 = this.f1601e;
                int i15 = this.f1599c;
                if (i14 > i15) {
                    i7 = 1;
                } else if (i14 != i15) {
                    i7 = 4;
                }
                if ((i6 & (i7 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i6);

        int e(View view);
    }

    public b0(b bVar) {
        this.f1595a = bVar;
        a aVar = new a();
        aVar.f1597a = 0;
        this.f1596b = aVar;
    }

    public final View a(int i6, int i7, int i8, int i9) {
        b bVar = this.f1595a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        while (i6 != i7) {
            View viewD = bVar.d(i6);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.f1596b;
            aVar.f1598b = iB;
            aVar.f1599c = iC;
            aVar.f1600d = iA;
            aVar.f1601e = iE;
            if (i8 != 0) {
                aVar.f1597a = i8;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i9 != 0) {
                aVar.f1597a = i9;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i6 += i10;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f1595a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.f1596b;
        aVar.f1598b = iB;
        aVar.f1599c = iC;
        aVar.f1600d = iA;
        aVar.f1601e = iE;
        aVar.f1597a = 24579;
        return aVar.a();
    }
}
