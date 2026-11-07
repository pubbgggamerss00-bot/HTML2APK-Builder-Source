package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lf {

    /* renamed from: z, reason: collision with root package name */
    public static final lf f6679z = new lf(new ae());

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f6681b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f6682c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f6683d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f6684e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f6685f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f6686g;
    public final Integer h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f6687i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public final Integer f6688j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f6689k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public final Integer f6690l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f6691m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f6692n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f6693o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f6694p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f6695q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f6696r;
    public final CharSequence s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f6697t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f6698u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f6699v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f6700w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f6701x;

    /* renamed from: y, reason: collision with root package name */
    public final bo1 f6702y;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lf(ae aeVar) {
        Boolean boolValueOf = aeVar.f2680k;
        Integer numValueOf = aeVar.f2679j;
        Integer numValueOf2 = aeVar.f2691w;
        int i6 = 1;
        int i7 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i6 = 0;
                            break;
                        case dn.zzm /* 21 */:
                            i6 = 2;
                            break;
                        case 22:
                            i6 = 3;
                            break;
                        case 23:
                            i6 = 4;
                            break;
                        case 24:
                            i6 = 5;
                            break;
                        case 25:
                            i6 = 6;
                            break;
                    }
                    numValueOf = Integer.valueOf(i6);
                }
            }
        } else if (numValueOf != null) {
            boolean z6 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z6);
            if (z6 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i7 = 21;
                        break;
                    case 3:
                        i7 = 22;
                        break;
                    case 4:
                        i7 = 23;
                        break;
                    case 5:
                        i7 = 24;
                        break;
                    case 6:
                        i7 = 25;
                        break;
                    default:
                        i7 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i7);
            }
        } else {
            numValueOf = null;
        }
        this.f6680a = aeVar.f2671a;
        this.f6681b = aeVar.f2672b;
        this.f6682c = aeVar.f2673c;
        this.f6683d = aeVar.f2674d;
        this.f6684e = aeVar.f2675e;
        this.f6685f = aeVar.f2676f;
        this.f6686g = aeVar.f2677g;
        this.h = aeVar.h;
        this.f6687i = aeVar.f2678i;
        this.f6688j = numValueOf;
        this.f6689k = boolValueOf;
        Integer num = aeVar.f2681l;
        this.f6690l = num;
        this.f6691m = num;
        this.f6692n = aeVar.f2682m;
        this.f6693o = aeVar.f2683n;
        this.f6694p = aeVar.f2684o;
        this.f6695q = aeVar.f2685p;
        this.f6696r = aeVar.f2686q;
        this.s = aeVar.f2687r;
        this.f6697t = aeVar.s;
        this.f6698u = aeVar.f2688t;
        this.f6699v = aeVar.f2689u;
        this.f6700w = aeVar.f2690v;
        this.f6701x = numValueOf2;
        this.f6702y = aeVar.f2692x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf.class == obj.getClass()) {
            lf lfVar = (lf) obj;
            if (Objects.equals(this.f6680a, lfVar.f6680a) && Objects.equals(this.f6681b, lfVar.f6681b) && Objects.equals(this.f6682c, lfVar.f6682c) && Objects.equals(this.f6683d, lfVar.f6683d) && Objects.equals(this.f6684e, lfVar.f6684e) && Arrays.equals(this.f6685f, lfVar.f6685f) && Objects.equals(this.f6686g, lfVar.f6686g) && Objects.equals(this.h, lfVar.h) && Objects.equals(this.f6687i, lfVar.f6687i) && Objects.equals(this.f6688j, lfVar.f6688j) && Objects.equals(this.f6689k, lfVar.f6689k) && Objects.equals(this.f6691m, lfVar.f6691m) && Objects.equals(this.f6692n, lfVar.f6692n) && Objects.equals(this.f6693o, lfVar.f6693o) && Objects.equals(this.f6694p, lfVar.f6694p) && Objects.equals(this.f6695q, lfVar.f6695q) && Objects.equals(this.f6696r, lfVar.f6696r) && Objects.equals(this.s, lfVar.s) && Objects.equals(this.f6697t, lfVar.f6697t) && Objects.equals(this.f6698u, lfVar.f6698u) && Objects.equals(this.f6699v, lfVar.f6699v) && Objects.equals(this.f6700w, lfVar.f6700w) && Objects.equals(this.f6701x, lfVar.f6701x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6680a, this.f6681b, this.f6682c, this.f6683d, null, null, this.f6684e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f6685f)), this.f6686g, null, this.h, this.f6687i, this.f6688j, this.f6689k, null, this.f6691m, this.f6692n, this.f6693o, this.f6694p, this.f6695q, this.f6696r, this.s, this.f6697t, this.f6698u, null, null, this.f6699v, null, this.f6700w, this.f6701x, Boolean.TRUE});
    }
}
