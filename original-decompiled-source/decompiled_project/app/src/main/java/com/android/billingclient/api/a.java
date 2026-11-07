package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f5606a;

    /* renamed from: b, reason: collision with root package name */
    public int f5607b;

    /* renamed from: c, reason: collision with root package name */
    public String f5608c;

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static class C0062a {

        /* renamed from: a, reason: collision with root package name */
        public int f5609a;

        /* renamed from: b, reason: collision with root package name */
        public int f5610b;

        /* renamed from: c, reason: collision with root package name */
        public String f5611c;

        public final a a() {
            a aVar = new a();
            aVar.f5606a = this.f5609a;
            aVar.f5607b = this.f5610b;
            aVar.f5608c = this.f5611c;
            return aVar;
        }
    }

    public static C0062a a() {
        C0062a c0062a = new C0062a();
        c0062a.f5610b = 0;
        c0062a.f5611c = "";
        return c0062a;
    }

    public final String toString() {
        return b6.a.b("Response Code: ", zzc.zzk(this.f5606a), ", Debug Message: ", this.f5608c);
    }
}
