package u2;

import android.text.Layout;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a1;
import java.text.Bidi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f29227a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29228b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f29229c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f29230d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f29231e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29232a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29233b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f29234c;

        public a(int i10, int i11, boolean z10) {
            this.f29232a = i10;
            this.f29233b = i11;
            this.f29234c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29232a == aVar.f29232a && this.f29233b == aVar.f29233b && this.f29234c == aVar.f29234c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f29234c) + a1.a(this.f29233b, Integer.hashCode(this.f29232a) * 31, 31);
        }

        public final String toString() {
            return "BidiRun(start=" + this.f29232a + ", end=" + this.f29233b + ", isRtl=" + this.f29234c + ')';
        }
    }

    public t(Layout layout) {
        this.f29227a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iX = mh.x.x(this.f29227a.getText(), '\n', length, 4);
            length = iX < 0 ? this.f29227a.getText().length() : iX + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f29227a.getText().length());
        this.f29228b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f29229c = arrayList2;
        this.f29230d = new boolean[this.f29228b.size()];
        this.f29228b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi a(int i10) {
        Bidi bidi;
        boolean[] zArr = this.f29230d;
        boolean z10 = zArr[i10];
        ArrayList arrayList = this.f29229c;
        if (z10) {
            return (Bidi) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.f29228b;
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList2.get(i10 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i10)).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = this.f29231e;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        Layout layout = this.f29227a;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, layout.getParagraphDirection(layout.getLineForOffset(e(i10))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList.set(i10, bidi);
        zArr[i10] = true;
        if (bidi != null) {
            char[] cArr3 = this.f29231e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f29231e = cArr2;
        return bidi;
    }

    public final float b(int i10, boolean z10) {
        Layout layout = this.f29227a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iF = i10;
        if (!z11) {
            return b(i10, z10);
        }
        Layout layout = this.f29227a;
        int iA = lf.c.a(layout, iF, z11);
        int lineStart = layout.getLineStart(iA);
        int lineEnd = layout.getLineEnd(iA);
        if (iF != lineStart && iF != lineEnd) {
            return b(i10, z10);
        }
        if (iF == 0 || iF == layout.getText().length()) {
            return b(i10, z10);
        }
        int iD = d(iF, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(e(iD))) == -1;
        int iF2 = f(lineEnd, lineStart);
        int iE = e(iD);
        int i13 = lineStart - iE;
        int i14 = iF2 - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return iF == lineStart ? z12 : !z12 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            aVarArr[i15] = new a(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (iF == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (aVarArr[i17].f29232a == iF) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z13 = (z10 || z12 == aVarArr[i12].f29234c) ? !z12 : z12;
            return (i12 == 0 && z13) ? layout.getLineLeft(iA) : (i12 != runCount - 1 || z13) ? z13 ? layout.getPrimaryHorizontal(aVarArr[i12 - 1].f29232a) : layout.getPrimaryHorizontal(aVarArr[i12 + 1].f29232a) : layout.getLineRight(iA);
        }
        if (iF > iF2) {
            iF = f(iF, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (aVarArr[i18].f29233b == iF) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z14 = (z10 || z12 == aVarArr[i11].f29234c) ? z12 : !z12;
        return (i11 == 0 && z14) ? layout.getLineLeft(iA) : (i11 != runCount - 1 || z14) ? z14 ? layout.getPrimaryHorizontal(aVarArr[i11 - 1].f29233b) : layout.getPrimaryHorizontal(aVarArr[i11 + 1].f29233b) : layout.getLineRight(iA);
    }

    public final int d(int i10, boolean z10) {
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f29228b;
        int iG = qg.p.g(arrayList, numValueOf);
        int i11 = iG < 0 ? -(iG + 1) : iG + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f29228b.get(i10 - 1)).intValue();
    }

    public final int f(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = this.f29227a.getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.r.f(cCharAt, 8192) < 0 || kotlin.jvm.internal.r.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }
}
