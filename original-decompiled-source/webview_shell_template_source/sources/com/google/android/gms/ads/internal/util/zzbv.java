package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am1;
import com.google.android.gms.internal.ads.cm1;
import com.google.android.gms.internal.ads.ml1;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.zn;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbv {
    public static Point zza(MotionEvent motionEvent, View view) {
        int[] iArrZzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzj[0], ((int) motionEvent.getRawY()) - iArrZzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.T7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e6) {
            e = e6;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e7) {
                zzo.zzh("Error occurred while putting signals into JSON object.", e7);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e8) {
            e = e8;
            jSONObject2 = jSONObject;
            zzo.zzh("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzj = zzj(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzj2 = zzj(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrZzj;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[0] - iArr[0]));
                            jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = zzk(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[0] - iArr[0]));
                                jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.O7)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.P7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Q7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    zzo.zzj("Unable to get asset views information");
                                    it2 = it;
                                    iArrZzj = iArr;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrZzj = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("can_show_on_lock_screen", zzs.zzo(view));
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("is_keyguard_locked", zzs.zzE(context));
                return jSONObject;
            } catch (JSONException unused) {
                zzo.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.N7)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                com.google.android.gms.ads.internal.zzv.zzq();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:66|22)|61|31|32|(4:34|(2:39|40)(1:48)|51|(2:62|53))(4:44|(2:46|47)(0)|51|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015e, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a A[Catch: JSONException -> 0x014a, TRY_LEAVE, TryCatch #5 {JSONException -> 0x014a, blocks: (B:31:0x012c, B:40:0x0146, B:48:0x015a, B:47:0x0156), top: B:61:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzg(Context context, View view) {
        int i6;
        ViewParent parent;
        String str;
        int iHashCode;
        JSONObject jSONObjectZzk;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i7 = 1;
            try {
                int[] iArrZzj = zzj(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i6 = i7;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i6] = Math.min(viewGroup.getMeasuredHeight(), iArr[i6]);
                        parent2 = parent2.getParent();
                        i7 = i6;
                    } catch (Exception unused) {
                        zzo.zzj("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent == null) {
                        }
                        return jSONObject;
                    }
                }
                i6 = i7;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view.getMeasuredWidth()));
                jSONObject2.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view.getMeasuredHeight()));
                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[0]));
                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[i6]));
                jSONObject2.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArr[i6]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectZzk = zzk(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[0]));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[i6]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectZzk = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectZzk);
            } catch (Exception unused2) {
                i6 = i7;
            }
            parent = view.getParent();
            if (parent == null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                } catch (IllegalAccessException e6) {
                    e = e6;
                    zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    iHashCode = str.hashCode();
                    if (iHashCode != -2066603854) {
                    }
                    return jSONObject;
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e7) {
                    e = e7;
                    zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    iHashCode = str.hashCode();
                    if (iHashCode != -2066603854) {
                    }
                    return jSONObject;
                } catch (InvocationTargetException e8) {
                    e = e8;
                    zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    iHashCode = str.hashCode();
                    if (iHashCode != -2066603854) {
                    }
                    return jSONObject;
                }
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        jSONObject.put("native_template_type", 2);
                    } else {
                        jSONObject.put("native_template_type", 0);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.P7)).booleanValue()) {
                        try {
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            jSONObject.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                            jSONObject.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                        } catch (Exception unused4) {
                            zze.zza("Unable to get native ad view layout types");
                        }
                    }
                } else {
                    if (str.equals("small_template")) {
                        jSONObject.put("native_template_type", i6);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.P7)).booleanValue()) {
                    }
                }
            } else {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                }
            }
        }
        return jSONObject;
    }

    public static boolean zzh(Context context, tb1 tb1Var) {
        am1 am1Var;
        if (!tb1Var.N) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.R7)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.U7)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.S7);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        cm1 cm1VarA = cm1.a(new ml1(';'));
        Iterator itI = cm1VarA.f3618a.i(cm1VarA, str);
        do {
            am1Var = (am1) itI;
            if (!am1Var.hasNext()) {
                return false;
            }
        } while (!((String) am1Var.next()).equals(packageName));
        return true;
    }

    public static boolean zzi(int i6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.B3)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.C3)).booleanValue() || i6 <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i6) {
        if (i6 != -2) {
            return i6 != -1 ? 2 : 3;
        }
        return 4;
    }
}
