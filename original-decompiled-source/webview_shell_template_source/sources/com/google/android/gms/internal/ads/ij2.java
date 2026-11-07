package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ij2 extends h30 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5783l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5784m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5785n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5786o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5787p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5788q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5789r;
    public final SparseArray s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f5790t;

    @Deprecated
    public ij2() {
        this.s = new SparseArray();
        this.f5790t = new SparseBooleanArray();
        this.f5783l = true;
        this.f5784m = true;
        this.f5785n = true;
        this.f5786o = true;
        this.f5787p = true;
        this.f5788q = true;
        this.f5789r = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ij2(Context context) throws ClassNotFoundException, NumberFormatException {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        String strH;
        int i6 = j31.f5914a;
        if ((i6 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f5235i = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.h = bo1.n(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && j31.e(context)) {
            if (i6 < 28) {
                strH = j31.h("sys.display-size");
            } else {
                strH = j31.h("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strH)) {
                try {
                    String[] strArrSplit = strH.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i7 = Integer.parseInt(strArrSplit[0]);
                        int i8 = Integer.parseInt(strArrSplit[1]);
                        point2 = (i7 > 0 && i8 > 0) ? new Point(i7, i8) : point2;
                    }
                } catch (NumberFormatException unused) {
                }
                qs0.c("Util", "Invalid display size: ".concat(String.valueOf(strH)));
            }
            if ("Sony".equals(j31.f5916c) && j31.f5917d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            }
            point2 = point;
        } else {
            point = new Point();
            if (i6 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
            point2 = point;
        }
        int i9 = point2.x;
        int i10 = point2.y;
        this.f5228a = i9;
        this.f5229b = i10;
        this.s = new SparseArray();
        this.f5790t = new SparseBooleanArray();
        this.f5783l = true;
        this.f5784m = true;
        this.f5785n = true;
        this.f5786o = true;
        this.f5787p = true;
        this.f5788q = true;
        this.f5789r = true;
    }

    public /* synthetic */ ij2(jj2 jj2Var) {
        super(jj2Var);
        this.f5783l = jj2Var.f6087l;
        this.f5784m = jj2Var.f6088m;
        this.f5785n = jj2Var.f6089n;
        this.f5786o = jj2Var.f6090o;
        this.f5787p = jj2Var.f6091p;
        this.f5788q = jj2Var.f6092q;
        this.f5789r = jj2Var.f6093r;
        SparseArray sparseArray = jj2Var.s;
        SparseArray sparseArray2 = new SparseArray();
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            sparseArray2.put(sparseArray.keyAt(i6), new HashMap((Map) sparseArray.valueAt(i6)));
        }
        this.s = sparseArray2;
        this.f5790t = jj2Var.f6094t.clone();
    }
}
