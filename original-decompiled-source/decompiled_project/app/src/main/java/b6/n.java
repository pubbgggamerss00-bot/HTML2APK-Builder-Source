package b6;

import java.util.ArrayList;
import qg.x;

/* loaded from: classes.dex */
public final class n {
    public static final int a(h6.d dVar, String str) {
        kotlin.jvm.internal.r.e(dVar, "<this>");
        int iB = b(dVar, str);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = b(dVar, "`" + str + '`');
        if (iB2 >= 0) {
            return iB2;
        }
        return -1;
    }

    public static final int b(h6.d dVar, String name) {
        kotlin.jvm.internal.r.e(dVar, "<this>");
        kotlin.jvm.internal.r.e(name, "name");
        if (dVar instanceof k) {
            throw null;
        }
        int columnCount = dVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (name.equals(dVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int c(h6.d stmt, String str) {
        kotlin.jvm.internal.r.e(stmt, "stmt");
        int iA = a(stmt, str);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + x.I(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int d(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }
}
