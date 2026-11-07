package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uc1 implements rk0 {
    public final HashSet s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final Context f9527t;

    /* renamed from: u, reason: collision with root package name */
    public final e70 f9528u;

    public uc1(Context context, e70 e70Var) {
        this.f9527t = context;
        this.f9528u = e70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle a() {
        String str;
        Bundle bundle;
        boolean z6;
        int i6;
        Bundle bundle2;
        e70 e70Var = this.f9528u;
        Context context = this.f9527t;
        e70Var.getClass();
        HashSet hashSet = new HashSet();
        synchronized (e70Var.f4140a) {
            hashSet.addAll(e70Var.f4144e);
            e70Var.f4144e.clear();
        }
        Bundle bundle3 = new Bundle();
        c70 c70Var = e70Var.f4143d;
        com.google.android.gms.ads.mediation.customevent.a aVar = e70Var.f4142c;
        synchronized (aVar) {
            str = (String) aVar.f2373u;
        }
        synchronized (c70Var.f3451f) {
            try {
                bundle = new Bundle();
                if (!c70Var.h.zzN()) {
                    bundle.putString("session_id", c70Var.f3452g);
                }
                bundle.putLong("basets", c70Var.f3447b);
                bundle.putLong("currts", c70Var.f3446a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", c70Var.f3448c);
                bundle.putInt("preqs_in_session", c70Var.f3449d);
                bundle.putLong("time_in_session", c70Var.f3450e);
                bundle.putInt("pclick", c70Var.f3453i);
                bundle.putInt("pimp", c70Var.f3454j);
                Context contextA = z30.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                if (identifier == 0) {
                    zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzo.zzj("Fail to fetch AdActivity theme");
                        zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                    if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z6 = true;
                        bundle.putBoolean("support_transparent_background", z6);
                        synchronized (c70Var.f3451f) {
                            i6 = c70Var.f3455k;
                        }
                        bundle.putInt("consent_form_action_identifier", i6);
                    } else {
                        zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                z6 = false;
                bundle.putBoolean("support_transparent_background", z6);
                synchronized (c70Var.f3451f) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = e70Var.f4145f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            v60 v60Var = (v60) it2.next();
            synchronized (v60Var.f9725d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", v60Var.f9726e);
                    bundle2.putString("slotid", v60Var.f9727f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", v60Var.f9730j);
                    bundle2.putLong("tresponse", v60Var.f9731k);
                    bundle2.putLong("timp", v60Var.f9728g);
                    bundle2.putLong("tload", v60Var.h);
                    bundle2.putLong("pcc", v60Var.f9729i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = v60Var.f9724c.iterator();
                    while (it3.hasNext()) {
                        u60 u60Var = (u60) it3.next();
                        u60Var.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", u60Var.f9466a);
                        bundle5.putLong("tclose", u60Var.f9467b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } finally {
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList("ads", arrayList);
        synchronized (this) {
            this.s.clear();
            this.s.addAll(hashSet);
        }
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final synchronized void k0(zze zzeVar) {
        if (zzeVar.zza != 3) {
            e70 e70Var = this.f9528u;
            HashSet hashSet = this.s;
            synchronized (e70Var.f4140a) {
                e70Var.f4144e.addAll(hashSet);
            }
        }
    }
}
