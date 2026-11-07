package com.google.android.material.carousel;

import com.google.android.material.carousel.b;
import d4.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f12172a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f12173b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f12174c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f12175d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f12176e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12177f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12178g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f12172a = bVar;
        this.f12173b = Collections.unmodifiableList(arrayList);
        this.f12174c = Collections.unmodifiableList(arrayList2);
        float f6 = ((b) arrayList.get(arrayList.size() - 1)).b().f12165a - bVar.b().f12165a;
        this.f12177f = f6;
        float f7 = bVar.d().f12165a - ((b) arrayList2.get(arrayList2.size() - 1)).d().f12165a;
        this.f12178g = f7;
        this.f12175d = d(f6, arrayList, true);
        this.f12176e = d(f7, arrayList2, false);
    }

    public static float[] d(float f6, ArrayList arrayList, boolean z6) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i6 = 1;
        while (i6 < size) {
            int i7 = i6 - 1;
            b bVar = (b) arrayList.get(i7);
            b bVar2 = (b) arrayList.get(i6);
            fArr[i6] = i6 == size + (-1) ? 1.0f : fArr[i7] + ((z6 ? bVar2.b().f12165a - bVar.b().f12165a : bVar.d().f12165a - bVar2.d().f12165a) / f6);
            i6++;
        }
        return fArr;
    }

    public static b e(b bVar, int i6, int i7, float f6, int i8, int i9, int i10) {
        ArrayList arrayList = new ArrayList(bVar.f12153c);
        arrayList.add(i7, (b.C0034b) arrayList.remove(i6));
        b.a aVar = new b.a(bVar.f12151a, i10);
        float f7 = f6;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            b.C0034b c0034b = (b.C0034b) arrayList.get(i11);
            float f8 = c0034b.f12168d;
            aVar.b((f8 / 2.0f) + f7, c0034b.f12167c, f8, i11 >= i8 && i11 <= i9, c0034b.f12169e, c0034b.f12170f, 0.0f, 0.0f);
            f7 += c0034b.f12168d;
            i11++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f6, int i6, boolean z6, float f7) {
        int i7;
        List<b.C0034b> list = bVar.f12153c;
        ArrayList arrayList = new ArrayList(list);
        float f8 = bVar.f12151a;
        b.a aVar = new b.a(f8, i6);
        Iterator<b.C0034b> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (it.next().f12169e) {
                i8++;
            }
        }
        float size = f6 / (list.size() - i8);
        float f9 = z6 ? f6 : 0.0f;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            b.C0034b c0034b = (b.C0034b) arrayList.get(i9);
            if (c0034b.f12169e) {
                i7 = i9;
                aVar.b(c0034b.f12166b, c0034b.f12167c, c0034b.f12168d, false, true, c0034b.f12170f, 0.0f, 0.0f);
            } else {
                i7 = i9;
                boolean z7 = i7 >= bVar.f12154d && i7 <= bVar.f12155e;
                float f10 = c0034b.f12168d - size;
                float fA = g.a(f10, f8, f7);
                float f11 = (f10 / 2.0f) + f9;
                float fAbs = Math.abs(f11 - c0034b.f12166b);
                float f12 = c0034b.f12170f;
                float f13 = fAbs;
                if (!z6) {
                    fAbs = 0.0f;
                }
                if (z6) {
                    f13 = 0.0f;
                }
                aVar.b(f11, fA, f10, z7, false, f12, fAbs, f13);
                f9 += f10;
            }
            i9 = i7 + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return this.f12174c.get(r0.size() - 1);
    }

    public final b b(float f6, float f7, float f8) {
        float fB;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f9 = this.f12177f;
        float f10 = f7 + f9;
        float f11 = this.f12178g;
        float f12 = f8 - f11;
        float f13 = c().a().f12171g;
        float f14 = a().a().h;
        if (f9 == f13) {
            f10 += f13;
        }
        if (f11 == f14) {
            f12 -= f14;
        }
        if (f6 < f10) {
            fB = x3.a.b(1.0f, 0.0f, f7, f10, f6);
            list = this.f12173b;
            fArr = this.f12175d;
        } else {
            if (f6 <= f12) {
                return this.f12172a;
            }
            fB = x3.a.b(0.0f, 1.0f, f12, f8, f6);
            list = this.f12174c;
            fArr = this.f12176e;
        }
        int size = list.size();
        float f15 = fArr[0];
        int i6 = 1;
        while (true) {
            if (i6 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f16 = fArr[i6];
            if (fB <= f16) {
                fArr2 = new float[]{x3.a.b(0.0f, 1.0f, f15, f16, fB), i6 - 1, i6};
                break;
            }
            i6++;
            f15 = f16;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f17 = fArr2[0];
        float f18 = bVar.f12151a;
        List<b.C0034b> list2 = bVar.f12153c;
        if (f18 != bVar2.f12151a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0034b> list3 = bVar2.f12153c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            b.C0034b c0034b = list2.get(i7);
            b.C0034b c0034b2 = list3.get(i7);
            arrayList.add(new b.C0034b(x3.a.a(c0034b.f12165a, c0034b2.f12165a, f17), x3.a.a(c0034b.f12166b, c0034b2.f12166b, f17), x3.a.a(c0034b.f12167c, c0034b2.f12167c, f17), x3.a.a(c0034b.f12168d, c0034b2.f12168d, f17), false, 0.0f, 0.0f, 0.0f));
        }
        return new b(bVar.f12151a, arrayList, x3.a.c(f17, bVar.f12154d, bVar2.f12154d), x3.a.c(f17, bVar.f12155e, bVar2.f12155e), bVar.f12156f);
    }

    public final b c() {
        return this.f12173b.get(r0.size() - 1);
    }
}
