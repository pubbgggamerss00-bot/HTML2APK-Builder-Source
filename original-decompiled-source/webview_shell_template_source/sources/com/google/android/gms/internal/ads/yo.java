package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yo extends p.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11030a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f11031b = Arrays.asList(((String) zzbe.zzc().a(zn.L9)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final ap f11032c;

    /* renamed from: d, reason: collision with root package name */
    public final p.b f11033d;

    /* renamed from: e, reason: collision with root package name */
    public final fu0 f11034e;

    public yo(ap apVar, p.b bVar, fu0 fu0Var) {
        this.f11033d = bVar;
        this.f11032c = apVar;
        this.f11034e = fu0Var;
    }

    @Override // p.b
    public final void a(String str, Bundle bundle) {
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.a(str, bundle);
        }
    }

    @Override // p.b
    public final Bundle b(String str, Bundle bundle) {
        p.b bVar = this.f11033d;
        if (bVar != null) {
            return bVar.b(str, bundle);
        }
        return null;
    }

    @Override // p.b
    public final void d(int i6, int i7, Bundle bundle) {
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.d(i6, i7, bundle);
        }
    }

    @Override // p.b
    public final void e(Bundle bundle) {
        this.f11030a.set(false);
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.e(bundle);
        }
    }

    @Override // p.b
    public final void g(Bundle bundle, int i6) {
        this.f11030a.set(false);
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.g(bundle, i6);
        }
        long jA = zzv.zzC().a();
        ap apVar = this.f11032c;
        apVar.f2814j = jA;
        List list = this.f11031b;
        if (list == null || !list.contains(String.valueOf(i6))) {
            return;
        }
        apVar.f2813i = zzv.zzC().b() + ((Integer) zzbe.zzc().a(zn.I9)).intValue();
        if (apVar.f2810e == null) {
            apVar.f2810e = new b(4, apVar);
        }
        apVar.d();
        zzaa.zzd(this.f11034e, null, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // p.b
    public final void h(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f11030a.set(true);
                zzaa.zzd(this.f11034e, null, "pact_action", new Pair("pe", "pact_con"));
                this.f11032c.c(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e6) {
            zze.zzb("Message is not in JSON format: ", e6);
        }
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.h(str, bundle);
        }
    }

    @Override // p.b
    public final void i(int i6, Uri uri, boolean z6, Bundle bundle) {
        p.b bVar = this.f11033d;
        if (bVar != null) {
            bVar.i(i6, uri, z6, bundle);
        }
    }
}
