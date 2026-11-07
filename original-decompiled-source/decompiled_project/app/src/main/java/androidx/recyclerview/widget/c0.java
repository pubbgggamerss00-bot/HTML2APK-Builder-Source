package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2526b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2527a;

        /* renamed from: b, reason: collision with root package name */
        public int f2528b;

        /* renamed from: c, reason: collision with root package name */
        public int f2529c;

        /* renamed from: d, reason: collision with root package name */
        public int f2530d;

        /* renamed from: e, reason: collision with root package name */
        public int f2531e;

        public final boolean a() {
            int i10 = this.f2527a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.f2530d;
                int i13 = this.f2528b;
                if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 112) != 0) {
                int i14 = this.f2530d;
                int i15 = this.f2529c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f2531e;
                int i17 = this.f2528b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f2531e;
                int i19 = this.f2529c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public c0(b bVar) {
        this.f2525a = bVar;
        a aVar = new a();
        aVar.f2527a = 0;
        this.f2526b = aVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        b bVar = this.f2525a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewD = bVar.d(i10);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.f2526b;
            aVar.f2528b = iB;
            aVar.f2529c = iC;
            aVar.f2530d = iA;
            aVar.f2531e = iE;
            if (i12 != 0) {
                aVar.f2527a = i12;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i13 != 0) {
                aVar.f2527a = i13;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f2525a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.f2526b;
        aVar.f2528b = iB;
        aVar.f2529c = iC;
        aVar.f2530d = iA;
        aVar.f2531e = iE;
        aVar.f2527a = 24579;
        return aVar.a();
    }
}
