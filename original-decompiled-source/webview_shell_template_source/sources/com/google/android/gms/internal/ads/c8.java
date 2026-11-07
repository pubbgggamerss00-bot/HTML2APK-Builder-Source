package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c8 implements x6 {

    /* renamed from: a, reason: collision with root package name */
    public final w7 f3457a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3458b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3459c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3460d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3461e;

    public c8(w7 w7Var, HashMap map, HashMap map2, HashMap map3) {
        this.f3457a = w7Var;
        this.f3460d = map2;
        this.f3461e = map3;
        this.f3459c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i6 = 0;
        w7Var.g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i6] = ((Long) it.next()).longValue();
            i6++;
        }
        this.f3458b = jArr;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final ArrayList a(long j6) {
        ArrayList arrayList = new ArrayList();
        w7 w7Var = this.f3457a;
        w7Var.h(j6, w7Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        w7Var.j(j6, false, w7Var.h, treeMap);
        String str = w7Var.h;
        Map map = this.f3459c;
        HashMap map2 = this.f3460d;
        w7Var.i(j6, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Pair pair = (Pair) arrayList.get(i6);
            String str2 = (String) this.f3461e.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                a8 a8Var = (a8) map2.get(pair.first);
                a8Var.getClass();
                mf0 mf0Var = new mf0();
                mf0Var.f7112b = bitmapDecodeByteArray;
                mf0Var.h = a8Var.f2604b;
                mf0Var.f7118i = 0;
                mf0Var.f7115e = a8Var.f2605c;
                mf0Var.f7116f = 0;
                mf0Var.f7117g = a8Var.f2607e;
                mf0Var.f7121l = a8Var.f2608f;
                mf0Var.f7122m = a8Var.f2609g;
                mf0Var.f7123n = a8Var.f2611j;
                arrayList2.add(mf0Var.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            a8 a8Var2 = (a8) map2.get(entry.getKey());
            a8Var2.getClass();
            mf0 mf0Var2 = (mf0) entry.getValue();
            CharSequence charSequence = mf0Var2.f7111a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (u7 u7Var : (u7[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u7.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(u7Var), spannableStringBuilder.getSpanEnd(u7Var), (CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            int i7 = 0;
            while (i7 < spannableStringBuilder.length()) {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
                i7 = i8;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length() - 1) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == '\n' && spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i13 = 0;
            while (i13 < spannableStringBuilder.length() - 1) {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i13) == ' ' && spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
                i13 = i14;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f6 = a8Var2.f2605c;
            int i15 = a8Var2.f2606d;
            mf0Var2.f7115e = f6;
            mf0Var2.f7116f = i15;
            mf0Var2.f7117g = a8Var2.f2607e;
            mf0Var2.h = a8Var2.f2604b;
            mf0Var2.f7121l = a8Var2.f2608f;
            float f7 = a8Var2.f2610i;
            int i16 = a8Var2.h;
            mf0Var2.f7120k = f7;
            mf0Var2.f7119j = i16;
            mf0Var2.f7123n = a8Var2.f2611j;
            arrayList2.add(mf0Var2.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final int zza() {
        return this.f3458b.length;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final long zzb(int i6) {
        return this.f3458b[i6];
    }
}
