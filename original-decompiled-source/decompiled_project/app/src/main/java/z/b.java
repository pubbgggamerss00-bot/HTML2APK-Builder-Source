package z;

import com.yalantis.ucrop.view.CropImageView;
import r.o2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f34444a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final d f34445b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final k f34446c = new k();

    /* renamed from: d, reason: collision with root package name */
    public static final C0352b f34447d = new C0352b();

    /* renamed from: e, reason: collision with root package name */
    public static final c f34448e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final h f34449f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final g f34450g = new g();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0350a f34451a = new C0350a();

        /* renamed from: b, reason: collision with root package name */
        public static final C0351b f34452b = new C0351b();

        /* renamed from: z.b$a$a, reason: collision with other inner class name */
        public static final class C0350a implements e {
            @Override // z.b.e
            public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
                b.c(iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* renamed from: z.b$a$b, reason: collision with other inner class name */
        public static final class C0351b implements e {
            @Override // z.b.e
            public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
                b.d(i10, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }
    }

    /* renamed from: z.b$b, reason: collision with other inner class name */
    public static final class C0352b implements l {
        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.d(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class c implements e, l {

        /* renamed from: a, reason: collision with root package name */
        public final float f34453a = 0;

        @Override // z.b.e, z.b.l
        public final float a() {
            return this.f34453a;
        }

        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.b(i10, iArr, iArr2, false);
            } else {
                b.b(i10, iArr, iArr2, true);
            }
        }

        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.b(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.d(i10, iArr, iArr2, false);
            } else {
                b.c(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    public interface e {
        default float a() {
            return 0;
        }

        void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2);
    }

    public static final class f implements e, l {

        /* renamed from: a, reason: collision with root package name */
        public final float f34454a = 0;

        @Override // z.b.e, z.b.l
        public final float a() {
            return this.f34454a;
        }

        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.e(i10, iArr, iArr2, false);
            } else {
                b.e(i10, iArr, iArr2, true);
            }
        }

        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.e(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class g implements e, l {

        /* renamed from: a, reason: collision with root package name */
        public final float f34455a = 0;

        @Override // z.b.e, z.b.l
        public final float a() {
            return this.f34455a;
        }

        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.f(i10, iArr, iArr2, false);
            } else {
                b.f(i10, iArr, iArr2, true);
            }
        }

        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class h implements e, l {

        /* renamed from: a, reason: collision with root package name */
        public final float f34456a = 0;

        @Override // z.b.e, z.b.l
        public final float a() {
            return this.f34456a;
        }

        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.g(i10, iArr, iArr2, false);
            } else {
                b.g(i10, iArr, iArr2, true);
            }
        }

        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.g(i10, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class i implements e, l {

        /* renamed from: a, reason: collision with root package name */
        public final float f34457a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34458b;

        /* renamed from: c, reason: collision with root package name */
        public final eh.p<Integer, f3.r, Integer> f34459c;

        /* renamed from: d, reason: collision with root package name */
        public final float f34460d;

        public i(float f10, boolean z10, eh.p pVar) {
            this.f34457a = f10;
            this.f34458b = z10;
            this.f34459c = pVar;
            this.f34460d = f10;
        }

        @Override // z.b.e, z.b.l
        public final float a() {
            return this.f34460d;
        }

        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            int i11;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iB1 = dVar.b1(this.f34457a);
            boolean z10 = this.f34458b && rVar == f3.r.f8829b;
            j jVar = b.f34444a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iB1, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iB1, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    iMin = iMin4;
                    i11 = i16;
                    i14++;
                }
            }
            int i17 = i11 - iMin;
            eh.p<Integer, f3.r, Integer> pVar = this.f34459c;
            if (pVar == null || i17 >= i10) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i10 - i17), rVar).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }

        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b(dVar, i10, iArr, f3.r.f8828a, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return f3.h.a(this.f34457a, iVar.f34457a) && this.f34458b == iVar.f34458b && kotlin.jvm.internal.r.a(this.f34459c, iVar.f34459c);
        }

        public final int hashCode() {
            int iA = o2.a(Float.hashCode(this.f34457a) * 31, 31, this.f34458b);
            eh.p<Integer, f3.r, Integer> pVar = this.f34459c;
            return iA + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f34458b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) f3.h.b(this.f34457a));
            sb.append(", ");
            sb.append(this.f34459c);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class j implements e {
        @Override // z.b.e
        public final void b(f3.d dVar, int i10, int[] iArr, f3.r rVar, int[] iArr2) {
            if (rVar == f3.r.f8828a) {
                b.c(iArr, iArr2, false);
            } else {
                b.d(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class k implements l {
        @Override // z.b.l
        public final void c(f3.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.c(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    public interface l {
        default float a() {
            return 0;
        }

        void c(f3.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    static {
        new f();
    }

    public static g a() {
        return f34450g;
    }

    public static void b(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    public static void c(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public static void e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = iArr.length == 0 ? CropImageView.DEFAULT_ASPECT_RATIO : (i10 - i12) / iArr.length;
        float f10 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += i16 + length;
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : CropImageView.DEFAULT_ASPECT_RATIO;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public static void g(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public static i h(float f10) {
        return new i(f10, true, z.c.f34469a);
    }
}
