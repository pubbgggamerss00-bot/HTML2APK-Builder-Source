package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import x4.k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final y4.b f2242a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f2243b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2244c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f2245d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f2246a;

        /* renamed from: b, reason: collision with root package name */
        public k f2247b;

        public a() {
            this(1);
        }

        public final void a(k kVar, int i10, int i11) {
            int iA = kVar.a(i10);
            SparseArray<a> sparseArray = this.f2246a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(kVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(kVar, i10 + 1, i11);
            } else {
                aVar.f2247b = kVar;
            }
        }

        public a(int i10) {
            this.f2246a = new SparseArray<>(i10);
        }
    }

    public h(Typeface typeface, y4.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f2245d = typeface;
        this.f2242a = bVar;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f33935a;
            i10 = bVar.f33936b.getInt(bVar.f33936b.getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f2243b = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f33935a;
            i11 = bVar.f33936b.getInt(bVar.f33936b.getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            k kVar = new k(this, i16);
            y4.a aVarB = kVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? aVarB.f33936b.getInt(iA3 + aVarB.f33935a) : 0, this.f2243b, i16 * 2);
            y4.a aVarB2 = kVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f33935a;
                i12 = aVarB2.f33936b.getInt(aVarB2.f33936b.getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (!(i12 > 0)) {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
            a aVar = this.f2244c;
            y4.a aVarB3 = kVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i18 = iA5 + aVarB3.f33935a;
                i13 = aVarB3.f33936b.getInt(aVarB3.f33936b.getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            aVar.a(kVar, 0, i13 - 1);
        }
    }
}
