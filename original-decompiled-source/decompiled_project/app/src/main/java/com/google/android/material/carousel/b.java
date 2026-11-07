package com.google.android.material.carousel;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f6385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6386b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C0071b> f6387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6388d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6389e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6390f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f6391a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6392b;

        /* renamed from: d, reason: collision with root package name */
        public C0071b f6394d;

        /* renamed from: e, reason: collision with root package name */
        public C0071b f6395e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f6393c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f6396f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f6397g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f6398h = CropImageView.DEFAULT_ASPECT_RATIO;

        /* renamed from: i, reason: collision with root package name */
        public int f6399i = -1;

        public a(float f10, int i10) {
            this.f6391a = f10;
            this.f6392b = i10;
        }

        public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f6392b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = CropImageView.DEFAULT_ASPECT_RATIO;
                if (f14 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, CropImageView.DEFAULT_ASPECT_RATIO));
                }
            }
            b(f10, f11, f12, z10, z11, fAbs, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        }

        public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            ArrayList arrayList = this.f6393c;
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f6399i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f6399i = arrayList.size();
            }
            C0071b c0071b = new C0071b(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f6394d == null) {
                    this.f6394d = c0071b;
                    this.f6396f = arrayList.size();
                }
                if (this.f6397g != -1 && arrayList.size() - this.f6397g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f6394d.f6403d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f6395e = c0071b;
                this.f6397g = arrayList.size();
            } else {
                if (this.f6394d == null && f12 < this.f6398h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f6395e != null && f12 > this.f6398h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f6398h = f12;
            arrayList.add(c0071b);
        }

        public final void c(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 <= 0 || f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                a((i11 * f12) + f10, f11, f12, z10, false);
            }
        }

        public final b d() {
            if (this.f6394d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f6393c;
                if (i10 >= arrayList2.size()) {
                    return new b(this.f6391a, arrayList, this.f6396f, this.f6397g, this.f6392b);
                }
                C0071b c0071b = (C0071b) arrayList2.get(i10);
                float f10 = this.f6394d.f6401b;
                float f11 = this.f6396f;
                float f12 = this.f6391a;
                arrayList.add(new C0071b((i10 * f12) + (f10 - (f11 * f12)), c0071b.f6401b, c0071b.f6402c, c0071b.f6403d, c0071b.f6404e, c0071b.f6405f, c0071b.f6406g, c0071b.f6407h));
                i10++;
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0071b {

        /* renamed from: a, reason: collision with root package name */
        public final float f6400a;

        /* renamed from: b, reason: collision with root package name */
        public final float f6401b;

        /* renamed from: c, reason: collision with root package name */
        public final float f6402c;

        /* renamed from: d, reason: collision with root package name */
        public final float f6403d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6404e;

        /* renamed from: f, reason: collision with root package name */
        public final float f6405f;

        /* renamed from: g, reason: collision with root package name */
        public final float f6406g;

        /* renamed from: h, reason: collision with root package name */
        public final float f6407h;

        public C0071b(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f6400a = f10;
            this.f6401b = f11;
            this.f6402c = f12;
            this.f6403d = f13;
            this.f6404e = z10;
            this.f6405f = f14;
            this.f6406g = f15;
            this.f6407h = f16;
        }
    }

    public b(float f10, ArrayList arrayList, int i10, int i11, int i12) {
        this.f6385a = f10;
        this.f6387c = Collections.unmodifiableList(arrayList);
        this.f6388d = i10;
        this.f6389e = i11;
        while (i10 <= i11) {
            if (((C0071b) arrayList.get(i10)).f6405f == CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f6386b++;
            }
            i10++;
        }
        this.f6390f = i12;
    }

    public final C0071b a() {
        return this.f6387c.get(this.f6388d);
    }

    public final C0071b b() {
        return this.f6387c.get(0);
    }

    public final C0071b c() {
        return this.f6387c.get(this.f6389e);
    }

    public final C0071b d() {
        return this.f6387c.get(r0.size() - 1);
    }
}
