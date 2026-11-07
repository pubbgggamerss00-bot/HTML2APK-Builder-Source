package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4862c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f4863a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f4864b = -1;

    public final void a(qh qhVar) {
        int i6 = 0;
        while (true) {
            zg[] zgVarArr = qhVar.s;
            if (i6 >= zgVarArr.length) {
                return;
            }
            zg zgVar = zgVarArr[i6];
            if (zgVar instanceof u3) {
                u3 u3Var = (u3) zgVar;
                if ("iTunSMPB".equals(u3Var.f9437u) && b(u3Var.f9438v)) {
                    return;
                }
            } else if (zgVar instanceof c4) {
                c4 c4Var = (c4) zgVar;
                if ("com.apple.iTunes".equals(c4Var.f3392t) && "iTunSMPB".equals(c4Var.f3393u) && b(c4Var.f3394v)) {
                    return;
                }
            } else {
                continue;
            }
            i6++;
        }
    }

    public final boolean b(String str) throws NumberFormatException {
        Matcher matcher = f4862c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i6 = j31.f5914a;
            int i7 = Integer.parseInt(strGroup, 16);
            int i8 = Integer.parseInt(matcher.group(2), 16);
            if (i7 <= 0 && i8 <= 0) {
                return false;
            }
            this.f4863a = i7;
            this.f4864b = i8;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
