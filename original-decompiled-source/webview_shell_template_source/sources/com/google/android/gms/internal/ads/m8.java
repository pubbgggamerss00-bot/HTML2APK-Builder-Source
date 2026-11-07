package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6964a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f6965b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f6966c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f6967d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6966c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6967d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString a(String str, String str2, List list) {
        int i6;
        int i7;
        int i8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int length = str2.length();
            String strTrim = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 + 1;
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i11);
                int iIndexOf2 = str2.indexOf(32, i11);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i11, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode == 3309) {
                        if (strSubstring.equals("gt")) {
                            spannableStringBuilder.append('>');
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i10 = iIndexOf + 1;
                        i9 = 0;
                    } else if (iHashCode == 3464) {
                        if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i10 = iIndexOf + 1;
                        i9 = 0;
                    } else if (iHashCode != 96708) {
                        if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                            spannableStringBuilder.append(' ');
                        } else {
                            qs0.f("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i10 = iIndexOf + 1;
                        i9 = 0;
                    } else {
                        if (strSubstring.equals("amp")) {
                            spannableStringBuilder.append('&');
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i10 = iIndexOf + 1;
                        i9 = 0;
                    }
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i11 < str2.length()) {
                char cCharAt2 = str2.charAt(i11);
                int iIndexOf3 = str2.indexOf(62, i11);
                int length2 = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i12 = length2 - 2;
                if (str2.charAt(i12) == '/') {
                    i7 = i9;
                    i6 = 1;
                } else {
                    i6 = i9;
                    i7 = i6;
                }
                int i13 = i10 + (cCharAt2 == '/' ? 2 : 1);
                if (i6 == 0) {
                    i12 = length2 - 1;
                }
                String strSubstring2 = str2.substring(i13, i12);
                if (strSubstring2.trim().isEmpty()) {
                    i8 = i7;
                    i10 = length2;
                    i9 = i8;
                } else {
                    String strTrim2 = strSubstring2.trim();
                    y5.n(!strTrim2.isEmpty());
                    int i14 = j31.f5914a;
                    String str3 = strTrim2.split("[ \\.]", 2)[i7];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98 ? str3.equals("b") : !(iHashCode2 == 99 ? !str3.equals("c") : iHashCode2 == 105 ? !str3.equals("i") : iHashCode2 == 3650 ? !str3.equals("rt") : iHashCode2 == 3314158 ? !str3.equals("lang") : iHashCode2 == 3511770 ? !str3.equals("ruby") : iHashCode2 == 117 ? !str3.equals("u") : iHashCode2 != 118 || !str3.equals("v"))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                j8 j8Var = (j8) arrayDeque.pop();
                                e(str, j8Var, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new i8(j8Var, spannableStringBuilder.length()));
                                }
                                if (j8Var.f5968a.equals(str3)) {
                                    break;
                                }
                            }
                        } else {
                            if (i6 == 0) {
                                int length3 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                y5.n(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(" ");
                                if (iIndexOf4 == -1) {
                                    i8 = i7;
                                } else {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    i8 = i7;
                                    strTrim3 = strTrim3.substring(i8, iIndexOf4);
                                }
                                String[] strArrSplit = strTrim3.split("\\.", -1);
                                String str4 = strArrSplit[i8];
                                HashSet hashSet = new HashSet();
                                for (int i15 = 1; i15 < strArrSplit.length; i15++) {
                                    hashSet.add(strArrSplit[i15]);
                                }
                                arrayDeque.push(new j8(str4, length3, strTrim, hashSet));
                            }
                            i10 = length2;
                            i9 = i8;
                        }
                        i8 = i7;
                        i10 = length2;
                        i9 = i8;
                    }
                }
            }
            i10 = i11;
            i9 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            e(str, (j8) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        e(str, new j8(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i9, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int b(List list, String str, j8 j8Var) {
        ArrayList arrayListD = d(list, str, j8Var);
        for (int i6 = 0; i6 < arrayListD.size(); i6++) {
            int i7 = ((k8) arrayListD.get(i6)).f6277t.f4535o;
            if (i7 != -1) {
                return i7;
            }
        }
        return -1;
    }

    public static g8 c(String str, Matcher matcher, ex0 ex0Var, ArrayList arrayList) {
        l8 l8Var = new l8();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            l8Var.f6597a = n8.b(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            l8Var.f6598b = n8.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            f(strGroup3, l8Var);
            StringBuilder sb = new StringBuilder();
            String strH = ex0Var.H(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = ex0Var.H(StandardCharsets.UTF_8);
            }
            l8Var.f6599c = a(str, sb.toString(), arrayList);
            return new g8(l8Var.a().a(), l8Var.f6597a, l8Var.f6598b);
        } catch (NumberFormatException unused) {
            qs0.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(List list, String str, j8 j8Var) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            f8 f8Var = (f8) list.get(i6);
            String str2 = j8Var.f5968a;
            Set set = j8Var.f5971d;
            String str3 = j8Var.f5970c;
            if (!f8Var.f4522a.isEmpty() || !f8Var.f4523b.isEmpty() || !f8Var.f4524c.isEmpty() || !f8Var.f4525d.isEmpty()) {
                int iA = f8.a(f8Var.f4525d, f8.a(f8Var.f4523b, f8.a(f8Var.f4522a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(f8Var.f4524c)) ? 0 : iA + (f8Var.f4524c.size() * 4);
            } else if (TextUtils.isEmpty(str2)) {
                size = 1;
            }
            if (size > 0) {
                arrayList.add(new k8(size, f8Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void e(String str, j8 j8Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i6;
        int i7;
        int i8;
        int i9 = j8Var.f5969b;
        int length = spannableStringBuilder.length();
        String str2 = j8Var.f5968a;
        int iHashCode = str2.hashCode();
        int i10 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iB = b(list2, str, j8Var);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, i8.f5595c);
                        int i11 = j8Var.f5969b;
                        int i12 = 0;
                        int length2 = 0;
                        while (i12 < arrayList.size()) {
                            if ("rt".equals(((i8) arrayList.get(i12)).f5596a.f5968a)) {
                                i8 i8Var = (i8) arrayList.get(i12);
                                int iB2 = b(list2, str, i8Var.f5596a);
                                if (iB2 == i10) {
                                    iB2 = iB != i10 ? iB : 1;
                                }
                                int i13 = i8Var.f5596a.f5969b - length2;
                                int i14 = i8Var.f5597b - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                                spannableStringBuilder.delete(i13, i14);
                                spannableStringBuilder.setSpan(new dj0(charSequenceSubSequence.toString(), iB2), i11, i13, 33);
                                length2 += charSequenceSubSequence.length();
                                i11 = i13;
                            }
                            i12++;
                            i10 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : j8Var.f5971d) {
                                Map map = f6966c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i9, length, 33);
                                } else {
                                    Map map2 = f6967d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i9, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new hk0(j8Var.f5970c), i9, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i9, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, length, 33);
            }
        } else if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            return;
        }
        ArrayList arrayListD = d(list2, str, j8Var);
        for (int i15 = 0; i15 < arrayListD.size(); i15++) {
            f8 f8Var = ((k8) arrayListD.get(i15)).f6277t;
            int i16 = f8Var.f4531k;
            if (i16 == -1 && f8Var.f4532l == -1) {
                i6 = -1;
            } else {
                i6 = (f8Var.f4532l == 1 ? (char) 2 : (char) 0) | (i16 == 1 ? (char) 1 : (char) 0);
            }
            if (i6 != -1) {
                int i17 = f8Var.f4531k;
                if (i17 == -1 && f8Var.f4532l == -1) {
                    i8 = -1;
                    i7 = 1;
                } else {
                    i7 = 1;
                    i8 = (i17 == 1 ? 1 : 0) | (f8Var.f4532l == 1 ? 2 : 0);
                }
                d0.h(spannableStringBuilder, new StyleSpan(i8), i9, length);
            } else {
                i7 = 1;
            }
            if (f8Var.f4530j == i7) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
            }
            if (f8Var.f4528g) {
                if (!f8Var.f4528g) {
                    throw new IllegalStateException("Font color not defined");
                }
                d0.h(spannableStringBuilder, new ForegroundColorSpan(f8Var.f4527f), i9, length);
            }
            if (f8Var.f4529i) {
                if (!f8Var.f4529i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                d0.h(spannableStringBuilder, new BackgroundColorSpan(f8Var.h), i9, length);
            }
            if (f8Var.f4526e != null) {
                d0.h(spannableStringBuilder, new TypefaceSpan(f8Var.f4526e), i9, length);
            }
            int i18 = f8Var.f4533m;
            if (i18 == 1) {
                d0.h(spannableStringBuilder, new AbsoluteSizeSpan((int) f8Var.f4534n, true), i9, length);
            } else if (i18 == 2) {
                d0.h(spannableStringBuilder, new RelativeSizeSpan(f8Var.f4534n), i9, length);
            } else if (i18 == 3) {
                d0.h(spannableStringBuilder, new RelativeSizeSpan(f8Var.f4534n / 100.0f), i9, length);
            }
            if (f8Var.f4536p) {
                spannableStringBuilder.setSpan(new ui0(), i9, length, 33);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181 A[Catch: NumberFormatException -> 0x01ab, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01ab, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:32:0x00a8, B:31:0x009e, B:33:0x00ac, B:35:0x00b2, B:57:0x00f8, B:56:0x00f0, B:58:0x00fe, B:59:0x0106, B:81:0x014a, B:80:0x0140, B:82:0x014e, B:84:0x0154, B:100:0x0188, B:99:0x0181, B:101:0x018e, B:103:0x0196, B:104:0x01a0), top: B:108:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(String str, l8 l8Var) {
        Matcher matcher = f6965b.matcher(str);
        while (matcher.find()) {
            int i6 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                int i7 = Integer.MIN_VALUE;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (!strSubstring.equals("center")) {
                                    qs0.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    break;
                                } else {
                                    i7 = 1;
                                    break;
                                }
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    i7 = 2;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    i7 = 0;
                                    break;
                                }
                                break;
                        }
                        l8Var.f6603g = i7;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        l8Var.f6601e = n8.a(strGroup2);
                        l8Var.f6602f = 0;
                    } else {
                        l8Var.f6601e = Integer.parseInt(strGroup2);
                        l8Var.f6602f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (!strGroup2.equals("center")) {
                                qs0.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i6 = 2;
                            break;
                        case -1074341483:
                            if (!strGroup2.equals("middle")) {
                            }
                            i6 = 2;
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                i6 = 3;
                                break;
                            }
                            qs0.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i6 = 2;
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                i6 = 4;
                                break;
                            }
                            qs0.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i6 = 2;
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                i6 = 5;
                                break;
                            }
                            qs0.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i6 = 2;
                            break;
                        case 109757538:
                            break;
                    }
                    l8Var.f6600d = i6;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (!strSubstring2.equals("line-left")) {
                                    qs0.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                    i6 = Integer.MIN_VALUE;
                                    break;
                                } else {
                                    i6 = 0;
                                    break;
                                }
                            case -1364013995:
                                if (!strSubstring2.equals("center")) {
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    i6 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (!strSubstring2.equals("middle")) {
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                }
                                break;
                        }
                        l8Var.f6604i = i6;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    l8Var.h = n8.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    l8Var.f6605j = n8.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode != 3642 || !strGroup2.equals("rl")) {
                            qs0.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i6 = Integer.MIN_VALUE;
                        }
                        l8Var.f6606k = i6;
                    } else {
                        if (strGroup2.equals("lr")) {
                            i6 = 2;
                        }
                        l8Var.f6606k = i6;
                    }
                } else {
                    qs0.f("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                qs0.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
