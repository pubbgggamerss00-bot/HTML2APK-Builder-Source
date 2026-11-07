package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f12151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12152b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C0034b> f12153c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12154d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12156f;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f12157a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12158b;

        /* renamed from: d, reason: collision with root package name */
        public C0034b f12160d;

        /* renamed from: e, reason: collision with root package name */
        public C0034b f12161e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f12159c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f12162f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f12163g = -1;
        public float h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f12164i = -1;

        public a(float f6, int i6) {
            this.f12157a = f6;
            this.f12158b = i6;
        }

        public final void a(float f6, float f7, float f8, boolean z6, boolean z7) {
            float fAbs;
            float f9 = f8 / 2.0f;
            float f10 = f6 - f9;
            float f11 = f9 + f6;
            float f12 = this.f12158b;
            if (f11 > f12) {
                fAbs = Math.abs(f11 - Math.max(f11 - f8, f12));
            } else {
                fAbs = 0.0f;
                if (f10 < 0.0f) {
                    fAbs = Math.abs(f10 - Math.min(f10 + f8, 0.0f));
                }
            }
            b(f6, f7, f8, z6, z7, fAbs, 0.0f, 0.0f);
        }

        public final void b(float f6, float f7, float f8, boolean z6, boolean z7, float f9, float f10, float f11) {
            if (f8 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f12159c;
            if (z7) {
                if (z6) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i6 = this.f12164i;
                if (i6 != -1 && i6 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f12164i = arrayList.size();
            }
            C0034b c0034b = new C0034b(Float.MIN_VALUE, f6, f7, f8, z7, f9, f10, f11);
            if (z6) {
                if (this.f12160d == null) {
                    this.f12160d = c0034b;
                    this.f12162f = arrayList.size();
                }
                if (this.f12163g != -1 && arrayList.size() - this.f12163g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f8 != this.f12160d.f12168d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f12161e = c0034b;
                this.f12163g = arrayList.size();
            } else {
                if (this.f12160d == null && f8 < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f12161e != null && f8 > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = f8;
            arrayList.add(c0034b);
        }

        public final void c(float f6, float f7, float f8, int i6, boolean z6) {
            if (i6 <= 0 || f8 <= 0.0f) {
                return;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                a((i7 * f8) + f6, f7, f8, z6, false);
            }
        }

        public final b d() {
            if (this.f12160d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (true) {
                ArrayList arrayList2 = this.f12159c;
                if (i6 >= arrayList2.size()) {
                    return new b(this.f12157a, arrayList, this.f12162f, this.f12163g, this.f12158b);
                }
                C0034b c0034b = (C0034b) arrayList2.get(i6);
                float f6 = this.f12160d.f12166b;
                float f7 = this.f12162f;
                float f8 = this.f12157a;
                arrayList.add(new C0034b((i6 * f8) + (f6 - (f7 * f8)), c0034b.f12166b, c0034b.f12167c, c0034b.f12168d, c0034b.f12169e, c0034b.f12170f, c0034b.f12171g, c0034b.h));
                i6++;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0034b {

        /* renamed from: a, reason: collision with root package name */
        public final float f12165a;

        /* renamed from: b, reason: collision with root package name */
        public final float f12166b;

        /* renamed from: c, reason: collision with root package name */
        public final float f12167c;

        /* renamed from: d, reason: collision with root package name */
        public final float f12168d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f12169e;

        /* renamed from: f, reason: collision with root package name */
        public final float f12170f;

        /* renamed from: g, reason: collision with root package name */
        public final float f12171g;
        public final float h;

        public C0034b(float f6, float f7, float f8, float f9, boolean z6, float f10, float f11, float f12) {
            this.f12165a = f6;
            this.f12166b = f7;
            this.f12167c = f8;
            this.f12168d = f9;
            this.f12169e = z6;
            this.f12170f = f10;
            this.f12171g = f11;
            this.h = f12;
        }
    }

    public b(float f6, ArrayList arrayList, int i6, int i7, int i8) {
        this.f12151a = f6;
        this.f12153c = Collections.unmodifiableList(arrayList);
        this.f12154d = i6;
        this.f12155e = i7;
        while (i6 <= i7) {
            if (((C0034b) arrayList.get(i6)).f12170f == 0.0f) {
                this.f12152b++;
            }
            i6++;
        }
        this.f12156f = i8;
    }

    public final C0034b a() {
        return this.f12153c.get(this.f12154d);
    }

    public final C0034b b() {
        return this.f12153c.get(0);
    }

    public final C0034b c() {
        return this.f12153c.get(this.f12155e);
    }

    public final C0034b d() {
        return this.f12153c.get(r0.size() - 1);
    }
}
