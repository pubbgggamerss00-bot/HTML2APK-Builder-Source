package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o7 implements a7 {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f7623y = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final n7 f7624t;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashMap f7626v;

    /* renamed from: w, reason: collision with root package name */
    public float f7627w = -3.4028235E38f;

    /* renamed from: x, reason: collision with root package name */
    public float f7628x = -3.4028235E38f;

    /* renamed from: u, reason: collision with root package name */
    public final ex0 f7625u = new ex0();

    public o7(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.s = false;
            this.f7624t = null;
            return;
        }
        this.s = true;
        byte[] bArr = (byte[]) list.get(0);
        int i6 = j31.f5914a;
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        y5.n(str.startsWith("Format:"));
        n7 n7VarA = n7.a(str);
        n7VarA.getClass();
        this.f7624t = n7VarA;
        d(new ex0((byte[]) list.get(1)), charset);
    }

    public static int a(long j6, ArrayList arrayList, ArrayList arrayList2) {
        int i6;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j6) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j6) {
                i6 = size + 1;
                break;
            }
        }
        arrayList.add(i6, Long.valueOf(j6));
        arrayList2.add(i6, i6 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i6 - 1)));
        return i6;
    }

    public static long c(String str) {
        Matcher matcher = f7623y.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i6 = j31.f5914a;
        long j6 = Long.parseLong(strGroup) * 3600000000L;
        long j7 = Long.parseLong(matcher.group(2)) * 60000000;
        return j6 + j7 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x0195. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186 A[Catch: RuntimeException -> 0x01b7, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01b7, blocks: (B:71:0x017a, B:73:0x0186, B:75:0x018d, B:79:0x01a6, B:77:0x0198), top: B:193:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, int i6, int i7, c7 c7Var) throws NumberFormatException {
        Charset charset;
        n7 n7Var;
        ex0 ex0Var;
        float f6;
        float f7;
        Layout.Alignment alignment;
        int i8;
        int i9;
        int i10;
        Integer num;
        Charset charset2;
        n7 n7Var2;
        ex0 ex0Var2;
        Matcher matcher;
        int i11;
        Matcher matcher2;
        Matcher matcher3;
        boolean zFind;
        boolean zFind2;
        PointF pointF;
        String strGroup;
        String strGroup2;
        int i12;
        o7 o7Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ex0 ex0Var3 = o7Var.f7625u;
        ex0Var3.h(i6 + i7, bArr);
        ex0Var3.j(i6);
        Charset charsetC = ex0Var3.c();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z6 = o7Var.s;
        if (!z6) {
            o7Var.d(ex0Var3, charsetC);
        }
        n7 n7VarA = z6 ? o7Var.f7624t : null;
        while (true) {
            String strH = ex0Var3.H(charsetC);
            int i13 = 1;
            if (strH == null) {
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    List list = (List) arrayList.get(i14);
                    if (!list.isEmpty()) {
                        if (i14 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        c7Var.mo6zza(new v6(list, ((Long) arrayList2.get(i14)).longValue(), ((Long) arrayList2.get(i14 + 1)).longValue() - ((Long) arrayList2.get(i14)).longValue()));
                    } else if (i14 == 0) {
                        i14 = 0;
                        if (i14 != arrayList.size() - 1) {
                        }
                    }
                    i14++;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                n7VarA = n7.a(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (n7VarA == null) {
                    qs0.f("SsaParser", "Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    int i15 = n7VarA.f7331e;
                    y5.n(strH.startsWith("Dialogue:"));
                    String[] strArrSplit = strH.substring(9).split(",", i15);
                    if (strArrSplit.length != i15) {
                        qs0.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[n7VarA.f7327a]);
                        if (jC == -9223372036854775807L) {
                            qs0.f("SsaParser", "Skipping invalid timing: ".concat(strH));
                        } else {
                            long jC2 = c(strArrSplit[n7VarA.f7328b]);
                            if (jC2 == -9223372036854775807L) {
                                qs0.f("SsaParser", "Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = o7Var.f7626v;
                                r7 r7Var = (linkedHashMap == null || (i12 = n7VarA.f7329c) == -1) ? null : (r7) linkedHashMap.get(strArrSplit[i12].trim());
                                String str = strArrSplit[n7VarA.f7330d];
                                Matcher matcher4 = q7.f8238a.matcher(str);
                                PointF pointF2 = null;
                                int i16 = -1;
                                while (matcher4.find()) {
                                    String strGroup3 = matcher4.group(i13);
                                    strGroup3.getClass();
                                    try {
                                        matcher2 = q7.f8239b.matcher(strGroup3);
                                        charset2 = charsetC;
                                    } catch (RuntimeException unused) {
                                        charset2 = charsetC;
                                    }
                                    try {
                                        matcher3 = q7.f8240c.matcher(strGroup3);
                                        zFind = matcher2.find();
                                        zFind2 = matcher3.find();
                                    } catch (RuntimeException unused2) {
                                        n7Var2 = n7VarA;
                                        ex0Var2 = ex0Var3;
                                        try {
                                            matcher = q7.f8241d.matcher(strGroup3);
                                            if (matcher.find()) {
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        i13 = 1;
                                    }
                                    if (zFind) {
                                        if (zFind2) {
                                            n7Var2 = n7VarA;
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                ex0Var2 = ex0Var3;
                                                try {
                                                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                    sb.append(strGroup3);
                                                    sb.append("'");
                                                    qs0.e("SsaStyle.Overrides", sb.toString());
                                                } catch (RuntimeException unused4) {
                                                }
                                            } catch (RuntimeException unused5) {
                                                ex0Var2 = ex0Var3;
                                                matcher = q7.f8241d.matcher(strGroup3);
                                                if (matcher.find()) {
                                                }
                                                i13 = 1;
                                            }
                                        } else {
                                            n7Var2 = n7VarA;
                                            ex0Var2 = ex0Var3;
                                        }
                                        strGroup2 = matcher2.group(1);
                                        strGroup = matcher2.group(2);
                                    } else {
                                        n7Var2 = n7VarA;
                                        ex0Var2 = ex0Var3;
                                        if (zFind2) {
                                            String strGroup4 = matcher3.group(1);
                                            strGroup = matcher3.group(2);
                                            strGroup2 = strGroup4;
                                        } else {
                                            pointF = null;
                                            if (pointF != null) {
                                                pointF2 = pointF;
                                            }
                                            matcher = q7.f8241d.matcher(strGroup3);
                                            if (matcher.find()) {
                                                String strGroup5 = matcher.group(1);
                                                if (strGroup5 == null) {
                                                    throw null;
                                                }
                                                try {
                                                    i11 = Integer.parseInt(strGroup5.trim());
                                                } catch (NumberFormatException unused6) {
                                                }
                                                switch (i11) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        break;
                                                    default:
                                                        qs0.f("SsaStyle", "Ignoring unknown alignment: ".concat(strGroup5));
                                                        i11 = -1;
                                                        break;
                                                }
                                                if (i11 == -1) {
                                                }
                                            } else {
                                                i11 = -1;
                                                if (i11 == -1) {
                                                    i16 = i11;
                                                    charsetC = charset2;
                                                    n7VarA = n7Var2;
                                                    ex0Var3 = ex0Var2;
                                                } else {
                                                    charsetC = charset2;
                                                    n7VarA = n7Var2;
                                                    ex0Var3 = ex0Var2;
                                                }
                                            }
                                            i13 = 1;
                                        }
                                    }
                                    if (strGroup2 == null) {
                                        throw null;
                                    }
                                    float f8 = Float.parseFloat(strGroup2.trim());
                                    if (strGroup == null) {
                                        throw null;
                                    }
                                    pointF = new PointF(f8, Float.parseFloat(strGroup.trim()));
                                    if (pointF != null) {
                                    }
                                    matcher = q7.f8241d.matcher(strGroup3);
                                    if (matcher.find()) {
                                    }
                                    i13 = 1;
                                }
                                charset = charsetC;
                                n7Var = n7VarA;
                                ex0Var = ex0Var3;
                                String strReplace = q7.f8238a.matcher(str).replaceAll(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f9 = o7Var.f7627w;
                                float f10 = o7Var.f7628x;
                                SpannableString spannableString = new SpannableString(strReplace);
                                mf0 mf0Var = new mf0();
                                mf0Var.f7111a = spannableString;
                                if (r7Var != null) {
                                    boolean z7 = r7Var.f8566g;
                                    Integer num2 = r7Var.f8562c;
                                    f7 = -3.4028235E38f;
                                    if (num2 != null) {
                                        f6 = f9;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        f6 = f9;
                                    }
                                    if (r7Var.f8568j == 3 && (num = r7Var.f8563d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f11 = r7Var.f8564e;
                                    if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                                        mf0Var.f7120k = f11 / f10;
                                        mf0Var.f7119j = 1;
                                    }
                                    if (!r7Var.f8565f) {
                                        i9 = 0;
                                        i10 = 33;
                                        if (z7) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    } else if (z7) {
                                        i9 = 0;
                                        i10 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i9 = 0;
                                        i10 = 33;
                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                    }
                                    if (r7Var.h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                    }
                                    if (r7Var.f8567i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                    }
                                } else {
                                    f6 = f9;
                                    f7 = -3.4028235E38f;
                                }
                                int i17 = i16;
                                int i18 = i17 != -1 ? i17 : r7Var != null ? r7Var.f8561b : -1;
                                switch (i18) {
                                    case 0:
                                    default:
                                        androidx.activity.m.g(i18, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                mf0Var.f7113c = alignment;
                                int i19 = Integer.MIN_VALUE;
                                switch (i18) {
                                    case 0:
                                    default:
                                        androidx.activity.m.g(i18, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i8 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i8 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i8 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i8 = 2;
                                        break;
                                }
                                mf0Var.f7118i = i8;
                                switch (i18) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        androidx.activity.m.g(i18, "Unknown alignment: ", "SsaParser");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i19 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i19 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i19 = 0;
                                        break;
                                }
                                mf0Var.f7117g = i19;
                                PointF pointF3 = pointF2;
                                if (pointF3 == null || f10 == f7 || f6 == f7) {
                                    int i20 = mf0Var.f7118i;
                                    mf0Var.h = i20 != 0 ? i20 != 1 ? i20 != 2 ? f7 : 0.95f : 0.5f : 0.05f;
                                    mf0Var.f7115e = i19 != 0 ? i19 != 1 ? i19 != 2 ? f7 : 0.95f : 0.5f : 0.05f;
                                    mf0Var.f7116f = 0;
                                } else {
                                    mf0Var.h = pointF3.x / f6;
                                    mf0Var.f7115e = pointF3.y / f10;
                                    mf0Var.f7116f = 0;
                                }
                                xg0 xg0VarA = mf0Var.a();
                                int iA = a(jC2, arrayList2, arrayList);
                                for (int iA2 = a(jC, arrayList2, arrayList); iA2 < iA; iA2++) {
                                    ((List) arrayList.get(iA2)).add(xg0VarA);
                                }
                                o7Var = this;
                                charsetC = charset;
                                n7VarA = n7Var;
                                ex0Var3 = ex0Var;
                            }
                        }
                        charset = charsetC;
                        n7Var = n7VarA;
                        ex0Var = ex0Var3;
                        o7Var = this;
                        charsetC = charset;
                        n7VarA = n7Var;
                        ex0Var3 = ex0Var;
                    }
                }
                charset = charsetC;
                n7Var = n7VarA;
                ex0Var = ex0Var3;
                o7Var = this;
                charsetC = charset;
                n7VarA = n7Var;
                ex0Var3 = ex0Var;
            } else {
                charset = charsetC;
                n7Var = n7VarA;
                ex0Var = ex0Var3;
                o7Var = this;
                charsetC = charset;
                n7VarA = n7Var;
                ex0Var3 = ex0Var;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0299 A[Catch: RuntimeException -> 0x01ef, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:85:0x01bf, B:87:0x01cd, B:88:0x01d3, B:95:0x01f4, B:97:0x01f8, B:99:0x0207, B:101:0x020b, B:103:0x021a, B:105:0x021e, B:106:0x0224, B:111:0x0241, B:113:0x0245, B:117:0x0256, B:119:0x025a, B:123:0x026b, B:125:0x026f, B:129:0x0280, B:131:0x0284, B:135:0x0295, B:137:0x0299, B:138:0x029f, B:146:0x02bf, B:144:0x02b0, B:109:0x022c, B:90:0x01de), top: B:168:0x01bf, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ex0 ex0Var, Charset charset) throws NumberFormatException {
        String strTrim;
        int i6;
        Integer numA;
        Integer numA2;
        int i7;
        float f6;
        int i8;
        int i9;
        r7 r7Var;
        int i10;
        int i11;
        while (true) {
            String strH = ex0Var.H(charset);
            if (strH == null) {
                return;
            }
            char c7 = '[';
            int i12 = 0;
            if ("[Script Info]".equalsIgnoreCase(strH)) {
                while (true) {
                    String strH2 = ex0Var.H(charset);
                    if (strH2 == null) {
                        break;
                    }
                    if (ex0Var.o() != 0) {
                        y5.p("Unsupported charset: ".concat(String.valueOf(charset)), ex0.f4415f.contains(charset));
                        if (((char) (ex0Var.n(charset) >> 16)) == '[') {
                            break;
                        }
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == 2) {
                        String strG = rj1.g(strArrSplit[0].trim());
                        switch (strG.hashCode()) {
                            case 1879649548:
                                if (!strG.equals("playresx")) {
                                    break;
                                } else {
                                    this.f7627w = Float.parseFloat(strArrSplit[1].trim());
                                    break;
                                }
                            case 1879649549:
                                if (!strG.equals("playresy")) {
                                    break;
                                } else {
                                    try {
                                        this.f7628x = Float.parseFloat(strArrSplit[1].trim());
                                        break;
                                    } catch (NumberFormatException unused) {
                                        break;
                                    }
                                }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    p7 p7Var = null;
                    while (true) {
                        String strH3 = ex0Var.H(charset);
                        if (strH3 != null) {
                            if (ex0Var.o() != 0) {
                                y5.p("Unsupported charset: ".concat(String.valueOf(charset)), ex0.f4415f.contains(charset));
                                if (((char) (ex0Var.n(charset) >> 16)) == c7) {
                                }
                            }
                            if (strH3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strH3.substring(7), ",");
                                int i13 = i12;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i13 < length) {
                                        String strG2 = rj1.g(strArrSplit2[i13].trim());
                                        switch (strG2.hashCode()) {
                                            case -1178781136:
                                                if (!strG2.equals("italic")) {
                                                    break;
                                                } else {
                                                    i20 = i13;
                                                    break;
                                                }
                                            case -1026963764:
                                                if (!strG2.equals("underline")) {
                                                    break;
                                                } else {
                                                    i21 = i13;
                                                    break;
                                                }
                                            case -192095652:
                                                if (!strG2.equals("strikeout")) {
                                                    break;
                                                } else {
                                                    i22 = i13;
                                                    break;
                                                }
                                            case -70925746:
                                                if (!strG2.equals("primarycolour")) {
                                                    break;
                                                } else {
                                                    i16 = i13;
                                                    break;
                                                }
                                            case 3029637:
                                                if (!strG2.equals("bold")) {
                                                    break;
                                                } else {
                                                    i19 = i13;
                                                    break;
                                                }
                                            case 3373707:
                                                if (!strG2.equals("name")) {
                                                    break;
                                                } else {
                                                    i14 = i13;
                                                    break;
                                                }
                                            case 366554320:
                                                if (!strG2.equals("fontsize")) {
                                                    break;
                                                } else {
                                                    i18 = i13;
                                                    break;
                                                }
                                            case 767321349:
                                                if (!strG2.equals("borderstyle")) {
                                                    break;
                                                } else {
                                                    i23 = i13;
                                                    break;
                                                }
                                            case 1767875043:
                                                if (!strG2.equals("alignment")) {
                                                    break;
                                                } else {
                                                    i15 = i13;
                                                    break;
                                                }
                                            case 1988365454:
                                                if (!strG2.equals("outlinecolour")) {
                                                    break;
                                                } else {
                                                    i17 = i13;
                                                    break;
                                                }
                                        }
                                        i13++;
                                    } else if (i14 != -1) {
                                        p7Var = new p7(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, length);
                                    }
                                }
                            } else {
                                if (strH3.startsWith("Style:")) {
                                    if (p7Var == null) {
                                        qs0.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                                    } else {
                                        y5.n(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i24 = p7Var.f7984k;
                                        if (length2 != i24) {
                                            Locale locale = Locale.US;
                                            StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Skipping malformed 'Style:' line (expected ", i24, " values, found ", length2, "): '");
                                            sbA.append(strH3);
                                            sbA.append("'");
                                            qs0.f("SsaStyle", sbA.toString());
                                        } else {
                                            try {
                                                strTrim = strArrSplit3[p7Var.f7975a].trim();
                                                int i25 = p7Var.f7976b;
                                                if (i25 != -1) {
                                                    String strTrim2 = strArrSplit3[i25].trim();
                                                    try {
                                                        i11 = Integer.parseInt(strTrim2.trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    switch (i11) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            qs0.f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(strTrim2)));
                                                            i11 = -1;
                                                            break;
                                                    }
                                                    i6 = i11;
                                                } else {
                                                    i6 = -1;
                                                }
                                                int i26 = p7Var.f7977c;
                                                numA = i26 != -1 ? r7.a(strArrSplit3[i26].trim()) : null;
                                                int i27 = p7Var.f7978d;
                                                numA2 = i27 != -1 ? r7.a(strArrSplit3[i27].trim()) : null;
                                                i7 = p7Var.f7979e;
                                            } catch (RuntimeException e6) {
                                                qs0.g("SsaStyle", "Skipping malformed 'Style:' line: '" + strH3 + "'", e6);
                                            }
                                            if (i7 != -1) {
                                                String strTrim3 = strArrSplit3[i7].trim();
                                                try {
                                                    f6 = Float.parseFloat(strTrim3);
                                                } catch (NumberFormatException e7) {
                                                    qs0.g("SsaStyle", "Failed to parse font size: '" + strTrim3 + "'", e7);
                                                }
                                                int i28 = p7Var.f7980f;
                                                boolean z6 = i28 == -1 && r7.b(strArrSplit3[i28].trim());
                                                int i29 = p7Var.f7981g;
                                                boolean z7 = i29 == -1 && r7.b(strArrSplit3[i29].trim());
                                                int i30 = p7Var.h;
                                                boolean z8 = i30 == -1 && r7.b(strArrSplit3[i30].trim());
                                                int i31 = p7Var.f7982i;
                                                boolean z9 = i31 == -1 && r7.b(strArrSplit3[i31].trim());
                                                i8 = p7Var.f7983j;
                                                if (i8 == -1) {
                                                    String strTrim4 = strArrSplit3[i8].trim();
                                                    try {
                                                        i10 = Integer.parseInt(strTrim4.trim());
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                    if (i10 == 1 || i10 == 3) {
                                                        i9 = i10;
                                                        r7Var = new r7(strTrim, i6, numA, numA2, f6, z6, z7, z8, z9, i9);
                                                        if (r7Var != null) {
                                                            linkedHashMap.put(r7Var.f8560a, r7Var);
                                                        }
                                                    }
                                                    qs0.f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim4)));
                                                    i9 = -1;
                                                    r7Var = new r7(strTrim, i6, numA, numA2, f6, z6, z7, z8, z9, i9);
                                                    if (r7Var != null) {
                                                    }
                                                } else {
                                                    i9 = -1;
                                                    r7Var = new r7(strTrim, i6, numA, numA2, f6, z6, z7, z8, z9, i9);
                                                    if (r7Var != null) {
                                                    }
                                                }
                                            } else {
                                                f6 = -3.4028235E38f;
                                                int i282 = p7Var.f7980f;
                                                if (i282 == -1) {
                                                    int i292 = p7Var.f7981g;
                                                    if (i292 == -1) {
                                                        int i302 = p7Var.h;
                                                        if (i302 == -1) {
                                                            int i312 = p7Var.f7982i;
                                                            if (i312 == -1) {
                                                                i8 = p7Var.f7983j;
                                                                if (i8 == -1) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        r7Var = null;
                                        if (r7Var != null) {
                                        }
                                    }
                                }
                                c7 = '[';
                                i12 = 0;
                            }
                        }
                    }
                }
                this.f7626v = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                qs0.e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strH)) {
                return;
            }
        }
    }
}
