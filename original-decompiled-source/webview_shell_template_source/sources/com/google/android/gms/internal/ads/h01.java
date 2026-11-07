package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h01 implements Runnable {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ h01() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws JSONException {
        HashMap map;
        HashMap map2;
        HashMap map3;
        ro0 ro0Var;
        WeakHashMap weakHashMap;
        lh1 lh1Var;
        HashSet hashSet;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.s) {
            case 0:
                break;
            default:
                oh1 oh1Var = oh1.f7759g;
                oh1Var.getClass();
                ArrayList arrayList = oh1Var.f7763a;
                ro0 ro0Var2 = oh1Var.f7765c;
                s70 s70Var = oh1Var.f7767e;
                lh1 lh1Var2 = oh1Var.f7766d;
                oh1Var.f7764b.clear();
                for (fg1 fg1Var : Collections.unmodifiableCollection(rg1.f8631c.f8633b)) {
                }
                oh1Var.f7768f = System.nanoTime();
                HashMap map4 = lh1Var2.f6741g;
                HashMap map5 = lh1Var2.f6735a;
                HashSet hashSet2 = lh1Var2.f6738d;
                HashSet hashSet3 = lh1Var2.h;
                HashMap map6 = lh1Var2.f6736b;
                HashMap map7 = lh1Var2.f6737c;
                HashSet hashSet4 = lh1Var2.f6739e;
                HashSet hashSet5 = lh1Var2.f6740f;
                WeakHashMap weakHashMap2 = lh1Var2.f6742i;
                rg1 rg1Var = rg1.f8631c;
                if (rg1Var != null) {
                    Iterator it = Collections.unmodifiableCollection(rg1Var.f8633b).iterator();
                    while (it.hasNext()) {
                        fg1 fg1Var2 = (fg1) it.next();
                        s70 s70Var2 = s70Var;
                        View view = (View) fg1Var2.f4653c.get();
                        Iterator it2 = it;
                        String str2 = fg1Var2.f4657g;
                        ArrayList arrayList2 = arrayList;
                        if (!fg1Var2.f4655e || fg1Var2.f4656f) {
                            weakHashMap = weakHashMap2;
                            lh1Var = lh1Var2;
                            hashSet = hashSet3;
                            s70Var = s70Var2;
                            it = it2;
                            arrayList = arrayList2;
                            lh1Var2 = lh1Var;
                            weakHashMap2 = weakHashMap;
                            hashSet3 = hashSet;
                        } else if (view != null) {
                            Context context = view.getContext();
                            lh1Var = lh1Var2;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (zIsInPictureInPictureMode) {
                                hashSet3.add(str2);
                            }
                            boolean z6 = zIsInPictureInPictureMode;
                            if (view.isAttachedToWindow()) {
                                if (view.hasWindowFocus()) {
                                    weakHashMap2.remove(view);
                                    bool = Boolean.FALSE;
                                } else if (weakHashMap2.containsKey(view)) {
                                    bool = (Boolean) weakHashMap2.get(view);
                                } else {
                                    bool = Boolean.FALSE;
                                    weakHashMap2.put(view, bool);
                                }
                                if (!bool.booleanValue() || z6) {
                                    HashSet hashSet6 = new HashSet();
                                    weakHashMap = weakHashMap2;
                                    View view2 = view;
                                    while (view2 != null) {
                                        String strA = jh1.a(view2);
                                        if (strA != null) {
                                            str = strA;
                                        } else {
                                            hashSet6.add(view2);
                                            Object parent = view2.getParent();
                                            HashSet hashSet7 = hashSet3;
                                            if (parent instanceof View) {
                                                view2 = (View) parent;
                                                hashSet3 = hashSet7;
                                            } else {
                                                hashSet3 = hashSet7;
                                                view2 = null;
                                            }
                                        }
                                    }
                                    hashSet = hashSet3;
                                    hashSet2.addAll(hashSet6);
                                    str = null;
                                    if (str != null) {
                                        hashSet4.add(str2);
                                        map5.put(view, str2);
                                        ArrayList arrayList3 = fg1Var2.f4652b.f9861a;
                                        int size = arrayList3.size();
                                        int i6 = 0;
                                        while (i6 < size) {
                                            Object obj = arrayList3.get(i6);
                                            i6++;
                                            ug1 ug1Var = (ug1) obj;
                                            View view3 = (View) ug1Var.f9555a.get();
                                            if (view3 != null) {
                                                kh1 kh1Var = (kh1) map6.get(view3);
                                                if (kh1Var != null) {
                                                    kh1Var.f6414b.add(str2);
                                                } else {
                                                    map6.put(view3, new kh1(ug1Var, str2));
                                                }
                                            }
                                        }
                                    } else if (str != "noWindowFocus") {
                                        hashSet5.add(str2);
                                        map7.put(str2, view);
                                        map4.put(str2, str);
                                    }
                                    s70Var = s70Var2;
                                    it = it2;
                                    arrayList = arrayList2;
                                    lh1Var2 = lh1Var;
                                    weakHashMap2 = weakHashMap;
                                    hashSet3 = hashSet;
                                } else {
                                    weakHashMap = weakHashMap2;
                                    str = "noWindowFocus";
                                }
                            } else {
                                str = "notAttached";
                                weakHashMap = weakHashMap2;
                            }
                            hashSet = hashSet3;
                            if (str != null) {
                            }
                            s70Var = s70Var2;
                            it = it2;
                            arrayList = arrayList2;
                            lh1Var2 = lh1Var;
                            weakHashMap2 = weakHashMap;
                            hashSet3 = hashSet;
                        } else {
                            hashSet5.add(str2);
                            map4.put(str2, "noAdView");
                            s70Var = s70Var2;
                            it = it2;
                            arrayList = arrayList2;
                            weakHashMap2 = weakHashMap2;
                        }
                    }
                }
                ArrayList arrayList4 = arrayList;
                s70 s70Var3 = s70Var;
                lh1 lh1Var3 = lh1Var2;
                HashSet hashSet8 = hashSet3;
                HashSet hashSet9 = hashSet5;
                long jNanoTime = System.nanoTime();
                v31 v31Var = (v31) ro0Var2.f8673t;
                if (hashSet9.size() > 0) {
                    Iterator it3 = hashSet9.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        HashSet hashSet10 = hashSet4;
                        JSONObject jSONObjectT = v31Var.t(null);
                        View view4 = (View) map7.get(str3);
                        bh1 bh1Var = (bh1) ro0Var2.s;
                        HashSet hashSet11 = hashSet9;
                        String str4 = (String) map4.get(str3);
                        if (str4 != null) {
                            JSONObject jSONObjectA = bh1Var.a(view4);
                            try {
                                jSONObjectA.put("adSessionId", str3);
                                ro0Var = ro0Var2;
                            } catch (JSONException e6) {
                                ro0Var = ro0Var2;
                                d0.f("Error with setting ad session id", e6);
                            }
                            try {
                                jSONObjectA.put("notVisibleReason", str4);
                            } catch (JSONException e7) {
                                d0.f("Error with setting not visible reason", e7);
                            }
                            gh1.b(jSONObjectT, jSONObjectA);
                        } else {
                            ro0Var = ro0Var2;
                        }
                        gh1.d(jSONObjectT);
                        HashMap map8 = map7;
                        HashSet hashSet12 = new HashSet();
                        hashSet12.add(str3);
                        s70Var3.getClass();
                        HashMap map9 = map6;
                        s70 s70Var4 = s70Var3;
                        sh1 sh1Var = new sh1(s70Var4, hashSet12, jSONObjectT, jNanoTime);
                        wv0 wv0Var = (wv0) s70Var4.f8824u;
                        sh1Var.f8388a = wv0Var;
                        ArrayDeque arrayDeque = (ArrayDeque) wv0Var.f10278t;
                        arrayDeque.add(sh1Var);
                        if (((qh1) wv0Var.f10279u) == null) {
                            qh1 qh1Var = (qh1) arrayDeque.poll();
                            wv0Var.f10279u = qh1Var;
                            if (qh1Var != null) {
                                qh1Var.executeOnExecutor((ThreadPoolExecutor) wv0Var.s, new Object[0]);
                            }
                        }
                        map7 = map8;
                        map6 = map9;
                        s70Var3 = s70Var4;
                        hashSet4 = hashSet10;
                        ro0Var2 = ro0Var;
                        hashSet9 = hashSet11;
                    }
                }
                HashSet hashSet13 = hashSet9;
                HashMap map10 = map6;
                HashMap map11 = map7;
                HashSet hashSet14 = hashSet4;
                s70 s70Var5 = s70Var3;
                if (hashSet14.size() > 0) {
                    JSONObject jSONObjectT2 = v31Var.t(null);
                    v31Var.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    rg1 rg1Var2 = rg1.f8631c;
                    if (rg1Var2 != null) {
                        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(rg1Var2.f8633b);
                        int size2 = collectionUnmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it4 = collectionUnmodifiableCollection.iterator();
                        while (it4.hasNext()) {
                            View view5 = (View) ((fg1) it4.next()).f4653c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        HashMap map12 = map11;
                                        View rootView = view5.getRootView();
                                        if (rootView == null || identityHashMap.containsKey(rootView)) {
                                            map11 = map12;
                                        } else {
                                            identityHashMap.put(rootView, rootView);
                                            float z7 = rootView.getZ();
                                            int size3 = arrayList5.size();
                                            while (true) {
                                                if (size3 > 0) {
                                                    map3 = map10;
                                                    int i7 = size3 - 1;
                                                    if (((View) arrayList5.get(i7)).getZ() > z7) {
                                                        size3 = i7;
                                                        map10 = map3;
                                                    }
                                                } else {
                                                    map3 = map10;
                                                }
                                            }
                                            arrayList5.add(size3, rootView);
                                            map11 = map12;
                                            map10 = map3;
                                        }
                                    } else if (view6.getAlpha() != 0.0f) {
                                        Object parent2 = view6.getParent();
                                        HashMap map13 = map11;
                                        view6 = parent2 instanceof View ? (View) parent2 : null;
                                        map11 = map13;
                                    }
                                }
                            }
                        }
                    }
                    map = map11;
                    map2 = map10;
                    int size4 = arrayList5.size();
                    for (int i8 = 0; i8 < size4; i8++) {
                        oh1Var.a((View) arrayList5.get(i8), (bh1) v31Var.f9702t, jSONObjectT2, false);
                    }
                    gh1.d(jSONObjectT2);
                    s70Var5.getClass();
                    uh1 uh1Var = new uh1(s70Var5, hashSet14, jSONObjectT2, jNanoTime);
                    wv0 wv0Var2 = (wv0) s70Var5.f8824u;
                    uh1Var.f8388a = wv0Var2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) wv0Var2.f10278t;
                    arrayDeque2.add(uh1Var);
                    if (((qh1) wv0Var2.f10279u) == null) {
                        qh1 qh1Var2 = (qh1) arrayDeque2.poll();
                        wv0Var2.f10279u = qh1Var2;
                        if (qh1Var2 != null) {
                            qh1Var2.executeOnExecutor((ThreadPoolExecutor) wv0Var2.s, new Object[0]);
                        }
                    }
                } else {
                    map = map11;
                    map2 = map10;
                    s70Var5.getClass();
                    rh1 rh1Var = new rh1(s70Var5);
                    wv0 wv0Var3 = (wv0) s70Var5.f8824u;
                    rh1Var.f8388a = wv0Var3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) wv0Var3.f10278t;
                    arrayDeque3.add(rh1Var);
                    if (((qh1) wv0Var3.f10279u) == null) {
                        qh1 qh1Var3 = (qh1) arrayDeque3.poll();
                        wv0Var3.f10279u = qh1Var3;
                        if (qh1Var3 != null) {
                            qh1Var3.executeOnExecutor((ThreadPoolExecutor) wv0Var3.s, new Object[0]);
                        }
                    }
                }
                map5.clear();
                map2.clear();
                map.clear();
                hashSet2.clear();
                hashSet14.clear();
                hashSet13.clear();
                map4.clear();
                int i9 = 0;
                lh1Var3.f6743j = false;
                hashSet8.clear();
                long jNanoTime2 = System.nanoTime() - oh1Var.f7768f;
                if (arrayList4.size() > 0) {
                    int size5 = arrayList4.size();
                    while (i9 < size5) {
                        ArrayList arrayList6 = arrayList4;
                        Object obj2 = arrayList6.get(i9);
                        i9++;
                        nh1 nh1Var = (nh1) obj2;
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        nh1Var.zzb();
                        if (nh1Var instanceof mh1) {
                            ((mh1) nh1Var).zza();
                        }
                        arrayList4 = arrayList6;
                    }
                }
                ah1 ah1Var = ah1.f2759d;
                Context context2 = (Context) ah1Var.f2760a.get();
                if (context2 != null) {
                    boolean zIsDeviceLocked = ((KeyguardManager) context2.getSystemService("keyguard")).isDeviceLocked();
                    ah1Var.a(ah1Var.f2761b, zIsDeviceLocked);
                    ah1Var.f2762c = zIsDeviceLocked;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h01(ht0 ht0Var) {
    }

    private final void a() {
    }
}
