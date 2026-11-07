package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class vw0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9956c;

    public /* synthetic */ vw0(int i6, Object obj, Object obj2) {
        this.f9954a = i6;
        this.f9955b = obj;
        this.f9956c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws p21 {
        int i6 = this.f9954a;
        int i7 = 0;
        Object obj = this.f9956c;
        Object obj2 = this.f9955b;
        switch (i6) {
            case 0:
                ww0 ww0Var = (ww0) obj2;
                ay0 ay0Var = (ay0) obj;
                ww0Var.c(xt0.U);
                int i8 = -1;
                while (true) {
                    try {
                        if (i7 >= ((Integer) zzbe.zzc().a(zn.W6)).intValue()) {
                            throw new p21(1, "Received HTTP error code from ad server: " + i8);
                        }
                        Context context = ww0Var.f10288b;
                        String str = ww0Var.f10289c.afmaVersion;
                        Binder.getCallingUid();
                        by0 by0VarA = new cy0(context, str).zza(ay0Var);
                        int i9 = by0VarA.f3324a;
                        if (((Boolean) zzbe.zzc().a(zn.X6)).booleanValue()) {
                            ww0Var.f10294i.a("fr", String.valueOf(i7));
                        }
                        if (i9 == 200) {
                            ww0Var.c(xt0.V);
                            return by0VarA.f3326c;
                        }
                        i7++;
                        i8 = i9;
                    } catch (Exception e6) {
                        throw new p21(e6.getMessage() == null ? "Fetch failed." : e6.getMessage(), e6);
                    }
                }
            case 1:
                g81 g81Var = f81.f4544k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    c5.a aVar = (c5.a) obj3;
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new g81(jSONArray.toString(), (Bundle) obj);
            case 2:
                return ((ye1) obj2).f10937b.zza((String) obj);
            default:
                return ((cf1) obj2).f3556d.zza((String) obj);
        }
    }
}
