package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s7 implements a7 {

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f8819v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f8820w = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder s = new StringBuilder();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f8821t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final ex0 f8822u = new ex0();

    public static long a(Matcher matcher, int i6) {
        String strGroup = matcher.group(i6 + 1);
        long j6 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i6 + 2);
        strGroup2.getClass();
        long j7 = (Long.parseLong(strGroup2) * 60000) + j6;
        String strGroup3 = matcher.group(i6 + 3);
        strGroup3.getClass();
        long j8 = (Long.parseLong(strGroup3) * 1000) + j7;
        String strGroup4 = matcher.group(i6 + 4);
        if (strGroup4 != null) {
            j8 += Long.parseLong(strGroup4);
        }
        return j8 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        if (r7.equals("{\\an9}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        if (r7.equals("{\\an8}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
    
        if (r7.equals("{\\an7}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        r3.f7117g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        if (r7.equals("{\\an3}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        if (r7.equals("{\\an2}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0165, code lost:
    
        if (r7.equals("{\\an1}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0167, code lost:
    
        r3.f7117g = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, int i6, int i7, c7 c7Var) throws NumberFormatException {
        String str;
        int i8;
        float f6;
        xg0 xg0VarA;
        s7 s7Var = this;
        ex0 ex0Var = s7Var.f8822u;
        ex0Var.h(i6 + i7, bArr);
        ex0Var.j(i6);
        Charset charsetC = ex0Var.c();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        while (true) {
            String strH = ex0Var.H(charsetC);
            if (strH == null) {
                return;
            }
            if (strH.length() != 0) {
                try {
                    Integer.parseInt(strH);
                    String strH2 = ex0Var.H(charsetC);
                    if (strH2 == null) {
                        qs0.f("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f8819v.matcher(strH2);
                    if (matcher.matches()) {
                        long jA = a(matcher, 1);
                        long jA2 = a(matcher, 6);
                        StringBuilder sb = s7Var.s;
                        int i9 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = s7Var.f8821t;
                        arrayList.clear();
                        String strH3 = ex0Var.H(charsetC);
                        while (!TextUtils.isEmpty(strH3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strH3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f8820w.matcher(strTrim);
                            int i10 = i9;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i10;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                i10 += length;
                            }
                            sb.append(sb2.toString());
                            strH3 = ex0Var.H(charsetC);
                            i9 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                str = (String) arrayList.get(i11);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i11++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        mf0 mf0Var = new mf0();
                        mf0Var.f7111a = spannedFromHtml;
                        if (str == null) {
                            xg0VarA = mf0Var.a();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        mf0Var.f7118i = 1;
                                        break;
                                    } else {
                                        mf0Var.f7118i = 0;
                                        break;
                                    }
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        mf0Var.f7118i = 2;
                                        break;
                                    }
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                    }
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                    }
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    break;
                                case -685620679:
                                    break;
                                case -685620648:
                                    break;
                                case -685620524:
                                    break;
                                case -685620493:
                                    break;
                                case -685620462:
                                    break;
                                default:
                                    i8 = 1;
                                    mf0Var.f7117g = 1;
                                    break;
                            }
                            int i12 = mf0Var.f7118i;
                            float f7 = 0.08f;
                            if (i12 == 0) {
                                f6 = 0.08f;
                            } else if (i12 == i8) {
                                f6 = 0.5f;
                            } else {
                                if (i12 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f6 = 0.92f;
                            }
                            mf0Var.h = f6;
                            int i13 = mf0Var.f7117g;
                            if (i13 != 0) {
                                if (i13 == i8) {
                                    f7 = 0.5f;
                                } else {
                                    if (i13 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f7 = 0.92f;
                                }
                            }
                            mf0Var.f7115e = f7;
                            mf0Var.f7116f = 0;
                            xg0VarA = mf0Var.a();
                        }
                        c7Var.mo6zza(new v6(bo1.n(xg0VarA), jA, jA2 - jA));
                    } else {
                        qs0.f("SubripParser", "Skipping invalid timing: ".concat(strH2));
                    }
                } catch (NumberFormatException unused) {
                    qs0.f("SubripParser", "Skipping invalid index: ".concat(strH));
                }
            }
            s7Var = this;
        }
    }
}
