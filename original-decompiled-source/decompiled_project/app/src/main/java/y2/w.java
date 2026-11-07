package y2;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public String f33770a;

    /* renamed from: b, reason: collision with root package name */
    public m f33771b;

    /* renamed from: c, reason: collision with root package name */
    public int f33772c;

    /* renamed from: d, reason: collision with root package name */
    public int f33773d;

    public final int a() {
        m mVar = this.f33771b;
        if (mVar == null) {
            return this.f33770a.length();
        }
        return (mVar.f33744a - mVar.a()) + (this.f33770a.length() - (this.f33773d - this.f33772c));
    }

    public final void b(int i10, int i11, String str) {
        if (i10 > i11) {
            z2.a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            z2.a.a("start must be non-negative, but was " + i10);
        }
        m mVar = this.f33771b;
        if (mVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(this.f33770a.length() - i11, 64);
            String str2 = this.f33770a;
            int i12 = i10 - iMin;
            kotlin.jvm.internal.r.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = this.f33770a;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            kotlin.jvm.internal.r.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            m mVar2 = new m();
            mVar2.f33744a = iMax;
            mVar2.f33745b = cArr;
            mVar2.f33746c = length;
            mVar2.f33747d = i13;
            this.f33771b = mVar2;
            this.f33772c = i12;
            this.f33773d = i14;
            return;
        }
        int i15 = this.f33772c;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > mVar.f33744a - mVar.a()) {
            this.f33770a = toString();
            this.f33771b = null;
            this.f33772c = -1;
            this.f33773d = -1;
            b(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > mVar.a()) {
            int iA = length2 - mVar.a();
            int i18 = mVar.f33744a;
            do {
                i18 *= 2;
            } while (i18 - mVar.f33744a < iA);
            char[] cArr2 = new char[i18];
            qg.m.f(mVar.f33745b, cArr2, 0, 0, mVar.f33746c);
            int i19 = mVar.f33744a;
            int i20 = mVar.f33747d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            qg.m.f(mVar.f33745b, cArr2, i22, i20, i21 + i20);
            mVar.f33745b = cArr2;
            mVar.f33744a = i18;
            mVar.f33747d = i22;
        }
        int i23 = mVar.f33746c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = mVar.f33745b;
            qg.m.f(cArr3, cArr3, mVar.f33747d - i24, i17, i23);
            mVar.f33746c = i16;
            mVar.f33747d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iA2 = mVar.a() + i16;
            int iA3 = mVar.a() + i17;
            int i25 = mVar.f33747d;
            char[] cArr4 = mVar.f33745b;
            qg.m.f(cArr4, cArr4, mVar.f33746c, i25, iA2);
            mVar.f33746c += iA2 - i25;
            mVar.f33747d = iA3;
        } else {
            mVar.f33747d = mVar.a() + i17;
            mVar.f33746c = i16;
        }
        str.getChars(0, str.length(), mVar.f33745b, mVar.f33746c);
        mVar.f33746c = str.length() + mVar.f33746c;
    }

    public final String toString() {
        m mVar = this.f33771b;
        if (mVar == null) {
            return this.f33770a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f33770a, 0, this.f33772c);
        sb.append(mVar.f33745b, 0, mVar.f33746c);
        char[] cArr = mVar.f33745b;
        int i10 = mVar.f33747d;
        sb.append(cArr, i10, mVar.f33744a - i10);
        String str = this.f33770a;
        sb.append((CharSequence) str, this.f33773d, str.length());
        return sb.toString();
    }
}
