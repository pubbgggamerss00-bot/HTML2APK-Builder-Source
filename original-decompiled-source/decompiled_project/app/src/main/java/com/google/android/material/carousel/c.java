package com.google.android.material.carousel;

import android.view.animation.LinearInterpolator;
import com.google.android.material.carousel.b;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rb.f;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f6408a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f6409b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f6410c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f6411d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6412e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6413f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6414g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f6408a = bVar;
        this.f6409b = Collections.unmodifiableList(arrayList);
        this.f6410c = Collections.unmodifiableList(arrayList2);
        float f10 = ((b) l.b.b(arrayList, 1)).b().f6400a - bVar.b().f6400a;
        this.f6413f = f10;
        float f11 = bVar.d().f6400a - ((b) l.b.b(arrayList2, 1)).d().f6400a;
        this.f6414g = f11;
        this.f6411d = d(f10, arrayList, true);
        this.f6412e = d(f11, arrayList2, false);
    }

    public static float[] d(float f10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = (b) arrayList.get(i11);
            b bVar2 = (b) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.b().f6400a - bVar.b().f6400a : bVar.d().f6400a - bVar2.d().f6400a) / f10);
            i10++;
        }
        return fArr;
    }

    public static b e(b bVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(bVar.f6387c);
        arrayList.add(i11, (b.C0071b) arrayList.remove(i10));
        b.a aVar = new b.a(bVar.f6385a, i14);
        float f11 = f10;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            b.C0071b c0071b = (b.C0071b) arrayList.get(i15);
            float f12 = c0071b.f6403d;
            aVar.b((f12 / 2.0f) + f11, c0071b.f6402c, f12, i15 >= i12 && i15 <= i13, c0071b.f6404e, c0071b.f6405f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            f11 += c0071b.f6403d;
            i15++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f10, int i10, boolean z10, float f11) {
        int i11;
        List<b.C0071b> list = bVar.f6387c;
        ArrayList arrayList = new ArrayList(list);
        float f12 = bVar.f6385a;
        b.a aVar = new b.a(f12, i10);
        Iterator<b.C0071b> it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (it.next().f6404e) {
                i12++;
            }
        }
        float size = f10 / (list.size() - i12);
        float f13 = z10 ? f10 : 0.0f;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            b.C0071b c0071b = (b.C0071b) arrayList.get(i13);
            if (c0071b.f6404e) {
                i11 = i13;
                aVar.b(c0071b.f6401b, c0071b.f6402c, c0071b.f6403d, false, true, c0071b.f6405f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                i11 = i13;
                boolean z11 = i11 >= bVar.f6388d && i11 <= bVar.f6389e;
                float f14 = c0071b.f6403d - size;
                float fA = f.a(f14, f12, f11);
                float f15 = (f14 / 2.0f) + f13;
                float fAbs = Math.abs(f15 - c0071b.f6401b);
                float f16 = c0071b.f6405f;
                float f17 = fAbs;
                if (!z10) {
                    fAbs = 0.0f;
                }
                if (z10) {
                    f17 = 0.0f;
                }
                aVar.b(f15, fA, f14, z11, false, f16, fAbs, f17);
                f13 += f14;
            }
            i13 = i11 + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return this.f6410c.get(r0.size() - 1);
    }

    public final b b(float f10, float f11, float f12) {
        float fB;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f6413f;
        float f14 = f11 + f13;
        float f15 = this.f6414g;
        float f16 = f12 - f15;
        float f17 = c().a().f6406g;
        float f18 = a().a().f6407h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f10 < f14) {
            fB = nb.a.b(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, f11, f14, f10);
            list = this.f6409b;
            fArr = this.f6411d;
        } else {
            if (f10 <= f16) {
                return this.f6408a;
            }
            fB = nb.a.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f16, f12, f10);
            list = this.f6410c;
            fArr = this.f6412e;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 >= size) {
                fArr2 = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
                break;
            }
            float f20 = fArr[i10];
            if (fB <= f20) {
                fArr2 = new float[]{nb.a.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f19, f20, fB), i10 - 1, i10};
                break;
            }
            i10++;
            f19 = f20;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        float f22 = bVar.f6385a;
        List<b.C0071b> list2 = bVar.f6387c;
        if (f22 != bVar2.f6385a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0071b> list3 = bVar2.f6387c;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list2.size(); i11++) {
            b.C0071b c0071b = list2.get(i11);
            b.C0071b c0071b2 = list3.get(i11);
            arrayList.add(new b.C0071b(nb.a.a(c0071b.f6400a, c0071b2.f6400a, f21), nb.a.a(c0071b.f6401b, c0071b2.f6401b, f21), nb.a.a(c0071b.f6402c, c0071b2.f6402c, f21), nb.a.a(c0071b.f6403d, c0071b2.f6403d, f21), false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        }
        int i12 = bVar.f6388d;
        int i13 = bVar2.f6388d;
        LinearInterpolator linearInterpolator = nb.a.f18655a;
        return new b(bVar.f6385a, arrayList, Math.round((i13 - i12) * f21) + i12, Math.round(f21 * (bVar2.f6389e - r4)) + bVar.f6389e, bVar.f6390f);
    }

    public final b c() {
        return this.f6409b.get(r0.size() - 1);
    }
}
