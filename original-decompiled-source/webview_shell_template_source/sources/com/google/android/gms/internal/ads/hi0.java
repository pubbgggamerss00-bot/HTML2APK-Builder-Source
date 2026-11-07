package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hi0 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public View f5415t;

    public hi0(Context context) {
        super(context);
        this.s = context;
    }

    public static hi0 a(Context context, View view, tb1 tb1Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        hi0 hi0Var = new hi0(context);
        List list = tb1Var.f9208u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = hi0Var.s;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f6 = ((ub1) list.get(0)).f9522a;
            float f7 = displayMetrics.density;
            hi0Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f6 * f7), (int) (r5.f9523b * f7)));
        }
        hi0Var.f5415t = view;
        hi0Var.addView(view);
        zzv.zzy();
        v70 v70Var = new v70(hi0Var, hi0Var);
        View view2 = (View) ((WeakReference) v70Var.s).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            v70Var.A(viewTreeObserver);
        }
        zzv.zzy();
        u70 u70Var = new u70(hi0Var, hi0Var);
        View view3 = (View) ((WeakReference) u70Var.s).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            u70Var.A(viewTreeObserver3);
        }
        JSONObject jSONObject = tb1Var.f9185h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            hi0Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            hi0Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        hi0Var.addView(relativeLayout);
        return hi0Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i6) {
        Context context = this.s;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        zzbc.zzb();
        int iZzx = zzf.zzx(context, (int) dOptDouble);
        textView.setPadding(0, iZzx, 0, iZzx);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        zzbc.zzb();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzf.zzx(context, (int) dOptDouble2));
        layoutParams.addRule(i6);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f5415t.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f5415t.setY(-r0[1]);
    }
}
