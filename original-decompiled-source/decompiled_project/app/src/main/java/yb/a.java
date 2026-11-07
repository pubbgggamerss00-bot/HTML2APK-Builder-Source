package yb;

import android.graphics.Paint;
import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f34359i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f34360j = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f34361k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f34362l = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f34363a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f34364b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f34365c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34366d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34367e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34368f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f34369g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f34370h;

    public a() {
        Paint paint = new Paint();
        this.f34370h = paint;
        Paint paint2 = new Paint();
        this.f34363a = paint2;
        this.f34366d = r3.a.d(-16777216, 68);
        this.f34367e = r3.a.d(-16777216, 20);
        this.f34368f = r3.a.d(-16777216, 0);
        paint2.setColor(this.f34366d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f34364b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f34365c = new Paint(paint3);
    }
}
