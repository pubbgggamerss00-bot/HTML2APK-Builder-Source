package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13634a;

    /* renamed from: b, reason: collision with root package name */
    public final View f13635b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f13636c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f13637d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f13638e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13639f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13640g;

    public g1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f13637d = layoutParams;
        this.f13638e = new Rect();
        this.f13639f = new int[2];
        this.f13640g = new int[2];
        this.f13634a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f13635b = viewInflate;
        this.f13636c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(g1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
