package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class rf0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8623b;

    public /* synthetic */ rf0(int i6, Object obj) {
        this.f8622a = i6;
        this.f8623b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f8622a) {
            case 0:
                String str = (String) zzbe.zzc().a(zn.ca);
                Uri.Builder builder = (Uri.Builder) this.f8623b;
                builder.appendQueryParameter(str, "12");
                return bs1.m(builder.toString());
            case 1:
                qr0 qr0Var = (qr0) this.f8623b;
                xa0 xa0VarA = qr0Var.f8447c.a(zzs.zzc(), null, null);
                n70 n70Var = new n70(xa0VarA);
                qr0Var.a(xa0VarA);
                xa0VarA.zzN().f4197z = new dh0(14, n70Var);
                xa0VarA.loadUrl((String) zzbe.zzc().a(zn.R3));
                return n70Var;
            case 2:
                return ((ox) this.f8623b).a((JSONObject) obj);
            default:
                return (c5.a) this.f8623b;
        }
    }
}
