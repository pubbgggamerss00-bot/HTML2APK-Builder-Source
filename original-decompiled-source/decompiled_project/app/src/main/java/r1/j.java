package r1;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f23075a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f23076b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f23077c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f23078d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f23079e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f23080f;

    /* renamed from: g, reason: collision with root package name */
    public static final z f23081g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f23082h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f23083i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f23084j;

    /* renamed from: k, reason: collision with root package name */
    public static final z f23085k;

    /* renamed from: l, reason: collision with root package name */
    public static final z f23086l;

    /* renamed from: m, reason: collision with root package name */
    public static final z f23087m;

    /* renamed from: n, reason: collision with root package name */
    public static final z f23088n;

    /* renamed from: o, reason: collision with root package name */
    public static final z f23089o;

    /* renamed from: p, reason: collision with root package name */
    public static final z f23090p;

    /* renamed from: q, reason: collision with root package name */
    public static final z f23091q;

    /* renamed from: r, reason: collision with root package name */
    public static final z f23092r;

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f23093s;

    /* renamed from: t, reason: collision with root package name */
    public static final p f23094t;

    /* renamed from: u, reason: collision with root package name */
    public static final z f23095u;

    /* renamed from: v, reason: collision with root package name */
    public static final z f23096v;

    /* renamed from: w, reason: collision with root package name */
    public static final z f23097w;

    /* renamed from: x, reason: collision with root package name */
    public static final q f23098x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f23099y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f23075a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f23076b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        a0 a0Var = new a0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a0 a0Var2 = new a0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a0 a0Var3 = new a0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f23077c = a0Var3;
        a0 a0Var4 = new a0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f23078d = a0Var4;
        b0 b0Var = o.f23111d;
        z zVar = new z("sRGB IEC61966-2.1", fArr, b0Var, a0Var, 0);
        f23079e = zVar;
        z zVar2 = new z("sRGB IEC61966-2.1 (Linear)", fArr, b0Var, 1.0d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1);
        f23080f = zVar2;
        z zVar3 = new z("scRGB-nl IEC 61966-2-2:2003", fArr, b0Var, null, new e(), new f(), -0.799f, 2.399f, a0Var, 2);
        f23081g = zVar3;
        z zVar4 = new z("scRGB IEC 61966-2-2:2003", fArr, b0Var, 1.0d, -0.5f, 7.499f, 3);
        f23082h = zVar4;
        z zVar5 = new z("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, b0Var, new a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f23083i = zVar5;
        z zVar6 = new z("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, b0Var, new a0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f23084j = zVar6;
        z zVar7 = new z("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new b0(0.314f, 0.351f), 2.6d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 6);
        f23085k = zVar7;
        z zVar8 = new z("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, b0Var, a0Var, 7);
        f23086l = zVar8;
        z zVar9 = new z("NTSC (1953)", fArr2, o.f23108a, new a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f23087m = zVar9;
        z zVar10 = new z("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, b0Var, new a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f23088n = zVar10;
        z zVar11 = new z("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, b0Var, 2.2d, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 10);
        f23089o = zVar11;
        z zVar12 = new z("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, o.f23109b, new a0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f23090p = zVar12;
        float[] fArr4 = {0.7347f, 0.2653f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0E-4f, -0.077f};
        b0 b0Var2 = o.f23110c;
        z zVar13 = new z("SMPTE ST 2065-1:2012 ACES", fArr4, b0Var2, 1.0d, -65504.0f, 65504.0f, 12);
        f23091q = zVar13;
        z zVar14 = new z("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, b0Var2, 1.0d, -65504.0f, 65504.0f, 13);
        f23092r = zVar14;
        c0 c0Var = new c0("Generic XYZ", b.f23066b, 14);
        f23093s = c0Var;
        long j10 = b.f23067c;
        p pVar = new p("Generic L*a*b*", j10, 15);
        f23094t = pVar;
        z zVar15 = new z("None", fArr, b0Var, a0Var2, 16);
        f23095u = zVar15;
        z zVar16 = new z("Hybrid Log Gamma encoding", fArr3, b0Var, null, new e.e(), new g(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, a0Var3, 17);
        f23096v = zVar16;
        z zVar17 = new z("Perceptual Quantizer encoding", fArr3, b0Var, null, new h(), new i(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, a0Var4, 18);
        f23097w = zVar17;
        q qVar = new q("Oklab", j10, 19);
        f23098x = qVar;
        f23099y = new c[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, c0Var, pVar, zVar15, zVar16, zVar17, qVar};
    }

    public static double a(a0 a0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = a0Var.f23059b;
        double d14 = a0Var.f23060c;
        double d15 = a0Var.f23061d;
        double d16 = a0Var.f23062e;
        double d17 = a0Var.f23063f;
        double d18 = d13 * d12;
        return (a0Var.f23064g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(a0 a0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / a0Var.f23059b;
        double d13 = 1.0d / a0Var.f23060c;
        double d14 = 1.0d / a0Var.f23061d;
        double d15 = a0Var.f23062e;
        double d16 = a0Var.f23063f;
        double d17 = (d10 * d11) / (a0Var.f23064g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    public static double c(a0 a0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = a0Var.f23059b;
        double d14 = a0Var.f23061d;
        double dPow = (Math.pow(d12, d14) * a0Var.f23060c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * a0Var.f23063f) + a0Var.f23062e), a0Var.f23064g) * d11;
    }

    public static double d(a0 a0Var, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -a0Var.f23059b;
        double d14 = a0Var.f23062e;
        double d15 = 1.0d / a0Var.f23064g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-a0Var.f23063f)) + a0Var.f23060c), 1.0d / a0Var.f23061d) * d11;
    }
}
