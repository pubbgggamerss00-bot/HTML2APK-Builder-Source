package c6;

import androidx.lifecycle.l0;
import hi.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import l9.q;
import l9.s;
import l9.t;
import ph.h;
import ph.q0;
import sh.a1;
import sh.z0;

/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q a(l0 handle, String str, File file, l5.a aVar) {
        r.e(handle, "handle");
        String str2 = (String) handle.b(str);
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        String strConcat = str.concat("DraftFile");
        String str3 = (String) handle.a(strConcat);
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[a-f0-9-]+\\.html");
            r.d(patternCompile, "compile(...)");
            if (!patternCompile.matcher(str3).matches()) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = UUID.randomUUID() + ".html";
            }
        }
        String str4 = str3;
        handle.c(str4, strConcat);
        File file2 = new File(file, str4);
        z0 z0VarA = a1.a(str2 == null ? "" : str2);
        q0 q0VarA = h.a(aVar, null, new t(str2, z0VarA, file2, null), 3);
        h.c(aVar, null, null, new s(q0VarA, z0VarA, file2, file, str4, null), 3);
        return new q(z0VarA, q0VarA);
    }

    public static final int b(i0 i0Var, int i10) {
        int i11;
        int[] iArr = i0Var.f13074f;
        int i12 = i10 + 1;
        int length = i0Var.f13073e.length;
        r.e(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }

    public static final ArrayList c(List list) {
        r.e(list, "<this>");
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }
}
