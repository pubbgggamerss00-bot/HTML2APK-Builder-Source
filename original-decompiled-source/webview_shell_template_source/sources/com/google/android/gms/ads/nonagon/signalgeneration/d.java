package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.j00;
import com.google.android.gms.internal.ads.lu1;
import com.google.android.gms.internal.ads.un0;
import com.google.android.gms.internal.ads.xj0;
import com.google.android.gms.internal.ads.zr1;
import com.google.android.gms.internal.consent_sdk.a9;
import com.htmltoapk.template.R;
import e3.h;
import g.g;
import i2.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.i1;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import u0.f0;
import u0.n0;
import u0.r;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements zr1, a9, r, h, l {
    public final Object s;

    public /* synthetic */ d(Object obj) {
        this.s = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        un0 un0Var = (un0) this.s;
        zzbk zzbkVar = (zzbk) obj;
        synchronized (un0Var) {
            un0Var.o0(new xj0(9, zzbkVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.h
    public void accept(Object obj, Object obj2) {
        o oVar = (o) this.s;
        v3.f fVar = (v3.f) obj2;
        d3.a<p> aVar = g3.c.f13264i;
        g3.a aVar2 = (g3.a) ((g3.d) obj).getService();
        aVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar2.f14012t);
        int i6 = o3.c.f14013a;
        if (oVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            oVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar2.s.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            fVar.f14800a.j(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // i2.l
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.s).getSupportedFeatures();
    }

    @Override // i2.l
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) d6.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.s).createWebView(webView));
    }

    @Override // u0.r
    public s0 d(View view, s0 s0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i6;
        boolean z6;
        s0 s0VarB;
        boolean z7;
        int iD = s0Var.d();
        g gVar = (g) this.s;
        Context context = gVar.C;
        int iD2 = s0Var.d();
        ActionBarContextView actionBarContextView = gVar.N;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i6 = 0;
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.N.getLayoutParams();
            if (gVar.N.isShown()) {
                if (gVar.f13108v0 == null) {
                    gVar.f13108v0 = new Rect();
                    gVar.f13109w0 = new Rect();
                }
                Rect rect = gVar.f13108v0;
                Rect rect2 = gVar.f13109w0;
                rect.set(s0Var.b(), s0Var.d(), s0Var.c(), s0Var.a());
                ViewGroup viewGroup = gVar.T;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z8 = i1.f13669a;
                    i1.a.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f13669a) {
                        i1.f13669a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f13670b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f13670b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f13670b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e6) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                        }
                    }
                }
                int i7 = rect.top;
                int i8 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = gVar.T;
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                s0 s0VarA = f0.e.a(viewGroup2);
                int iB = s0VarA == null ? 0 : s0VarA.b();
                int iC = s0VarA == null ? 0 : s0VarA.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z7 = true;
                }
                if (i7 <= 0 || gVar.V != null) {
                    View view2 = gVar.V;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            gVar.V.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    gVar.V = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    gVar.T.addView(gVar.V, -1, layoutParams);
                }
                View view4 = gVar.V;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = gVar.V;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!gVar.f13088a0 && z) {
                    iD2 = 0;
                }
                z6 = z;
                i6 = 0;
                z = z7;
            } else {
                i6 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z6 = false;
                } else {
                    z6 = false;
                    z = false;
                }
            }
            if (z) {
                gVar.N.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = gVar.V;
        if (view6 != null) {
            view6.setVisibility(z6 ? i6 : 8);
        }
        if (iD != iD2) {
            int iB2 = s0Var.b();
            int iC2 = s0Var.c();
            int iA = s0Var.a();
            int i12 = Build.VERSION.SDK_INT;
            s0.e dVar = i12 >= 34 ? new s0.d(s0Var) : i12 >= 30 ? new s0.c(s0Var) : i12 >= 29 ? new s0.b(s0Var) : new s0.a(s0Var);
            dVar.g(m0.b.c(iB2, iD2, iC2, iA));
            s0VarB = dVar.b();
        } else {
            s0VarB = s0Var;
        }
        WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
        WindowInsets windowInsetsF = s0VarB.f();
        if (windowInsetsF == null) {
            return s0VarB;
        }
        WindowInsets windowInsetsB = f0.c.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? s0.g(view, windowInsetsB) : s0VarB;
    }

    @Override // i2.l
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) d6.a.a(DropDataContentProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.s).getDropDataProvider());
    }

    @Override // i2.l
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) d6.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.s).getStatics());
    }

    @Override // i2.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) d6.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.s).getWebkitToCompatConverter());
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        un0 un0Var = (un0) this.s;
        String message = th.getMessage();
        synchronized (un0Var) {
            un0Var.o0(new lu1(message, 1));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public /* bridge */ /* synthetic */ Object zzb() {
        return new j00(((com.google.android.gms.internal.consent_sdk.e) this.s).f11694b);
    }
}
