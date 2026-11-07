package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10079b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10080c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10081d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10082e;

    /* renamed from: f, reason: collision with root package name */
    public final b8 f10083f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f10084g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10085i;

    /* renamed from: j, reason: collision with root package name */
    public final w7 f10086j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f10087k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f10088l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10089m;

    public w7(String str, String str2, long j6, long j7, b8 b8Var, String[] strArr, String str3, String str4, w7 w7Var) {
        this.f10078a = str;
        this.f10079b = str2;
        this.f10085i = str4;
        this.f10083f = b8Var;
        this.f10084g = strArr;
        this.f10080c = str2 != null;
        this.f10081d = j6;
        this.f10082e = j7;
        str3.getClass();
        this.h = str3;
        this.f10086j = w7Var;
        this.f10087k = new HashMap();
        this.f10088l = new HashMap();
    }

    public static w7 b(String str, long j6, long j7, b8 b8Var, String[] strArr, String str2, String str3, w7 w7Var) {
        return new w7(str, null, j6, j7, b8Var, strArr, str2, str3, w7Var);
    }

    public static w7 c(String str) {
        return new w7(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null, null);
    }

    public static SpannableStringBuilder f(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            mf0 mf0Var = new mf0();
            mf0Var.f7111a = new SpannableStringBuilder();
            treeMap.put(str, mf0Var);
        }
        CharSequence charSequence = ((mf0) treeMap.get(str)).f7111a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        ArrayList arrayList = this.f10089m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final w7 d(int i6) {
        ArrayList arrayList = this.f10089m;
        if (arrayList != null) {
            return (w7) arrayList.get(i6);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean e(long j6) {
        long j7 = this.f10081d;
        long j8 = this.f10082e;
        if (j7 == -9223372036854775807L) {
            if (j8 == -9223372036854775807L) {
                return true;
            }
            j7 = -9223372036854775807L;
        }
        if (j7 <= j6 && j8 == -9223372036854775807L) {
            return true;
        }
        if (j7 != -9223372036854775807L || j6 >= j8) {
            return j7 <= j6 && j6 < j8;
        }
        return true;
    }

    public final void g(TreeSet treeSet, boolean z6) {
        String str = this.f10078a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z6 || zEquals || (zEquals2 && this.f10085i != null)) {
            long j6 = this.f10081d;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
            long j7 = this.f10082e;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
        }
        if (this.f10089m != null) {
            for (int i6 = 0; i6 < this.f10089m.size(); i6++) {
                w7 w7Var = (w7) this.f10089m.get(i6);
                boolean z7 = true;
                if (!z6 && !zEquals) {
                    z7 = false;
                }
                w7Var.g(treeSet, z7);
            }
        }
    }

    public final void h(long j6, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str3)) {
            str = str3;
        }
        if (e(j6) && "div".equals(this.f10078a) && (str2 = this.f10085i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i6 = 0; i6 < a(); i6++) {
            d(i6).h(j6, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j6, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i6;
        int i7;
        w7 w7Var;
        int i8;
        int i9;
        int i10;
        b8 b8VarE;
        int i11;
        Iterator it;
        float f6;
        int i12;
        int i13;
        int i14;
        Map map3 = map;
        if (e(j6)) {
            String str2 = this.h;
            String str3 = !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? str2 : str;
            Iterator it2 = this.f10088l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f10087k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    mf0 mf0Var = (mf0) treeMap.get(str4);
                    mf0Var.getClass();
                    a8 a8Var = (a8) map2.get(str3);
                    a8Var.getClass();
                    int i15 = a8Var.f2611j;
                    b8 b8VarE2 = f0.e(this.f10083f, this.f10084g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) mf0Var.f7111a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        mf0Var.f7111a = spannableStringBuilder;
                    }
                    if (b8VarE2 != null) {
                        int i16 = b8VarE2.h;
                        int i17 = 1;
                        if (((i16 == -1 && b8VarE2.f2969i == -1) ? -1 : (i16 == 1 ? (char) 1 : (char) 0) | (b8VarE2.f2969i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i18 = b8VarE2.h;
                            if (i18 != -1) {
                                i14 = (i18 != i17 ? i17 : 0) | (b8VarE2.f2969i != i17 ? 2 : 0);
                                StyleSpan styleSpan = new StyleSpan(i14);
                                i6 = 33;
                                spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                            } else if (b8VarE2.f2969i != -1) {
                                i17 = 1;
                                i14 = (i18 != i17 ? i17 : 0) | (b8VarE2.f2969i != i17 ? 2 : 0);
                                StyleSpan styleSpan2 = new StyleSpan(i14);
                                i6 = 33;
                                spannableStringBuilder.setSpan(styleSpan2, iIntValue, iIntValue2, 33);
                            } else {
                                i14 = -1;
                                i17 = 1;
                                StyleSpan styleSpan22 = new StyleSpan(i14);
                                i6 = 33;
                                spannableStringBuilder.setSpan(styleSpan22, iIntValue, iIntValue2, 33);
                            }
                        } else {
                            i6 = 33;
                        }
                        if (b8VarE2.f2967f == i17) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i6);
                        }
                        if (b8VarE2.f2968g == i17) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i6);
                        }
                        if (b8VarE2.f2964c) {
                            if (!b8VarE2.f2964c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            d0.h(spannableStringBuilder, new ForegroundColorSpan(b8VarE2.f2963b), iIntValue, iIntValue2);
                        }
                        if (b8VarE2.f2966e) {
                            if (!b8VarE2.f2966e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            d0.h(spannableStringBuilder, new BackgroundColorSpan(b8VarE2.f2965d), iIntValue, iIntValue2);
                        }
                        if (b8VarE2.f2962a != null) {
                            d0.h(spannableStringBuilder, new TypefaceSpan(b8VarE2.f2962a), iIntValue, iIntValue2);
                        }
                        v7 v7Var = b8VarE2.f2978r;
                        if (v7Var != null) {
                            int i19 = v7Var.f9741a;
                            if (i19 == -1) {
                                i7 = -1;
                                i19 = (i15 == 2 || i15 == 1) ? 3 : 1;
                                i13 = 1;
                            } else {
                                i7 = -1;
                                i13 = v7Var.f9742b;
                            }
                            int i20 = v7Var.f9743c;
                            if (i20 == -2) {
                                i20 = 1;
                            }
                            d0.h(spannableStringBuilder, new tj0(i19, i13, i20), iIntValue, iIntValue2);
                        } else {
                            i7 = -1;
                        }
                        int i21 = b8VarE2.f2973m;
                        if (i21 == 2) {
                            w7 w7Var2 = this.f10086j;
                            while (true) {
                                if (w7Var2 == null) {
                                    w7Var2 = null;
                                    break;
                                }
                                b8 b8VarE3 = f0.e(w7Var2.f10083f, w7Var2.f10084g, map3);
                                if (b8VarE3 != null && b8VarE3.f2973m == 1) {
                                    break;
                                } else {
                                    w7Var2 = w7Var2.f10086j;
                                }
                            }
                            if (w7Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(w7Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        w7Var = null;
                                        break;
                                    }
                                    w7 w7Var3 = (w7) arrayDeque.pop();
                                    b8 b8VarE4 = f0.e(w7Var3.f10083f, w7Var3.f10084g, map3);
                                    if (b8VarE4 != null && b8VarE4.f2973m == 3) {
                                        w7Var = w7Var3;
                                        break;
                                    }
                                    for (int iA = w7Var3.a() - 1; iA >= 0; iA--) {
                                        arrayDeque.push(w7Var3.d(iA));
                                    }
                                }
                                if (w7Var != null) {
                                    if (w7Var.a() == 1) {
                                        i8 = 0;
                                        if (w7Var.d(0).f10079b != null) {
                                            String str5 = w7Var.d(0).f10079b;
                                            int i22 = j31.f5914a;
                                            b8 b8VarE5 = f0.e(w7Var.f10083f, w7Var.f10084g, map3);
                                            if (b8VarE5 != null) {
                                                i9 = b8VarE5.f2974n;
                                                i10 = i7;
                                            } else {
                                                i9 = i7;
                                                i10 = i9;
                                            }
                                            if (i9 == i10 && (b8VarE = f0.e(w7Var2.f10083f, w7Var2.f10084g, map3)) != null) {
                                                i9 = b8VarE.f2974n;
                                            }
                                            spannableStringBuilder.setSpan(new dj0(str5, i9), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i8 = 0;
                                    }
                                    qs0.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                                if (b8VarE2.f2977q == 1) {
                                    d0.h(spannableStringBuilder, new ui0(), iIntValue, iIntValue2);
                                }
                                i11 = b8VarE2.f2970j;
                                float f7 = 100.0f;
                                if (i11 != 1) {
                                    it = it2;
                                    f6 = 100.0f;
                                    d0.h(spannableStringBuilder, new AbsoluteSizeSpan((int) b8VarE2.f2971k, true), iIntValue, iIntValue2);
                                } else if (i11 == 2) {
                                    it = it2;
                                    f6 = 100.0f;
                                    d0.h(spannableStringBuilder, new RelativeSizeSpan(b8VarE2.f2971k), iIntValue, iIntValue2);
                                } else if (i11 != 3) {
                                    it = it2;
                                    f6 = 100.0f;
                                } else {
                                    float f8 = b8VarE2.f2971k / 100.0f;
                                    RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    int length = relativeSizeSpanArr.length;
                                    int i23 = i8;
                                    float sizeChange = f8;
                                    int i24 = i23;
                                    while (i24 < length) {
                                        float f9 = f7;
                                        RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i24];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                            i12 = i24;
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        } else {
                                            i12 = i24;
                                        }
                                        i24 = i12 + 1;
                                        f7 = f9;
                                        it2 = it3;
                                    }
                                    it = it2;
                                    f6 = f7;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                if ("p".equals(this.f10078a)) {
                                    float f10 = b8VarE2.s;
                                    if (f10 != Float.MAX_VALUE) {
                                        mf0Var.f7124o = (f10 * (-90.0f)) / f6;
                                    }
                                    Layout.Alignment alignment = b8VarE2.f2975o;
                                    if (alignment != null) {
                                        mf0Var.f7113c = alignment;
                                    }
                                    Layout.Alignment alignment2 = b8VarE2.f2976p;
                                    if (alignment2 != null) {
                                        mf0Var.f7114d = alignment2;
                                    }
                                }
                                it2 = it;
                            }
                        } else if (i21 == 3 || i21 == 4) {
                            spannableStringBuilder.setSpan(new u7(), iIntValue, iIntValue2, 33);
                        }
                        i8 = 0;
                        if (b8VarE2.f2977q == 1) {
                        }
                        i11 = b8VarE2.f2970j;
                        float f72 = 100.0f;
                        if (i11 != 1) {
                        }
                        if ("p".equals(this.f10078a)) {
                        }
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i25 = 0;
            while (i25 < a()) {
                d(i25).i(j6, map3, map2, str3, treeMap);
                i25++;
                map3 = map;
            }
        }
    }

    public final void j(long j6, boolean z6, String str, TreeMap treeMap) {
        TreeMap treeMap2;
        boolean z7;
        long j7;
        HashMap map = this.f10087k;
        map.clear();
        HashMap map2 = this.f10088l;
        map2.clear();
        String str2 = this.f10078a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str3) ? str3 : str;
        if (this.f10080c && z6) {
            SpannableStringBuilder spannableStringBuilderF = f(str4, treeMap);
            String str5 = this.f10079b;
            str5.getClass();
            spannableStringBuilderF.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z6) {
            f(str4, treeMap).append('\n');
            return;
        }
        if (e(j6)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((mf0) entry.getValue()).f7111a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i6 = 0; i6 < a(); i6++) {
                w7 w7VarD = d(i6);
                if (z6 || zEquals) {
                    treeMap2 = treeMap;
                    z7 = true;
                    j7 = j6;
                } else {
                    j7 = j6;
                    treeMap2 = treeMap;
                    z7 = false;
                }
                w7VarD.j(j7, z7, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderF2 = f(str4, treeMap);
                int length = spannableStringBuilderF2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderF2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderF2.charAt(length) != '\n') {
                    spannableStringBuilderF2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((mf0) entry2.getValue()).f7111a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
