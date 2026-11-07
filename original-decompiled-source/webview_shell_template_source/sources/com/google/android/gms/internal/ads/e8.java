package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e8 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4153c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4154d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f4155a = new ex0();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4156b = new StringBuilder();

    public static String a(ex0 ex0Var, StringBuilder sb) {
        b(ex0Var);
        if (ex0Var.o() == 0) {
            return null;
        }
        String strC = c(ex0Var, sb);
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(strC)) {
            return strC;
        }
        char cV = (char) ex0Var.v();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cV);
        return sb2.toString();
    }

    public static void b(ex0 ex0Var) {
        while (true) {
            for (boolean z6 = true; ex0Var.o() > 0 && z6; z6 = false) {
                int i6 = ex0Var.f4417b;
                byte[] bArr = ex0Var.f4416a;
                byte b7 = bArr[i6];
                char c7 = (char) b7;
                if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
                    ex0Var.k(1);
                } else {
                    int i7 = ex0Var.f4418c;
                    if (i6 + 2 <= i7) {
                        int i8 = i6 + 1;
                        if (b7 == 47) {
                            int i9 = i6 + 2;
                            if (bArr[i8] == 42) {
                                while (true) {
                                    int i10 = i9 + 1;
                                    if (i10 >= i7) {
                                        break;
                                    }
                                    if (((char) bArr[i9]) == '*' && ((char) bArr[i10]) == '/') {
                                        i7 = i9 + 2;
                                        i9 = i7;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                                ex0Var.k(i7 - ex0Var.f4417b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String c(ex0 ex0Var, StringBuilder sb) {
        boolean z6;
        char c7;
        sb.setLength(0);
        int i6 = ex0Var.f4417b;
        int i7 = ex0Var.f4418c;
        loop0: while (true) {
            for (false; i6 < i7 && !z6; true) {
                c7 = (char) ex0Var.f4416a[i6];
                z6 = (c7 < 'A' || c7 > 'Z') && (c7 < 'a' || c7 > 'z') && !((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_');
            }
            sb.append(c7);
            i6++;
        }
        ex0Var.k(i6 - ex0Var.f4417b);
        return sb.toString();
    }
}
