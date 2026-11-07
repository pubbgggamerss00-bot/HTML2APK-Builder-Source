package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x1 {
    public static qh a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str = (String) list.get(i6);
            int i7 = j31.f5914a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                qs0.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(g3.l(new ex0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e6) {
                    qs0.g("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new v4(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new qh(arrayList);
    }

    public static xj1 b(ex0 ex0Var, boolean z6, boolean z7) throws rn {
        if (z6) {
            c(3, ex0Var, false);
        }
        ex0Var.b((int) ex0Var.B(), StandardCharsets.UTF_8);
        long jB = ex0Var.B();
        String[] strArr = new String[(int) jB];
        for (int i6 = 0; i6 < jB; i6++) {
            strArr[i6] = ex0Var.b((int) ex0Var.B(), StandardCharsets.UTF_8);
        }
        if (z7 && (ex0Var.v() & 1) == 0) {
            throw rn.a(null, "framing bit expected to be set");
        }
        return new xj1(1, strArr);
    }

    public static boolean c(int i6, ex0 ex0Var, boolean z6) throws rn {
        if (ex0Var.o() < 7) {
            if (z6) {
                return false;
            }
            throw rn.a(null, "too short header: " + ex0Var.o());
        }
        if (ex0Var.v() != i6) {
            if (z6) {
                return false;
            }
            throw rn.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i6))));
        }
        if (ex0Var.v() == 118 && ex0Var.v() == 111 && ex0Var.v() == 114 && ex0Var.v() == 98 && ex0Var.v() == 105 && ex0Var.v() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw rn.a(null, "expected characters 'vorbis'");
    }
}
