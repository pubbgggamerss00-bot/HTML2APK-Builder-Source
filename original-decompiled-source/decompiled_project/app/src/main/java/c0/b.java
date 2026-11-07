package c0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final float f4347a;

        public a(float f10) {
            this.f4347a = f10;
            if (Float.compare(f10, 0) > 0) {
                return;
            }
            y.c.a("Provided min size should be larger than zero.");
        }

        @Override // c0.b
        public final ArrayList a(f3.d dVar, int i10, int i11) {
            int iMax = Math.max((i10 + i11) / (dVar.b1(this.f4347a) + i11), 1);
            int i12 = i10 - ((iMax - 1) * i11);
            int i13 = i12 / iMax;
            int i14 = i12 % iMax;
            ArrayList arrayList = new ArrayList(iMax);
            int i15 = 0;
            while (i15 < iMax) {
                arrayList.add(Integer.valueOf((i15 < i14 ? 1 : 0) + i13));
                i15++;
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return f3.h.a(this.f4347a, ((a) obj).f4347a);
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f4347a);
        }
    }

    ArrayList a(f3.d dVar, int i10, int i11);
}
