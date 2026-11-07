package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gq0 {

    /* renamed from: a, reason: collision with root package name */
    public final ct0 f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final gs0 f5121b;

    /* renamed from: c, reason: collision with root package name */
    public fq0 f5122c = null;

    public gq0(ct0 ct0Var, gs0 gs0Var) {
        this.f5120a = ct0Var;
        this.f5121b = gs0Var;
    }

    public final View a(final FrameLayout frameLayout, final WindowManager windowManager) {
        xa0 xa0VarA = this.f5120a.a(zzs.zzc(), null, null);
        xa0VarA.zzF().setVisibility(4);
        xa0VarA.zzF().setContentDescription("policy_validator");
        xa0VarA.Z("/sendMessageToSdk", new au(2, this));
        xa0VarA.Z("/hideValidatorOverlay", new yt() { // from class: com.google.android.gms.internal.ads.cq0
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                xa0 xa0Var = (xa0) obj;
                zzo.zze("Hide native ad policy validator overlay.");
                xa0Var.zzF().setVisibility(8);
                if (xa0Var.zzF().getWindowToken() != null) {
                    windowManager.removeView(xa0Var.zzF());
                }
                xa0Var.destroy();
                ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                gq0 gq0Var = this;
                if (gq0Var.f5122c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(gq0Var.f5122c);
            }
        });
        xa0VarA.Z("/open", new iu(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(xa0VarA);
        yt ytVar = new yt() { // from class: com.google.android.gms.internal.ads.dq0
            /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.internal.ads.fq0] */
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) throws NumberFormatException {
                int i6;
                final xa0 xa0Var = (xa0) obj;
                eb0 eb0VarZzN = xa0Var.zzN();
                gq0 gq0Var = this;
                eb0VarZzN.f4196y = new r0(gq0Var, map);
                if (map == null) {
                    return;
                }
                final View view = frameLayout;
                Context context = view.getContext();
                String str = (String) map.get("validator_width");
                int iIntValue = ((Integer) zzbe.zzc().a(zn.V7)).intValue();
                try {
                    iIntValue = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
                zzbc.zzb();
                int iZzx = zzf.zzx(context, iIntValue);
                String str2 = (String) map.get("validator_height");
                int iIntValue2 = ((Integer) zzbe.zzc().a(zn.W7)).intValue();
                try {
                    iIntValue2 = Integer.parseInt(str2);
                } catch (NumberFormatException unused2) {
                }
                zzbc.zzb();
                int iZzx2 = zzf.zzx(context, iIntValue2);
                int i7 = 0;
                try {
                    i6 = Integer.parseInt((String) map.get("validator_x"));
                } catch (NumberFormatException unused3) {
                    i6 = 0;
                }
                zzbc.zzb();
                int iZzx3 = zzf.zzx(context, i6);
                try {
                    i7 = Integer.parseInt((String) map.get("validator_y"));
                } catch (NumberFormatException unused4) {
                }
                zzbc.zzb();
                int iZzx4 = zzf.zzx(context, i7);
                xa0Var.h0(new cc0(1, iZzx, iZzx2));
                try {
                    xa0Var.u().getSettings().setUseWideViewPort(((Boolean) zzbe.zzc().a(zn.X7)).booleanValue());
                    xa0Var.u().getSettings().setLoadWithOverviewMode(((Boolean) zzbe.zzc().a(zn.Y7)).booleanValue());
                } catch (NullPointerException unused5) {
                }
                final WindowManager.LayoutParams layoutParamsZzb = zzbv.zzb();
                layoutParamsZzb.x = iZzx3;
                layoutParamsZzb.y = iZzx4;
                View viewZzF = xa0Var.zzF();
                final WindowManager windowManager2 = windowManager;
                windowManager2.updateViewLayout(viewZzF, layoutParamsZzb);
                final String str3 = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    final int i8 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - iZzx4;
                    gq0Var.f5122c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.fq0
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            Rect rect2 = new Rect();
                            if (view.getGlobalVisibleRect(rect2)) {
                                xa0 xa0Var2 = xa0Var;
                                if (xa0Var2.zzF().getWindowToken() == null) {
                                    return;
                                }
                                String str4 = str3;
                                boolean zEquals = "1".equals(str4);
                                int i9 = i8;
                                WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                                if (zEquals || "2".equals(str4)) {
                                    layoutParams.y = rect2.bottom - i9;
                                } else {
                                    layoutParams.y = rect2.top - i9;
                                }
                                windowManager2.updateViewLayout(xa0Var2.zzF(), layoutParams);
                            }
                        }
                    };
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(gq0Var.f5122c);
                    }
                }
                String str4 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                xa0Var.loadUrl(str4);
            }
        };
        gs0 gs0Var = this.f5121b;
        gs0Var.c("/loadNativeAdPolicyViolations", new fs0(gs0Var, weakReference, "/loadNativeAdPolicyViolations", ytVar));
        gs0Var.c("/showValidatorOverlay", new fs0(gs0Var, new WeakReference(xa0VarA), "/showValidatorOverlay", new st(3)));
        return xa0VarA.zzF();
    }
}
