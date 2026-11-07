package ub;

import android.content.Context;
import android.util.TypedValue;
import com.basitce.htmltoapk.R;
import ga.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f29690f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29692b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29694d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29695e;

    public a(Context context) {
        TypedValue typedValueA = xb.a.a(context.getTheme(), R.attr.elevationOverlayEnabled);
        boolean z10 = (typedValueA == null || typedValueA.type != 18 || typedValueA.data == 0) ? false : true;
        Integer numA = g.a(context, R.attr.elevationOverlayColor);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g.a(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numA2 != null ? numA2.intValue() : 0;
        Integer numA3 = g.a(context, R.attr.colorSurface);
        int iIntValue3 = numA3 != null ? numA3.intValue() : 0;
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f29691a = z10;
        this.f29692b = iIntValue;
        this.f29693c = iIntValue2;
        this.f29694d = iIntValue3;
        this.f29695e = f10;
    }
}
