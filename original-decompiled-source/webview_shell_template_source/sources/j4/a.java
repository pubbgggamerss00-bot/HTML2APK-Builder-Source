package j4;

import android.content.Context;
import androidx.work.j;
import com.htmltoapk.template.R;
import q4.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f13497f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13501d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13502e;

    public a(Context context) {
        boolean zB = b.b(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer numG = j.g(context, R.attr.elevationOverlayColor);
        int iIntValue = numG != null ? numG.intValue() : 0;
        Integer numG2 = j.g(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numG2 != null ? numG2.intValue() : 0;
        Integer numG3 = j.g(context, R.attr.colorSurface);
        int iIntValue3 = numG3 != null ? numG3.intValue() : 0;
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f13498a = zB;
        this.f13499b = iIntValue;
        this.f13500c = iIntValue2;
        this.f13501d = iIntValue3;
        this.f13502e = f6;
    }
}
