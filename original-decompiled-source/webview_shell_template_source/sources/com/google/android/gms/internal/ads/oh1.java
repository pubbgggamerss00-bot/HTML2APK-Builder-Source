package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oh1 {

    /* renamed from: g, reason: collision with root package name */
    public static final oh1 f7759g = new oh1();
    public static final Handler h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f7760i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final h01 f7761j = new h01();

    /* renamed from: k, reason: collision with root package name */
    public static final m50 f7762k = new m50(1);

    /* renamed from: f, reason: collision with root package name */
    public long f7768f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7763a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7764b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final lh1 f7766d = new lh1();

    /* renamed from: c, reason: collision with root package name */
    public final ro0 f7765c = new ro0(7);

    /* renamed from: e, reason: collision with root package name */
    public final s70 f7767e = new s70(5, new wv0());

    public static void b() {
        if (f7760i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7760i = handler;
            handler.post(f7761j);
            f7760i.postDelayed(f7762k, 200L);
        }
    }

    public final void a(View view, bh1 bh1Var, JSONObject jSONObject, boolean z6) {
        Object obj;
        boolean z7;
        int i6;
        if (jh1.a(view) == null) {
            lh1 lh1Var = this.f7766d;
            char c7 = lh1Var.f6738d.contains(view) ? (char) 1 : lh1Var.f6743j ? (char) 2 : (char) 3;
            if (c7 == 3) {
                return;
            }
            JSONObject jSONObjectA = bh1Var.a(view);
            gh1.b(jSONObject, jSONObjectA);
            HashMap map = lh1Var.f6735a;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z8 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e6) {
                    d0.f("Error with setting ad session id", e6);
                }
                WeakHashMap weakHashMap = lh1Var.f6742i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z8 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z8));
                } catch (JSONException e7) {
                    d0.f("Error with setting has window focus", e7);
                }
                boolean zContains = lh1Var.h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException e8) {
                        d0.f("Error with setting is picture-in-picture active", e8);
                    }
                }
                lh1Var.f6743j = true;
                return;
            }
            HashMap map2 = lh1Var.f6736b;
            kh1 kh1Var = (kh1) map2.get(view);
            if (kh1Var != null) {
                map2.remove(view);
            }
            if (kh1Var != null) {
                ug1 ug1Var = kh1Var.f6413a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = kh1Var.f6414b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    jSONArray.put((String) arrayList.get(i7));
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", ug1Var.f9556b);
                    jSONObjectA.put("friendlyObstructionPurpose", ug1Var.f9557c);
                    jSONObjectA.put("friendlyObstructionReason", ug1Var.f9558d);
                } catch (JSONException e9) {
                    d0.f("Error with setting friendly obstruction", e9);
                }
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = z6 || z7;
            boolean z10 = c7 == 1;
            bh1Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z10) {
                    for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                        a(viewGroup.getChildAt(i8), bh1Var, jSONObjectA, z9);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i10 = 0;
                while (i10 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i10));
                    int size3 = arrayList4.size();
                    int i11 = 0;
                    while (true) {
                        i6 = i10 + 1;
                        if (i11 < size3) {
                            a((View) arrayList4.get(i11), bh1Var, jSONObjectA, z9);
                            i11++;
                        }
                    }
                    i10 = i6;
                }
            }
        }
    }
}
