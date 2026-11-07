package t4;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14433i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f14434j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f14435k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f14436l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f14437a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f14439c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14441e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14442f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f14443g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f14437a = paint2;
        this.f14440d = m0.a.e(-16777216, 68);
        this.f14441e = m0.a.e(-16777216, 20);
        this.f14442f = m0.a.e(-16777216, 0);
        paint2.setColor(this.f14440d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f14438b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f14439c = new Paint(paint3);
    }
}
