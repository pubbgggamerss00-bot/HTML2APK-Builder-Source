package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class du implements yt {

    /* renamed from: v, reason: collision with root package name */
    public static final Map f4026v;
    public final zzb s;

    /* renamed from: t, reason: collision with root package name */
    public final w00 f4027t;

    /* renamed from: u, reason: collision with root package name */
    public final xj1 f4028u;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        w.a aVar = new w.a(7);
        for (int i6 = 0; i6 < 7; i6++) {
            aVar.put(strArr[i6], numArr[i6]);
        }
        f4026v = Collections.unmodifiableMap(aVar);
    }

    public du(zzb zzbVar, w00 w00Var, xj1 xj1Var) {
        this.s = zzbVar;
        this.f4027t = w00Var;
        this.f4028u = xj1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0388 A[Catch: all -> 0x01cd, TryCatch #1 {all -> 0x01cd, blocks: (B:91:0x01c2, B:93:0x01c6, B:94:0x01cb, B:98:0x01d0, B:100:0x01d8, B:101:0x01dd, B:103:0x01df, B:105:0x01eb, B:106:0x01f0, B:108:0x01f2, B:110:0x01fa, B:111:0x01ff, B:113:0x0201, B:115:0x020f, B:116:0x0220, B:118:0x022e, B:119:0x023f, B:121:0x024d, B:122:0x025e, B:124:0x026c, B:125:0x027d, B:127:0x028b, B:128:0x0299, B:130:0x02a7, B:131:0x02a9, B:133:0x02ad, B:135:0x02b1, B:137:0x02b9, B:140:0x02c1, B:144:0x02e1, B:150:0x02ed, B:210:0x0403, B:211:0x0408, B:213:0x040a, B:215:0x042a, B:217:0x042e, B:219:0x043b, B:221:0x0477, B:227:0x04f0, B:250:0x0547, B:251:0x055f, B:252:0x0580, B:254:0x0588, B:255:0x0598, B:256:0x05c2, B:259:0x05c5, B:261:0x05e5, B:262:0x05fa, B:231:0x04ff, B:235:0x050e, B:239:0x051d, B:243:0x052c, B:248:0x053d, B:249:0x0541, B:220:0x0474, B:264:0x05fc, B:265:0x0601, B:152:0x02f5, B:154:0x02f9, B:159:0x030c, B:186:0x0397, B:188:0x039a, B:190:0x039e, B:193:0x03a5, B:163:0x0324, B:169:0x0347, B:168:0x033d, B:173:0x0352, B:177:0x0362, B:184:0x0392, B:182:0x0374, B:183:0x0388, B:194:0x03b4, B:200:0x03de, B:206:0x03ee, B:203:0x03e4, B:205:0x03ec, B:197:0x03d6, B:199:0x03dc, B:207:0x03f3, B:208:0x03fa, B:267:0x0603, B:268:0x0608, B:270:0x060a, B:271:0x060f), top: B:298:0x01c2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0403 A[Catch: all -> 0x01cd, TryCatch #1 {all -> 0x01cd, blocks: (B:91:0x01c2, B:93:0x01c6, B:94:0x01cb, B:98:0x01d0, B:100:0x01d8, B:101:0x01dd, B:103:0x01df, B:105:0x01eb, B:106:0x01f0, B:108:0x01f2, B:110:0x01fa, B:111:0x01ff, B:113:0x0201, B:115:0x020f, B:116:0x0220, B:118:0x022e, B:119:0x023f, B:121:0x024d, B:122:0x025e, B:124:0x026c, B:125:0x027d, B:127:0x028b, B:128:0x0299, B:130:0x02a7, B:131:0x02a9, B:133:0x02ad, B:135:0x02b1, B:137:0x02b9, B:140:0x02c1, B:144:0x02e1, B:150:0x02ed, B:210:0x0403, B:211:0x0408, B:213:0x040a, B:215:0x042a, B:217:0x042e, B:219:0x043b, B:221:0x0477, B:227:0x04f0, B:250:0x0547, B:251:0x055f, B:252:0x0580, B:254:0x0588, B:255:0x0598, B:256:0x05c2, B:259:0x05c5, B:261:0x05e5, B:262:0x05fa, B:231:0x04ff, B:235:0x050e, B:239:0x051d, B:243:0x052c, B:248:0x053d, B:249:0x0541, B:220:0x0474, B:264:0x05fc, B:265:0x0601, B:152:0x02f5, B:154:0x02f9, B:159:0x030c, B:186:0x0397, B:188:0x039a, B:190:0x039e, B:193:0x03a5, B:163:0x0324, B:169:0x0347, B:168:0x033d, B:173:0x0352, B:177:0x0362, B:184:0x0392, B:182:0x0374, B:183:0x0388, B:194:0x03b4, B:200:0x03de, B:206:0x03ee, B:203:0x03e4, B:205:0x03ec, B:197:0x03d6, B:199:0x03dc, B:207:0x03f3, B:208:0x03fa, B:267:0x0603, B:268:0x0608, B:270:0x060a, B:271:0x060f), top: B:298:0x01c2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x040a A[Catch: all -> 0x01cd, TryCatch #1 {all -> 0x01cd, blocks: (B:91:0x01c2, B:93:0x01c6, B:94:0x01cb, B:98:0x01d0, B:100:0x01d8, B:101:0x01dd, B:103:0x01df, B:105:0x01eb, B:106:0x01f0, B:108:0x01f2, B:110:0x01fa, B:111:0x01ff, B:113:0x0201, B:115:0x020f, B:116:0x0220, B:118:0x022e, B:119:0x023f, B:121:0x024d, B:122:0x025e, B:124:0x026c, B:125:0x027d, B:127:0x028b, B:128:0x0299, B:130:0x02a7, B:131:0x02a9, B:133:0x02ad, B:135:0x02b1, B:137:0x02b9, B:140:0x02c1, B:144:0x02e1, B:150:0x02ed, B:210:0x0403, B:211:0x0408, B:213:0x040a, B:215:0x042a, B:217:0x042e, B:219:0x043b, B:221:0x0477, B:227:0x04f0, B:250:0x0547, B:251:0x055f, B:252:0x0580, B:254:0x0588, B:255:0x0598, B:256:0x05c2, B:259:0x05c5, B:261:0x05e5, B:262:0x05fa, B:231:0x04ff, B:235:0x050e, B:239:0x051d, B:243:0x052c, B:248:0x053d, B:249:0x0541, B:220:0x0474, B:264:0x05fc, B:265:0x0601, B:152:0x02f5, B:154:0x02f9, B:159:0x030c, B:186:0x0397, B:188:0x039a, B:190:0x039e, B:193:0x03a5, B:163:0x0324, B:169:0x0347, B:168:0x033d, B:173:0x0352, B:177:0x0362, B:184:0x0392, B:182:0x0374, B:183:0x0388, B:194:0x03b4, B:200:0x03de, B:206:0x03ee, B:203:0x03e4, B:205:0x03ec, B:197:0x03d6, B:199:0x03dc, B:207:0x03f3, B:208:0x03fa, B:267:0x0603, B:268:0x0608, B:270:0x060a, B:271:0x060f), top: B:298:0x01c2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0541 A[Catch: all -> 0x01cd, TryCatch #1 {all -> 0x01cd, blocks: (B:91:0x01c2, B:93:0x01c6, B:94:0x01cb, B:98:0x01d0, B:100:0x01d8, B:101:0x01dd, B:103:0x01df, B:105:0x01eb, B:106:0x01f0, B:108:0x01f2, B:110:0x01fa, B:111:0x01ff, B:113:0x0201, B:115:0x020f, B:116:0x0220, B:118:0x022e, B:119:0x023f, B:121:0x024d, B:122:0x025e, B:124:0x026c, B:125:0x027d, B:127:0x028b, B:128:0x0299, B:130:0x02a7, B:131:0x02a9, B:133:0x02ad, B:135:0x02b1, B:137:0x02b9, B:140:0x02c1, B:144:0x02e1, B:150:0x02ed, B:210:0x0403, B:211:0x0408, B:213:0x040a, B:215:0x042a, B:217:0x042e, B:219:0x043b, B:221:0x0477, B:227:0x04f0, B:250:0x0547, B:251:0x055f, B:252:0x0580, B:254:0x0588, B:255:0x0598, B:256:0x05c2, B:259:0x05c5, B:261:0x05e5, B:262:0x05fa, B:231:0x04ff, B:235:0x050e, B:239:0x051d, B:243:0x052c, B:248:0x053d, B:249:0x0541, B:220:0x0474, B:264:0x05fc, B:265:0x0601, B:152:0x02f5, B:154:0x02f9, B:159:0x030c, B:186:0x0397, B:188:0x039a, B:190:0x039e, B:193:0x03a5, B:163:0x0324, B:169:0x0347, B:168:0x033d, B:173:0x0352, B:177:0x0362, B:184:0x0392, B:182:0x0374, B:183:0x0388, B:194:0x03b4, B:200:0x03de, B:206:0x03ee, B:203:0x03e4, B:205:0x03ec, B:197:0x03d6, B:199:0x03dc, B:207:0x03f3, B:208:0x03fa, B:267:0x0603, B:268:0x0608, B:270:0x060a, B:271:0x060f), top: B:298:0x01c2, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Map map) throws JSONException {
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        xa0 xa0Var = (xa0) obj;
        int iIntValue = ((Integer) f4026v.get((String) map.get("a"))).intValue();
        int i10 = -1;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                zzb zzbVar = this.s;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    w00 w00Var = this.f4027t;
                    synchronized (w00Var.D) {
                        try {
                            if (w00Var.F == null) {
                                w00Var.m("Not an activity context. Cannot resize.");
                                return;
                            }
                            if (w00Var.E.zzO() == null) {
                                w00Var.m("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (w00Var.E.zzO().b()) {
                                w00Var.m("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (w00Var.E.x()) {
                                w00Var.m("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                zzv.zzq();
                                w00Var.C = zzs.zzO((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                zzv.zzq();
                                w00Var.f10003z = zzs.zzO((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                zzv.zzq();
                                w00Var.A = zzs.zzO((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                zzv.zzq();
                                w00Var.B = zzs.zzO((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                w00Var.f10000w = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                w00Var.f9999v = str;
                            }
                            if (w00Var.C < 0 || w00Var.f10003z < 0) {
                                w00Var.m("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = w00Var.F.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                zzv.zzq();
                                int[] iArrZzV = zzs.zzV(w00Var.F);
                                zzv.zzq();
                                int[] iArrZzR = zzs.zzR(w00Var.F);
                                int i11 = iArrZzV[0];
                                int i12 = iArrZzV[1];
                                int i13 = w00Var.C;
                                if (i13 < 50 || i13 > i11) {
                                    zzo.zzj("Width is too small or too large.");
                                } else {
                                    int i14 = w00Var.f10003z;
                                    if (i14 < 50 || i14 > i12) {
                                        zzo.zzj("Height is too small or too large.");
                                    } else {
                                        if (i14 != i12 || i13 != i11) {
                                            if (w00Var.f10000w) {
                                                String str2 = w00Var.f9999v;
                                                switch (str2.hashCode()) {
                                                    case -1364013995:
                                                        if (str2.equals("center")) {
                                                            i6 = ((w00Var.f10001x + w00Var.A) + (i13 >> 1)) - 25;
                                                            i8 = ((w00Var.f10002y + w00Var.B) + (i14 >> 1)) - 25;
                                                            break;
                                                        }
                                                        i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                        i7 = w00Var.f10002y;
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                    case -1012429441:
                                                        if (str2.equals("top-left")) {
                                                            i6 = w00Var.f10001x + w00Var.A;
                                                            i7 = w00Var.f10002y;
                                                        } else {
                                                            i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                            i7 = w00Var.f10002y;
                                                        }
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                    case -655373719:
                                                        if (str2.equals("bottom-left")) {
                                                            i6 = w00Var.f10001x + w00Var.A;
                                                            i9 = w00Var.f10002y;
                                                            i8 = ((i9 + w00Var.B) + i14) - 50;
                                                            break;
                                                        }
                                                        i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                        i7 = w00Var.f10002y;
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                    case 1163912186:
                                                        if (str2.equals("bottom-right")) {
                                                            i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                            i9 = w00Var.f10002y;
                                                            i8 = ((i9 + w00Var.B) + i14) - 50;
                                                            break;
                                                        }
                                                        i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                        i7 = w00Var.f10002y;
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                    case 1288627767:
                                                        if (str2.equals("bottom-center")) {
                                                            i6 = ((w00Var.f10001x + w00Var.A) + (i13 >> 1)) - 25;
                                                            i9 = w00Var.f10002y;
                                                            i8 = ((i9 + w00Var.B) + i14) - 50;
                                                            break;
                                                        }
                                                        i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                        i7 = w00Var.f10002y;
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                    case 1755462605:
                                                        if (str2.equals("top-center")) {
                                                            i6 = ((w00Var.f10001x + w00Var.A) + (i13 >> 1)) - 25;
                                                            i8 = w00Var.f10002y + w00Var.B;
                                                            break;
                                                        }
                                                        i6 = ((w00Var.f10001x + w00Var.A) + i13) - 50;
                                                        i7 = w00Var.f10002y;
                                                        i8 = w00Var.B + i7;
                                                        break;
                                                }
                                                if (i6 >= 0 && i6 + 50 <= i11 && i8 >= iArrZzR[0] && i8 + 50 <= iArrZzR[1]) {
                                                    iArr = new int[]{w00Var.f10001x + w00Var.A, w00Var.f10002y + w00Var.B};
                                                }
                                            } else {
                                                zzv.zzq();
                                                int[] iArrZzV2 = zzs.zzV(w00Var.F);
                                                zzv.zzq();
                                                int[] iArrZzR2 = zzs.zzR(w00Var.F);
                                                int i15 = iArrZzV2[0];
                                                int i16 = w00Var.f10001x + w00Var.A;
                                                int i17 = w00Var.f10002y + w00Var.B;
                                                if (i16 < 0) {
                                                    i16 = 0;
                                                } else {
                                                    int i18 = w00Var.C;
                                                    if (i16 + i18 > i15) {
                                                        i16 = i15 - i18;
                                                    }
                                                }
                                                int i19 = iArrZzR2[0];
                                                if (i17 < i19) {
                                                    i17 = i19;
                                                } else {
                                                    int i20 = w00Var.f10003z;
                                                    int i21 = i17 + i20;
                                                    int i22 = iArrZzR2[1];
                                                    if (i21 > i22) {
                                                        i17 = i22 - i20;
                                                    }
                                                }
                                                iArr = new int[]{i16, i17};
                                            }
                                            if (iArr != null) {
                                                w00Var.m("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            zzbc.zzb();
                                            int iZzx = zzf.zzx(w00Var.F, w00Var.C);
                                            zzbc.zzb();
                                            int iZzx2 = zzf.zzx(w00Var.F, w00Var.f10003z);
                                            ViewParent parent = ((View) w00Var.E).getParent();
                                            if (parent == null || !(parent instanceof ViewGroup)) {
                                                w00Var.m("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) w00Var.E);
                                            PopupWindow popupWindow = w00Var.K;
                                            if (popupWindow == null) {
                                                w00Var.M = viewGroup;
                                                zzv.zzq();
                                                Object obj2 = w00Var.E;
                                                ((View) obj2).setDrawingCacheEnabled(true);
                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj2).getDrawingCache());
                                                ((View) obj2).setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(w00Var.F);
                                                w00Var.H = imageView;
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                                w00Var.G = w00Var.E.zzO();
                                                w00Var.M.addView(w00Var.H);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(w00Var.F);
                                            w00Var.L = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            w00Var.L.setLayoutParams(new ViewGroup.LayoutParams(iZzx, iZzx2));
                                            zzv.zzq();
                                            PopupWindow popupWindow2 = new PopupWindow((View) w00Var.L, iZzx, iZzx2, false);
                                            w00Var.K = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            w00Var.K.setTouchable(true);
                                            w00Var.K.setClippingEnabled(!w00Var.f10000w);
                                            w00Var.L.addView((View) w00Var.E, -1, -1);
                                            w00Var.I = new LinearLayout(w00Var.F);
                                            zzbc.zzb();
                                            int iZzx3 = zzf.zzx(w00Var.F, 50);
                                            zzbc.zzb();
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzx3, zzf.zzx(w00Var.F, 50));
                                            String str3 = w00Var.f9999v;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (!str3.equals("center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                        break;
                                                    } else {
                                                        layoutParams.addRule(13);
                                                        break;
                                                    }
                                                case -1012429441:
                                                    if (str3.equals("top-left")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(9);
                                                        break;
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (str3.equals("bottom-left")) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(9);
                                                        break;
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals("bottom-right")) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(11);
                                                        break;
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(14);
                                                        break;
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(14);
                                                        break;
                                                    }
                                                    break;
                                            }
                                            w00Var.I.setOnClickListener(new v00(w00Var));
                                            w00Var.I.setContentDescription("Close button");
                                            w00Var.L.addView(w00Var.I, layoutParams);
                                            try {
                                                PopupWindow popupWindow3 = w00Var.K;
                                                View decorView = window.getDecorView();
                                                zzbc.zzb();
                                                int iZzx4 = zzf.zzx(w00Var.F, iArr[0]);
                                                zzbc.zzb();
                                                popupWindow3.showAtLocation(decorView, 0, iZzx4, zzf.zzx(w00Var.F, iArr[1]));
                                                int i23 = iArr[0];
                                                int i24 = iArr[1];
                                                xj1 xj1Var = w00Var.J;
                                                if (xj1Var != null) {
                                                    ((bt0) xj1Var.f10619t).f3272c.o0(new d0(18));
                                                }
                                                w00Var.E.h0(new cc0(1, iZzx, iZzx2));
                                                int i25 = iArr[0];
                                                int i26 = iArr[1];
                                                zzv.zzq();
                                                w00Var.o(i25, i26 - zzs.zzR(w00Var.F)[0], w00Var.C, w00Var.f10003z);
                                                w00Var.p("resized");
                                                return;
                                            } catch (RuntimeException e6) {
                                                w00Var.m("Cannot show popup window: " + e6.getMessage());
                                                w00Var.L.removeView((View) w00Var.E);
                                                ViewGroup viewGroup2 = w00Var.M;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(w00Var.H);
                                                    w00Var.M.addView((View) w00Var.E);
                                                    w00Var.E.h0(w00Var.G);
                                                }
                                                return;
                                            }
                                        }
                                        zzo.zzj("Cannot resize to a full-screen ad.");
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            w00Var.m("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (iIntValue == 3) {
                    z00 z00Var = new z00(xa0Var, map);
                    Activity activity = z00Var.f11122v;
                    if (activity == null) {
                        z00Var.m("Activity context is not available");
                        return;
                    }
                    zzv.zzq();
                    if (!((Boolean) zzcd.zza(activity, new jn())).booleanValue() || j3.d.a(activity).f13494a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        z00Var.m("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        z00Var.m("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        z00Var.m("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    zzv.zzq();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        z00Var.m("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources resourcesB = zzv.zzp().b();
                    zzv.zzq();
                    AlertDialog.Builder builderZzL = zzs.zzL(activity);
                    builderZzL.setTitle(resourcesB != null ? resourcesB.getString(R.string.f2263s1) : "Save image");
                    builderZzL.setMessage(resourcesB != null ? resourcesB.getString(R.string.f2264s2) : "Allow Ad to store image in Picture gallery?");
                    builderZzL.setPositiveButton(resourcesB != null ? resourcesB.getString(R.string.s3) : "Accept", new x00(z00Var, str4, lastPathSegment));
                    builderZzL.setNegativeButton(resourcesB != null ? resourcesB.getString(R.string.s4) : "Decline", new y00(z00Var));
                    builderZzL.create().show();
                    return;
                }
                if (iIntValue == 4) {
                    s00 s00Var = new s00(xa0Var, map);
                    Activity activity2 = s00Var.f8754w;
                    if (activity2 == null) {
                        s00Var.m("Activity context is not available.");
                        return;
                    }
                    zzv.zzq();
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    com.google.android.gms.common.internal.l.g("Intent can not be null", type);
                    if (activity2.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        s00Var.m("This feature is not available on the device.");
                        return;
                    }
                    zzv.zzq();
                    AlertDialog.Builder builderZzL2 = zzs.zzL(activity2);
                    Resources resourcesB2 = zzv.zzp().b();
                    builderZzL2.setTitle(resourcesB2 != null ? resourcesB2.getString(R.string.f2265s5) : "Create calendar event");
                    builderZzL2.setMessage(resourcesB2 != null ? resourcesB2.getString(R.string.s6) : "Allow Ad to create a calendar event?");
                    builderZzL2.setPositiveButton(resourcesB2 != null ? resourcesB2.getString(R.string.s3) : "Accept", new q00(s00Var));
                    builderZzL2.setNegativeButton(resourcesB2 != null ? resourcesB2.getString(R.string.s4) : "Decline", new r00(s00Var));
                    builderZzL2.create().show();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f4027t.q(true);
                        return;
                    } else if (iIntValue != 7) {
                        zzo.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((bt0) this.f4028u.f10619t).f3281m.zza();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean z6 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (xa0Var == null) {
            zzo.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str5)) {
            i10 = 7;
        } else if ("landscape".equalsIgnoreCase(str5)) {
            i10 = 6;
        } else if (!z6) {
            i10 = 14;
        }
        xa0Var.m(i10);
    }
}
