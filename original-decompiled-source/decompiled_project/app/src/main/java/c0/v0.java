package c0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f4487a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f4488b;

    /* renamed from: c, reason: collision with root package name */
    public int f4489c;

    /* renamed from: d, reason: collision with root package name */
    public int f4490d;

    /* renamed from: e, reason: collision with root package name */
    public int f4491e;

    /* renamed from: f, reason: collision with root package name */
    public int f4492f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4493g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4494h;

    /* renamed from: i, reason: collision with root package name */
    public int f4495i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4496a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4497b;

        public a(int i10, int i11) {
            this.f4496a = i10;
            this.f4497b = i11;
        }
    }

    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4498a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static int f4499b;

        @Override // c0.x
        public final int a() {
            return f4499b;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4500a;

        /* renamed from: b, reason: collision with root package name */
        public final List<c0.c> f4501b;

        public c(int i10, List<c0.c> list) {
            this.f4500a = i10;
            this.f4501b = list;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<a, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f4502a = i10;
        }

        @Override // eh.l
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.f4496a - this.f4502a);
        }
    }

    public v0(j jVar) {
        this.f4487a = jVar;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.f4488b = arrayList;
        this.f4492f = -1;
        this.f4493g = new ArrayList();
        this.f4494h = qg.z.f22752a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f4495i)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c b(int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        ArrayList arrayList;
        if (!this.f4487a.f4403c) {
            int i14 = this.f4495i;
            int i15 = i10 * i14;
            int iD = d() - i15;
            if (i14 > iD) {
                i14 = iD;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            if (i14 == this.f4494h.size()) {
                arrayList = this.f4494h;
            } else {
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i16 = 0; i16 < i14; i16++) {
                    arrayList2.add(new c0.c(u0.a(1)));
                }
                this.f4494h = arrayList2;
                arrayList = arrayList2;
            }
            return new c(i15, arrayList);
        }
        int iA = i10 / a();
        ArrayList<a> arrayList3 = this.f4488b;
        int iMin = Math.min(iA, arrayList3.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = arrayList3.get(iMin).f4496a;
        int iE = arrayList3.get(iMin).f4497b;
        int i17 = this.f4489c;
        ArrayList arrayList4 = this.f4493g;
        if (iA2 <= i17 && i17 <= i10) {
            iIntValue = this.f4490d;
            iE = this.f4491e;
            iA2 = i17;
        } else if (iMin == this.f4492f && (i11 = i10 - iA2) < arrayList4.size()) {
            iIntValue = ((Number) arrayList4.get(i11)).intValue();
            iA2 = i10;
            iE = 0;
        }
        if (iA2 % a() == 0) {
            int i18 = i10 - iA2;
            z10 = 2 <= i18 && i18 < a();
        }
        if (z10) {
            this.f4492f = iMin;
            arrayList4.clear();
        }
        if (iA2 > i10) {
            y.c.c("currentLine (" + iA2 + ") > lineIndex (" + i10 + ')');
        }
        while (iA2 < i10 && iIntValue < d()) {
            if (z10) {
                arrayList4.add(Integer.valueOf(iIntValue));
            }
            int i19 = 0;
            while (i19 < this.f4495i && iIntValue < d()) {
                if (iE == 0) {
                    i13 = iE;
                    iE = e(iIntValue);
                } else {
                    i13 = 0;
                }
                i19 += iE;
                if (i19 > this.f4495i) {
                    break;
                }
                iIntValue++;
                iE = i13;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < d()) {
                if (arrayList3.size() != iA2 / a()) {
                    y.c.c("invalid starting point");
                }
                arrayList3.add(new a(iIntValue, iE));
            }
        }
        this.f4489c = i10;
        this.f4490d = iIntValue;
        this.f4491e = iE;
        ArrayList arrayList5 = new ArrayList();
        int i20 = 0;
        int i21 = iIntValue;
        while (i20 < this.f4495i && i21 < d()) {
            if (iE == 0) {
                int i22 = iE;
                iE = e(i21);
                i12 = i22;
            } else {
                i12 = 0;
            }
            i20 += iE;
            if (i20 > this.f4495i) {
                break;
            }
            i21++;
            arrayList5.add(new c0.c(u0.a(iE)));
            iE = i12;
        }
        return new c(iIntValue, arrayList5);
    }

    public final int c(int i10) {
        int i11;
        if (d() <= 0) {
            return 0;
        }
        if (i10 >= d()) {
            y.c.a("ItemIndex > total count");
        }
        if (!this.f4487a.f4403c) {
            return i10 / this.f4495i;
        }
        d dVar = new d(i10);
        ArrayList<a> arrayList = this.f4488b;
        int size = arrayList.size();
        qg.p.m(arrayList.size(), size);
        int i12 = size - 1;
        int i13 = 0;
        while (true) {
            if (i13 > i12) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + i12) >>> 1;
            int iIntValue = ((Number) dVar.invoke(arrayList.get(i11))).intValue();
            if (iIntValue >= 0) {
                if (iIntValue <= 0) {
                    break;
                }
                i12 = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 < 0) {
            i11 = (-i11) - 2;
        }
        int iA = a() * i11;
        int i14 = arrayList.get(i11).f4496a;
        if (i14 > i10) {
            y.c.a("currentItemIndex > itemIndex");
        }
        int i15 = 0;
        while (i14 < i10) {
            int i16 = i14 + 1;
            int iE = e(i14);
            i15 += iE;
            int i17 = this.f4495i;
            if (i15 >= i17) {
                if (i15 == i17) {
                    iA++;
                    i15 = 0;
                } else {
                    iA++;
                    i15 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new a(i16 - (i15 > 0 ? 1 : 0), 0));
            }
            i14 = i16;
        }
        return e(i10) + i15 > this.f4495i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f4487a.f4402b.f7052b;
    }

    public final int e(int i10) {
        b.f4499b = this.f4495i;
        d0.g<i> gVarB = this.f4487a.f4402b.b(i10);
        int i11 = i10 - gVarB.f7131a;
        return (int) ((i) gVarB.f7133c).f4394b.invoke(b.f4498a, Integer.valueOf(i11)).f4355a;
    }
}
