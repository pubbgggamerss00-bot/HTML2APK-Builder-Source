package d2;

import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import i0.u2;
import pg.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7323a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7325c;

    /* renamed from: d, reason: collision with root package name */
    public final d2.a[] f7326d;

    /* renamed from: e, reason: collision with root package name */
    public int f7327e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f7328f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7329g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f7330h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7331a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f7332b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f7333c;

        static {
            a aVar = new a("Lsq2", 0);
            f7331a = aVar;
            a aVar2 = new a("Impulse", 1);
            f7332b = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f7333c = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7333c.clone();
        }
    }

    public c(boolean z10, a aVar) {
        int i10;
        this.f7323a = z10;
        this.f7324b = aVar;
        if (z10 && aVar.equals(a.f7331a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new l();
            }
            i10 = 2;
        }
        this.f7325c = i10;
        this.f7326d = new d2.a[20];
        this.f7328f = new float[20];
        this.f7329g = new float[20];
        this.f7330h = new float[3];
    }

    public final void a(float f10, long j10) {
        int i10 = (this.f7327e + 1) % 20;
        this.f7327e = i10;
        d2.a[] aVarArr = this.f7326d;
        d2.a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f7319a = j10;
            aVar.f7320b = f10;
        } else {
            d2.a aVar2 = new d2.a();
            aVar2.f7319a = j10;
            aVar2.f7320b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    public final float b(float f10) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float f11;
        boolean z10;
        int i10;
        float fSignum;
        float f12 = f10;
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            f2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i11 = this.f7327e;
        d2.a[] aVarArr = this.f7326d;
        d2.a aVar2 = aVarArr[i11];
        if (aVar2 == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            d2.a aVar3 = aVar2;
            while (true) {
                d2.a aVar4 = aVarArr[i11];
                boolean z11 = this.f7323a;
                aVar = this.f7324b;
                fArr = this.f7328f;
                fArr2 = this.f7329g;
                if (aVar4 == null) {
                    f11 = f13;
                    z10 = z11;
                    i10 = 1;
                    break;
                }
                long j10 = aVar2.f7319a;
                f11 = f13;
                int i13 = i11;
                long j11 = aVar4.f7319a;
                float f14 = j10 - j11;
                z10 = z11;
                i10 = 1;
                float fAbs = Math.abs(j11 - aVar3.f7319a);
                aVar3 = (aVar == a.f7331a || z10) ? aVar4 : aVar2;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar4.f7320b;
                fArr2[i12] = -f14;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f13 = f11;
            }
            if (i12 >= this.f7325c) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f7330h;
                        e.c(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f11;
                    }
                } else {
                    if (iOrdinal != i10) {
                        throw new l();
                    }
                    int i14 = i12 - i10;
                    float f15 = fArr2[i14];
                    int i15 = i14;
                    float fAbs2 = f11;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f16 = fArr2[i16];
                        if (f15 != f16) {
                            float f17 = (z10 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i15--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f13 = fSignum * DescriptorProtos.Edition.EDITION_2023_VALUE;
            } else {
                f13 = f11;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return f11;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public /* synthetic */ c() {
        this(false, a.f7331a);
    }

    public c(int i10) {
        this(true, a.f7332b);
    }
}
